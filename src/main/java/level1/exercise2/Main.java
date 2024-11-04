package level1.exercise2;

public class Main {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();

        Persona persona = new Persona("Juan", "Perez", 20);

        genericMethods.printArgs(persona, "C'est la vie", 42);
        genericMethods.printArgs(3.1416, persona, true);
        genericMethods.printArgs("John", 100, 'A');
    }
}
