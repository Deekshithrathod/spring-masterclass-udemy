package webapp;

public class UserValidatorService {
	public boolean validateUser(String username, String password) {
		if(username.equals("user") && password.equals("pass")) {
			return true;
		}
		return false;
	}
}
