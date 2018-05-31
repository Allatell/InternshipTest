package person;

import person.consciousness.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledge;

    public Student(String name, int knowledgeLevel) {
        this.name = name;
        this.setKnowledge(new Knowledge(knowledgeLevel));
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
