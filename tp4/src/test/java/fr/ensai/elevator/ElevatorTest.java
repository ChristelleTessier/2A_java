package fr.ensai.elevator;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ElevatorTest{
    
    @Test 
    void testIsFullNo(){
        /* Test ascenseur vide 
        La méthode isFull est difficile a tester parceque les données sont générées de manière aléatoire
        et l'appel de l'ascenseur s'effectue par les étages.
        Difficultés pour charger un ascensseur -> besoin d'une nouvelle méthode InitialisationElevator */

        // GIVEN
        /* Création des clients */
        Person client1 = new Person(0);
        Person client2 = new Person(0);

        /* Initialisation des paramètres de l'ascenseur */
        int id = 0;
        int capacity = 3;
        int currentFloor = 0;

        /* Création de l'ascenseur vide */
        Elevator ascenseur1 = new Elevator(id, currentFloor, capacity);

        /* Chargement de l'ascensseur */
        ascenseur1.initialisationElevator(client1);
        ascenseur1.initialisationElevator(client2);

        // WHEN 
        boolean testAscenseur = ascenseur1.isFull();
        
        // THEN 
        assertEquals(testAscenseur,false);
    }

    @Test 
    void testIsFullYes(){
        /* Test d'ascenseur plein*/

        // GIVEN
        /* Création des clients */
        Person client1 = new Person(0);
        Person client2 = new Person(0);
        Person client3 = new Person(0);

        /* Initialisation des paramètres de l'ascenseur */
        int id = 0;
        int capacity = 3;
        int currentFloor = 0;

        /* Création de l'ascenseur vide */
        Elevator ascenseur1 = new Elevator(id, currentFloor, capacity);

        /* Chargement de l'ascensseur */
        ascenseur1.initialisationElevator(client1);
        ascenseur1.initialisationElevator(client2);
        ascenseur1.initialisationElevator(client3);

        // WHEN 
        boolean testAscenseur = ascenseur1.isFull();
        
        // THEN 
        assertEquals(testAscenseur,true);
    }

    @Test 
    void testAddDestination(){
        /* La méthode isFull est difficile a tester parceque les données sont générées de manière aléatoire
        et l'appel de l'ascenseur s'effectue par les étages.
        Difficultés pour charger un ascensseur -> besoin d'une nouvelle méthode InitialisationElevator */

        // GIVEN
        /* Création des clients */
        Person client1 = new Person(0);
        Person client2 = new Person(0);

        /* Initialisation des paramètres de l'ascenseur */
        int id = 0;
        int capacity = 3;
        int currentFloor = 0;

        /* Création de l'ascenseur vide */
        Elevator ascenseur1 = new Elevator(id, currentFloor, capacity);

        /* Chargement de l'ascensseur */
        ascenseur1.initialisationElevator(client1);
        ascenseur1.initialisationElevator(client2);

        // WHEN 
        boolean testAscenseur = ascenseur1.isFull();
        
        // THEN 
        assertEquals(testAscenseur,false);
    }




    
}