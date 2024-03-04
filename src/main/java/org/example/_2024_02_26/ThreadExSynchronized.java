package org.example._2024_02_26;

public class ThreadExSynchronized {

    public static int result = 0;

    //@SneakyThrows
    public static void main(String[] args) throws InterruptedException {
        ThreadExOne one = new ThreadExOne();
        ThreadExTwo two = new ThreadExTwo();
        ThreadExThree three = new ThreadExThree();
        ThreadExFour four = new ThreadExFour();


        one.start();
        two.start();
        three.start();
        four.start();

        one.join();
        two.join();
        three.join();
        four.join();

        System.out.println(ThreadExSynchronized.result);

    }

    public synchronized static void addResult(int value) {
        result += value;
    }
}


class ThreadExOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            //System.out.println("0 -> 25 *** " + i);
            ThreadExSynchronized.addResult(i);
        }
    }
}

class ThreadExTwo extends Thread {
    @Override
    public void run() {
        for (int i = 25; i < 50; i++) {
            //System.out.println("25 -> 50 *** " + i);
            ThreadExSynchronized.addResult(i);
        }
    }

}

class ThreadExThree extends Thread {
    @Override
    public void run() {
        for (int i = 50; i < 75; i++) {
            //System.out.println("50 -> 75 *** " + i);
            ThreadExSynchronized.addResult(i);
        }
    }

}

class ThreadExFour extends Thread {
    @Override
    public void run() {
        for (int i = 75; i <= 100; i++) {
            //System.out.println("76 -> 100 *** " + i);
            ThreadExSynchronized.addResult(i);
        }
    }

}