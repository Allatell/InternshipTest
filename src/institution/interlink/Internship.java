package institution.interlink;

import person.Student;

public class Internship {

    String name;
    ArrayList<Student> students = new ArrayList<Student>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        students.add(student);
    }

    public String getStudents() {
        return students;
    }
}
