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
public interface UserInterface {
    //set
    public void setNama (String nama);
    public void setAlamat (String alamat);
    public void setTelepon (String telepon);
    
    //get
    public String getNama(int id);
    public String getAlamat (int id);
    public String getTelepon (int id);
}
