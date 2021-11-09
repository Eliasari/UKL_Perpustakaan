/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklperpustakaan;

import java.util.ArrayList;

public class Buku {
    //arraylist
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Buku(){
        this.namaBuku.add("Arkeologi");
        this.stok.add(10);
        this.harga.add(100000);
        
        this.namaBuku.add("Kamus Bahasa Inggris");
        this.stok.add(12);
        this.harga.add(80000);
        
        this.namaBuku.add("Fisika");
        this.stok.add(5);
        this.harga.add(50000);
        
        this.namaBuku.add("Programming");
        this.stok.add(4);
        this.harga.add(120000);
    }
    
    //nambah get jml buku
    public int getjmlBuku(){
        return this.namaBuku.size();
    }
    
    //nambahkan edit buku
    public int editStok(int idBuku, int stok){
        return this.stok.set(idBuku, stok);
    }
    
    public void namaBuku(String nama){
        this.namaBuku.add(nama);
    }
    
    public void stok(Integer stokBarang){
        this.stok.add(stokBarang);
    }
    
    public void harga(Integer hargaBarang){
        this.harga.add(hargaBarang);
    }
    
    public String getnamaBuku(int id){
        return this.namaBuku.get(id);
    }
    
    public Integer getstok(int id){
        return this.stok.get(id);
    }
    
    public Integer getharga(int id){
        return this.harga.get(id);
    }
    
    
}
