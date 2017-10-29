package com.bridgeit.Utility;

import java.util.Random;
import java.util.Scanner;

public class TicUtility {
	 Scanner in =new Scanner (System.in);
	 private int counter;
     private char posn[]=new char[10];
	 private char player;
	 /*
	* This method is used to draw the new board.
	**/
	 public void newBoard()
	 {
	
	 char[] posndef = {'0','1','2','3','4','5','6','7','8','9'};
	 int i;
	 counter = 0;
	 player = 'X';
	
	 for (i=1; i<10; i++)
	{posn[i]=posndef[i];}
	 currentBoard();
	}

	
	 /*
	 * This method is used to display the current board status.
	**/
	 public String currentBoard()
	{
	 System.out.println( "\n\n" );
	 System.out.println( "\n\n" );
	 System.out.println( "\n\n\t\t"+posn[1]+" | "+posn[2]+" | "+posn[3]);
    System.out.println( "\t\t  |   | " );
	 System.out.println( "\t\t__|___|___ " );
	 System.out.println( "\n\n\t\t"+posn[4]+" | "+posn[5]+" | " +posn[6]);
	 System.out.println( "\t\t  |   | " );
	 System.out.println( "\t\t__|___|___ " );
	 System.out.println( "\n\n\t\t"+posn[7]+" | "+posn[8]+" | " +posn[9]);
	 System.out.println( "\t\t  |   | " );
    System.out.println( "\t\t  |   | " );
	 System.out.println( "\n\n" );
	 return "currentBoard";
	 }
	 /*
	 * This method is used to play the cross game.
	**/
	 public void play()
	{
	 int spot;
	char blank = ' ';
	
	System.out.println( "Player " + getPlayer() +" will go first and be the letter 'X'+" );
	
	 do{
	currentBoard(); // display current board
	
	 System.out.println( "\n\n Player " + getPlayer() +" choose a posn."
	);
	boolean posTaken = true;
	while (posTaken){
	 if(getPlayer()=='X'){
	
	 spot=in.nextInt();
	 }
	 else{
	 Random m=new Random();
	 spot = m.nextInt(9);
	}
	 posTaken = checkPosn(spot);
	 if(posTaken==false)
	 posn[spot]=getPlayer();
	 }
	
	 System.out.println( "Nice move." );
	 currentBoard(); // display current board
	nextPlayer();
	 }while ( checkWinner() == blank );
	
	 }
	 /*
    * This method is used to check the winner of the game.
	 **/
	
	 public char checkWinner()
	 {
	 char Winner = ' ';
	
	 // Check if X wins
	 if (posn[1] == 'X' && posn[2] == 'X' && posn[3] == 'X') Winner = 'X';
	 if (posn[4] == 'X' && posn[5] == 'X' && posn[6] == 'X') Winner = 'X';
	 if (posn[7] == 'X' && posn[8] == 'X' && posn[9] == 'X') Winner = 'X';
	 if (posn[1] == 'X' && posn[4] == 'X' && posn[7] == 'X') Winner = 'X';
	 if (posn[2] == 'X' && posn[5] == 'X' && posn[8] == 'X') Winner = 'X';
	 if (posn[3] == 'X' && posn[6] == 'X' && posn[9] == 'X') Winner = 'X';
	 if (posn[1] == 'X' && posn[5] == 'X' && posn[9] == 'X') Winner = 'X';
	 if (posn[3] == 'X' && posn[5] == 'X' && posn[7] == 'X') Winner = 'X';
	 if (Winner == 'X' )
	
	 {
	 System.out.println("Player1 wins the game." );
	 return Winner;
	 }
	
	 // Check if O wins
	 if (posn[1] == 'O' && posn[2] == 'O' && posn[3] == 'O') Winner = 'O';
	 if (posn[4] == 'O' && posn[5] == 'O' && posn[6] == 'O') Winner = 'O';
	 if (posn[7] == 'O' && posn[8] == 'O' && posn[9] == 'O') Winner = 'O';
	 if (posn[1] == 'O' && posn[4] == 'O' && posn[7] == 'O') Winner = 'O';
	 if (posn[2] == 'O' && posn[5] == 'O' && posn[8] == 'O') Winner = 'O';
	 if (posn[3] == 'O' && posn[6] == 'O' && posn[9] == 'O') Winner = 'O';
	 if (posn[1] == 'O' && posn[5] == 'O' && posn[9] == 'O') Winner = 'O';
	 if (posn[3] == 'O' && posn[5] == 'O' && posn[7] == 'O') Winner = 'O';
	 if (Winner == 'O' )
	 {
	 System.out.println( "Player2 wins the game." );
	 return Winner; }
	
	 // check for Tie
	 for(int i=1;i<10;i++)
	 {
	 if(posn[i]=='X' || posn[i]=='O')
	 {
	 if(i==9)
	 {
	 char Draw='D';
	 System.out.println(" Game is stalemate ");
	 return Draw;
	 }
	 continue;
	 }
	 else
	 break;
	
	 }
	
	 return Winner;
	 }
	 /*
	 * This method is used to check board position.
	 **/
	
	 public boolean checkPosn(int spot)
	 {
	
	
	 if (posn[spot] == 'X' || posn[spot] == 'O')
	 {
	 System.out.println("That posn is already taken, please choose another");
	 return true;
	 }
	 else {
	 return false;
	 }
	
	 }

	

	 /*
	 * This method is used to get the next player.
	 **/
	
	 public void nextPlayer()
	 {
	 if (player == 'X')
	 player = 'O';
	 else player = 'X';
	
	 }
	 /*
	 * This method is used to display title.
	 **/
	 public String getTitle()
	 {
	 return "Cross Game" ;
	 }
	 /*
	 * This method is used to get the current player.
	 **/
	 public char getPlayer()
	 {
	 return player;
	 }
	
}
