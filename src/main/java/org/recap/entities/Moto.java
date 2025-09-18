package org.recap.entities;

public class Moto extends Veicolo {
    MotoType cilindrata;
    boolean cascoInDotazione;

    public Moto(String id, String targa, String modello, String marca, double tariffa, MotoType cilindrata, boolean cascoInDotazione) {
        super(id, targa, modello, marca, tariffa);
        this.cilindrata = cilindrata;
        this.cascoInDotazione = cascoInDotazione;
    }

    public MotoType getCilindrata() {
        return cilindrata;
    }

    public boolean isCascoInDotazione() {
        return cascoInDotazione;
    }

    public void setCascoInDotazione(boolean cascoInDotazione) {
        this.cascoInDotazione = cascoInDotazione;
    }

    @Override
    public void accendi() {
        System.out.println("Vreem Vreem");
    }

    @Override
    public void affitta() {
        System.out.println("Hai affittato questa moto");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrata=" + cilindrata +
                ", cascoInDotazione=" + cascoInDotazione +
                ", id='" + id + '\'' +
                ", targa='" + targa + '\'' +
                ", modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", tariffa=" + tariffa +
                '}';
    }
}
