/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPDB;

/**
 *
 * @author LENOVO
 */
public class FormulirPendaftaran {
    private String idFormulir;
    private String tanggalPendaftaran;
    private String statusPendaftaran;

    public FormulirPendaftaran(String idFormulir, String tanggalPendaftaran, String statusPendaftaran) {
        this.idFormulir = idFormulir;
        this.tanggalPendaftaran = tanggalPendaftaran;
        this.statusPendaftaran = statusPendaftaran;
    }

    public void submitFormulir() {
        System.out.println("Formulir telah disubmit.");
    }

    public void updateStatus(String statusBaru) {
        this.statusPendaftaran = statusBaru;
        System.out.println("Status pendaftaran diperbarui menjadi: " + statusBaru);
    }
}
