package com.automation.comparableProblem;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<ComparableProblem> problem = new ArrayList<ComparableProblem>();
        problem.add(new ComparableProblem(10, 45));
        problem.add(new ComparableProblem(10, 5));
        problem.add(new ComparableProblem(10, 0));
        problem.add(new ComparableProblem(10, 55));

        for(ComparableProblem problem1: problem) {
            System.out.println(problem1.number1+ " " + problem1.number2);
        }
    }
}
