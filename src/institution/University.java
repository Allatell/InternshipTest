package institution;

import person.Student;

import java.util.ArrayList;

public class University {

    private String name;
    private int knowledgeLevel;
    private ArrayList<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
        updateKnowledgeLevel(student.getKnowledge().getLevel());
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public float getKnowledgeLevel(){
        return knowledgeLevel;
    }

    public void updateKnowledgeLevel(int studentKnowledgeLevel) {
        if (students.size()==1) this.knowledgeLevel = studentKnowledgeLevel;
        else {
            this.knowledgeLevel += studentKnowledgeLevel;
            this.knowledgeLevel = this.knowledgeLevel/2;
        }
    }
}
