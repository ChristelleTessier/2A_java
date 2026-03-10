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

        // maBibliotheque.addItem(fellowshipOfTheRing);

        // maBibliotheque.displayBooks();

        maBibliotheque.loadBooksFromCSV("books.csv");

        maBibliotheque.displayBooks();

    }
}