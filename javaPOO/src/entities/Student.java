package entities;

public class Student {
    // grade 1 - max 30 / grade 2 and 3 - max 35
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public double finalGrade() { return grade1 + grade2 + grade3; }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        }
        else {
            return 0.0;
        }
    }
}
