package person;

import person.consciousness.Knowledge;

public class Student {

    String name;
    Knowledge knowledge;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }
}
