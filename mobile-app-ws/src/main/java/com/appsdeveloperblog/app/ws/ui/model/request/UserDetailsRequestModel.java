package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.NotNull;

public class UserDetailsRequestModel {
    @NotNull(message="First Name cannot be null")
	private String firstName;
    @NotNull(message="First Name cannot be null")
	private String lastName;
    @NotNull(message="First Name cannot be null")
	private String email;
    @NotNull(message="First Name cannot be null")
	private String password;
    
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
