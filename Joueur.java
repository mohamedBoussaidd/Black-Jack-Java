
public class Joueur {
	private String name;
	private String type;
	private Integer score;

	

	public Joueur(String name, String type) {
		super();
		this.type = type;
		this.name = name;
		this.score = 0;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//fonction qui fait piocher et qui retourne le score de la carte piocher
	public  Integer piocher() {
		Integer scoreDeCartePiocher = new Card().getScore();
		System.out.println(" ** La carte tirer par " + getName() + " lui rapporte " + scoreDeCartePiocher + " points");
		 setScore(getScore() + scoreDeCartePiocher);
		 Integer score = getScore();
		 System.out.println(" ** Son score est de : " + getScore());
		return score;
	}
	

}
