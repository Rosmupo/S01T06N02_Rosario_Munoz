package EX2;

public class GenericMethods {

    public static <T> void printArguments(T... a) {
        System.out.println("Number of arguments: "
                + a.length);
        for (T i : a)
            System.out.print(i + " _");
        System.out.println();
    }

}
