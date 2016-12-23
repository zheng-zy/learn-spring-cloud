package org.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple EurekaService.
 */
public class EurekaServiceApplicationTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EurekaServiceApplicationTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(EurekaServiceApplicationTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
