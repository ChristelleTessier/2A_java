package fr.ensai.library;

public class Student extends Person{
    
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new Student.
     */
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        super(name, age);
        this.isClassDelegate = isClassDelegate;
        this.academicYear = academicYear;
    }
    
}
