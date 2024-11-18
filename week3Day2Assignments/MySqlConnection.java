package week3Day2Assignments;

public abstract class MySqlConnection implements DatabseConnection {
	public abstract void executeQuery();
    public void connect() {	
    	System.out.println("..............");
    }
    public void disconnect() {
    	System.out.println("..............");
    }
	public void executeUpdate() {
		System.out.println("..............");
	}
}
