package level2.exercise2;

public class GenericMethods {

    @SafeVarargs
    public final <T> void printArgs(T... args) {

        for (int i=0; i<args.length; i++) {
            System.out.println("Arg" + i + ": " + args[i] );
        }
    }
}
