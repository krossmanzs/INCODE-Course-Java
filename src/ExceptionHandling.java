import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    // Definition: An exception is an event, which occurs
    // during the execution of a program, that disrupts the normal
    // flow of the program's instructions.

    // Sebuah event pada saat runtime program, dimana hal itu belok
    // dari normal flow instruksi program tersebut

    // Menangani Exception (Exception Handling)
    // try {
    //  bla bla...
    // } catch (Exception e_name) {
    //  bla bla..
    // } finally {
    //  bla bla..
    // }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        try {
            int angka = userInput.nextInt();
            System.out.println(angka);

            int angka2 = userInput.nextInt();
            System.out.println(angka2);
        } catch (InputMismatchException IME) {
            IME.printStackTrace();
//            System.out.println(IME.getMessage());
            System.out.println("WOI MASUKIN ANGKA!!!");
        }

        try {
            System.out.println("halo teman teman");
            throw new NullPointerException();
        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(IME.getMessage());
            System.out.println("Terdapat Null Pointer Exception!");
        }

        int angka;
        try {
            angka = userInput.nextInt();
            System.out.println(angka);
        } catch (InputMismatchException IME) {
            System.out.println("WOI MASUKIN ANGKA!!!");
        } finally {
            angka = 10;
        }

        System.out.println(angka);

        int[] angka2 = {52,32,22};
        try {
            System.out.println(angka2[2]);

            int umur = userInput.nextInt();
            System.out.println(umur);
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Error msg: " + e.getMessage());
            System.out.println("index 10 gada anjir!");
        } catch (InputMismatchException IME) {
            System.out.println("Input mismatch exception bro!");
        }
    }
}
