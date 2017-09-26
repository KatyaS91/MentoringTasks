package tasks.part2_4.service;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public final class ServiceFactory {

	private static final ServiceFactory instance = new ServiceFactory();

	private final BouquetService bouquetService = new BouquetServiceImpl();

	private ServiceFactory(){}

	public static ServiceFactory getInstance(){
		return instance;
	}

	public BouquetService getBouquetService(){
		return bouquetService;
	}
}