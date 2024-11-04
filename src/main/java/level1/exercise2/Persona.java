package level1.exercise2;

public class Persona {
    private final String name;
    private final String surname;
    private final int age;

    public Persona(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{ name: " + name +
                ", surname: " + surname +
                ", age: " + age + "}";
    }
}
