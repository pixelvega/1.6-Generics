package level1.exercise2;

public class GenericMethods {
    public <T, U, V> void printArgs(T arg1, U arg2, V arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}
