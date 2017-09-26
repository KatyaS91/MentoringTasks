package tasks.part2_4.controller;

import tasks.part2_4.bean.BaseBouquet;
import tasks.part2_4.controller.commands.CreateBouquet;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public class Controller {

	public String createBouquet(BaseBouquet bouquet){
		CreateBouquet executionCommand = new CreateBouquet();
		String response;
		response = executionCommand.createBouquet(bouquet);
		return response;
	}
}