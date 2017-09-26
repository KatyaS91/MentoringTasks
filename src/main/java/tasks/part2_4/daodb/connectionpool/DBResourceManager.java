package tasks.part2_4.daodb.connectionpool;

import java.util.ResourceBundle;

/**
 * Created by Katsiaryna_Skarzhyns on 9/21/2017.
 */
public class DBResourceManager {
	private final static DBResourceManager instance = new DBResourceManager();
	private ResourceBundle bundle = ResourceBundle.getBundle("config");

	public static DBResourceManager getInstance(){
		return instance;
	}

	public String getValue(String key){
		return bundle.getString(key);
	}
}