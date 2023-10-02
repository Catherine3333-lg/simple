import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args) {
    Scanner Scanner=new Scanner(System.in); 
    System.out.print("Enter your income:$");
    double income=Scanner.nextDouble();
    double tax=0.0;
    if(income<= 235000){
        tax=0;
        }else if(income<=335000){
        tax=(income-235000)*0.1;
        }else if (income<=410000){
            tax=10000+(income-335000)*0.2;
        }else if(income<=10000000){
            tax=25000+(income-10000000)*0.3;
        }else{
            tax=100000+25000+(income-10000000)*0.3;
        }
    System.out.println("your liability is:$"+tax);
    Scanner.close();
    }
}
                    
    
    

