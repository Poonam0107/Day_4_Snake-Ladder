package com.day4_SnakeandLadder;

public class UC2_To_Get_NumberBetween_1to6 {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Program");
		int playerPosition=0;
		System.out.println("Position of the player before game start position : "+playerPosition);
        int dice =(int) (Math.floor((Math.random()*6)+1));
        System.out.println("Rolled Dice Number is "+dice);

	}

}
