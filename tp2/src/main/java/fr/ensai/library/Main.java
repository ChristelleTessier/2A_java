package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        // 1. Création de l'objet (Instanciation)
        Library maBibliotheque = new Library("bibliotheque");

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing);

        maBibliotheque.addItem(fellowshipOfTheRing);

        // ajout des livres du fichier csv
        maBibliotheque.loadBooksFromCSV("books.csv");

        // creation de deux magazines
        Magazine mag1 = new Magazine("National Geographic", 2024, 96, "0027-9358", "Janvier");
        maBibliotheque.addItem(mag1);
        Magazine mag2 = new Magazine("The Economist", 2023, 80, "0013-0613", "Vol. 448");
        maBibliotheque.addItem(mag2);
        
        maBibliotheque.displayItems();

    }
}