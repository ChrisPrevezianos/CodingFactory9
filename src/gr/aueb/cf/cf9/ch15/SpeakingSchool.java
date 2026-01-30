package gr.aueb.cf.cf9.ch15;

public class SpeakingSchool {

    // tightly coupled
    private final Cat cat = new Cat();

    public SpeakingSchool() {

    }

    public void learnToSpeak() {
        cat.speak();
    }
}
