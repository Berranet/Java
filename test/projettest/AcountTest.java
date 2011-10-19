/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projettest;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Berra
 */
public class AcountTest {
    
    public AcountTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of increase method, of class Acount.
     */
    @Test
    public void testIncrease() {
        
        Acount instance = new Acount();
        instance.increase();
    assertEquals(1, instance.count);
    }
    @Test
    public void testCheck() {
        System.out.println("check");
        Acount instance = new Acount();
        
        try{
                instance.check();
                fail("Should have failed.");
           }
        
    catch (NotImplementedException ex )   
    {
    
    } 
    
    }
    @Test
    public void testComplexe(){
        Acount instance = new Acount();
        for ( int i=0; i<10; i++)
                instance.increase();
        assertEquals(10, instance.count);
        //on peut faire plusieur assertEquals 
    }
    
}
