package org.recap;

import org.recap.entities.*;

public class Application {

    public static void main(String[] args) {
        try {

//        Veicolo panda = new Veicolo("1", "ABCDEFG", "Panda", "Fiat", 50.00 ); //✨
//        v.setTariffa(67.80);
            Auto panda = new Auto("1", "ABCDEFG", "Panda", "Fiat", 50.00, true, false);
            Auto qashqai = new Auto("2", "FGHIJKL", "Qashqai", "Nissan", 80.00, false, true);

            Moto vespa = new Moto("3", "MNOPQRS", "Vespa", "Vespa", 14.00, MotoType.cc50, false);
            Moto ciao = new Moto("4", "TUVWXYZ", "Ciao", "Ciao", 10.00, MotoType.cc50, false);

            User luca = new User("Luca", UserRole.USER);
//            System.out.println(luca);

            luca.affittaVeicolo(panda);
            luca.affittaVeicolo(qashqai);
            luca.affittaVeicolo(vespa);
            luca.affittaVeicolo(ciao);

            luca.stampaPrenotazioni();

            luca.rimuoviVeicoloAffittato("2");

            luca.stampaPrenotazioni();



        } catch (RuntimeException err) {
            System.out.println(err.getMessage());


        }

//        Generare un mini gestionale per un autonoleggio
//        Sono disponibili tre tipi di veicoli:
//        - Auto
//        - Moto
//        - Camper
//        Ogni veicolo ha:
//        - un ID
//        - una targa di 7 cifre -> attenzione a non lasciare che venga inserita una targa con piu o meno caratteri (non occorre rispettare la strutture lettere / numeri)
//        - Un modello
//        - Una marca
//        - Una tariffa giornaliera per l'affitto
//        Le auto hanno, in aggiunta:
//        - Un valore che specifichi se siano adatte a neopatentati (di default lo sono sempre)
//        - Un valore che specifichi se hanno la connessione Android Auto
//        Le moto hanno, in aggiunta:
//        - Un valore che specifichi se siano 50cc, 100cc o 150cc
//        - Un valore che specifichi se il casco è in dotazione o meno

//        Si crei un sistema che - tramite scanner - permetta di gestire gli affitti dei veicoli
//        - L'utente puo' essere un utente normale oppure un admin
//        - Se admin, l'utente puo' visualizzare tutte le prenotazioni e cancellarle
//        - Se utente normale, l'utente puo' visualizzare solo le sue prenotazioni e farne di nuove

//        [EXTRA]: Gli id devono essere di 16 cifre random in questo formato: `xxxx-xxxx-xxxx-xxxx` che deve essere generato automaticamente quando creiamo un nuovo veicolo

    }
}
