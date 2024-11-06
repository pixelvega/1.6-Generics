package level2.exercise1;

public class GenericMethods {

    public <T> void printArgs(Persona persona, T arg2, T arg3) {
        System.out.println("Arg Persona: " + persona);
        System.out.println("Arg 2: " + arg2);
        System.out.println("Arg 3: " + arg3);
    }
}
