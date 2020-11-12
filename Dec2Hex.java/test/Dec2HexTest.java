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
import org.junit.Test;
import static org.junit.Assert.*;
import sun.applet.Main;
import sun.misc.IOUtils;

/**
 *
 * @author feder
 */
public class Dec2HexTest {
    
    public Dec2HexTest() {
    }

    /**
     * Test of main method, of class Dec2Hex.
     */
    @Test
    public void testMain() throws IOException {
    System.out.println("test whit positive number:");
    String[] cars = {"22222"};
    Dec2Hex.main(cars); 
    }
    
     @Test
    public void testMainOvalue() throws IOException {
    System.out.println("test whit positive number:");
    String[] cars = {"0"};
    Dec2Hex.main(cars); 
    }
     @Test
    public void testMainNeg() throws IOException {
    System.out.println("test whit positive number:");
    String[] cars = {"6"};
    Dec2Hex.main(cars); 
    }
}
