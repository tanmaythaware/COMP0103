package com.comp0103.verification;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static com.comp0103.verification.Fibonacci.generateFibonacci;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitQuickcheck.class)
public class FibonacciTest {
//    @Property
//    public void fibonacciTest(@InRange(minInt = 0, maxInt = 30)int n) {
//        if (n < 0) return; // Handling negative input
//        long[] fib = generateFibonacci(n);
//        if (n == 0) {
//            assertEquals(0, fib.length);
//        } else if (n == 1) {
//            assertEquals(1, fib.length);
//            assertEquals(0, fib[0]);
//        } else if (n == 2) {
//            assertEquals(2, fib.length);
//            assertEquals(0, fib[0]);
//            assertEquals(1, fib[1]);
//        } else {
//            assertEquals(fib[n - 1] + fib[n - 2], fib[n]);
//        }
//    }

    @Property
    public void fibonacciTest(@InRange(minInt = 2, maxInt = 100)int n) {
        long[] fib = generateFibonacci(n);
        if (n == 2) {
            assertEquals(2, fib.length);
            assertEquals(0, fib[0]);
            assertEquals(1, fib[1]);
        } else {
            assertEquals(fib[n - 2] + fib[n - 3], fib[n-1]);
        }
    }
}
