/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import javax.swing.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bob
 */
public class PushRandomPanelTester {

    public PushRandomPanelTester() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    // Test a button push
    public void testPushRandom() {
        JFrame frame = new JFrame("Push Random");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PushRandomPanel panel = new PushRandomPanel();
        frame.add(panel);
        
        frame.pack();
        frame.setVisible(true);
        
        mPush.doClick();
        String str = mLabel.getText();
        //String str = "1";  // for testing
        int result = Integer.parseInt(str);
        //System.out.println("Result: " + mResult); // for testing
        assertTrue(result >= 1 || result <= 100);
    }
}
