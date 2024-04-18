package com.comp0103.verification;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import java.math.BigInteger;
import org.junit.runner.RunWith;


@RunWith(JUnitQuickcheck.class)
public class PrimeFactorsPropertiesTest {
    @Property(trials = 10) public void factorsPassPrimalityTest(
            BigInteger n) {

        assumeThat(n, greaterThan(ZERO));

        for (BigInteger each : PrimeFactors.of(n))
            assertTrue(each.isProbablePrime(100));
    }

    @Property(trials = 10) public void factorsMultiplyToOriginal(
            BigInteger n) {

        assumeThat(n, greaterThan(ZERO));

        BigInteger product = ONE;
        for (BigInteger each : PrimeFactors.of(n))
            product = product.multiply(each);

        assertEquals(n, product);
    }

    @Property(trials = 10) public void factorizationsAreUnique(
            BigInteger m,
            BigInteger n) {

        assumeThat(m, greaterThan(ZERO));
        assumeThat(n, greaterThan(ZERO));
        assumeThat(m, not(equalTo(n)));

        assertThat(PrimeFactors.of(m), not(equalTo(PrimeFactors.of(n))));
    }
}
