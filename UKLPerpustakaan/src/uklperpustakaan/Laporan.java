/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklperpustakaan;

/**
 *
 * @author Elia Sari
 */
public class Laporan {
    public void Laporan(Buku buku){
        int a = buku.getjmlBuku();
        
        System.out.println(" ");
        System.out.println("-------DAFTAR BUKU-------");
        System.out.println(" ");
        
        System.out.println("ID \tNama \tStok \tHarga Peminjaman");
        
        for (int i = 0; i <a; i++){
            System.out.println(i + ".\t" + buku.getnamaBuku(i) + "\t" + buku.getstok(i) + "\t" + buku.getharga(i) + "/minggu");
        }
    }
    
    public void Laporan(Petugas petugas){
        int a = petugas.getjmlPetugas();
        
        System.out.println(" ");
        System.out.println("-------DAFTAR KARYAWAN-------");
        System.out.println(" ");
        
        System.out.println("ID \tNama \tAlamat \tTelepon");
        
        for (int i = 0; i <a; i++){
            System.out.println(i + ".\t" + petugas.getNama(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i));
        }
    }
    
    public void Laporan(Siswa siswa){
        int a = siswa.getjmlSiswa();
        
        System.out.println(" ");
        System.out.println("-------DAFTAR DATA SISWA-------");
        System.out.println(" ");
        
        System.out.println("ID \tNama \tAlamat \tTelepon \tstatus");
        
        for (int i = 0; i <a; i++){
            System.out.println(i + ".\t" + siswa.getNama(i) + "\t" + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getstatus(i));
        }
    }
    
    
}
