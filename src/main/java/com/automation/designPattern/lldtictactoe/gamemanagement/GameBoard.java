package com.automation.designPattern.lldtictactoe.gamemanagement;

public class GameBoard implements GameBoardFeature{

    private int boardSize;

    private int moves = 0;

    private  EventType situation = EventType.ONGOING;
    private Character [][] board ;

    public GameBoard(int size){
        boardSize = size;

    }
    @Override
    public void initialize() {
        board = new Character[boardSize + 1][boardSize + 1];
        for(int i = 0 ; i <boardSize ; ++i){
            for(int j = 0 ; j < boardSize ; ++j){

                board[i][j] = Symbol.START.getValue();

            }
        }
    }

    @Override
    public void display() {
        for(int i = 0 ; i <boardSize ; ++i){
            for(int j = 0 ; j < boardSize ; ++j){

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public EventType getSituation() {
        return situation;
    }

    public void setSituation(EventType situation) {
        this.situation = situation;
    }

    public Character[][] getBoard() {
        return board;
    }

    public void setBoard(Character[][] board) {
        this.board = board;
    }
}
