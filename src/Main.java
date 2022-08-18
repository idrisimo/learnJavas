import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive data types
        int hello_world = 5;
        double num2 = 5.0;
        boolean b = true;
        char c = 'h';

        // not primitive
        String str = "idris";

        System.out.println(str);
        
        int x = 5;
        int y = 7;
        int z = 56;
        double sum = x*y/(double)z;
        double d = Math.pow(x,y);

        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        // int scanned = sc.nextInt();
        // boolean scanned = sc.nextBoolean();
        int num3 = Integer.parseInt(scanned);

        System.out.println(scanned);
        System.out.println(num3);

    }
}
