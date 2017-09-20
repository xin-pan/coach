package cn;

import java.util.Arrays;

public class Hello {
    public static void main(String... args) {
        Arrays.stream(args).forEach(arg -> System.out.printf(arg));
    }
}
