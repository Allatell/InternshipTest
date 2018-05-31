package institution.interlink;

import person.Student;

import java.util.ArrayList;

public class Internship {

    String name;

    ArrayList<Student> students = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        students.add(student);
    }

    public String getStudents() {
        String students = new String();
        for (Student student:this.students) {
            students.concat(student.getName()+" ");
        }
        return students;
    }
}
