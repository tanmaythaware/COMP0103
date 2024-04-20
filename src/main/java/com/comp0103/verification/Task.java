package com.comp0103.verification;

//C3
//public class Task {
//
//    static long[] generate(int n) {
//        long[]

//C3R1 for prompt: "complete the java code" followed by C3.
//public class Task {
//
//    static long[] generate(int n) {
//        long[] result = new long[n];
//        for (int i = 0; i < n; i++) {
//            // Generate your long values here, for example:
//            result[i] = i * i; // Just a placeholder example
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int n = 10; // Example: number of elements
//        long[] generatedArray = generate(n);
//        for (long value : generatedArray) {
//            System.out.println(value);
//        }
//    }
//}

//No code in response for the prompt “Property Based Tests showed the following error. Rewrite the java code”. This was followed by the error stack.

//C3R2 for prompt "Give me the complete code. without the property based test"
public class Task {

    // Method to generate Fibonacci sequence up to n terms
    public static long[] generate(int n) {
        long[] fibonacci = new long[n];
        if (n >= 1) {
            fibonacci[0] = 0;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    // Main method for testing
    public static void main(String[] args) {
        int n = 10; // Example: generate Fibonacci sequence up to 10 terms
        long[] fibonacciSequence = generate(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Fibonacci[" + i + "] = " + fibonacciSequence[i]);
        }
    }
}


