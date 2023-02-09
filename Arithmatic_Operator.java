import java.util.Scanner;

public class Arithmatic_Operator 
{
        public static void main(String[] args)
        {
            Scanner a = new Scanner(System.in);
                    
            // Enter First Value Using Scanner
            System.out.println("Enter First No:");
            int c = a.nextInt();
            
            //Enter Second Value Using Scanner
            System.out.println("Enter Second No:");
            int f = a.nextInt();
            
            int add = c + f;
            System.out.println("Addition :" + add);
            
            int sub = c-f;
            System.out.println("Subtraction :" + sub);
            
            int mul = c*f;
            System.out.println("Multiplication :" + mul);
            
            int div = c/f;        
            System.out.println("Division :" + div);
            
            int mod = c%f; 
            System.out.println("Moduals :" + mod);
            a.close();
        }
}
