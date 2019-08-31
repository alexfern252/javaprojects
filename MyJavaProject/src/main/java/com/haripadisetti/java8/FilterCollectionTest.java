package com.haripadisetti.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{
	
	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}



public class FilterCollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"Abc",100));
		list.add(new Product(2,"Abc2",200));
		list.add(new Product(3,"Abc3",300));
		list.add(new Product(4,"Abc4",400));
		list.add(new Product(5,"Abc5",500));
		
        // using lambda to filter data  
		 Stream<Product> filteredProdData = list.stream().filter(product -> product.getPrice() >300);
          
        // using lambda to iterate through collection 
		 filteredProdData.forEach(product -> System.out.println(product.getName() + ":"+ product.getPrice()));
		 
    
	}

}
