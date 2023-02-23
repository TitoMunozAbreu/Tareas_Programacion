Soccer league app

# Java SE 8 - Activity guide

## Table of contents

- [Overview](#overview)
- [My process](#my-process)
  - [What I learned](#what-i-learned)
  - [Continued development](#continued-development)
  - [Useful resources](#useful-resources)
- [Author](#author)
- [Acknowledgments](#acknowledgments)

## Overview
This is a beginner activity which pass through out all the Java fundamental skills.


## My process
I`d taken my time to make this practice.


### What I learned

    - Ones of the many String class methods, I used the methods split and matches which both contains regular expressions (regrex).
    - To call a static method from another class. I called by the named call dot name method.
    - methods could be static and used it in the main class just by calling its own class unless you need to instantiate an object that won't
      necessary.


### Continued development
    - Learn about DAO and DTO concepts
    - Debugging


### Useful resources


The are some code

```Java code
     //call regrex String methods

         //Write code to find the player in team2 whose name contains the string “Sab”.
                for(Player p2:theTeams[2].playerArray){
                    if(p2.playerName.matches(".*Sab.*")){
                        System.out.println("Found " + p2.playerName);

                        System.out.println("Last name is " +
                                p2.playerName.split(" ")[1]);
                        break;
                    }
                }
        //Display all players of team1 in the format lastname, firstname.
        System.out.println(theTeams[1].teamName);
        for(Player p1: theTeams[1].playerArray){
            System.out.print("Last name: " + p1.playerName.split(" ")[0]);
            System.out.println("First name: " + p1.playerName.split(" ")[1]);
            break;
        }

    //call a static method in the main class from other class
        GameUtils.addGameGoals(currGame);

    //create a new method playGame
            public void playGame(){
                //Add the code to create a random number of goals between 0 and 6
                int numberOfGoals = (int) (Math.random()*7);

                //instantiate the Goal array using numberOfGoals to give it the correct number of elements.
                this.goals = new Goal[numberOfGoals];

                //call the addGameGoals method of the GameUtils class.
                GameUtils.addGameGoals(this);//when I called this method I'd surprised inserting a class  by just using this.
            }

```

## Author

- Oracle, code by papaya

## Acknowledgments
