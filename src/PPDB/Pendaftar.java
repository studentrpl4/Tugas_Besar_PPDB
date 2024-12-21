/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPDB;

/**
 *
 * @author LENOVO
 */
public class Pendaftar {
    private String idPendaftar;
    private String nama;
    private String alamat;
    private String asalSekolah;
    private String noTelpon;
    private String email;

    public Pendaftar(String idPendaftar, String nama, String alamat, String asalSekolah, String noTelpon, String email) {
        this.idPendaftar = idPendaftar;
        this.nama = nama;
        this.alamat = alamat;
        this.asalSekolah = asalSekolah;
        this.noTelpon = noTelpon;
        this.email = email;
    }

    public void isiFormulir() {
        System.out.println("Mengisi formulir pendaftaran.");
    }
}
