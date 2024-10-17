package com.automation.designPattern.lldtictactoe;

import com.automation.designPattern.lldtictactoe.gamemanagement.Board;
import com.automation.designPattern.lldtictactoe.gamemanagement.Game;
import com.automation.designPattern.lldtictactoe.gamemanagement.GameBoard;

public class TicTacToeGame {

    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard(3);
        Board board = new Board(gameBoard);
        Game game= new Game(board);
        game.run();

    }
}
