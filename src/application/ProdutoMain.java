package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProdutoMain {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto product = new Produto();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println();
		System.out.println("Product data: " + product); //implicitamente retorna toString
		
		System.out.println();
		System.out.println("Enter the number of products to be add in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
				
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be add removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
