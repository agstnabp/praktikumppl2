package org.example;

import java.time.LocalDate;

public class Card {
    String namaPemilik;
    String noRek;
    String namaBank;


    public Card(String namaPemilik, String noRek, String namaBank) {
        this.namaPemilik = namaPemilik;
        this.noRek = noRek;
        this.namaBank = namaBank;
    }

    public Card() {
    }

    public String getNamaBank() {
        return namaBank;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public LocalDate getMasaAktif() {
        return masaAktif;
    }

    public void setMasaAktif(LocalDate masaAktif) {
        this.masaAktif = masaAktif;
    }

    LocalDate masaAktif;

    public void setNamaBank(String bank){
}
}