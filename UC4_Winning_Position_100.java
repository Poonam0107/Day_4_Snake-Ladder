package com.day4_SnakeandLadder;

public class UC4_Winning_Position_100 {

	public static final int WINNING_POSITION = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Program");
		int playerPosition=0;
		System.out.println("Position of the player before game start position : "+playerPosition);
		while (playerPosition !=WINNING_POSITION)
		{
			System.out.println("Roll Dice to Move");
			int dice =(int) (Math.floor((Math.random()*6)+1));
			int chance =(int) Math.floor(Math.random()*3);
			if(chance==0) 
			{
				System.out.println("No Play");
				playerPosition=playerPosition;
			}
			else if(chance==1)
			{
				System.out.println("Got a Ladder");
				if(playerPosition<WINNING_POSITION)
				{
					playerPosition=playerPosition +dice;
				}
				else
				{
					playerPosition=playerPosition;
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
			
		}

	}

}
