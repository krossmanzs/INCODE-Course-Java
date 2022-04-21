public class Array {
    public static void main(String[] args) {
        // keyword
        // array adalah kumpulan nilai dari suatu tipe data

        int[] a = new int[5];
        // {0,0,0,0,0}
        for(int i = 0; i < a.length; i++) {
            System.out.printf("Nilai a[%d]: %d\n", i, a[i]);
        }

        a[0] = 12;
        a[1] = 22;
        a[2] = 56;
        a[3] = 65;
        a[4] = 66;
        // {12,22,56,65,66}

        System.out.println();

        for(int i = 0; i < a.length; i++) {
            System.out.printf("Nilai a[%d]: %d\n", i, a[i]);
        }

        System.out.println();

        int[] b = {32,33,55};
        for(int i = 0; i < b.length; i++) {
            System.out.printf("Nilai b[%d]: %d\n", i, b[i]);
        }

        System.out.println();

        int[] c;
//        {}
        c = new int[]{1, 2, 3};
        for(int i = 0; i < c.length; i++) {
            System.out.printf("Nilai c[%d]: %d\n", i, c[i]);
        }

        System.out.println();

        String d = "halo semuanya"; // {h,a,l,o, ,s,e,m,u,a,n,y,a}

        for(int i = 0; i < d.length(); i++) {
            System.out.printf("Nilai d[%d]: %c\n", i, d.charAt(i));
        }

        System.out.println();

        String[] hewan = {"Marchel", "Linux", "Cindy", "Dadang", "Michael"};
        System.out.print("Nama nama hewan: ");

        for(int i = 0; i < hewan.length; i++) {
            System.out.printf("%s, ", hewan[i]);
        }

        int[] angka = {1,2,3,4,5}; // 15
        int total = 0;
        System.out.printf("\n\nTotal: %d\n", total);

        System.out.println("\nMULAI LOOPING");
        for(int i = 0; i < angka.length; i++) {
            System.out.printf("%d += %d = %d \t|| looping ke - %d\n", total, angka[i], total + angka[i], i);
            total += angka[i];
        }
        System.out.println("STOP LOOPING\n");

        System.out.printf("Total: %d\n", total);
    }
}
