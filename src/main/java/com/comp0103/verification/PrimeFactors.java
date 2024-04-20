package com.comp0103.verification;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//C2
//final class PrimeFactors {
//    static List<BigInteger> of(BigInteger n) {
//        List<BigInteger> primes = new ArrayList<>();
//
//        for (BigInteger candi

//C2R1 for prompt "complete the java code." followed by C2
final class PrimeFactors {
    static List<BigInteger> of(BigInteger n) {
        List<BigInteger> primes = new ArrayList<>();

        for (BigInteger candidate = BigInteger.valueOf(2); n.compareTo(BigInteger.ONE) > 0; candidate = candidate.add(BigInteger.ONE)) {
            while (n.remainder(candidate).equals(BigInteger.ZERO)) {
                primes.add(candidate);
                n = n.divide(candidate);
            }
        }
        return primes;
    }
}



