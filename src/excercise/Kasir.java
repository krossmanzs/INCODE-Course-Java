package excercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Kasir {
    static ArrayList<Integer> harga = new ArrayList<>();
    static ArrayList<Integer> stok = new ArrayList<>();
    static ArrayList<String> produk = new ArrayList<>();

    static int untung = 0;
    public static void main(String[] args) {
        System.out.println("Hari ini pengen ngapain?");
        user();
    }
    static void tambahProduk(String namaProduk, int jumlahStok, int hargaPaok){
        produk.add(namaProduk);
        stok.add(jumlahStok);
        harga.add(hargaPaok);
    }

    static void pembelian(){
        int pilihan;
        boolean paok = true;
        if(produk.isEmpty()){
            System.out.println("Blom ad stok, balik goblok");
        } else {
            do {
                printList();
                System.out.println("Pilih nomor produk yang diinginkan : ");
                Scanner userInput = new Scanner(System.in);
                pilihan = userInput.nextInt();
                if(pilihan < produk.size() && pilihan >= 0){
                    System.out.println("Suksesfuli masuk");
                    paok = false;
                }else{
                    System.out.println("Ngisi yg bener paok");
                }
            }while (paok);
            if(stok.get(pilihan) == 0){
                System.out.println("Maaf pelanggan, stok sudah habis");
            } else {
                if (yes("r u sure abt dat?")) {
                    int currentStok = stok.get(pilihan) - 1;
                    stok.set(pilihan, currentStok);
                    untung += harga.get(pilihan);
                    System.out.println("Dah dibeli glbk, tll");
                }
            }
        }


    }
    static void printList (){
        for(int i = 0; i < produk.size(); i++){
            System.out.printf("%d. Produk: %s, Stok: %d, Harga: %d\n",i ,produk.get(i), stok.get(i), harga.get(i));
        }
    }
    static void cekProduk(int index){
        System.out.printf("%d. Produk: %s, Stok: %d, Harga: %d\n",index ,produk.get(index), stok.get(index), harga.get(index));

    }
    static boolean yes(String message){
        boolean lanjut = true;
        boolean kntl = false;
        do{
            char huruf;
            System.out.println(message);
            Scanner yesNo = new Scanner(System.in);
            huruf = yesNo.next().toLowerCase().charAt(0);
            if(huruf == 'y'){
                kntl = true;
                lanjut = false;
            }else if(huruf == 'n'){
                lanjut = false;
                kntl = false;
            }
        }while(lanjut);
        return kntl;
    }
    static void user(){
        boolean userlanjut = true;
        do {
            System.out.println("Pilih user yang kau mau");
            System.out.println("1. Pembeli");
            System.out.println("2. Penjual");
            System.out.println("3. Keluar");
            int pilihan = getAngka("PILIH ANGKA:");
            switch(pilihan){
                case 1 :
                    pembeli();
                    break;
                case 2 :
                    penjual();
                    break;
                case 3:
                    System.out.println("You Died");
                    userlanjut = false;
                default:
                    System.out.println("Pilih yg bener");
                    break;
            }
        }while(userlanjut);
    }
    static void pembeli(){
        boolean lanjut = true;
        do{
            System.out.println("1. Belanja");
            System.out.println("2. Balik Menu");
            int pilihan = getAngka("PILIH ANGKA:");
            switch(pilihan){
                case 1 :
                    pembelian();
                    break;
                case 2 :
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilih yg bener");
                    break;
            }
        }while(lanjut);
    }
    static void penjual(){
        boolean lanjut = true;
        do{
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Cek Profits");
            System.out.println("4. Balik Menu");
            int pilihan = getAngka("PILIH ANGKA:");
            switch(pilihan){
                case 1 :
                    tanyaProduke();
                    break;
                case 2 :
                    hapusBarang();
                    break;
                case 3:
                    System.out.println(untung);
                    break;
                case 4:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilih yg bener");
                    break;
            }
        }while(lanjut);
    }
    static int getAngka(String message){
        System.out.println(message);
        Scanner getAngka = new Scanner(System.in);
        return getAngka.nextInt();
    }
    static void tanyaProduke(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Nama");
        String nama = userInput.nextLine();
        System.out.println("Stok");
        int stok = userInput.nextInt();
        System.out.println("Harga");
        int harga = userInput.nextInt();
        tambahProduk(nama, stok, harga);
        System.out.println("Barang masuk");
        printList();
    }
    static void hapusBarang(){
        int pilihan;
        boolean paok = true;
        do {
            printList();
            System.out.println("Pilih nomor produk yang mau diapus: ");
            Scanner userInput = new Scanner(System.in);
            pilihan = userInput.nextInt();
            if(pilihan < produk.size() && pilihan >= 0){
                paok = false;
            }else{
                System.out.println("Ngisi yg bener paok");
            }
        }while (paok);
        if(yes("Yakin bos?")){
            produk.remove(pilihan);
            stok.remove(pilihan);
            harga.remove(pilihan);
            System.out.println("Barang berhasil dibuang");
        }

    }
    // list produkm oje
    // nambah/update produk
    // kasi harga setiap produk
    // jumlah pembelian
    // stok
    // keuntungan oje

    // Pisang x 1 : 5000
    // Apel x 5 : 4000

    // === pilih user
    // 1. sebagai pembeli
    // 2. sebagai penjual

    // === Pembeli
    // 1. beli barang
    //      -> barangnya apa
    //         kalau dia ga kosong kita beli
    // 2. balik ke menu utama

    // === Penjual
    // 1. Nambahin barang
    // 2. ngapus barang
    // 3. cek keuntungan
    // 4. balik ke menu utama
}
