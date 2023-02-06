package com.day4_SnakeandLadder;

public class UC3_Check_For_Option {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Program");
		int playerPosition=0;
		System.out.println("Position of the player before game start position : "+playerPosition);
        int dice =(int) (Math.floor((Math.random()*6)+1));
        System.out.println("Rolled Dice Number is "+dice);
        int chance =(int) Math.floor((Math.random()*3)+1);
        if(chance==0)
        {
        	System.out.println("No Play");
        	playerPosition=playerPosition;
        	System.out.println("Position of the player after roll is : "+playerPosition);
        	
        }
        else if(chance==1)
        {
        	System.out.println("Got a Lader");
        	playerPosition=playerPosition+dice;
        	System.out.println("Position of the player after roll is : "+playerPosition);
        	
        }
        else
        {
        	System.out.println("Hit with Snake: ");
        	playerPosition=playerPosition-dice;
        	if(playerPosition < 0)
        	{
        		playerPosition=0;
        	}
        	System.out.println("Position of the player after roll is : "+playerPosition);
        	
        	
        }
        
	}

}
