package fr.ensai.library;
import java.time.LocalDate;

public class Loan {
    
    private Student student;
    private Item item;
    private LocalDate startDate;
    private LocalDate returnDate;

    /**
     * Constructs a new Loan object.
     */
    public Loan(Student student, Item item) {
        this.student = student;
        this.item = item;
        this.startDate = LocalDate.now();
        this.returnDate = this.startDate.plusWeeks(3);;
    }

    /**
     * Mise a jour date de retour
     */
    public void setReturnDate(LocalDate date) {
        this.returnDate = date;
        }

    @Override
    public String toString() {
        return String.format("Item %s borrowed by %s", this.item, this.returnDate);
    }
    }




