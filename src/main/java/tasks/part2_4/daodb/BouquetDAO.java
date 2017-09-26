package tasks.part2_4.daodb;

import tasks.part2_4.bean.BaseBouquet;

/**
 * Created by Katsiaryna_Skarzhyns on 9/21/2017.
 */
public interface BouquetDAO {
	int createBouquet(BaseBouquet bouquet) throws DAOException;
}
