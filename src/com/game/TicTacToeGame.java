package com.game;
import java.util.Scanner;

public class TicTacToeGame {
	public char player;
	public char computer;
	public char board[][] ;
	public void chooseSymbol() {
		Scanner input = new Scanner(System.in);
		System.out.println("Player please enter the symbol : ");
		player = input.next().charAt(0);
		if(player == 'X') {
			computer = 'O';
			System.out.println("Computer gets " + computer);
		}
		else if(player == 'O'){
			computer = 'X';
			System.out.println("Computer gets " + computer);
		}
		else {
			System.out.println("Please enter a valid input !");
		}
	}
	public void createBoard(){
		board = new char[4][4];
		for(int i = 1 ; i <= 3 ; i++) {
			for(int j = 1 ; j <= 3 ; j++) {
				board[i][j] = ' ';
			}
		}
	}
	public static void main(String[] args) {
		TicTacToeGame gameBoard = new TicTacToeGame();
		gameBoard.createBoard();
		gameBoard.chooseSymbol();
		
	}
}
