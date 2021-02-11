/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peternakan;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Peternakan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("                    Welcome to                    ");
        System.out.println("                  UNXPECTED FARM                  ");
        System.out.println("==================================================");
        
        System.out.println("\n");
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nomor Hp  : ");
        String hp = input.nextLine();
        System.out.print("Masukkan Alamat    : ");
        String alamat = input.nextLine();
        
        
        System.out.println("\n");
        int hasil = 0;
        boolean ulangi = true;
        while (ulangi){
        System.out.println("Menyediakan : ");
        String[] pilihan = {" ", " Data Hewan Ternak            "," Susu (Sapi dan Kambing)            ", " Daging (Sapi, Kambing, ayam)     ", " Telur  ", " Produk Olahan Bahan Samping"};
        
        for (int i = 1; i < pilihan.length; i++)
            System.out.println("(Code) "+i+pilihan[i]);
        
        System.out.println("\n");
        System.out.print("Apa Yang Anda Inginkan ? (Masukkan code)  ==> ");
        int pil1 = input.nextInt();
        switch(pil1){
            case 1 :
                System.out.println("\n");
                System.out.println("                 DATA HEWAN TERNAK                ");
                System.out.println("--------------------------------------------------");
                String[] data = {" ", " Ayam Petelur            "," Ayam Potong            ", " Sapi Perah     ", " Sapi Brahman  ", " Kambing Etawa  ", " Kambing Kacang  "};
                for (int i = 1; i < data.length; i++)
                    System.out.println("(Code) "+i+data[i]);
                
                System.out.print("Data Hewan Apa Yang Ingin Anda Ketahui ? (Masukkan code)  ==> ");
                int pil2 = input.nextInt();
                System.out.println("\n");
                switch(pil2){
                    case 1 :
                        System.out.println("                 Data Ayam Petelur                ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("Jumlah        : 50 ekor");
                        System.out.println("Jenis         : Ayam Ras");
                        break;
                    case 2 :
                        System.out.println("                 Data Ayam Potong                 ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("Jumlah Jantan : 35 ekor");
                        System.out.println("Jumlah Betina : 60 ekor");
                        System.out.println("Jumlah Total  : 95 ekor");
                        System.out.println("Jenis         : Ayam Broiler");
                        break;
                    case 3 :
                        System.out.println("                  Data Sapi Perah                 ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("Jumlah        : 100 ekor");
                        System.out.println("Jenis         : Burlina");
                        break;
                    case 4 :
                        System.out.println("                 Data Sapi Brahman                ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("Jumlah Jantan : 80 ekor");
                        System.out.println("Jumlah Betina : 120 ekor");
                        System.out.println("Jumlah Total  : 200 ekor");
                        System.out.println("Jenis         : Brahman");
                        break;
                    case 5 :
                        System.out.println("                Data Kambing Etawa                ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("Jumlah        : 60 ekor");
                        System.out.println("Jenis         : Etawa");
                        break;
                    case 6 :
                        System.out.println("                Data Kambing Kacang               ");
                        System.out.println("--------------------------------------------------");
                        System.out.println("Jumlah Jantan : 40 ekor");
                        System.out.println("Jumlah Betina : 45 ekor");
                        System.out.println("Jumlah Total  : 85 ekor");
                        System.out.println("Jenis         : Kambing Kacang");
                        break;
                    default :
                        System.out.println("Maaf, Kode Yang Anda Masukkan Tidak Tersedia");
                        System.out.println("\n");
                        break;
                }
                break;
            case 2 :
                System.out.println("\n");
                System.out.println("                Daftar Produk Susu                ");
                System.out.println("--------------------------------------------------");
                String[] susu = {" ", " Susu Kambing Etawa    ", " Susu Sapi Murni            "};
                int [] harga1 = {0, 30000, 7500};
                for (int i = 1; i < harga1.length; i++)
                    System.out.println("Kode "+i+susu[i]+"      Rp. "+harga1[i]);
                
                System.out.println("---------------------------------------------");
                System.out.print("Produk Susu Apa Yang Anda Inginkan ? (Masukkan code)  ==> ");
                int pil3 = input.nextInt();
                System.out.println("\n");
                switch(pil3){
                    case 1 :
                        System.out.println("Produk        : "+susu[pil3]);
                        System.out.println("harga         : Rp. "+harga1[pil3]);
                        System.out.print("Jumlah (Liter): ");
                        int jumlah1 = input.nextInt();
                        int total = harga1[pil3] * jumlah1;
                        System.out.println("Total         : Rp. "+total);
                        System.out.println("Barang Yang Di Beli Akan Dikirim Ke Alamat Anda");
                        hasil += total;
                        break;
                    case 2 :
                        System.out.println("Produk        : "+susu[pil3]);
                        System.out.println("harga         : Rp. "+harga1[pil3]);
                        System.out.print("Jumlah (Liter): ");
                        int jumlah2 = input.nextInt();
                        total = harga1[pil3] * jumlah2;
                        System.out.println("Total         : Rp. "+total);
                        System.out.println("Barang Yang Di Beli Akan Dikirim Ke Alamat Anda");
                        hasil += total;
                        break;
                    default :
                        System.out.println("Maaf, Kode Yang Anda Masukkan Tidak Tersedia");
                        System.out.println("\n");
                        break;
                }
                break;
            case 3 :
                System.out.println("\n");
                System.out.println("               Daftar Produk Daging               ");
                System.out.println("--------------------------------------------------");
                String[] daging = {" ", " Daging Kambing    ", " Daging Sapi            ", " Daging Ayam            "};
                int [] harga2 = {0, 100000, 120000, 35000};
                for (int i = 1; i < harga2.length; i++)
                    System.out.println("Kode "+i+daging[i]+"      Rp. "+harga2[i]);
                
                System.out.println("\n");
                System.out.println("---------------------------------------------");
                System.out.print("Daging Apa Yang Anda Inginkan ? (Masukkan code)  ==> ");
                int pil4 = input.nextInt();
                System.out.println("\n");
                
                switch(pil4){
                    case 1 :
                        System.out.println("Produk        : "+daging[pil4]);
                        System.out.println("harga         : Rp. "+harga2[pil4]);
                        System.out.print("Jumlah (Kg)  : ");
                        int jumlah2 = input.nextInt();
                        int total = harga2[pil4] * jumlah2;
                        System.out.println("Total         : Rp. "+total);
                        System.out.println("Barang Yang Di Beli Akan Dikirim Ke Alamat Anda");
                        hasil += total;
                        break;
                    case 2 :
                        System.out.println("Produk        : "+daging[pil4]);
                        System.out.println("harga         : Rp. "+harga2[pil4]);
                        System.out.print("Jumlah (kg)  : ");
                        int jumlah3 = input.nextInt();
                        total = harga2[pil4] * jumlah3;
                        System.out.println("Total         : Rp. "+total);
                        System.out.println("Barang Yang Di Beli Akan Dikirim Ke Alamat Anda");
                        hasil += total;
                        break;
                    case 3 :
                        System.out.println("Produk        : "+daging[pil4]);
                        System.out.println("harga         : Rp. "+harga2[pil4]);
                        System.out.print("Jumlah (Kg)  : ");
                        int jumlah4 = input.nextInt();
                        total = harga2[pil4] * jumlah4;
                        System.out.println("Total         : Rp. "+total);
                        System.out.println("Barang Yang Di Beli Akan Dikirim Ke Alamat Anda");
                        hasil += total;
                        break;
                    default :
                        System.out.println("Maaf, Kode Yang Anda Masukkan Tidak Tersedia");
                        System.out.println("\n");
                        break;
                }
                break;
            case 4 :
                System.out.println("\n");
                System.out.println("               Produk Telur Ayam                  ");
                System.out.println("--------------------------------------------------");
                String[] telur = {" ", " Telur     ", " Telur Bentesan (Pecah)           "};
                int [] harga3 = {0, 24000, 15000};
                for (int i = 1; i < harga3.length; i++)
                    System.out.println("Kode "+i+telur[i]+"      Rp. "+harga3[i]);
                
                System.out.println("\n");
                System.out.println("---------------------------------------------");
                System.out.print("Telur Apa Yang Anda Inginkan ? (Masukkan code)  ==> ");
                int pil5 = input.nextInt();
                System.out.println("\n");
                
                switch(pil5){
                    case 1 :
                        System.out.println("Produk        : "+telur[pil5]);
                        System.out.println("harga         : Rp. "+harga3[pil5]);
                        System.out.print("Jumlah (Liter): ");
                        int jumlah5 = input.nextInt();
                        int total = harga3[pil5] * jumlah5;
                        System.out.println("Total         : Rp. "+total);
                        System.out.println("Barang Yang Di Beli Akan Dikirim Ke Alamat Anda");
                        hasil += total;
                        break;
                    case 2 :
                        System.out.println("Produk        : "+telur[pil5]);
                        System.out.println("harga         : Rp. "+harga3[pil5]);
                        System.out.print("Jumlah (Liter): ");
                        int jumlah6 = input.nextInt();
                        total = harga3[pil5] * jumlah6;
                        System.out.println("Total         : Rp. "+total);
                        System.out.println("Barang Yang Di Beli Akan Dikirim Ke Alamat Anda");
                        hasil += total;
                        break;
                    default :
                        System.out.println("Maaf, Kode Yang Anda Masukkan Tidak Tersedia");
                        System.out.println("\n");
                        break;
                }
            default :
                System.out.println("Maaf, Kode Yang Anda Masukkan Tidak Tersedia");
                System.out.println("\n");
                break;
        }
        int total = 0;
        System.out.println("TOTAL PEMBAYARAN : "+hasil);
        boolean uang = true;
        while(uang){
        System.out.print("Nominal uang : Rp ");
        int bayar = input.nextInt();
        if (bayar == hasil){
            uang = false;
            System.out.println("Uang Anda Pas ");
        }else if (bayar >= hasil){
            int kembalian = bayar - hasil;
            uang = false;
            System.out.println("Kembalian : "+kembalian);
        }else if (bayar <= hasil){
            uang = true;
            System.out.println("Uang Anda Kurang, Silahkan masukkan ulang uang anda");}
        }
        //Menambah barang
        System.out.println("\n");
        System.out.println("Apakah Ada Yang Ingin Anda Lakukan lagi ? (ya/tidak)");
            String pilih = input.next();
            ulangi = pilih.equals("ya");
    }
        System.out.println("\n");
        System.out.println("          Terima Kasih Telah Berkunjung Di UNXPECTED FARM           ");
    
    }
}
