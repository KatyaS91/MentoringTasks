package tasks.part2_4.daofile;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final BouquetStreamDAO bouquetStreamDAOImpl = new BouquetStreamDAOImpl();

	private DAOFactory(){}

	public static DAOFactory getInstance(){
		return instance;
	}

	public BouquetStreamDAO getBouquetStreamDAO(){
		return bouquetStreamDAOImpl;
	}
}