import java.io.*;
import java.util.*;
public class App {
              public static void main(String[] args)
            throws FileNotFoundException{
                Scanner input = new Scanner(new File("my data.txt"));
                double prev = input.nextDouble();
                for (int i=1; i<=7;i++){
                    double next = input.nextDouble();
                    System.out.println(prev+"to"+next+", change="+(next-prev));
                    prev=next;
                }
                
            }
    
    
}
