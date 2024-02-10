package application;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


import entities.ImportedProducts;
import entities.Product;
import entities.UsedProducts;


public class Program {
	
	public static void main (String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int quantityProducts = scanner.nextInt();
		
		
		List<Product> productsList = new ArrayList<>();
		
		for (int i = 0; i < quantityProducts; i++) {
			scanner.nextLine();
			System.out.println("Product #" + (i+1) + " Data:");
						
			System.out.print("Common, Used or Imported (c/u/i) ?");
			String productType = scanner.nextLine().toLowerCase();
			
			System.out.print("Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Price: ");
			Double price = scanner.nextDouble();
			
			
			if (productType.charAt(0) == 'i') {
				
				System.out.print("Customs fee: ");
				Double customsFee = scanner.nextDouble();
				ImportedProducts imported = new ImportedProducts(name, price, customsFee);
				productsList.add(imported);
				
			} else if (productType.charAt(0) == 'u') {
				
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(scanner.next());
				UsedProducts used = new UsedProducts(name, price, manufactureDate);
				productsList.add(used);
				
			}
			else {
				
				Product product = new Product(name, price);
				productsList.add(product);
				
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product list: productsList) {
			System.out.println(list.priceTag());
		}
		
		scanner.close();
		
	}

}
