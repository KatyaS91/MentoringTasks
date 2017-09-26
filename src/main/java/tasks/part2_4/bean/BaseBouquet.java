package tasks.part2_4.bean;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public class BaseBouquet {

	private String flowerName;
	private int amount;

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public BaseBouquet(String flowerName, int amount) {
		this.flowerName = flowerName;
		this.amount = amount;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		BaseBouquet bouquet = (BaseBouquet) o;

		if (amount != bouquet.amount)
			return false;
		return flowerName != null ? flowerName.equals(bouquet.flowerName) : bouquet.flowerName == null;
	}

	@Override public int hashCode() {
		int result = flowerName != null ? flowerName.hashCode() : 0;
		result = 31 * result + amount;
		return result;
	}
}