package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="acc")
@SessionScoped
public class Account {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String add() {
		String meh = meh();
		System.out.println(meh);
		if(meh == "suc") {
			return "home";
		}
		return "wrong";
	}
	
	public String login() {
		Acclogin lg = new Acclogin();
		String User = lg.getUsername();
		String Pass = lg.getPassword();
		if(username.equals(User) && password.equals(Pass)) {
			return "home";
		}
		return "wrong";
	}
	
	public String meh() {
		if(username.equals("alice") && password.equals("alice")) {
			return "suc";
		}
		return "fail";
	}
	//meh
}
