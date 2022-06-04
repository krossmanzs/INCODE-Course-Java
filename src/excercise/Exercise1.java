package excercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        char[][] simbol = createNewSimbol();

        // TODO: 6/4/2022 exception handling
        // TODO: 6/4/2022 input selang seling antara o dan x
        // TODO: 6/4/2022 cek kemenangan minimal saat loop ke 3 dan seterusnya

        // untuk dapetin data sebanyak 9 kali
        for (int i = 0; i < 9; i++) {
            simbol = inputUser(simbol);
            printTicTacToe(simbol);
        }

    }
    static char[][] inputUser(char[][] simbol) {
        // masukkan koordinat x: 5

        int koordinat[] = getKoordinat(simbol);
        // index 0 = x
        // index 1 = y
        int x = koordinat[0];
        int y = koordinat[1];

        // simpen char temp
        char temp = getSimbol();

        simbol[x][y] = temp;

        System.out.printf("Koordinat (%d,%d) diisi dengan %c\n", x, y, temp);

        return simbol;
    }

    static boolean cekKoordinat(int[] koordinat, char[][] simbol) {
        // index 0 = x
        // index 1 = y
        int x = koordinat[0];
        int y = koordinat[1];

//         x | _ | x
//        ============
//         _ | o | _
//        ============
//         _ | _ | _

        // apakah simbol[x][y] terdapat nilai?
        if (simbol[x][y] != ' ') {
            // yes -> return true
            return true;
        } else {
            // no -> return false
            return false;
        }
    }

    static int[] getKoordinat(char[][] simbol) {
        // index 0 = x
        // index 1 = y
        int[] koordinat = new int[2];
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.printf("masukkan koordinat x :");
            koordinat[0] = userInput.nextInt();
            System.out.printf("masukkan koordinat y :");
            koordinat[1] = userInput.nextInt();

            boolean adaNilai = cekKoordinat(koordinat, simbol);
            if (adaNilai) {
                System.err.println("\nKoordinat ini sudah diisi, silahkan masukkan ulang!");
            }
        } while (cekKoordinat(koordinat, simbol));

        return koordinat;
    }

    static char getSimbol() {
        // masukkan simbolnya(o/x)
        boolean ulang = true;
        char simbol;
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.printf("Masukkan simbolnya(o/x):");

            simbol = userInput.next().charAt(0); // o

            // kalo simbol == o/x maka ulang selesai
            if(simbol == 'o' || simbol == 'x') {
                ulang = false;
            }

            if(ulang) {
                System.err.println("\nMasukin yang bener blog >:(");
            }
        } while (ulang);

        return simbol;
    }

    static char[][] createNewSimbol() {
        char[][] simbol = new char[3][3];

        for (int i = 0; i < simbol.length; i++) {
            for(int j = 0; j < simbol[i].length; j++) {
                simbol[i][j] = ' ';
            }
        }

        return simbol;
    }

    static void printTicTacToe(char simbol[][]) {
        System.out.println("\n");
        for(int x = 0; x < simbol.length; x++) {
            System.out.printf(" ");
            for(int y = 0; y < simbol[x].length; y++) {
                System.out.printf("%c", simbol[x][y]);
                if(y != simbol[x].length - 1) {
                    System.out.printf(" | ");
                }
            }
            if(x != 2) {
                System.out.printf("\n============\n");
            }
        }
        System.out.println("\n");
    }
}
