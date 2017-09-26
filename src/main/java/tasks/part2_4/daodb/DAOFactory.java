package tasks.part2_4.daodb;

/**
 * Created by Katsiaryna_Skarzhyns on 9/21/2017.
 */
public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final BouquetDAO bouquetDAOImpl = new SQLBouquetDAO();

	private DAOFactory(){}

	public static DAOFactory getInstance(){
		return instance;
	}

	public BouquetDAO getBookNewsDAO(){
		return bouquetDAOImpl;
	}
}
