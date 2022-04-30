public class ArrayMultiDimensi {
    /*
        Multidimensional adalah array yang berisi array.
        Array dapat terdiri dari 1 atau lebih dimensi.
        Contoh 2 atau 3 dimensi.
    **/

    public static void main(String[] args) {
        int b[] = {0,1,2};
        // b[][] = {{2,3,45,6},{12,54,4},{2,1,23,4}}

        int a[][] = {{1,2,3},{2,3,4},{4,5,6}};

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.printf("a[%d][%d] = %d\n", i, j, a[i][j]);
            }
            System.out.println();
        }

        int c[][][] = {{{1,2,3}, {7,8,9}},{{4,5,6}}};
        System.out.println(c[0][0][2]); // garland, dadang, michael
        System.out.println(c[0][1][2]); // garland, dadang, michael
    }
}
