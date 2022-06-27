package EX1;

public class GenericMethods {

    public static <T> void printArguments(T a, T b, String city) {
        System.out.println("Primer argumento: " + a.toString() + ". Segundo argumento: " + b.toString() + ". Tercer argumento: " + city.toString());

    }
}
