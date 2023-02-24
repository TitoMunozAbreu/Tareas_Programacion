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
This is a beginner activity which pass throughout all the Java fundamental skills.


## My process
I`d taken my time to make this practice.


### What I learned

    - One of the many String class methods, I used the methods split and matches which both contains regular expressions (regrex).
    - To call a static method from another class. I called by the named call dot name method.
    - methods could be static and used it in the main class just by calling its own class unless you need to instantiate an object that won't necessary.
    - StringTokenizer class very usefull which in this case to name a bunch of players and teams name



### Continued development
    - Learn about DAO and DTO concepts
    - Debugging


### Useful resources

  Some code

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
     }

    //call a static method in the main class from other class
        GameUtils.addGameGoals(currGame);

    //create a new method playGame{
        public void playGame(){
            //Add the code to create a random number of goals between 0 and 6
            int numberOfGoals = (int) (Math.random()*7);
  
            //instantiate the Goal array using numberOfGoals to give it the correct number of elements.
            this.goals = new Goal[numberOfGoals];
  
            //call the addGameGoals method of the GameUtils class.
            GameUtils.addGameGoals(this);//when I called this method I'd surprised inserting a class  by just using this.
        }
    }
            
    // Call StringTokenizer object{    
        public PlayerDatabase(){
            //create a StringTokenizer authorTokens that is built on the authorList String.
            StringTokenizer authorTokens = new StringTokenizer(authorList,",");
            //Instantiate the ArrayList players
            players = new ArrayList<>();
    
            //Create a while loop to iterate through the StringTokenizer
            while (authorTokens.hasMoreTokens()){
                players.add(new Player(authorTokens.nextToken()));
            }
        }
        
        //Other way of using the StringTokenizer object
            public Game[] createGames(Team[] theTeams){
                //Instantiate an ArrayList to hold the games that you will create
                ArrayList<Game> theGames = new ArrayList<>();
                //Create a for loop to iterate through all the teams in the Team array
                    for(Team homeTeam : theTeams){
                        for(Team awayTeam : theTeams){
                            //check that each teams are differents
                            if(homeTeam!=awayTeam){
                                //create a Game for each iteration of the inner loop.
                                theGames.add(new Game(homeTeam,awayTeam));
                            }
                        }
                    }
                  return (Game[]) theGames.toArray( new Game[1] );
                } 
            }
    }

```

## Author

- Oracle, code by papaya

## Acknowledgments
