package edu.soumya.spring.microservice.sample.gateway;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ApplicationTest extends TestCase{
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ApplicationTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ApplicationTest.class );
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
