package ru.netology;

public class Box implements Runnable {

    public static final int BOX_PAUSE = 1000;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Main.toggle) {
                Main.toggle = false;
                System.out.println("Коробка выключила тумблер");
            }
        }
    }
}