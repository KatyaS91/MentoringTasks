package tasks.part2_4.controller.commands;

import tasks.part2_4.bean.BaseBouquet;
import tasks.part2_4.controller.Command;
import tasks.part2_4.service.BouquetService;
import tasks.part2_4.service.ServiceException;
import tasks.part2_4.service.ServiceFactory;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public class CreateBouquet implements Command {

	String response = null;
	int price;

	public String createBouquet(BaseBouquet bouquet) {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		BouquetService bouquetService = serviceFactory.getBouquetService();
		try {
			price = bouquetService.createBouquet(bouquet);
			response = "Bouquet is created, the price is  "+ price;
		} catch (ServiceException ex) {
			response = "Sorry, we don't have such flowers";
		}
		return response;
	}
}