package org.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple EurekaFeignApplication.
 */
public class FeignApplicationTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FeignApplicationTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(FeignApplicationTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
