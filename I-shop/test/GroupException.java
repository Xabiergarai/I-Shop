
public class GroupException extends Exception {
	String u;
	
	public GroupException(String mensaje) {
		u = mensaje;
	}
	public String toString(){
		return u;
	}
	
}
