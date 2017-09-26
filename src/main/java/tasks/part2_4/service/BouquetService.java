package tasks.part2_4.service;

import tasks.part2_4.bean.BaseBouquet;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public interface BouquetService {
	int createBouquet(BaseBouquet bouquet) throws ServiceException;
}