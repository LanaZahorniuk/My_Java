package org.example._2024_02_28;

import java.io.*;

public class DaemonTex {
    public static void main(String[] args) {
        System.out.println("MAIN START");
        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        System.out.println("MAIN END");
    }
}

class UserThread extends Thread {

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("User.txt"));) {
            for (char c = '!'; c < 'z'; c++) {
                try {
                    Thread.sleep(222);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                writer.write(c);
                System.out.println("USER THREAD: " + c);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class DaemonThread extends Thread {

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Daemon.txt"));) {
            for (int i = 0; i < 999; i++) {
                try {
                    Thread.sleep(555);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                writer.write(String.valueOf(i));
                System.out.println("DAEMON: " + i);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}