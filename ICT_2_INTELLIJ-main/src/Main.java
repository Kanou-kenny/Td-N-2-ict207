public class Main {
    public static void main(String[] args) {
    	/*char continuer = 'Y';
    	int choix = 0;
    	Etudiant [] tableau = null ;
    	Système.out.println("")*/
//
//        Etudiant etudiant = Etudiant.createEtudiant();
//        etudiant.afficher();
//        etudiant.bonifier(10);
//        etudiant.afficher();

        //////////////////////////////////////////////////////////////
        int taille = GestionEtudiant.setTaille();
        Etudiant[] etudiants = GestionEtudiant.createtab(taille);
        etudiants = GestionEtudiant.sortTab(etudiants);
        GestionEtudiant.afficherOrdreMerite(etudiants);
        GestionEtudiant.afficherPremierEtudiant(etudiants);
        GestionEtudiant.afficherDernierEtudiant(etudiants);
        //GestionEtudiant.reinitialiserListeClasse(etudiants);
        GestionEtudiant.sortirProgramme();
        
       /* while(continuer == 'Y') {
        	switch(choix) {
        	case 1 :
        		afficherEtudiant(tableau);
        			break
        		default :
        			System.out.println("choix indisponoble");
        			break ;
        	}
        	System.out.println("Voulez-vous continuer: Y/N");
        	continuer
        }*/


    }
}
