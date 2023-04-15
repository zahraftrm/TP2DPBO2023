/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2dpbo2023;

/**
 *
 * @author Zahra F
 */
public class Wishlist {
    private String varian_wishlist;
    private String varian;
    private String harga;
    private String toko;
    private byte foto;
    
    public Wishlist(String varian_wishlist, String varian, String harga, String toko, byte foto){
        this.varian_wishlist = varian_wishlist;
        this.varian = varian;
        this.harga = harga;
        this.toko = toko;
        this.foto = foto;
    }
    
    public void setNama_wishlist(String varian_wishlist) {
        this.varian_wishlist = varian_wishlist;
    }
    
    public void setVarian(String varian) {
        this.varian = varian;
    }
    
    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    public void setToko(String toko) {
        this.toko = toko;
    }
    
    public void setFoto(byte foto) {
        this.foto = foto;
    }
    
    public String getNama_wishlist() {
        return this.varian_wishlist;
    }
    
    public String getVarian() {
        return this.varian;
    }
    
    public String getHarga() {
        return this.harga;
    }
    
    public String getToko() {
        return this.toko;
    }
    
    public byte getFoto() {
        return this.foto;
    }
}
