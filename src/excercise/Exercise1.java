package excercise;

public class Exercise1 {
    public static void main(String[] args) {
        char[][] simbol = createNewSimbol();

        simbol[0][0] = 'x';
        simbol[1][1] = 'o';
        simbol[0][2] = 'x';

        printTicTacToe(simbol);
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
    }

}
