import java.util.Scanner;

public class inverted_pyra {
     public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number for star patter");
            int a = sc.nextInt();
           for(int i =1; i<=a; i++){
            for(int j =1; j<=a-i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
           }
            
        }
    }
}
