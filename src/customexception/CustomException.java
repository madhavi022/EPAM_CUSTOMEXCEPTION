/*
problem statement:
You are required to compute the power of a number by implementing a calculator. 
Create a class MyCalculator which consists of a single method long power(int, int
This method takes two integers,n  and p,as parameters and finds n^p . 
If either n or p is negative, then the method must throw an exception which says "n or p should not be negative."
Also, if both  and  are zero, then the method must throw an exception which says "n and p should not be zero."
For example, -4 and -5 would result in  java.lang.Exception:n or p should not be negative.
Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.
*/
//pogram which demonstrates custom exception
package customexception;
import java.util.*;
import java.lang.*;
class MyCalculator extends Exception{
    long power(int n,int p) throws Exception
   {
        
        int num=n;
        //if power is zero then result is one
        if(p==0 && n!=0)
          return 1;
        //if number itself is zero then result is zero
          if(n==0&&p!=0)
            return 0;
          //raises an CustomException when number is zero and power is zero
         if(n==0 && p==0)
           throw new Exception("n and p should not be zero.");
         //raises an CustomException when number<0 or power<0
         if(n<0||p<0)  
            throw new Exception("n or p should not be negative.");  
         //here recursively n^p is calculated
        else
          return num*power(num,p-1);  
        
    }
}

public class CustomException {

   public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
} 

