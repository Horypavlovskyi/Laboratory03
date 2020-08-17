package com.google;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte a = 25;
        short b = (byte)a;
        int c = (byte)a;
        long d = (byte)a;
        float e = 3.14f;
        double f = (int)c;
        char g = 165;
        boolean h = true;
        System.out.println(a);
        System.out.println((b));
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        int max = 2_147_483_647;
        float min = (float)max;
        System.out.println(max);
        System.out.println(min);

        byte power = 127;
        power++;
        System.out.println(power);

        System.out.println(7 % 2 == 0 ? "Even" : "Odd");
    }
}
