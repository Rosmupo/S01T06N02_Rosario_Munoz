package EX1;

/*- Exercici 1
Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.
*/

public class App {
    public static void main(String[] args) {

        int num = 1;
        String city = "La Roca del Vallès";
        Persona persona = new Persona("María", "López", 50);
        GenericMethods.printArguments(persona, num, city);
    }
}