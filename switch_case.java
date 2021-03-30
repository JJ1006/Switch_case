
import java.util.*;
public class switch_case {
    public static void main(String[]args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter your age : ");
        age = sc.nextInt();
        
        switch(age){
            case 18 ->  System.out.println("You are eligible to vote");
            case 60 ->  System.out.println("You are eligible to retire");
            case 25 ->  System.out.println("You have completed a quarter of century");
            case 50 ->  System.out.println("You have completed half of century");
            case 75 -> System.out.println("You have completed three-fourth quarter of century");
            case 100 -> System.out.println("You have completed century");
            default -> System.out.println("Enjoy Your Life");
        }
        sc.close();
    }
}
