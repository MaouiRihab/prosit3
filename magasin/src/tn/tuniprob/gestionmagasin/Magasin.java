package tn.tuniprob.gestionmagasin;
    public class Magasin {

        private int identifiant;
        private String adresse;

        private final int CAPACITE = 0;


        private Produit[] tabprod = new Produit[CAPACITE];

        private static int comproduit= 0;
        private int comp;

        public Magasin() {
        }

        public Magasin(int id, String ad) {
            identifiant = id;
            adresse = ad;
        }


        public void afficherMarquePr() {
            for (int i = 0; i < comp; i++)
                System.out.println("Marque :" + tabprod[i].getMarque());
        }

        public String toString() {
            String str = "L'ensemble des produits :\n";
            for (int i = 0; i < comp; i++)
                str += tabprod[i] + "\n";

            return "identifiant ;" + identifiant + " adresse :" + adresse + "\n" + str;

        }

        public static int getTotalProduitsAjoutes() {
            return comproduit;
        }

        public boolean chercherProduit(Produit produitCherche) {
            for (int i = 0; i < comp; i++) {
                Produit p = tabprod[i];
                if (p.comparermethode1(produitCherche)) {
                    return true;
                }
            }
            return false;
        }

        public void ajouter(Produit p) {
            if (chercherProduit(p)) {
                System.out.println("Le produit est déjà présent dans le magasin.");
            } else {
                if (comp < CAPACITE) {
                    tabprod[comp] = p;
                    comp++;
                } else {
                    System.out.println("Magasin plein");
                }
            }


        }
    }
