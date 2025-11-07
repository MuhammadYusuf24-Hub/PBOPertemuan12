/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "pesanan")
@NamedQueries({
    @NamedQuery(name = "Pesanan.findAll", query = "SELECT p FROM Pesanan p ORDER BY p.idPesanan ASC"),
    @NamedQuery(name = "Pesanan.findByIdPesanan", query = "SELECT p FROM Pesanan p WHERE p.idPesanan = :idPesanan"),
    @NamedQuery(name = "Pesanan.findByNamaPelanggan", query = "SELECT p FROM Pesanan p WHERE p.namaPelanggan = :namaPelanggan"),
    @NamedQuery(name = "Pesanan.findByJumlah", query = "SELECT p FROM Pesanan p WHERE p.jumlah = :jumlah")})
public class Pesanan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pesanan")
    private Integer idPesanan;
    @Column(name = "nama_pelanggan")
    private String namaPelanggan;
    @Column(name = "jumlah")
    private Integer jumlah;
    @JoinColumn(name = "id_menu", referencedColumnName = "id_menu")
    @ManyToOne
    private Menu idMenu;

    public Pesanan() {
    }

    public Pesanan(Integer idPesanan) {
        this.idPesanan = idPesanan;
    }

    public Integer getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(Integer idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPesanan != null ? idPesanan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pesanan)) {
            return false;
        }
        Pesanan other = (Pesanan) object;
        if ((this.idPesanan == null && other.idPesanan != null) || (this.idPesanan != null && !this.idPesanan.equals(other.idPesanan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cafe.Pesanan[ idPesanan=" + idPesanan + " ]";
    }

    void IdMenu(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
