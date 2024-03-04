package org.example._2024_02_26;

import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExAtomicInt {

    public static AtomicInteger result = new AtomicInteger();

    @SneakyThrows
    public static void main(String[] args) { // throws InterruptedException
        ThreadExAtomicIntOne one = new ThreadExAtomicIntOne();
        ThreadExAtomicIntTwo two = new ThreadExAtomicIntTwo();
        ThreadExAtomicIntThree three = new ThreadExAtomicIntThree();
        ThreadExAtomicIntFour four = new ThreadExAtomicIntFour();


        one.start();
        two.start();
        three.start();
        four.start();

        one.join();
        two.join();
        three.join();
        four.join();

        System.out.println(ThreadExAtomicInt.result);

    }
}



class ThreadExAtomicIntOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            //System.out.println("0 -> 25 *** " + i);
            ThreadExAtomicInt.result.addAndGet(i);
        }
    }
}

class ThreadExAtomicIntTwo extends Thread {
    @Override
    public void run() {
        for (int i = 25; i < 50; i++) {
            //System.out.println("25 -> 50 *** " + i);
            ThreadExAtomicInt.result.addAndGet(i);
        }
    }

}

class ThreadExAtomicIntThree extends Thread {
    @Override
    public void run() {
        for (int i = 50; i < 75; i++) {
            //System.out.println("50 -> 75 *** " + i);
            ThreadExAtomicInt.result.addAndGet(i);
        }
    }

}

class ThreadExAtomicIntFour extends Thread {
    @Override
    public void run() {
        for (int i = 75; i <= 100; i++) {
            //System.out.println("76 -> 100 *** " + i);
            ThreadExAtomicInt.result.addAndGet(i);
        }
    }

}