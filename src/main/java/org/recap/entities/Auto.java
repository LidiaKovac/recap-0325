package org.recap.entities;

public class Auto extends Veicolo {
    //   ... tutti gli attributi di Veicolo
    private boolean perNeopatentati;
    private boolean androidAuto;

    // ...tutti i metodi di Veicolo
    public Auto(String id, String targa, String modello, String marca, double tariffa, boolean perNeopatentati, boolean hasAndroidAuto) {
        super(id, targa, modello, marca, tariffa); //✨
        this.perNeopatentati = perNeopatentati;
        this.androidAuto = hasAndroidAuto;
    }

    public boolean isPerNeopatentati() {
        return perNeopatentati;
    }

    public boolean isAndroidAuto() {
        return androidAuto;
    }

    @Override
    public String getTarga() {
        return "TARGA NON DISPONIBILE";
    }

    @Override
    public void accendi() {
        System.out.println("Vroom Vroom");
    }

    @Override
    public void affitta() {
        System.out.println("Hai affittato questa auto");
    }

    @Override
    public String toString() {
        return "      \nAuto{" +
                "id='" + this.id + '\'' +
                ", targa='" + this.targa + '\'' +
                ", modello='" + this.modello + '\'' +
                ", marca='" + this.marca + '\'' +
                ", tariffa=" + this.tariffa +
                "perNeopatentati=" + this.perNeopatentati +
                ", androidAuto=" + this.androidAuto +
                '}';
    }
}
