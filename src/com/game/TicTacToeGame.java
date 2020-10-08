package com.game;

public class TicTacToeGame {
	public char board[][] ;
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
	}
}
