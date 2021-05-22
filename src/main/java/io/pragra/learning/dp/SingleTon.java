package io.pragra.learning.dp;

public class SingleTon {
    // ThreadSafe
    private static volatile SingleTon instance;

    private SingleTon() {
    }

    public static SingleTon getInstance(){
        synchronized (SingleTon.class) {
            if (instance == null) {
                instance = new SingleTon();
            }
        }
        return instance;
    }
}
