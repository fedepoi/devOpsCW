/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mga
 */
public class InputHelper {
    private final Scanner reader;
    
    public InputHelper(Scanner r) {
        reader =r;//new Scanner(System.in);
    }

    // Read Character
    public char readCharacter(String prompt) {
        
        System.out.println(prompt + ": ");
        char inputText = reader.nextLine().charAt(0);
        return inputText;
    }    
    
    // Read Character - set of valid values
    public char readCharacter(String prompt, String validCharacters) {
        char inputText;
        boolean inputError;        
        do {
            inputError = false;             
            System.out.println(prompt + ": ");
            inputText = reader.nextLine().toUpperCase().charAt(0);
            if (validCharacters.indexOf(inputText) == -1) {
                inputError = true;
                System.out.println("Character out of range: please re-enter: "); 
            }
        } while (inputError);        
        return inputText;
    }     
    
    // Read String
    public String readString(String prompt) {
        
        System.out.println(prompt + ": ");
        String inputText = reader.nextLine();
        return inputText;
    }
    
    // Read Int
    public int readInt(String prompt, int max, int min) {
        int inputNumber = 0;
        boolean inputError;
        do {
            inputError = false;                
            System.out.println(prompt + ": ");

            try {
                inputNumber = Integer.parseInt(reader.nextLine());
                if (inputNumber < min || inputNumber > max) {
                    inputError = true;
                    System.out.println("Number out of range: please re-enter\n");                        
                }
            } catch (NumberFormatException e) {
                inputError = true;
                System.out.println("Not a valid number: please re-enter: ");
            }
        } while (inputError);
        return inputNumber;
    } 
    
    // Read Int
    public int readInt(String prompt) {
        int inputNumber = 0;
        boolean inputError;
        do {
           
            inputError = false;                
            //System.out.println(prompt + ": ");

            try {
                inputNumber = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                inputError = true;
                System.out.println("Not a valid number: please re-enter: ");
            }
        } while (inputError);
        return inputNumber;
    }     
    
    // Read Float
    public float readFloat(String prompt) {
        float inputNumber = 0.0f;
        boolean inputError;
        do {
            inputError = false;                
            System.out.println(prompt + ": ");

            try {
                inputNumber = Float.parseFloat(reader.nextLine());
            } catch (NumberFormatException e) {
                inputError = true;
                System.out.println("Not a valid number: please re-enter: ");
            }
        } while (inputError);
        return inputNumber;
    }     
    
   
}
