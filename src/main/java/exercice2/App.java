package exercice2;

import java.util.Scanner;

public class App {

    private static IMetier<Produit> metier = new MetierProduitImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choix;
        long id;

        do {
            Produit produit = new Produit();
            String nom;
            String marque;
            double prix;
            String description;
            int quantite;
            afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour chariot

            switch (choix) {
                case 1:
                    System.out.print(metier.getAll());;
                    break;
                case 2:
                    System.out.print("id = ");
                    id = scanner.nextInt();
                    System.out.print(metier.findById(id));
                    break;
                case 3:
                    System.out.println("Ajouter un nouveau produit");
                    System.out.print("Nom: ");
                    nom = scanner.nextLine();
                    System.out.print("Marque: ");
                    marque = scanner.nextLine();
                    System.out.print("Prix: ");
                    prix = scanner.nextDouble();
                    System.out.print("Description: ");
                    description = scanner.next();
                    System.out.print("Quantité: ");
                    quantite = scanner.nextInt();
                    id =  metier.getSize();
                    produit.setId(id);
                    produit.setNom(nom);
                    produit.setMarque(marque);
                    produit.setPrix(prix);
                    produit.setDescription(description);
                    produit.setQuantite(quantite);
                    metier.add(produit);
                    break;
                case 4:
                    System.out.print("id = ");
                    id = scanner.nextInt();
                    metier.delete(id);
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 5);
    }

    private static void afficherMenu() {
        System.out.println("\n\nMenu principal:");
        System.out.println("1. Afficher la liste des produits");
        System.out.println("2. Rechercher un produit par son identifiant");
        System.out.println("3. Ajouter un nouveau produit");
        System.out.println("4. Supprimer un produit par identifiant");
        System.out.println("5. Quitter");
        System.out.print("Votre choix (1-5) : ");
    }
}
