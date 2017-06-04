package utilities;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;

import threading.runnables.GameRunnable;

/**
 * Create an executable jar and a binary file, representing the whole game.
 * 
 */

//TODO this class has too many hard-coded elements, small changes in project might lead to utter destruction.
public class ExecutableCreator {

    //If run with eclipse, process' working directory points to project's directory.
    private static String workingDirectory;
    private static String targetDirectory;
    
    private static String mainJava;
    
    
    private static final String jarName = "yourGame.jar";
    private static final String appendDirectory = "/src/";
    /*Be careful when playing with the files named below.*/
    private static final String[] requiredFiles = {
            "memory/Memory.java",
            "gameObjects/ChoiceTextLine.java","gameObjects/NpcTextLine.java","gameObjects/PlayerTextLine.java","gameObjects/TextLine.java",
            "karmaComputation/KarmaOperation.java","karmaComputation/EvaluationTree.java",
            "preferences/Config.java",
            "threading/runnables/GameRunnable.java","threading/runnables/RunnableConfiguration.java","threading/runnables/TextOutputRunnable.java",
            "threading/threads/BaseThread.java"
    };
    
    /**
     * If not specified, executable file is stored in folder named exec.
     */
    public ExecutableCreator()
    {
        targetDirectory = "/exec";
        workingDirectory = System.getProperty("user.dir");
        setMainFile();
    }
    
    /**
     * Instantiate an ExecutableCreator which will output to the specified directory(WorkingDirectory/dir).
     * @param dir Path to directory 
     */
    public ExecutableCreator(String dir)
    {
        this();
        targetDirectory = dir;
    }
    
    /**
     * Tries to create exe, logs to output on failure.
     * @param gameInstance game instance to write.
     * @return whether or not the process was successful.
     */
    public boolean createExecutable(GameRunnable gameInstance)
    {
        /*Directory to store the output.*/
        File dir = new File(workingDirectory + targetDirectory);
        deleteDirectory(dir);
        if(!dir.mkdir())
        {
            Logger.getGlobal().log(Level.WARNING, "Unable to create directory, check if it is empty.");
            return false;
        }
        /*Write game instance to file.*/
        try
        {
            FileOutputStream fos = new FileOutputStream(workingDirectory + targetDirectory + "/data.sdtgd");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(gameInstance);
            oos.close();
            fos.close();
        }
        catch(IOException e)
        {
            Logger.getGlobal().log(Level.SEVERE, "Could not write data.");
            e.printStackTrace();
            return false;
        }
        /*Copy .java files.*/
        for(String from : requiredFiles)
        {
            Path src = Paths.get(workingDirectory + appendDirectory + from);
            Path dest = Paths.get(workingDirectory + targetDirectory + from.substring(from.lastIndexOf("/")));
            try
            {
                Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
            }
            catch (IOException e)
            {
                Logger.getGlobal().log(Level.SEVERE, "Could not copy: " + src);
                e.printStackTrace();
                return false;
            }
        }
        /*Create main class.*/
        try
        {
            FileOutputStream fos = new FileOutputStream(workingDirectory + targetDirectory + "/SdtgMain.java");
            PrintWriter pw = new PrintWriter(fos);
            pw.print(mainJava);
            pw.close();
            fos.close();
        }
        catch(IOException ioe)
        {
            Logger.getGlobal().log(Level.SEVERE, ioe.getMessage());
            return false;
        }
        /*Compile .java files*/ 
        /*TODO For this to work, java.home system property should point to a jdk folder.*/
        try
        { 
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
            ArrayList<File> sourceFileList = new ArrayList<File>();
            File[] sourceFiles = new File(workingDirectory + targetDirectory).listFiles();
            for(File f : sourceFiles)
                if(f.getName().contains(".java"))
                    sourceFileList.add(f);
            Iterable<? extends JavaFileObject> compilationUnits =fileManager.getJavaFileObjectsFromFiles (sourceFileList);
            CompilationTask task = compiler.getTask (null,fileManager, null, null, null, compilationUnits);
            if(!task.call())
            {
                Logger.getGlobal().log(Level.SEVERE, "Failed to compile classes.");
                return false;
            }
            fileManager.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        /*Remove .java files*/
        File[] sourceFiles = new File(workingDirectory + targetDirectory).listFiles();
        for(File f : sourceFiles)
            if(f.getName().contains(".java"))
                f.delete();
        /*Create executable .jar*/
        try
        {
            Manifest man = new Manifest();
            man.getMainAttributes().put(Attributes.Name.CLASS_PATH, ".");
            man.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "0.1");
            man.getMainAttributes().put(Attributes.Name.MAIN_CLASS, "mainPackage.SdtgMain");
            FileOutputStream fos = new FileOutputStream(workingDirectory + targetDirectory + "/" + jarName);
            JarOutputStream jos = new JarOutputStream(fos,man);
            int len = 0;
            byte[] buffer = new byte[1024];
            for(File f : sourceFiles)
                if(f.getName().contains(".class"))
                {
                    /*TODO remove abysmal code.*/
                    String fullPath = null;
                    for(String s : requiredFiles)
                    {
                        //System.out.println(s + " : " + f.getName().replace(".class", "").substring(0,
                        //        f.getName().indexOf("$") < 0 ? f.getName().replace(".class", "").length() : f.getName().indexOf("$")));
                        if(s.contains(f.getName().replace(".class", "").substring(0,
                                f.getName().indexOf("$") < 0 ? f.getName().replace(".class", "").length() : f.getName().indexOf("$"))))
                        {
                            fullPath = s.substring(0,s.lastIndexOf("/")+1) + f.getName();
                            break;
                        }
                    }
                    if(fullPath == null)
                            fullPath = "mainPackage/SdtgMain.class";
                    JarEntry je = new JarEntry(fullPath.replace("/", "/"));
                    je.setComment("jarring.");
                    je.setTime(Calendar.getInstance().getTimeInMillis());
                    jos.putNextEntry(je);
                    InputStream is = new BufferedInputStream(new FileInputStream(f));
                    while((len = is.read(buffer, 0, buffer.length)) != -1)
                        jos.write(buffer, 0, len);
                    is.close();
                    jos.closeEntry();
                }
            jos.close();
        }
        catch(IOException ioe)
        {
            Logger.getGlobal().log(Level.SEVERE, ioe.getMessage() + "\n Cannot create jar.");
            return false;
        }
        /*Remove .class files*/
        sourceFiles = new File(workingDirectory + targetDirectory).listFiles();
        for(File f : sourceFiles)
            if(f.getName().contains(".class"))
                f.delete();
        /*Create a bat script to run the jar.*/
        /*This seems to be important for the process of running the .jar on Windows.*/
        try
        {
            FileOutputStream fos = new FileOutputStream(workingDirectory + targetDirectory + "/start.bat");
            PrintWriter pw = new PrintWriter(fos);
            pw.println("java -jar "+jarName);
            pw.close();
            fos.close();
        }
        catch(IOException ioe)
        {
            Logger.getGlobal().log(Level.SEVERE, ioe.getMessage()+"\n Cannot write bat script.");
        }
        return true;
    }
    
    //http://stackoverflow.com/questions/20281835/how-to-delete-a-folder-with-files-using-java
    private void deleteDirectory(File element)
    {
        if (element.isDirectory()) {
            for (File sub : element.listFiles()) {
                deleteDirectory(sub);
            }
        }
        element.delete();
    }
    
    /*Cheating around static initialization.*/
    private void setMainFile()
    {
        mainJava = "package mainPackage;"+
                "import java.io.FileInputStream;import java.io.IOException;import java.io.ObjectInputStream;import java.util.logging.Level;"+
                "import java.util.logging.Logger;import threading.runnables.GameRunnable;import threading.threads.BaseThread;"+
                "public class SdtgMain {private static final String pathToData = System.getProperty(\"user.dir\")+\"//data.sdtgd\";"+
                "public static void main(String[] args){ GameRunnable mainGame = null;try{FileInputStream fis = new FileInputStream(pathToData);"+
                "ObjectInputStream ois = new ObjectInputStream(fis);mainGame = (GameRunnable) ois.readObject();ois.close();fis.close();}"+
                "catch(IOException ioe){Logger.getGlobal().log(Level.SEVERE, ioe.getMessage());System.exit(1);}"+
                "catch(ClassNotFoundException cnfe){Logger.getGlobal().log(Level.SEVERE, cnfe.getMessage() + \"/n File might be corrupted.\");System.exit(2);}"+
                "BaseThread gameCapsule = new BaseThread(mainGame);gameCapsule.start();}}";
    }
    
}
