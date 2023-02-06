package com.day4_SnakeandLadder;

public class UC7_While_Two_Players {
	public static final int WINNING_POSITION = 100;
	static int playerOnePosition=0;
	static int playerTwoPosition=0;
	static int dice1,dice2;
	static int count_player_1=0;
	static int count_player_2=0;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Program");
		DiceRoll(); 

	}
	public static void OptionCheck1()
	{
		int optionCheck=(int) (Math.floor(Math.random()*3));
		switch (optionCheck)
		{
		case 0:
			System.out.println("So its no play");
			System.out.println("Players position would be :"+playerOnePosition);
			break;
		case 1:
			System.out.println("its a Ladder");
			playerOnePosition=playerOnePosition+dice1;
			if(playerOnePosition > WINNING_POSITION)
			{
				playerOnePosition=playerOnePosition -dice1;
			}
			break;
		case 2:
			System.out.println("its a Snake");
			playerOnePosition=playerOnePosition+dice1;
			if(playerOnePosition <0)
			{
				playerOnePosition=0;
			}
			break;		
		
		}
	}

	public static void OptionCheck2()
	{
		int optionCheck=(int) (Math.floor(Math.random()*3));
		switch (optionCheck)
		{
		case 0:
			System.out.println("So its no play");
			System.out.println("Players position would be :"+playerTwoPosition);
			break;
		case 1:
			System.out.println("its a Ladder");
			playerTwoPosition=playerTwoPosition+dice2;
			if(playerTwoPosition > WINNING_POSITION)
			{
				playerTwoPosition=playerTwoPosition -dice2;
			}
			break;
		case 2:
			System.out.println("its a Snake");
			playerTwoPosition=playerTwoPosition+dice2;
			if(playerTwoPosition <0)
			{
				playerTwoPosition=0;
			}
			break;		
		
		}
	}

public static void DiceRoll()
{
	System.out.println("Initial position of the player is :"+playerOnePosition + "and "+playerTwoPosition);
	while(playerOnePosition != WINNING_POSITION && playerTwoPosition != WINNING_POSITION)
	{
		count_player_1++;
		System.out.println("Moves of player 1 :"+count_player_1);
		dice1=(int) (Math.floor((Math.random()*6)+1));
		OptionCheck1();
		System.out.println("player 1 position is"+playerOnePosition);
		System.out.println("------------------------------------------------");
		
		count_player_2++;
		System.out.println("Moves of player 2 :"+count_player_2);
		dice2=(int) (Math.floor((Math.random()*6)+1));
		OptionCheck2();
		System.out.println("player 2 position is"+playerTwoPosition);
		System.out.println("------------------------------------------------");	
		
	}
	if(playerOnePosition ==WINNING_POSITION)
	{
		System.out.println("Player 1 won the game and Took "+" "+count_player_1 + "Moves");
	}
	else
	{
		System.out.println("Player 2 won the game and Took " +" "+count_player_2 + "Moves");
		
	}
}

}
