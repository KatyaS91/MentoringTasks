package tasks.part2_4.daoxml;

/**
 * Created by Katsiaryna_Skarzhyns on 9/21/2017.
 */
public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final BouquetXmlDAO bouquetXmlDAOImpl = new BouquetXmlDAOImpl();

	private DAOFactory(){}

	public static DAOFactory getInstance(){
		return instance;
	}

	public BouquetXmlDAO getBouquetXmlDAO(){
		return bouquetXmlDAOImpl;
	}
}