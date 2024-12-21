/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPDB;

/**
 *
 * @author LENOVO
 */
public class ProgramStudi {
    private String kodeProdi;
    private String namaProdi;
    private String fakultas;
    private int kuota;

    public ProgramStudi(String kodeProdi, String namaProdi, String fakultas, int kuota) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
        this.fakultas = fakultas;
        this.kuota = kuota;
    }

    public void lihatDetail() {
        System.out.println("Program Studi: " + namaProdi);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Kuota: " + kuota);
    }
}
