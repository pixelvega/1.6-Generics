package level2.exercise2;

import java.util.Arrays;

public class GenericMethods {

    @SafeVarargs
    public final <T> void printArgs(Persona persona, T... args) {
        System.out.println("Arg Persona: " + persona);
        for (int i=0; i<args.length; i++) {
            System.out.println("Arg" + i + ": " + args[i] );
        }
    }
}
