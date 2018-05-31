package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 75));
        university.addStudent(new Student("Julia Veselkina", 50));
        university.addStudent(new Student("Maria Perechrest", 50));

        Internship internship = new Internship("Interlink");
        internship.addStudentsFromUniversity(university);
        System.out.println("List of internship's students:");
        for (Student student:internship.getStudents()) {
            System.out.println(student.getName()+" ");
        }
    }
}
