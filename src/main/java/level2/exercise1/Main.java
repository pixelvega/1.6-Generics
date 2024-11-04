package level2.exercise1;

public class Main {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();

        Persona persona = new Persona("Juan", "Perez", 20);

        genericMethods.printArgs(persona, "C'est la vie", 1);
        genericMethods.printArgs(persona, 3.1416, true);
        genericMethods.printArgs(persona, 100, 'A');
    }
}
