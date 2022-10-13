package latihan;

import java.util.Scanner;

public class kotak {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int x = userInput.nextInt();

        for(int i = 0; i < x; i++) {
            if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i% 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("FizzBuzz");
            }
        }
    }
}
