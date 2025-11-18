package com.hust.kstn.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        final int ITER = 65536;
        Random r = new Random(123);

        // Using String + in loop
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < ITER; i++) {
            s += r.nextInt(2);
        }
        System.out.println("String + time: " + (System.currentTimeMillis() - start) + " ms (length=" + s.length() + ")");

        // Using StringBuilder
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(ITER * 2);
        for (int i = 0; i < ITER; i++) {
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        System.out.println("StringBuilder time: " + (System.currentTimeMillis() - start) + " ms (length=" + s.length() + ")");

        // Using StringBuffer
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer(ITER * 2);
        for (int i = 0; i < ITER; i++) {
            sbuf.append(r.nextInt(2));
        }
        s = sbuf.toString();
        System.out.println("StringBuffer time: " + (System.currentTimeMillis() - start) + " ms (length=" + s.length() + ")");
    }
}
