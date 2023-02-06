package com.day4_SnakeandLadder;

public class UC6_Report_The_Number {

	public static final int WINNING_POSITION = 100;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Program");
		int playerPosition=0;
		int i=0;
		System.out.println("Position of the player before game start position : "+playerPosition);
		while (playerPosition !=WINNING_POSITION)
		{
			System.out.println("Roll Dice to Move");
			int dice =(int) (Math.floor((Math.random()*6)+1));
			System.out.println("The Dice is :"+dice);
			int chance =(int) Math.floor(Math.random()*3);
			if(chance==0) 
			{
				System.out.println("No Play");
				playerPosition=playerPosition;
				i++;
			}
			else if(chance==1)
			{
				System.out.println("Got a Ladder");
				if(playerPosition<WINNING_POSITION)
				{
					playerPosition=playerPosition +dice;
					i++;
					if(playerPosition>WINNING_POSITION)
					{
						System.out.println("position getting more than 100");
						playerPosition=playerPosition-dice;
					}
					}
				else
				{
					playerPosition=playerPosition;
					i++;
				}
		  }
			else
			{
				System.out.println("Hit with snake");
				playerPosition=playerPosition-dice;
				if(playerPosition <0)
				{
					playerPosition=0;
				}
			}
			System.out.println("player present position is "+playerPosition);
			System.out.println("Moves : "+i);
			
		}
		System.out.println("");
		System.out.println("Moves required to finish Game is :"+i);
	}

}
