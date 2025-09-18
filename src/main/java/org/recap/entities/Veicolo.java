package org.recap.entities;

import org.recap.exceptions.TargaNotValidException;

public abstract class Veicolo implements Affittabile {
    protected String id;
    protected String targa;
    protected String modello;
    protected String marca;
    protected double tariffa;

    public Veicolo(String id, String targa, String modello, String marca, double tariffa) { //✨
        //lancio errore se targa.length != 7
            if (targa.length() != 7) {
                throw new TargaNotValidException(targa);
            }
            this.id = id;
            this.targa = targa;
            this.modello = modello;
            this.marca = marca;
            this.tariffa = tariffa;
    }

    //...tutti i metodi astratti di Affittabile

    //SETTER
    public void setTariffa(double nuovaTariffa) {
        this.tariffa = nuovaTariffa;
    }

    //    GETTER
    public String getId() {
        return this.id;
    }

    public String getTarga() {
        return targa;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    public double getTariffa() {
        return tariffa;
    }

    public abstract void accendi();


    @Override
    public String toString() {
        return "Veicolo{" +
                "id='" + id + '\'' +
                ", targa='" + targa + '\'' +
                ", modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", tariffa=" + tariffa +
                '}';
    }
}
