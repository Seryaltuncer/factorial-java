import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1, num;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        num = keyboard.nextInt();
        
        for(int i=1; i<=num; i++){
            System.out.println("i = "+ i);
            fact *= i;
            System.out.println("fact= " + fact);

        }
        
        System.out.println("The factorial of "
                + num + " is " + fact);
    }
}
