import java.util.Scanner;

public class GestionEtudiant {
    public static int setTaille(){
        System.out.println("Veiullez entrer la taille du tableau: ");
        Scanner scanner = new Scanner(System.in);
        int taille = scanner.nextInt() ;
        return  taille;

    }

    public static Etudiant[] createtab(int taille){
    	System.out.println("Creation de tableau");
        Etudiant[] tab = new Etudiant[taille];
        double val;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<taille; i++){
            System.out.println("Information de l'etudiant : "+(i+1));
            tab[i]=Etudiant.createEtudiant();
            System.out.println("Note de l'etudiant : "+(i+1));
            val = sc.nextDouble();
            tab[i].bonifier(val);
        }
        
        System.out.println("Fin creation de tableau");
        return tab;
    }
    public static Etudiant[] sortTab(Etudiant[] tab){
        int j, i;
        Etudiant tmp ;
        System.out.println("Debut Tri");
        for(i=0 ; i< tab.length-1 ;i++){
            for(j=i+1 ; j< tab.length ;j++){
                if(tab[i].getMoyenne() < tab[j].getMoyenne()){
                    tmp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = tmp;

                }
            }

        }
        System.out.println("Fin tri");
        return tab;

    }
    public static void afficherOrdreMerite(Etudiant[] tab){
    	System.out.println("Affichage ordre de merite");
        for (int i = 0; i < tab.length ; i++){
            tab[i].afficher();
        }
        System.out.println("Fin orfre merite");
    }

    public static void afficherPremierEtudiant(Etudiant[] tab){
    	System.out.println("Affichage premier");
        tab[0].afficher();

    }

    public static void afficherDernierEtudiant(Etudiant[] tab){
    	System.out.println("Affichage dernier");
        tab[tab.length-1].afficher();
    }

    public static void reinitialiserListeClasse(Etudiant[] tab){
        tab = createtab(tab.length);
    }

    public static void sortirProgramme(){
        System.exit(0);
    }
}
