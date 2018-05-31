package institution;

import person.Student;

import java.util.ArrayList;

public class University {

    String name;
    long knowledgeLevel;
    ArrayList<Student> students = new ArrayList<Student>();

    public University(String name) {
        this.name = name;
        this.knowledgeLevel = 0;
    }

    public void setStudent(Student student) {

    }

    public void addStudent(Student student) {
        students.add(student);
        this.knowledgeLevel = this.knowledgeLevel+student.getKnowledge().getLevel();
    }
}
