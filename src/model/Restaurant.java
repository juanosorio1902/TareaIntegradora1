package model;

public class Restaurant {
	
	private String name;
	private String nit;
	private String admin;
	
	
	public Restaurant(String name, String nit, String admin) {
		this.name = name;
		this.nit = nit;
		this.admin = admin;
		
	}
		
	
	public String getName() {
		return name;
	}
	public String getNit() {
		return nit;
	}
	public String getAdmin() {
		return admin;
	}
	

}

