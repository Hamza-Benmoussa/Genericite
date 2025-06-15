package exercice1;

public class App {

    public static void main(String[] args) {
        // Test avec des entiers
        StorageGenerique<Integer> intStorage = new StorageGenerique<>();
        intStorage.addElement(10);
        intStorage.addElement(20);
        intStorage.addElement(30);
        intStorage.removeElement(1);

        System.out.println("Taille du stockage des entiers : " + intStorage.getSize());
        System.out.println("Element à l'index 1 : " + intStorage.getElement(1));

        intStorage.removeElement(2);
        System.out.println("Après suppression, taille du stockage des entiers : " + intStorage.getSize());

        // Test avec des chaines de caractères
        StorageGenerique<String> stringStorage = new StorageGenerique<>();
        stringStorage.addElement("Hello");
        stringStorage.addElement("World");
        stringStorage.addElement("!");
        stringStorage.addElement("Goodbye");
        stringStorage.removeElement(0);

        System.out.println("\nTaille du stockage des chaines : " + stringStorage.getSize());
        System.out.println("Element à l'index 0 : " + stringStorage.getElement(0));

        // Test avec des doubles
        StorageGenerique<Double> doubleStorage = new StorageGenerique<>();
        doubleStorage.addElement(1.5);
        doubleStorage.addElement(3.14);
        doubleStorage.addElement(4.6);
        doubleStorage.removeElement(2);

        System.out.println("\nTaille du stockage des doubles : " + doubleStorage.getSize());
        System.out.println("Element à l'index 2 : " + doubleStorage.getElement(2));
    }
}
