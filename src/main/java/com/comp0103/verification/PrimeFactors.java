package com.comp0103.verification;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

final class PrimeFactors {
    static List<BigInteger> of(BigInteger n) {
        List<BigInteger> primes = new ArrayList<>();

        for (BigInteger candidate = BigInteger.valueOf(2);
             n.compareTo(ONE) > 0;
             candidate = candidate.add(ONE)) {

            for (; n.mod(candidate).equals(ZERO); n = n.divide(candidate))
                primes.add(candidate);
        }

        return primes;
    }

    private PrimeFactors() {
        throw new UnsupportedOperationException();
    }
}
