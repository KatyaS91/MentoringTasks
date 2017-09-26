package tasks.part2_4.daodb.connectionpool;

/**
 * Created by Katsiaryna_Skarzhyns on 9/21/2017.
 */
public class ConnectionPoolException extends Exception {
	private static final long serialVersionUID = 1L;

	public ConnectionPoolException(String message, Exception e){
		super(message,e);
	}
}