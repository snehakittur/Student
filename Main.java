import java.time.LocalDate;
import java.time.Period;

class Student {
    String name;
    LocalDate dob;

    public Student(String name, String dobStr) {
        this.name = name;
        this.dob = LocalDate.parse(dobStr);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Alice", "2005-06-15");
        s.displayInfo();
    }
}
