package latihan;

import java.util.Scanner;

public class kotak {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int row = userInput.nextInt();
        int col = userInput.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
