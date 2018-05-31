package institution.interlink;

import institution.University;
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

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void addStudentsFromUniversity(University university){
        ArrayList<Student> universityStudents =  university.getStudents();
        for (Student student:universityStudents) {
            if (student.getKnowledge().getLevel()>university.getKnowledgeLevel()){
                setStudent(student);
            }
        }
    }
}
