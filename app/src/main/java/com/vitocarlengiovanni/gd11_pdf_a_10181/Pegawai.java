package com.vitocarlengiovanni.gd11_pdf_a_10181;

import java.util.Arrays;
import java.util.List;

public class Pegawai {
    public String nama_pegawai;
    public String nomor_pokok;
    public String jabatan;
    public String alamat;
    public double gaji;
    public int tahun_masuk;

    public Pegawai(String nama_pegawai, String nomor_pokok, String jabatan, String alamat, double gaji, Integer tahun_masuk) {
        this.nama_pegawai = nama_pegawai;
        this.nomor_pokok = nomor_pokok;
        this.jabatan = jabatan;
        this.alamat = alamat;
        this.gaji = gaji;
        this.tahun_masuk = tahun_masuk;
    }

    public static List<Pegawai> generateListPegawai() {
        return Arrays.asList(
                new Pegawai("Yosia Galih", "180709971", "Asisten Bahasa Inggris Khusus", "Yogyakarta", 5000000, 2018),
                new Pegawai("Wendy Winata", "180709598", "Asisten Dasar Pemrograman", "Kaliurang", 5500000, 2017),
                new Pegawai("Hans Giovani", "180709734", "Asisten Basis Data", "Jawa Tengah", 4500000, 2019),
                new Pegawai("Eras Timothy", "180709642", "Asisten Struktur Data", "Kalimantan Barat", 5250000, 2018),
                new Pegawai("Cris Yustianto", "180709999", "Asisten Jaringan Komputer", "Yogyakarta", 6000000, 2017),
                new Pegawai("Aditya Rio", "180709840", "Asisten Pemrograman Berorientasi Objek", "Sukoharjo Solo", 4750000, 2019),
                new Pegawai("Hilarius Ryan", "180709780", "Asisten Pemrograman Berbasis Platform", "Malang", 5300000, 2018),
                new Pegawai("Jonathan Robertus", "180709646", "Asisten Jaringan Komputer", "Sleman", 5500000, 2017)
        );
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getNomor_pokok() {
        return nomor_pokok;
    }

    public void setNomor_pokok(String nomor_pokok) {
        this.nomor_pokok = nomor_pokok;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public Integer getTahun_masuk() {
        return tahun_masuk;
    }

    public void setTahun_masuk(Integer tahun_masuk) {
        this.tahun_masuk = tahun_masuk;
    }
}
