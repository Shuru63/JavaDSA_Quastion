import java.util.*;
public class income_tax {
    public static void main(String args[]){
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("enter the incomes");
            int income=sc.nextInt();
        int tax;

          if(income < 500000){
           tax =0;
                   
        }
        else if(income>=500000 && income <1000000)
        { 
          tax= (int)(income*0.08);
            }

            else{
                tax= (int)(income*0.12);
            }
            System.out.println("your tax is :"+ tax);
    }
}
}
