import java.util.Scanner;
public class prime {
    
    public static void main (String [] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= number; i++){
            if ( number % i == 0){
                count++;
            }
           
        }

        if ( count == 2)
        System.out.println("Prime");
        else System.out.println("Not prime");


    }
}
