package level1.exercise2;

public class GenericMethods {
    public <T> void printArgs(T arg1, T arg2, T arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}
