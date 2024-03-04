package org.example._2024_02_28;

public class Deadlock {
    private final Object LOCK1 = new Object();
    private final Object LOCK2 = new Object();

    public void m1() {
        synchronized (LOCK1) {
            System.out.println("start_1");
            synchronized (LOCK2) {
                System.out.println("end_1");
            }
        }
    }

    public void m2() {
        synchronized (LOCK2) {
            System.out.println("start_2");
            synchronized (LOCK1) {
                System.out.println("end_2");
            }
        }
    }

    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();

        Runnable m11 = deadlock.new M11();
        Runnable m22 = deadlock.new M22();

        Thread thread1 = new Thread(m11);
        Thread thread2 = new Thread(m22);

        thread1.start();
        thread2.start();
    }

    class M11 implements Runnable {

        @Override
        public void run() {
            new Deadlock().m1();
        }
    }

    class M22 implements Runnable {

        @Override
        public void run() {
            new Deadlock().m2();
        }
    }
}
