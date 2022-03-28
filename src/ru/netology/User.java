package ru.netology;

public class User implements Runnable {

    private static final int ENABLING = 5;
    public static final int USER_PAUSE = 2000;

    @Override
    public void run() {
        for (int i = 0; i < ENABLING; i++) {
            if (!Main.toggle) {
                Main.toggle = true;
                System.out.println("Пользователь включил тумблер.");
                try {
                    Thread.sleep(USER_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}