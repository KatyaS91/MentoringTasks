package tasks.part2_4.daodb;

import tasks.part2_4.bean.*;
import tasks.part2_4.daodb.connectionpool.ConnectionPool;
import tasks.part2_4.daodb.connectionpool.ConnectionPoolException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Katsiaryna_Skarzhyns on 9/21/2017.
 */
public class SQLBouquetDAO implements BouquetDAO {

	private Connection con;

	private Connection takeCon() {
		try {
			ConnectionPool.getInstance().initPoolData();
			con = ConnectionPool.getInstance().takeConnection();
		} catch (ConnectionPoolException e) {
			System.out.println("ConnectionPool error");
		}
		return con;
	}

	public int createBouquet(BaseBouquet bouquet) throws DAOException{
		BaseFlower flower = null;
		String flowerName = bouquet.getFlowerName();
		int count = bouquet.getAmount();
		int price;

		switch (flowerName){
		case "Chamomile":
			flower = new Chamomile(count);
			break;
		case "Cornflower":
			flower = new Cornflower(count);
			break;
		case "Myosotis":
			flower = new Myosotis(count);
			break;
		default:
			new DAOException();
		}
		price = flower.getPrice() * count;
		try {
			takeCon();
			String sql = "INSERT INTO bouquet(flowername, amount, price) VALUES(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, flowerName);
			ps.setInt(2, count);
			ps.setInt(3, price);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("Соединение не закрыто");
			}

		}
		return price;
	}
}