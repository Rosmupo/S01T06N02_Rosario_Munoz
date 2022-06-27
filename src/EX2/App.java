package EX2;

/*
- Exercici 2
Modifica l'apartat anterior de manera que els arguments del mètode
genèric siguin una llista d'arguments de variable indefinida.
 */

public class App {

    public static void main(String[] args) {
        int num = 1;
        String city = "La Roca del Vallès";
        boolean info = true;
        Persona persona = new Persona("María", "López", 50);
        GenericMethods.printArguments(persona, num, city, info);
    }

}