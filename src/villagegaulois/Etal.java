package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public class Etal implements IEtal {
	private Gaulois vendeur;
	private IProduit[] produits;
	private int nbProduit = 0;
	private int quantiteDebutMarche;
	private int quantite;
	private boolean etalOccupe = false;
	private int prix;

	@Override
	public boolean isEtalOccupe() {
		return etalOccupe;
	}

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public int getQuantite() {
		return quantite;
	}

}
