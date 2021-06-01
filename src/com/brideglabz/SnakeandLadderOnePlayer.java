package com.brideglabz;

public class SnakeandLadderOnePlayer {
	public static void main(String args[]) {
		int position = 0;
		int min = 1;
		int max = 6;
		int min1 = 1;
		int max1 = 3;
		int count = 0;
		while (position != 100) {
			count++;
			int randomDice = min + (int) (Math.random() * ((max - min) + 1));
			int randomOption = min1 + (int) (Math.random() * ((max1 - min1) + 1));
			switch (randomOption) {
			case 1:
				break;
			case 2:
				if ((position + randomDice) <= 100) {
					position += randomDice;
				}
				break;
			case 3:
				if ((position - randomDice) >= 0) {
					position -= randomDice;
				}
				break;
			}
			System.out.println("Position after " + count + " dice rolls is " + position);
		}
		System.out.println("Congratulations you won!!");
		System.out.println("Number of times the dice was rolled to win the game: " + count);

	}
}
