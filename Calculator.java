package Basic;
import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("------- Basic Calculator-------");
        System.out.println("enter the first number :");
        double num1 = sc.nextDouble();
        System.out.println("choose the required operator : (+,-,*,/)");
        char operator = sc.next().charAt(0);
        System.out.println("enter the second number :");
        double num2 = sc.nextDouble();

        //defining variable named result 
        double result = 0; //initialising the variable

        if(operator=='+'){
            result = num1+num2;
        }
        else if(operator=='-'){
            result = num1-num2;
        }
        else if(operator=='*'){
            result = num1*num2;
        }
        else if(operator == '/'){
            if(num2 !=0){
                result=num1/num2;
            }
            else{
                System.out.println("cannot divide by zero");
                return;
            }
        }
        System.out.println("Result = "+result);
    }
}