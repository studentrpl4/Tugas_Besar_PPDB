/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PPDB;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pendaftar
        Pendaftar pendaftar = new Pendaftar("P001", "Budi Santoso", "Jl. Merdeka No.1", "SMA Negeri 1", "08123456789", "budi@gmail.com");
        pendaftar.isiFormulir();

        // Membuat objek FormulirPendaftaran
        FormulirPendaftaran formulir = new FormulirPendaftaran("F001", "2024-12-21", "Pending");
        formulir.submitFormulir();
        formulir.updateStatus("Diterima");

        // Membuat objek ProgramStudi
        ProgramStudi programStudi = new ProgramStudi("TI", "Teknik Informatika", "Fakultas Teknik", 50);
        programStudi.lihatDetail();

        // Membuat objek Universitas
        Universitas universitas = new Universitas(1, "Universitas Negeri Jakarta");
        universitas.lihatProgramStudi();

        // Membuat objek MahasiswaBaru
        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("M001", "Ani Wijaya", "Jl. Sudirman No.2", "SMA Negeri 2", "08234567890", "ani@gmail.com");
        mahasiswaBaru.isiFormulir();
    }
}
