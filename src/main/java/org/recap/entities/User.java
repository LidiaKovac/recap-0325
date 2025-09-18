package org.recap.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Veicolo> veicoliAffittati;
    //List -> array di js, tutto una lista di un tipo di dato, non ha un ordine, non ha costrizioni di unicita'
    //Set -> tutto dello stesso dello tipo, ma valori UNICI
    private UserRole role;

    public User(String name, UserRole role) {
        this.name = name;
        this.role = role;
        this.veicoliAffittati= new ArrayList<>();
    }

    public void affittaVeicolo(Veicolo veicolo) {
        this.veicoliAffittati.add(veicolo);
    }

    public void rimuoviVeicoloAffittato(String id) {
        this.veicoliAffittati = this.veicoliAffittati.stream().filter((veicolo) -> !veicolo.getId().equals(id)).toList();
    }

    public void stampaPrenotazioni() {
        System.out.println("Hai affittato " + veicoliAffittati.size() + " veicoli");
        for (int i = 0; i < veicoliAffittati.size(); i++) {
            // veicoliAffittati[i] -> .get(i)
            System.out.println(veicoliAffittati.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Veicolo> getVeicoliAffittati() {
        return veicoliAffittati;
    }

    public UserRole getRole() {
        return role;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", veicoliAffittati=" + veicoliAffittati +
                ", role=" + role +
                '}';
    }
}
