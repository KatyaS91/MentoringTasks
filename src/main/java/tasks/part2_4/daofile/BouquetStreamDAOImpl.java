package tasks.part2_4.daofile;

import tasks.part2_4.bean.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public class BouquetStreamDAOImpl implements BouquetStreamDAO {

	public int createBouquet(BaseBouquet bouquet) throws DAOException {

		BaseFlower flower = null;
		String flowerName = bouquet.getFlowerName();
		int count = bouquet.getAmount();
		int price;

		switch (flowerName){
		case "Chamomile":
			flower = new Chamomile(count);
			break;
		case "Cornflower":
			flower = new Cornflower(count);
			break;
		case "Myosotis":
			flower = new Myosotis(count);
			break;
		default:
			throw new DAOException();
		}
		price = flower.getPrice() * count;
		try {
			File file = new File("C:\\Users\\Katsiaryna_Skarzhyns\\Desktop\\Bouquets.txt");
			FileWriter writer = new FileWriter(file, true);
			String text = flowerName + " " + count + " шт. " + price + "BYN" + "\n";
			writer.write(text);
			writer.flush();
		} catch (IOException ex) {
			throw new DAOException();
		}
		return price;
	}
}