package level2.exercise1;

public class GenericMethods {

    public <U, V> void printArgs(Persona persona, U arg2, V arg3) {
        System.out.println("Arg Persona: " + persona);
        System.out.println("Arg 2: " + arg2);
        System.out.println("Arg 3: " + arg3);
    }
}
