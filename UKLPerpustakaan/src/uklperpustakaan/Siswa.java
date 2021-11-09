/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklperpustakaan;

import java.util.ArrayList;

public class Siswa implements UserInterface{
    //arraylist
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    //constructor
    public Siswa(){
        this.nama.add("Elia");
        this.alamat.add("Blitar");
        this.telepon.add("0389473652");
        this.status.add(true);
        
        this.nama.add("Fadilla");
        this.alamat.add("Blitar");
        this.telepon.add("834672384829");
        this.status.add(true);
        
        this.nama.add("Cessa");
        this.alamat.add("Blitar");
        this.telepon.add("9084832765783");
        this.status.add(false);
    }
    
    //set boolean status manual
    public void setstatus(Boolean status){
        this.status.add(status);
    }
    
   //get boolean status manual
    public Boolean getstatus(int id){
        return this.status.get(id);
    }
    
    //get jumlah siswa gapake parameter dan inipun pake this.nama.size
    public int getjmlSiswa(){
        return this.nama.size();
    }
    
    //edit status pake set
    public void editstatus(int idSiswa, boolean status){
        this.status.set(idSiswa,status);
    }
    
    @Override
    public void setNama(String nama) {
        this.nama.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.nama.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
