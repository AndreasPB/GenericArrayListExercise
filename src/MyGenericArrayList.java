import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class MyGenericArrayList<E> {

    private Object[] genericArray;

    // Constructor der laver 5 tilfældige tal fra 0 til 99
    public MyGenericArrayList() {
        Random rand = new Random();
        genericArray = new Object[5];

        for(int i = 0; i < genericArray.length; i++) {
            int randomInt = rand.nextInt(100);
            genericArray[i] = randomInt;
        }
    }

    //  Retunerer index
    public Object get(int index) {

        return genericArray[index];
    }

    // Gemmer data i dataTransfer, overskriver det gamle array
    // sender data tilbage og tilføjer value bagerst i det nye array
    public void add(E value) {

        int newLength = genericArray.length + 1;
        Object[] dataTransfer = genericArray;
        genericArray = new Object[newLength];

        for(int i = 0; i < newLength - 1; i++) {
            genericArray[i] = dataTransfer[i];
        }
        genericArray[newLength - 1] = value;
        System.out.println(value + " added!");
    }

    // Tilføjer et tal på positionen index og rykker alt en plads til højre
    public void add(int index, E e) {

        int newLength = genericArray.length + 1;
        Object[] dataTransfer = new Object[newLength];

        int count = 0;

        for(int i = 0; i < genericArray.length; i++) {
            if(index == i) {
                dataTransfer[i] = e;
                System.out.println(e + " placed on index " + index);
                count++;
            }
            dataTransfer[i + count] = genericArray[i];
        }
        genericArray = dataTransfer;
    }

    // En pænere add metoder, men snyder med Arrays.copyOf
    public void addCopyOf(int value) {

        int newLength = genericArray.length + 1;

        genericArray = Arrays.copyOf(genericArray, newLength);

        genericArray[newLength - 1] = value;
    }

    // Laver et nyt array uden tallet på plads index
    public void remove(int index) {

        int newLength = genericArray.length - 1;
        Object[] dataTransfer = new Objects[newLength];

        int count = 0;

        for(int i = 0; i < genericArray.length; i++) {
            if(index == i) {
                System.out.println("You removed " + genericArray[i]);
                count++;
            } else {
                dataTransfer[i - count] = genericArray[i];
            }
        }

        genericArray = dataTransfer;
    }


    // Viser længden på arrayet
    public int size() {

        return genericArray.length;
    }

    // Overskriver genericArray med et tomt array
    public void clear() {
        genericArray = new Objects[0];
        System.out.println("Your array has been cleared!");
    }

    // Printer alle tallene i genericArray til consollen (uden havelåge-kommaer :))
    public void printAll() {

        System.out.println("Your array: ");

        if(genericArray.length == 0) {
            throw new ArrayIndexOutOfBoundsException("You're trying to print an empty array.");
        } else {
            System.out.print(genericArray[0]);

            for(int i = 1; i < genericArray.length; i++) {
                System.out.print(", " + genericArray[i]);
            }
            System.out.println();
        }
    }
}
