A text-based-sci-fi-action-adventure-rpg game(or engine).

### Setup Instructions  
1. Obtain git [For Windows](https://git-scm.com/download/win) or follow the instructions [For Ubuntu](https://help.ubuntu.com/lts/serverguide/git.html).  
2. Open git-bash, or terminal on ubuntu.
3. Use `git init` after navigating to your desired development folder.
4. You can either: 
   1. clone the repo `git clone https://github.com/olgunataberk/SDtG`,  
   2. or add it as a remote repository and then fetch/pull from there `git remote add <reference_name> https://github.com/olgunataberk/SDtG` followed by `git pull <reference_name> master`.
5. Download [Antlr](http://www.antlr.org/) and set it as your projects dependency.
   - In Eclipse: Project Properties -> Java Build Path -> Libraries -> Add JARs -> Select the jar you downloaded from antlr.org.
6. Now you are ready to work with the project on your favourite IDE(although I strongly suggest using Eclipse).

## How to Make a Game  

(This works for Windows)
Currently you can override "Example.txt" with your Script™. When executed SDtG will produce a bat file in a folder in your project folder named "exec/start.bat", which will execute the jar file.

## How to Write a script  

### What is a script?  

Script™ is a text file that SDtG needs to create an executable text-based game. Currently you can specify:

- conversations between entities,
- questions to the player,
- again conversations that happen depending on the player's choices' 

in your Script™.

### Instructions

- #### How to make a regular conversation.
   
   The syntax of regular conversations is very simple. First you must specify a name, let it be `jaraxxus` for the following example. If `jaraxxus` is supposed to talk(which should be the case if you are creating a regular conversation) you can write down what the entity will say between two double quotation marks preceeded by a colon. 
   
   In the end it should look like this -> `jaraxxus : "You face jaraxxus!"`.
   
   Also note that whitespace is not important outside the text enclosed by quotation marks, meaning `jaraxxus:"You face jaraxxus!"` and the above example would be the same.

- #### How decision making works.

   - #### KarmaVariables
   
      Decisions are made depending on the results of boolean expressions that are based on relational operations applied on what we call KarmaVariables, storage units that hold integer values.
      
      You must declare any variable you use at the top of your script, if you are going to use 3 variables named k1,k2 and k3 ; you can declare them as follows.
      
      ```
      initialize
      (k1,k2,k3)
      end
      ```
      
   - #### Choice dependant conversations
   
      You might want certain conversations to happen depending on the player's choices. For those conversations you must specify an expression. The expression will be evaluated during gameplay and if it evaluates to true, the line accompanying it will be displayed.

      For example `(k1>50)jaraxxus:"Who am I?"` will be displayed only if k1 is bigger than 50 at that time.
      
   - #### Text Blocks
      
      For multiple lines of text that require the evaluation of a single condition, you can use text blocks.
      ```
      (k1>50)
      {
         jaraxxus : "Am I really jaraxxus?"
         jaraxxus : "Who am I?"
      }
      ```
      will be displayed sequentially when `k1>50` is satisfied.
- #### How ask for/handle input from user.
   
   This is a bit more complicated than defining a regular conversation. After specifying a name, you must write down the question and answers available to that question one by one enclosed by square brackets. Answers are defined as sets of two elements where the first one is the string representation of the choice and the other one is the procedure implying which KarmaVariables are affected in what way.
   
   For example `jaraxxus:["Am I really jaraxxus?" "Yes":(k1+50)(k3-50),"Maybe"(k1-50),"I don't think so"(k2-40)]` would be displayed as:
   
   ```
   jaraxxus : "Am I really jaraxxus?"
   Yes|Maybe|I don't think so
   ```
   
   When the player chooses an option the accompanying expressions are evaluated. On this example, if the player were to type "Yes", k1 would be incremented by 50 and k3 would be decremented by 50.
