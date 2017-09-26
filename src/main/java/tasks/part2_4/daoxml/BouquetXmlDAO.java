package tasks.part2_4.daoxml;

import tasks.part2_4.bean.BaseBouquet;

/**
 * Created by Katsiaryna_Skarzhyns on 9/21/2017.
 */
public interface BouquetXmlDAO {
	int createBouquet(BaseBouquet bouquet) throws DAOException;
}