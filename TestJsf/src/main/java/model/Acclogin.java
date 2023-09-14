package model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name="Acclogin")
@SessionScoped
public class Acclogin {

	private String Fname;
	private String Lname;
	private String Gender;
	private String Dob;
	private String Address;
	private String Contact;
	private String Email;
	private String Username;
	private String Password;
	private String CPassword;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCPassword() {
		return CPassword;
	}
	public void setCPassword(String cPassword) {
		CPassword = cPassword;
	}
	
	public String add() {
		return "loginhome";
	}
	
	public String gotologin() {
		return "loginhome";
	}
	
	public String gotohome() {
		return "login";
	}
	
	public void validateCPassword(FacesContext fc, UIComponent c, Object value)throws
	ValidatorException
	{
	String cPassword= (String)value;
	Acclogin rf=new Acclogin();
	System.out.println(getPassword());
	if (cPassword.compareTo(getPassword())!=0 ) {
	FacesMessage message = new FacesMessage();
	message.setSummary("Password does not match");
	throw new ValidatorException(message);
	}
	}
	
	
}
