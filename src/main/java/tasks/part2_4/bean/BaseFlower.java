package tasks.part2_4.bean;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public class BaseFlower {

	private int price;
	private int amount;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		BaseFlower flower = (BaseFlower) o;

		if (price != flower.price)
			return false;
		return amount == flower.amount;
	}

	@Override public int hashCode() {
		int result = price;
		result = 31 * result + amount;
		return result;
	}
}
