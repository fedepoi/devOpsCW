/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.InflaterInputStream;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.applet.Main;
import static sun.applet.Main.main;
import sun.misc.IOUtils;

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
