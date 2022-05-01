public class ControlFlow {
    // Break
    // menhentikan suatu flow

    // Continue
    // skip satu proses dalam flow

    // Flow?
    // aliran atau kumpulan perintah

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) { // looping dari 1 - 5
            if(i == 2) { // ketika i adalah 2
                continue; // kita skip flow yg sekarang
            } else {
                System.out.println(i);
            }
        }

        System.out.println();

        for(int i = 1; i <= 5; i++) { // 1 - 5
            System.out.println(i);

            if(i == 3) { // jika i adalah 3
                break; // kita break atau hentikan loop
            }
        }
    }
}
