package institution;

import person.Student;

public class University {

    String name;
    ArrayList<Student> students = new ArrayList<Student>();

    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        //TODO: Implementation is needed
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
