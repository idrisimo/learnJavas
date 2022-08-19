import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String fizz = "fizz";
        String buzz = "buzz";
        String fizz_buzz = fizz.concat(buzz); 
        int multiple_of_three = 3;
        int multiple_of_five = 5;

        for (int i = 1; i <= 100; i++) {
            if(i % multiple_of_three == 0 && i % multiple_of_five == 0) {
                System.out.println(fizz_buzz);
            } else if (i % multiple_of_five == 0) {
                System.out.println(buzz);
            } else if (i % multiple_of_three == 0 ) {
                System.out.println(fizz);
            } else {
                System.out.println(i);
            }
        }

    }
}
