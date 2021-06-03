import java.util.Scanner;

public class LancerJeu {

	public static void start() {
		Joueur joueur = new Joueur(infoUser(), "player");
		Joueur dealer = new Joueur("le dealer", "dealer");
		while (joueur.getScore() < 21 && dealer.getScore() < 21) {
			if (creeBoiteDialogue("*** Bienvenue " + joueur.getName().toUpperCase() + " Voulez vous une carte ?")
					.equalsIgnoreCase("oui")) {
				joueur.piocher();
				dealer.piocher();
			} else {
				if(joueur.getScore() > dealer.getScore()) {
					System.out.println("** Bravo tu as gagner ton score est de "+ joueur.getScore() +" donc tu es le plus proche de 21");
				}else {
					System.out.println("** Dommage tu as perdu ton score est de "+ joueur.getScore() +" donc tu es le plus plus éloigner de 21");
				}
			}
			stopParfait(joueur);
		}
		stopTaGagner(joueur);
		stopTaPerdu(joueur);
		
	}

	public static void stopTaPerdu(Joueur joueur) {
		if (joueur.getScore() > 21) {
			System.out.println("** Dommage tu as perdu le dealer a ete meilleur ! tu peux resseyer ");
		}
		
	}

	public static void stopParfait(Joueur joueur) {
		if (joueur.getScore() == 21) {
			System.out.println("** Bravo tu as taper dans le mile ton score est de : 21 ");
		}
		
	}

	public static void stopTaGagner(Joueur joueur) {
		if (joueur.getScore() <= 21) {
			System.out.println("** Bravo ta gagner tu as fais un score plus elever que le dealer ");
		}

		
	}

	public static void main(String[] args) {

		start();
	}

	public static String creeBoiteDialogue(String texte) {
		System.out.println(texte);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public static String infoUser() {
		System.out.println("** Veiullez indiquer votre nom : ");
		Scanner sc = new Scanner(System.in);
		return sc.next();
		
	}
	
}