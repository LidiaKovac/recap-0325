package org.recap;

import com.github.javafaker.Faker;
import org.recap.entities.*;

import java.util.*;
import java.util.stream.Stream;

public class Application {
    private static Faker faker = new Faker(Locale.ENGLISH);
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    private static List<Veicolo> veicoli = new ArrayList<>();

    public static void main(String[] args) {
        try {

            for(int i = 0; i < 100; i++) {
                Auto auto = new Auto("A" + i, "ABCDEFG", faker.backToTheFuture().character(), faker.funnyName().name(), random.nextDouble(100), random.nextBoolean(), random.nextBoolean());
                Moto moto = new Moto("M" + i, "FGHIJKL", faker.elderScrolls().firstName(), faker.zelda().character(), random.nextDouble(100), MotoType.cc50, random.nextBoolean());
                veicoli.add(auto);
                veicoli.add(moto);
            }
            //Auto panda = new Auto("1", "ABCDEFG", "Panda", "Fiat", 50.00, true, false);
            //Auto qashqai = new Auto("2", "FGHIJKL", "Qashqai", "Nissan", 80.00, false, true);

            //Moto vespa = new Moto("3", "MNOPQRS", "Vespa", "Vespa", 14.00, MotoType.cc50, false);
            //Moto ciao = new Moto("4", "TUVWXYZ", "Ciao", "Ciao", 10.00, MotoType.cc50, false);

//            System.out.println(luca);



            //Find by id
            System.out.println("Inserisci un id: ");
            String id = input.nextLine();
            Stream<Veicolo> streamVeicoli = veicoli.stream();
            Stream<Veicolo> streamFiltrata = streamVeicoli.filter((veicolo) -> veicolo.getId().equals(id));
            List<Veicolo> listaDiVeicoliFiltrati = streamFiltrata.toList();
            Veicolo trovato = listaDiVeicoliFiltrati.getFirst();

            // veicoli.stream().filter(veicolo -> veicolo.getId().equals(id)).toList().getFirst();
            System.out.println(trovato);

            //return id e targa da lista veicoli
            Stream<Veicolo> stream2Veicoli = veicoli.stream();
            Stream<Map> mappedList = stream2Veicoli.map(veicolo -> {
                Map map = new HashMap<>();
                map.put(veicolo.getId(), veicolo.getTarga());
                return map;
            });

            System.out.println(mappedList.toList());

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
