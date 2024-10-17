package com.automation.designPattern.lldtictactoe.gamemanagement;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Board implements BoardFeatures{

    Scanner scn = new Scanner(System.in);
    private GameBoard board;

    private Queue<Player> userChoices = new LinkedList<>();

    Player p1, p2;

    public Board(GameBoard board) {
        p1= new Player();
        p2= new Player();
        p1.setGameName("Alex");
        p2.setGameName("Bob");
        board.setSituation(EventType.ONGOING);

        // OnBoarding 2 New Players
        p1.setUserSymbol(Symbol.ZERO);
        p2.setUserSymbol(Symbol.CROSS);

        this.userChoices.add(p1);
        this.userChoices.add(p2);

        this.board = board;
    }
    @Override
    public void judge() {
        for(int i  = 0 ; i < board.getBoardSize() ; ++i)
        {
            Character start = board.getBoard()[i][0];

            int count = 0;
            for(int  j = 0 ; j < board.getBoardSize(); ++j){
                if(board.getBoard()[i][j].equals(start)){
                    count  = count + 1;
                }
            }

            if(count == board.getBoardSize()){
                if(start.equals(Symbol.ZERO.getValue()))
                {

                    board.setSituation((EventType.WIN));

                }
                if(start.equals(Symbol.CROSS.getValue()))
                {
                    board.setSituation((EventType.WIN));

                }
            }

        }

        // Coloumn Check

        for(int i  = 0 ; i < board.getBoardSize() ; ++i)
        {
            Character start = board.getBoard()[0][i];
            int count = 0;
            for(int  j = 0 ; j < board.getBoardSize(); ++j){
                if(board.getBoard()[j][i] == start){
                    count  = count + 1;
                }
            }

            if(count == board.getBoardSize()){
                if(start.equals(Symbol.ZERO.getValue()))
                {
                    board.setSituation((EventType.WIN));
                }
                if(start.equals(Symbol.CROSS.getValue()))
                {
                    board.setSituation((EventType.WIN));

                }
            }
        }


        // Diagonal check
        Character start = board.getBoard()[0][0];
        int count = 0;
        for(int i = 0 ; i < board.getBoardSize() ; ++i){
            if(board.getBoard()[i][i] == start) count = count + 1;
        }

        if(count == board.getBoardSize()){
            if(start.equals(Symbol.ZERO.getValue()))
            {
                board.setSituation((EventType.WIN));

            }
            if(start.equals(Symbol.CROSS.getValue()))
            {
                board.setSituation((EventType.WIN));

            }
        }


        // Reverse Diagonal Check

        count = 0;
        start = board.getBoard()[0][board.getBoardSize() - 1];

        for (int i = 0 ; i < board.getBoardSize() ; ++i){
            for (int  j = 0 ; j < board.getBoardSize() ; ++j){
                if((i + j) == board.getBoardSize() - 1){
                    if(board.getBoard()[i][j] == start){
                        count = count + 1;
                    }
                }
            }
        }

        if(count == board.getBoardSize()){
            if(start.equals(Symbol.ZERO.getValue()))
            {
                board.setSituation((EventType.WIN));

            }
            if(start.equals(Symbol.CROSS.getValue()))
            {
                board.setSituation((EventType.WIN));
            }
        }

        if(board.getMoves() < board.getBoardSize() * board.getBoardSize()){
            if(!board.getSituation().equals(EventType.WIN))
                board.setSituation(EventType.ONGOING);
        }
        else
        {
            if(!board.getSituation().equals(EventType.WIN)){
                board.setSituation(EventType.DRAW);
            }
        }

    }

    @Override
    public void announceTurn(Player p) {
        System.out.println(p.getGameName() + "Turn");
    }

    @Override
    public Integer makeChoice(Player p) {
        System.out.println( p.getGameName() + " Please Make a Choice");
        System.out.println("Make a Numeric Choice b/w 0 & " + board.getBoardSize() * board.getBoardSize());
        Integer choice = scn.nextInt();
        return choice;
    }

    @Override
    public Boolean isValid(Integer choice) {
        return (choice>=0 && choice<board.getBoardSize() *board.getBoardSize()) &&
                (board.getBoard()[(int) choice / board.getBoardSize()][(int)choice % board.getBoardSize()].equals(Symbol.START.getValue()));
    }


    @Override
    public void doChanges(Integer choice, Player p) {
        int x = choice / board.getBoardSize();
        int y = choice % board.getBoardSize();
        board.getBoard()[x][y] = p.getUserSymbol().getValue();
        userChoices.add(p);

        judge();
    }

    @Override
    public void MakeMove() {
        Player p = userChoices.poll();
        announceTurn(p);

        Integer choice = makeChoice(p);
        // keep Asking untill player dont give a correct choice
        while(!isValid(choice)){
            choice = makeChoice(p);
        }
        board.setMoves(board.getMoves() + 1);
        board.setSituation(board.getSituation());
        doChanges(choice,p);
    }

    public GameBoard getBoard() {
        return board;
    }

    public void setBoard(GameBoard board) {
        this.board = board;
    }

    public Queue<Player> getUserChoices() {
        return userChoices;
    }

    public void setUserChoices(Queue<Player> userChoices) {
        this.userChoices = userChoices;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public Player getP2() {
        return p2;
    }

    public void setP2(Player p2) {
        this.p2 = p2;
    }
}
