/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklperpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman {
    //arraylist
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> Banyak = new ArrayList<Integer>();
    
    //contructor peminjaman
    public Peminjaman(){
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.Banyak.add(2);
        
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.Banyak.add(3);
        
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.Banyak.add(1);
        
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.Banyak.add(2);
    }
    
    //proses peminjaman ada siswa, peminjaman, buku, laporan
    public void prosesPeminjaman (Siswa siswa, Peminjaman peminjaman, Buku buku, Laporan laporan){
        Scanner input = new Scanner(System.in);
        
        //print perpustakaan
        System.out.println(" ");
        System.out.println("---------PERPUSTAKAAN-----------");
        System.out.println(" ");
        
        //memasukkan id sesuai user
        System.out.print("\nMasukkan ID Siswa : ");
        //scanner (dia juga pake variabel)
        int idSiswa = input.nextInt();
        
        //mencocokkan status siswa di class siswa
        if(siswa.getstatus(idSiswa) == false){
            System.out.println("Selamat datang " + siswa.getNama(idSiswa) + " Mohon maaf anda tidak bisa melakukan peminjaman buku.");
            System.exit(0);
        }
        System.out.println("Selamat datang " + siswa.getNama(idSiswa) + " silakan melakukan peminjaman buku.");
        
        //variabel arraylist dari idbuku dan banyak
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> Banyak = new ArrayList<Integer>();
        
        //inputan user untuk banyaknya pinjaman buku
        int i = 0;
        int temp = 0;
        
        //memasukkan kode buku atau end
        //pilih nginput buku sebanyak berapa
        //ngecek stok buku cukup ndak
        do{
            //kode buku ini dimasukkan oleh user melalui scanner dengan temp
            System.out.println("Masukkan kode buku or end file (99)");
            System.out.println(" ");
            temp = input.nextInt();
            
            //print berapa banyak buku yang diinginkan user tetep pake temp
            if(temp != 99){
                idBuku.add(temp);
                System.out.println(buku.getnamaBuku(idBuku.get(i)) + " sebanyak : ");
                
                //user input banyak buku
                Banyak.add(input.nextInt());
                
                //melihat dulu berapa stok buku, jika tidak cukup ya tidak bisa meminjam
                if(buku.getstok(idBuku.get(i)) < Banyak.get(i)){
                   System.out.println("Mohon maaf sisa buku tidak mencukupi");
                   System.exit(0);
                }
            i++;
            }
        }while(temp != 99);
        
        //print peminjaman tadi
        System.out.println("Peminjaman buku dari " + siswa.getNama(idSiswa) + "adalah sebaga berikut : ");
        System.out.println("Nama buku \tQty \tHarga \tjumlah");
        
        //deklarasi b sebagai idbuku dan deklarasi total
        int b = idBuku.size();
        int total = 0;
        
        //untuk model mtk dari jumlah = banyak buku x harga buku
        for(int k = 0; k < b; k++){
            int jumlah = Banyak.get(k) * buku.getharga(idBuku(k));
            total += jumlah;
            
            //print nama banyak harga dan jumlah tadi
            System.out.println(buku.getnamaBuku(idBuku.get(k)) + "\t" + Banyak.get(k) + "\t" + buku.getharga(k) + "\t" + jumlah);
            
            //memanggil method peminjaman di class peminjaman
            //untuk mengurangi stok bukunya
            //yang dipinjam sesuai dengan idbuku
            peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(k), Banyak.get(k));
        }
        //print total peminjaman
        System.out.println("Total peminjaman buku : " + total);
        
        //edit status apabila true dapat pinjam lagi, apabila false siswa belum mengembalikan buku
        siswa.editstatus(idSiswa, false);
        if(siswa.getstatus(idSiswa) == true){
            System.out.println("Dapat melakukan peminjaman buku");
        }else{
            System.out.println("Tidak dapat melakukan peminjaman buku");    
        }   
        
        //print kembalikan buku
        System.out.println("Apakah ingin mengembalikan buku?");
        //inputan user true dan false
        boolean answer = input.nextBoolean();
        if(answer == true){
            siswa.editstatus(idSiswa,true);
            System.out.println("Status = " + siswa.getstatus(idSiswa));
            
            for(int L = 0;L < b;L++){
                peminjaman.setPengembalian(buku, idSiswa, idBuku.get(L), Banyak.get(L));
            }
        }else{
            System.out.println("Anda belum mengembalikan buku");
            laporan.Laporan(buku);
            laporan.Laporan(siswa);
            System.exit(0);
        }
    }
    //print stok buku dari buku idsiswa idbuku banyak, peminjamannya
    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int Banyak){
        //mengedit stok dan transaksi nanti
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.Banyak.add(Banyak);
        
        buku.editStok(idBuku, buku.getstok(idBuku)-Banyak);
    }
    //print stok buku dari buku idsiswa idbuku banyak (pengembaliannya
    public void setPengembalian(Buku buku, int idSiswa, int idBuku, int Banyak){
        //mengedit stok dan transaksi nanti
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.Banyak.add(Banyak);
        
        buku.editStok(idBuku, buku.getstok(idBuku)+Banyak);
    }
    
    //method
    public Integer idSiswa (int id){
        return this.idSiswa.get(id);
    }
    
    public Integer idBuku (int id){
        return this.idBuku.get(id);
    }
    
    public Integer Banyak (int id){
        return this.Banyak.get(id);
    }
}
