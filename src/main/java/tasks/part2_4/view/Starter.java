package tasks.part2_4.view;

import tasks.part2_4.bean.BaseBouquet;
import tasks.part2_4.controller.Controller;

import java.util.Scanner;

/**
 * Created by Katsiaryna_Skarzhyns on 9/20/2017.
 */
public class Starter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter flower name: ");
		String flower = in.next();
		int amount = 0;
		while (amount <=0 ) {
			System.out.println("Enter amount (more than 0): ");
			amount = in.nextInt();
		}
		BaseBouquet chamomileBouquet = new BaseBouquet(flower, amount);
		Controller controller = new Controller();
		System.out.println(controller.createBouquet(chamomileBouquet));
	}
}