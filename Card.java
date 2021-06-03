import java.util.Random;

public class Card {

	private Integer score;

	public Card() {
		super();

		this.score = new Random().nextInt(11) + 1;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer numero) {
		this.score = numero;
	}

// 
}
