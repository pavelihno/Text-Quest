package com.example.textquest;

public final class History {
    private static History instance;
    public int balance;

    private History() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.balance = 1000;
    }

    public static History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }
}

