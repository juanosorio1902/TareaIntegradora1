package ui;
import java.util.Scanner;

import model.DataBase;

public class Menu {
	private  Scanner lector;
	private DataBase mainBase;
	private final static int EXIT_OPTION = 0;
	
	public Menu() {
		lector = new Scanner(System.in);
		mainBase = new DataBase();
	}
	
	public void startMenu() {
		String menu = showMenu();
		int option;
		do {
			System.out.print(menu);
			option = readOption();
			executeOperation(option);
		}while(option!=EXIT_OPTION);
				
	}
	
	private String showMenu() {
		String menu; 
		menu = "________________________\n";
		menu += "Welcome to the menu\n";
		menu += "________________________\n";
		menu += "1. Add restaurant\n";
		menu += "2. Add client\n";
		menu += "3. Add\n";
				
		return menu;		
	
	}
	
	private int readOption() {
		int op;
		op = Integer.parseInt(lector.nextLine());
		return op;
	}

	
	private void executeOperation(int option) {
		switch(option) {
		case 1:
			addRestaurant();		
		break;
		case 2:
			addClient();
		break;
		case 3:
			addProduct();
						
		break;
		case 4:
		
		break;
		case 5:
			
		break;
		
		
		}
		
		
		
	}
	
	private void addRestaurant() {
		System.out.println("Enter the name");
		String name = lector.nextLine();
		System.out.println("Enter the nit");
		String nit = lector.nextLine();
		System.out.println("Enter the admin's name");
		String admin = lector.nextLine();
		String message = mainBase.addRestaurant(name, nit, admin);
		System.out.println(message);
		
	}
	private void addClient() {
		System.out.println("Enter the id's type");
		String idtype = lector.nextLine();
		System.out.println("Enter the id");
		String id = lector.nextLine();
		System.out.println("Enter the client's name");
		String name = lector.nextLine();
		System.out.println("Enter the client's telephone number");
		String telephone = lector.nextLine();
		System.out.println("Enter the client's address");
		String address = lector.nextLine();
		String message = mainBase.addClient(idtype, id, name, telephone, address);
		System.out.println(message);
		
	}
	private void addProduct() {
		System.out.println("Enter the code of the product");
		String code = lector.nextLine();
		System.out.println("Enter the name");
		String name = lector.nextLine();
		System.out.println("Enter a description");
		String description = lector.nextLine();
		System.out.println("Enter the cost");
		String cost = lector.nextLine();
		System.out.println("Enter the nit of the restaurant");
		String restnit = lector.nextLine();
		String message = mainBase.addProduct(code, name, description, cost, restnit);
		System.out.println(message);
		
		
	}

	
	
	
	

}
