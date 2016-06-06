package org.swcraft.testing.vegas.dep;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.junit.Assert.assertThat;

public class NumberGeneratorTest {

    private static final int LOWER_LIMIT = 0;
    private static final int UPPER_LIMIT = 1;

    @Test
    public void testLimits() throws Exception {
        NumberGenerator generator = new NumberGenerator();
        int result = generator.generate(UPPER_LIMIT);
        assertThat(result, is(both(greaterThanOrEqualTo(LOWER_LIMIT)).and(lessThan(UPPER_LIMIT))));
    }

    // Other tests for true randomness...
}