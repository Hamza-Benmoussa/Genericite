package exercice2;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {

    private List<Produit> produits;

    public MetierProduitImpl() {
        this.produits = new ArrayList<>();
    }

    @Override
    public void add(Produit produit) {
        produits.add(produit);
    }

    @Override
    public int getSize() {
        return produits.size();
    }

    @Override
    public List<Produit> getAll() {
        if(produits.isEmpty()){
            System.out.println("Aucun produit n'a été trouver.");
            return null;
        } else{
            return produits;
        }
    }


    @Override
    public Produit findById(long id) {
        Produit p = produits.stream()
                .filter(produit -> produit.getId() == id)
                .findFirst()
                .orElse(null);
        if(p != null) {
            return p;
        } else {
            System.out.println("Produit introuvable.");
            return null;
        }
    }

    @Override
    public void delete(long id) {
        Produit p = findById(id);
        if(p != null) {
            produits.removeIf(produit -> produit.getId() == id);
        }
    }
}

