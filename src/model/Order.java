package model;
import java.util.*;

public class Order {

		private String code;		
		private Date date;
		private String clientCode;
		private String restnit;
		private ArrayList<String> products;
		private ArrayList<Integer> quantitys;
		
		
		
		
		
		public String getCode() {
			return code;
		}
		public Date getDate() {
			return date;
		}
		public String getClientCode() {
			return clientCode;
		}
		public String getRestnit() {
			return restnit;
		}
		public ArrayList<String> getProducts() {
			return products;
		}
		public ArrayList<Integer> getQuantitys() {
			return quantitys;
		}
		
		
}
