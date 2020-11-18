/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.junit.Test;


/**
 *
 * @author feder
 */
public class Dec2HexTest {
    
    public Dec2HexTest() {
    }

    @Test
    public void testMain() {
        System.out.println("test with a single positive value");
        Dec2Hex instance = new Dec2Hex();
        String [] args = { "134"};
       instance.main(args);
    }
    
    
    
    @Test
    public void testMainNegative1() {
        System.out.println("test with a single positive value");
        Dec2Hex instance = new Dec2Hex();
        String [] args = { "-4"};
       instance.testNeg(Integer.parseInt(args[0]));
    }
    
}
