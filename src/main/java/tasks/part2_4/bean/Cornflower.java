package tasks.part2_4.bean;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public class Cornflower extends BaseFlower {

	private int amount;

	private int price = 2;

	public Cornflower(int amount) {
		this.amount = amount;
	}

	@Override public int getAmount() {
		return amount;
	}

	@Override public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override public int getPrice() {
		return price;
	}

	@Override public void setPrice(int price) {
		this.price = price;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;

		Cornflower that = (Cornflower) o;

		if (amount != that.amount)
			return false;
		return price == that.price;
	}

	@Override public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + amount;
		result = 31 * result + price;
		return result;
	}
}