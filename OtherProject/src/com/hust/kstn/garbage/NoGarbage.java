package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class NoGarbage {
    // Read a file (or generate data if no file) and build String using StringBuilder (efficient)
    public static void main(String[] args) {
        byte[] inputBytes = null;
        if (args.length > 0) {
            String filename = args[0];
            try {
                inputBytes = Files.readAllBytes(Paths.get(filename));
            } catch (IOException e) {
                System.err.println("Cannot read file: " + filename + " -> will generate data instead");
            }
        }

        if (inputBytes == null) {
            // generate ~4MB of random bytes to simulate a large file
            Random rnd = new Random(123);
            inputBytes = new byte[4 * 1024 * 1024];
            rnd.nextBytes(inputBytes);
        }

        System.out.println("NoGarbage: building using StringBuilder (efficient)...");
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(inputBytes.length);
        for (byte b : inputBytes) {
            sb.append((char) (b & 0xFF));
        }
        String output = sb.toString();
        long end = System.currentTimeMillis();
        System.out.println("Done. Length=" + output.length() + ", time=" + (end - start) + " ms");
    }
}
