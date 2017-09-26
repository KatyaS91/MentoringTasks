package tasks.part2_4.controller;

import tasks.part2_4.bean.BaseBouquet;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public interface Command {
	String createBouquet(BaseBouquet bouquet);
}