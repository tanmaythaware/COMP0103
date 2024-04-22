package com.comp0103.verification;

//Test: FibonacciTest.java

// Partial and Syntactically Correct

//C3
//public class Task {
//
//    static long[] generate(int n) {
//        long[]

//C3R1 for prompt: "complete the java code" followed by C3. (Passed Infer analysis but not property-based tests)
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

//C3R2 for prompt "Give me the complete code. without the property based test" (Passed Infer analysis and property-based tests)
//public class Task {
//
//    // Method to generate Fibonacci sequence up to n terms
//    public static long[] generate(int n) {
//        long[] fibonacci = new long[n];
//        if (n >= 1) {
//            fibonacci[0] = 0;
//        }
//        if (n >= 2) {
//            fibonacci[1] = 1;
//        }
//        for (int i = 2; i < n; i++) {
//            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//        }
//        return fibonacci;
//    }
//
//    // Main method for testing
//    public static void main(String[] args) {
//        int n = 10; // Example: generate Fibonacci sequence up to 10 terms
//        long[] fibonacciSequence = generate(n);
//        for (int i = 0; i < n; i++) {
//            System.out.println("Fibonacci[" + i + "] = " + fibonacciSequence[i]);
//        }
//    }
//}

/*============================================================================*/

//Partial and Syntactically Incorrect

//C6
//public clas Task {
//
//    static long[] generate( n) {
//        long[]


//C6R1 for prompt "Complete Java Code" followed by C6 (Passed Infer analysis but not property-based tests)

//public class Task {
//
//    public static long[] generate(long n) {
//        // Create an array to hold the even numbers
//        long[] evenNumbers = new long[(int) n];
//
//        // Fill the array with the first n even numbers
//        for (int i = 0; i < n; i++) {
//            evenNumbers[i] = 2 * (i + 1);
//        }
//
//        return evenNumbers;
//    }
//
//    public static void main(String[] args) {
//        long n = 5; // Number of even numbers to generate
//        long[] result = generate(n);
//
//        // Print the generated even numbers
//        System.out.println("The first " + n + " even numbers are:");
//        for (long num : result) {
//            System.out.print(num + " ");
//        }
//    }
//}

//C6R2 for prompt “Property Based Test showed the following error. Rewrite the code.” Followed by the error stack (Passed Infer analysis but not property-based tests)
//public class Task {
//
//    // Function to calculate the Fibonacci number for a given index n
//    private long fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
//}

//C6R3 for prompt "Property based test showed the following error" followed by the error stack (Passed Infer analysis but not property-based tests)
//public class Task {
//    // Method to generate the first 'n' Fibonacci numbers
//    private static long[] generate(int n) {
//        long[] fib = new long[n];
//        if (n > 0) {
//            fib[0] = 0;
//        }
//        if (n > 1) {
//            fib[1] = 1;
//        }
//        for (int i = 2; i < n; i++) {
//            fib[i] = fib[i - 1] + fib[i - 2];
//        }
//        return fib;
//    }
//}

//C6R4 for prompt "Property Based test gave the following error.  generate() should be public." followed by the error stack (Passed Infer analysis and property-based tests)
public class Task {
    public static long[] generate(int n) {
        long[] fib = new long[n];
        if (n > 0) {
            fib[0] = 0;
        }
        if (n > 1) {
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}


