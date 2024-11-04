package level1.exercise1;

public class Main {
    public static void main(String[] args) {

        NoGenericsMethod noGenericsMethod1 = new NoGenericsMethod("Juan", "Perez", "Iglesias");
        NoGenericsMethod noGenericsMethod2 = new NoGenericsMethod("Perez","Juan","Iglesias"
        );
        NoGenericsMethod noGenericsMethod3 = new NoGenericsMethod("Iglesias","Perez","Juan"
        );

        System.out.println(noGenericsMethod1);
        System.out.println(noGenericsMethod2);
        System.out.println(noGenericsMethod3);
    }
}
