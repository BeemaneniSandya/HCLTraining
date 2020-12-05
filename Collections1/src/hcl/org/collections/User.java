package hcl.org.collections;

public class User implements Comparable<User> {
	private String name;
	private String username;
	private String password;
	private Integer mobilenumber;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String username, String password, Integer mobilenumber) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.mobilenumber = mobilenumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the mobilenumber
	 */
	public Integer getMobilenumber() {
		return mobilenumber;
	}

	/**
	 * @param mobilenumber the mobilenumber to set
	 */
	public void setMobilenumber(Integer mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public int compareTo(User arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int comparableTo(User user) {
		if (this.mobilenumber < user.getMobilenumber()) {
			return -1;
		} else if (this.mobilenumber > user.getMobilenumber()) {
			return 1;
		} else
			return 0;

	}

}
