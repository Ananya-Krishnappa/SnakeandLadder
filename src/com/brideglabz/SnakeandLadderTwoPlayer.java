package com.brideglabz;

public class SnakeandLadderTwoPlayer {
	public static void main(String args[]) {
		int playerPos1 = 0;
		int playerPos2 = 0;
		int min = 1;
		int max = 6;
		int min1 = 1;
		int max1 = 3;
		boolean player1Turn = true;
		while (playerPos1 != 100 && playerPos2 != 100) {
			boolean playAgain = false;
			int randomDice = min + (int) (Math.random() * ((max - min) + 1));
			int randomOption = min1 + (int) (Math.random() * ((max1 - min1) + 1));
			switch (randomOption) {
			case 1:
				break;
			case 2:
				if (player1Turn) {
					if ((playerPos1 + randomDice) <= 100) {
						playerPos1 += randomDice;
					}
				} else {
					if ((playerPos2 + randomDice) <= 100) {
						playerPos2 += randomDice;
					}
				}
				playAgain = true;
				break;
			case 3:
				if (player1Turn) {
					if ((playerPos1 - randomDice) >= 0) {
						playerPos1 -= randomDice;
					}
				} else {
					if ((playerPos2 - randomDice) >= 0) {
						playerPos2 -= randomDice;
					}
				}
				break;
			}
			System.out.println("Position of player1 " + playerPos1);
			System.out.println("Position of player2 " + playerPos2);
			if (!playAgain) {
				player1Turn = !player1Turn;
			}
		}
		String player = (playerPos1 == 100) ? "Player1" : "Player2";
		System.out.println("Game won by " + player);

	}
}
