package excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        char[][] simbol = createNewSimbol();

        System.out.println("TIK TAK TO GEM");
        printTicTacToe(simbol);

        // untuk dapetin data sebanyak 9 kali
        for (int i = 0; i < 9; i++) {
            char huruf;
            // genap o
            if(i % 2 == 0) {
                huruf = 'o';
            } else { // ganjil x
                huruf = 'x';
            }

            simbol = inputUser(simbol, huruf);

            printTicTacToe(simbol);

            boolean menang;
            if (i >= 2) {
                menang = cekKemenangan(simbol, huruf);
                if (menang) {
                    System.out.printf("Huruf %c memenangkan permainan!\n", huruf);
                    break;
                }
            }

            if (i == 8) {
                System.out.println("Tidak ada yang menang!");
            }
        }

    }

    private static boolean cekKemenangan(char[][] simbol, char huruf) {
        // diagonal \
        if ((simbol[0][0] == huruf) && (simbol[1][1] == huruf) && (simbol[2][2] == huruf)) {
            return true;
        }

        // diagonal /
        if ((simbol[2][0] == huruf) && (simbol[1][1] == huruf) && (simbol[0][2] == huruf)) {
            return true;
        }

        // sejajar

        int panjang = simbol.length;

        // traverse ke kanan

        int sama = 0;
        for(int y = 0; y < panjang; y++) {
            for(int x = 0; x < panjang; x++) {
                if (simbol[x][y] == huruf) {
                    sama++;
                }
            }

            if (sama < panjang) {
                sama = 0;
            } else { // jika terdapat 3 huruf sejajar yang sama maka kita return true
                return true;
            }
        }

        // traverse ke bawah
        for(int x = 0; x < panjang; x++) {
            for(int y = 0; y < panjang; y++) {
                if (simbol[x][y] == huruf) {
                    sama++;
                }
            }

            if (sama < panjang) {
                sama = 0;
            } else { // jika terdapat 3 huruf sejajar yang sama maka kita return true
                return true;
            }
        }


        // jika semua persyaratan kemenangan tidak memenuhi
        // maka kita return false
        return false;
    }

    static char[][] inputUser(char[][] simbol, char huruf) {
        // index 1 = x
        // index 0 = y
        // masukkan koordinat
        System.out.printf("===== (%c)\n", huruf);
        int koordinat[] = getKoordinat(simbol);
        int x = koordinat[1];
        int y = koordinat[0];

        simbol[x][y] = huruf;

        System.out.printf("Koordinat (%d,%d) diisi dengan %c\n", x, y, huruf);

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
        // index 1 = x
        // index 0 = y
        int[] koordinat = new int[2];

        do {
            koordinat[0] = askKoordinat("masukkan koordinat x(0-2) :");
            koordinat[1] = askKoordinat("masukkan koordinat y(0-2) :");

            boolean adaNilai = cekKoordinat(koordinat, simbol);

            if (adaNilai) {
                System.err.println("\nKoordinat ini sudah diisi, silahkan masukkan ulang!");
            }
        } while (cekKoordinat(koordinat, simbol));

        return koordinat;
    }

    static int askKoordinat(String message) {
        boolean lanjut = true;
        int angka = -99;
        
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.printf(message);
            
            try {
                angka = userInput.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Silahkan masukkan angka yaaa!");
            }

            // angka 0-2
            if (angka >= 0 && angka < 3) {
                lanjut = false;
            } else {
                System.err.println("Koordinat melebihi jangkauan!");
            }
            
        } while (lanjut);

        return angka;
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
                } if (y == simbol[x].length - 1) {
                    System.out.printf("\t %d", x);
                }
            }
            if(x != 2) {
                System.out.printf("\n============\n");
            } if (x == 2) {
                System.out.printf("\n %d   %d   %d \n", 0,1,2);
            }
        }
        System.out.println("\n");
    }
}
