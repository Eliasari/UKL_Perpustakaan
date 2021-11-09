/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklperpustakaan;

import java.util.Scanner;

public class AplikasiPerpustakaan {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        do{
        Siswa siswa1 = new Siswa();
        Petugas petugas1 = new Petugas();
        Buku buku1 = new Buku();
        Peminjaman peminjaman1 = new Peminjaman();
        Laporan laporan1 = new Laporan();
        
        laporan1.Laporan(petugas1);
        laporan1.Laporan(buku1);
        laporan1.Laporan(siswa1);
        
        peminjaman1.prosesPeminjaman(siswa1, peminjaman1, buku1, laporan1);
        
        laporan1.Laporan(buku1);
        laporan1.Laporan(siswa1);
        
        System.out.println("Lanjutkan atau matikan 1:99");
        System.out.println("==>");
        input = scan.nextInt();
        
        }while(input != 99);
    }
}
