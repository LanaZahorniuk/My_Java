package org.example._2023_12_13;

import java.util.ArrayList;
import java.util.Arrays;

public interface Queue2023<T> {

    void put(T t);

    boolean isEmpty();

    T get();

    T pop();

    class QueueImpl<T> implements Queue2023<T> {
        ArrayList<T> arrayList = new ArrayList<>();

        @Override
        public void put(T t) {
            arrayList.add(t);
        }

        @Override
        public boolean isEmpty() {
            if (this.arrayList.size() == 0) {
                return true;
            }
            return false;
        }

        @Override
        public T get() {
            T t = arrayList.get(0);
            return t;
        }

        @Override
        public T pop() {
            T t = get();
            arrayList.remove(t);
            return t;
        }

        @Override
        public String toString() {
            return "QueueImpl{" +
                    "arrayList=" + arrayList +
                    '}';
        }
    }

}
