package org.example._2024_03_04;

public class Three {
    public static void main(String[] args) {

        Storage storage = new Storage();

        Factory factory = new Factory(storage);
        Delivery delivery = new Delivery(storage);
        Customer customer = new Customer(storage);

        Thread factoryThread = new Thread(factory);
        Thread deliveryThread = new Thread(delivery);
        Thread customerThread = new Thread(customer);

        factoryThread.start();
        customerThread.start();
        deliveryThread.start();
    }

    static class Storage {
        private int item = 0;
        private int order = 0;
        private final Object lock = new Object();


        public void makeManufacture() {
            synchronized (lock) {
                while (item >= 5) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                item++;
                System.out.println("the Factory produces. production = " + item);
                lock.notifyAll();
            }
        }

        public void makeOrder() {
            synchronized (lock) {
                while (item < 1 || order >= item) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                order++;
                System.out.println("customer makes an order. quantity orders = " + order);
                lock.notifyAll();
            }
        }

        public void makeDelivery() {
            synchronized (lock) {
                while (item < 1 || order < 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                item--;
                order --;
                System.out.println("do delivery. production = " + item);
                lock.notifyAll();
            }
        }


    }

    static class Factory implements Runnable {
        Storage storage;

        public Factory(Storage storage) {
            this.storage = storage;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                storage.makeManufacture();
            }
        }
    }

    static class Delivery implements Runnable {
        Storage storage;

        public Delivery(Storage storage) {
            this.storage = storage;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                storage.makeDelivery();
            }
        }
    }

    static class Customer implements Runnable {

        Storage storage;

        public Customer(Storage storage) {
            this.storage = storage;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                storage.makeOrder();

            }
        }
    }
}
