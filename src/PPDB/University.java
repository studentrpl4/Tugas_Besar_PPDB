/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPDB;

/**
 *
 * @author LENOVO
 */
public class Universitas {
    private int idUniversitas;
    private String namaUniversitas;

    public Universitas(int idUniversitas, String namaUniversitas) {
        this.idUniversitas = idUniversitas;
        this.namaUniversitas = namaUniversitas;
    }

    public void lihatProgramStudi() {
        System.out.println("Menampilkan daftar program studi di " + namaUniversitas);
    }
}
