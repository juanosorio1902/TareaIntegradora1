package model;

public class Product {
	
	private String code;
	private String name;
	private String description;
	private String cost;
	private String restnit;
	
	
	public Product(String code, String name, String description, String cost, String restnit) {
		this.code = code;
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.restnit = restnit;
		
	}
	
	
	
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getCost() {
		return cost;
	}
	public String getRestnit() {
		return restnit;
	}
	
	

}

