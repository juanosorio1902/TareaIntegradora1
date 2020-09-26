package model;

public class Client {
	
	private String idtype;
	private String id;
	private String name;
	private String telephone;
	private String address;
	
	
	public Client(String idtype, String id, String name, String telephone, String address) {
		this.idtype = idtype;
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.address = address;
		
	}
		
	
	public String getIdtype() {
		return idtype;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTelephone() {
		return telephone;
	}
	public String getAddress() {
		return address;
	}
	
	
	

}
