import java.util.Scanner;
class Dec2Hex{  
   public static int Arg1;
     public static void main(String args[])    {
        if (args.length > 0)         {    
        try             {  
              Arg1 = Integer.parseInt(args[0]);      
      }           
  catch (NumberFormatException e)             
 {System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);             }   
     }
        start();
}
     
     
   public static void start(){
              
char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
int rem, num; 
System.out.println("please enter a valide number");
//creating scanner class to read console input
 Scanner scan = new Scanner(System.in);
 InputHelper read = new InputHelper(scan);
 
num = read.readInt(scan.next()); 
while(num <0){
    System.out.println("enter a positive integer");
    num = read.readInt(scan.next());
}

String hexadecimal="";
          System.out.println("Converting the Decimal Value " + num + " to Hex..."); 
        while(num != 0)         {   
 rem=num%16;     hexadecimal= ch[rem] + hexadecimal;
            num= num/16;         }   
 System.out.println("Hexadecimal representation is : " + hexadecimal);   
     
     }
     
} 
