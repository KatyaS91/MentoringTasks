package tasks.part2_4.service;

import tasks.part2_4.bean.BaseBouquet;
import tasks.part2_4.daofile.BouquetStreamDAO;
import tasks.part2_4.daofile.DAOException;
import tasks.part2_4.daofile.DAOFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public class BouquetServiceImpl implements BouquetService {

	public int createBouquet(BaseBouquet bouquet) throws ServiceException {
		try {
			DAOFactory daoObjectFactory = DAOFactory.getInstance();
			BouquetStreamDAO bouquetStreamDAO = daoObjectFactory.getBouquetStreamDAO();
			return bouquetStreamDAO.createBouquet(bouquet);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}
}