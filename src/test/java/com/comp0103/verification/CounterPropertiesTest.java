package com.comp0103.verification;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.Fields;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitQuickcheck.class)
public class CounterPropertiesTest {
    @Property
    public void incrementing(@From(Fields.class) Counter c) {
        int count = c.count();
        assertEquals(count + 1, c.increment().count());
    }

    @Property public void decrementing(@From(Fields.class) Counter c) {
        int count = c.count();
        assertEquals(count - 1, c.decrement().count());
    }
}
