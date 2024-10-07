package com.automation.comparableProblem;

public class ComparableProblem implements Comparable<ComparableProblem>{


        int number1;
        int number2;

        public ComparableProblem(int n1, int n2) {
            this.number1=n1;
            this.number2=n2;
        }


        @Override
        public int compareTo(ComparableProblem o) {
            return o.number2-this.number2;
        }

//    @Override
//    public String toString() {
//        return "ComparableProblem{" +
//                "number1=" + number1 +
//                ", number2=" + number2 +
//                '}';
//    }
}
