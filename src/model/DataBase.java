package model;

import java.util.ArrayList;

public class DataBase {
	
	private ArrayList<Restaurant> restaurants;
	private ArrayList<Client> clients;
	private ArrayList<Product> products;
	private ArrayList<Order> orders;
	
	public DataBase() {
		restaurants = new ArrayList<Restaurant>();
		clients = new ArrayList<Client>();
		products = new ArrayList<Product>();
		orders = new ArrayList<Order>();
		
	}
	
	
	
	
	
	
	
	public boolean searchRestaurant(String nit){
		boolean restFound = false;
		for(int i=0; (i<restaurants.size())&&(!restFound); i++){
			if(restaurants.get(i)!=null){
				if(restaurants.get(i).getNit().equals(nit)){
					restFound = true;
				}
			}
		}	
		return restFound;
	}
	public String addRestaurant(String name, String nit, String admin) {
		String message;
		boolean found = searchRestaurant(nit);
		if(!found) {
			Restaurant newRestaurant = new Restaurant(name,nit,admin);
			restaurants.add(newRestaurant);
			message="The restaurant has been added";
				
		}
		else {
			message="The restaurant was not added, this nit already exist";
		}
		return message;	
		
	}
	public boolean searchClient(String id){
		boolean clientFound = false;
		for(int i=0; (i<clients.size())&&(!clientFound); i++){
			if(clients.get(i)!=null){
				if(clients.get(i).getId().equals(id)){
					clientFound = true;
				}
			}
		}	
		return clientFound;
	}
	public String addClient(String idtype, String id, String name, String telephone, String address) {
		String message;
		boolean found = searchClient(id);
		if(!found) {
			Client newClient = new Client(idtype, id, name, telephone, address);
			clients.add(newClient);
			message="The client has been added";
				
		}
		else {
			message="The client can not been added, this id already exist";
		}
		return message;	
		
	}
	public boolean searchRestaurant2(String restnit){
		boolean restFound = false;
		for(int i=0; (i<restaurants.size())&&(!restFound); i++){
			if(restaurants.get(i)!=null){
				if(restaurants.get(i).getNit().equals(restnit)){
					restFound = true;
				}
			}
		}	
		return restFound;
	}
	public boolean searchProduct(String code){
		boolean productFound = false;
		for(int i=0; (i<products.size())&&(!productFound); i++){
			if(products.get(i)!=null){
				if(products.get(i).getCode().equals(code)){
					productFound = true;
				}
			}
		}	
		return productFound;
	}
	public String addProduct(String code, String name, String description, String cost, String restnit) {
		String message;
		boolean found = searchProduct(code);
		boolean exist = searchRestaurant2(restnit);
		if(!found && exist) {
			Product newProduct = new Product(code, name, description, cost, restnit);
			products.add(newProduct);
			message="The product has been added";
				
		}
		else {
			message="The product can not been added, this product already exist or the restaurant's nit doesn't exist";
		}
		return message;	
		
	}
	
	
	

}
