package fr.ensai.elevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CrazyElevator extends Elevator{

    /* Initialisation de l'outil/instance pour générer comportement aléatoire */
    private Random randomCrazy = new Random();
    /* Gestion affichage téléportation */
    private List<Person> victimesPersons = new ArrayList<>();

    /* Constructeur -> dérive du constructeur de Elevator -> super */
    public CrazyElevator(int id, int startFloor, int capacity) {
        super(id, startFloor, capacity);
    }

    /**
     * Redéfinition du mouvement avec un comportement "fou" avec même proba :
     * 1. Rester immobile
     * 2. Sauter la prochaine destination pour aller à celle d'après
     * 3. Mouvement normal
     * 
     * Utilisation de la méthode move de la classe héritée
     */
    @Override /*  Réécriture de la méthode move déja présente dans Elevator*/
    public void move() {
        /* Cas limite liste destination vide -> on sort */
        if (getListeDestination().isEmpty()) {
            return;
        }

        int choix = randomCrazy.nextInt(3); /* Génère 0, 1 ou 2 */

        if (choix == 0) {
                /* Rester immobile -> sortie de la boucle on ne fait rien */
                return;
        }
        else if(choix == 1){
                /* Sauter la destination suivante : 2 étapes
                Etape 1 -> suppression du premier élément 
                Etape 2 -> réalisation du mouvement comme le faisait l'ancienne méthode 
                On doit d'abord vérifier qu 'il y a au moins deux destinations*/ 
                if (getListeDestination().size() > 1) {
                    getListeDestination().removeFirst();
                    /* Appelle de la méthode originale */
                    super.move();
                } else {
                    /* Si une destination on reste sur place */
                }
            }
        else {
                /*  Mouvement normal */
                super.move();
        }
    }

    /**
     * Redéfinition du déchargement (accepte ou non):
     *
     * Utilisation de la méthode unloadPassengers de la classe héritée
     */
    @Override
    public int unloadPassengers(Floor floor) {
        int choix = randomCrazy.nextInt(2); /* Génère 0 -> déchargement ok ou 1 -> pas de déchargment */

        if (choix == 0) {
            /* Appelle de la méthode originale */
            return super.unloadPassengers(floor);
        } else {
            /* On ne décharge personne */
            return 0;
        }
    }

    /**
     * Définition du comportement de l'ascenseur si il est plein
     */
    public void teleportation(){
        /* Sauvegarde du nom des passage */
        this.victimesPersons = new ArrayList<>(getPassengers());

        /* On vide la liste des passagers */
        getPassengers().clear();

        /* Je choisis de garder la liste des destinations l'ascenseur se déplace mais a vide */
    }

    /** Rédéfinition du comportement de charger passager
     * Si l'ascenseur est plein utilise teleportation 
     * 
     * Utilisation de la méthode loadPassengers
     */
    @Override
    public void loadPassengers(Floor floor){
        /* Remplissage classique avec méthode héritée */
        super.loadPassengers(floor);

        /* Test si plein -> si oui téportation */
        if (this.isFull()){
            this.teleportation();
        }
    }

    public String getVictimesStr() {
        if (victimesPersons.isEmpty()) {
            return "";
        }
        String s = victimesPersons.stream()
                .map(Person::toString)
                .collect(java.util.stream.Collectors.joining(", "));
        
        victimesPersons.clear(); // On vide pour le prochain tour
        return s;
    }

}
