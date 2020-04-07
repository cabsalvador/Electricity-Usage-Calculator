import java.io.Serializable;

public class User implements Serializable {
	private String firstName;
	private String lastName;
	private String userName;
//	private String password;
//	private String verifyPassword;
	private String 
	
	public User(final String firstName, final String lastName, final String userName, final String password, final String verifyPassword, ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.verifyPassword = verifyPassword;
	}

}