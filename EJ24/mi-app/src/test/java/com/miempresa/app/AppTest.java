package com.miempresa.app;

<<<<<<< HEAD
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
=======
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void testMain() {
      // Prueba vacía
  }

>>>>>>> 22407fbc91be54c0f1c4a5e67a3d9e418550f7a2
}
