package com.comp0103.verification;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

// Partial and Syntactically Correct

//C2
//final class PrimeFactors {
//    static List<BigInteger> of(BigInteger n) {
//        List<BigInteger> primes = new ArrayList<>();
//
//        for (BigInteger candi

//C2R1 for prompt "complete the java code." followed by C2
//final class PrimeFactors {
//    static List<BigInteger> of(BigInteger n) {
//        List<BigInteger> primes = new ArrayList<>();
//
//        for (BigInteger candidate = BigInteger.valueOf(2); n.compareTo(BigInteger.ONE) > 0; candidate = candidate.add(BigInteger.ONE)) {
//            while (n.remainder(candidate).equals(BigInteger.ZERO)) {
//                primes.add(candidate);
//                n = n.divide(candidate);
//            }
//        }
//        return primes;
//    }
//}


/*============================================================================*/

//Partial and Syntactically Incorrect

//C5
//final cass PrimeFactors {
//    static List<BigInteger> of(BigInteger ) {
//        List<BigInteger> primes = ArrayList<>();
//
//        for (BigInteger candi


//C5R1 for prompt "Complete java code"

//public final class PrimeFactors {
//    public static List<BigInteger> of(BigInteger n) {
//        List<BigInteger> primes = new ArrayList<>();
//
//        // Start from 2, the smallest prime
//        BigInteger candidate = BigInteger.valueOf(2);
//
//        // Divide by 2 as long as it's even
//        while (n.mod(candidate).equals(BigInteger.ZERO)) {
//            primes.add(candidate);
//            n = n.divide(candidate);
//        }
//
//        // Now check for odd factors from 3 onward
//        candidate = BigInteger.valueOf(3);
//        BigInteger step = BigInteger.valueOf(2);
//        BigInteger max = n.sqrt(); // Don't need to check beyond the square root
//
//        while (candidate.compareTo(max) <= 0) {
//            while (n.mod(candidate).equals(BigInteger.ZERO)) {
//                primes.add(candidate);
//                n = n.divide(candidate);
//                max = n.sqrt(); // Recalculate square root after division
//            }
//            candidate = candidate.add(step); // Move to the next odd number
//        }
//
//        // If there's anything left of n, it is a prime itself
//        if (n.compareTo(BigInteger.ONE) > 0) {
//            primes.add(n);
//        }
//
//        return primes;
//    }
//}

//C5R2 for prompt "infer analysis shows the following error" followed by the error stack

public final class PrimeFactors {
    public static List<BigInteger> of(BigInteger n) {
        List<BigInteger> primes = new ArrayList<>();

        // Start from 2, the smallest prime
        BigInteger candidate = BigInteger.valueOf(2);

        // Divide by 2 as long as it's even
        while (n.mod(candidate).equals(BigInteger.ZERO)) {
            primes.add(candidate);
            n = n.divide(candidate);
        }

        // Now check for odd factors from 3 onward
        candidate = BigInteger.valueOf(3);
        BigInteger step = BigInteger.valueOf(2);

        BigInteger max = sqrt(n); // Use custom sqrt method

        while (candidate.compareTo(max) <= 0) {
            while (n.mod(candidate).equals(BigInteger.ZERO)) {
                primes.add(candidate);
                n = n.divide(candidate);
                max = sqrt(n); // Recalculate square root after division
            }
            candidate = candidate.add(step); // Move to the next odd number
        }

        // If there's anything left of n, it is a prime itself
        if (n.compareTo(BigInteger.ONE) > 0) {
            primes.add(n);
        }

        return primes;
    }

    // Custom sqrt method for BigInteger
    private static BigInteger sqrt(BigInteger n) {
        if (n.compareTo(BigInteger.ZERO) < 0) {
            throw new ArithmeticException("Negative argument.");
        }
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return n;
        }

        // Newton's method for integer square root
        BigInteger x = n;
        BigInteger y = x.add(BigInteger.ONE).divide(BigInteger.valueOf(2));

        while (y.compareTo(x) < 0) {
            x = y;
            y = (y.add(n.divide(y))).divide(BigInteger.valueOf(2));
        }

        return x;
    }
}