package week3Day2Assignments;

public class JavaConnection extends MySqlConnection {

	
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("The sql got connected");

	}

	
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("The sql got disconnected");

	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("The query was updated");

	}
	public static void main(String[] args) {
		JavaConnection javaConnect = new JavaConnection();
		javaConnect.connect();
		javaConnect.disconnect();
		javaConnect.executeUpdate();
		javaConnect.executeQuery();


	}


	@Override
	public void executeQuery() {
		System.out.println("The query got executed");
		
	}

	

}
