import java.util.HashMap;

public class UserId {
	public static HashMap<String,String> user = new HashMap<String,String>();
	static{
		user.put("zee","12345");
		user.put("admin","password");
	}
	public static boolean validate(String username, String password){
//		System.out.println(username +"   " + password);
		try{
			return user.get(username).equals(password);
		}
		catch(Exception e){
			return false;
		}
	}
}
