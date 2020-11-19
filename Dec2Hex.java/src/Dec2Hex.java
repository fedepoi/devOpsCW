
import java.util.Scanner;
class Dec2Hex{     
    public static int Arg1;     
    public static void main(String args[])    {
    
       if(args.length==0){
           System.out.println("please provide a number");
           System.exit(0);
       } 
       else{
        if (args.length > 0) {            
            try{
                
                Arg1 = Integer.parseInt(args[0]);  
            }             
            catch (NumberFormatException e)              
            {System.err.println("Argument " + args[0] + " must be an integer.");                
            System.exit(0);             
            }        
        } else if(args.length>1){
        System.out.println("enter only one value");
         System.exit(0);
        }
         if (Arg1<0){
         System.out.println("enter a positive int");
         System.exit(0);
         }
         if (Arg1>Integer.MAX_VALUE){
         System.out.println("enter a smaller number");
         System.exit(0);
         }
         
        
        
       }
        
        
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num; 
        num = Arg1; 
        String hexadecimal="";          
        System.out.println("Converting the Decimal Value " + num + " to Hex...");         
        while(num != 0)         
        {    
            rem=num%16;     
            hexadecimal= ch[rem] + hexadecimal;            
            num= num/16;         
        }    
        System.out.println("Hexadecimal representation is : " + hexadecimal); 
    }
    
    
} 
