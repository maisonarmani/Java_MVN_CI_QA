package com.company;


public class Main {
    private enum Mirrors{
        CLEAR, DEAD, ALIVE
    }

    public static void main(String[] args) {

        CyclicBarrierDemo demo = new CyclicBarrierDemo();
        demo.runSimulation(5, 3);
    }
}


