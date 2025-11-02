package applcation;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        System.out.println("Hello and welcome!");

        System.out.print("Enter a number of products: ");
        int nProducts = input.nextInt();
       for(int i = 1; i <= nProducts; i++) {
            System.out.println("Enter product # " + i + " data: ");
            System.out.println("Common, Used, Imported: (C/U/I)");
            char type = input.next().charAt(0);

            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Price: ");
            double price = input.nextDouble();
            input.nextLine();
            if(type == 'c'){
                products.add(new Product(name, price));
            }
            else if(type == 'u'){
                products.add(new UsedProduct(name, price));
            }
            else if(type == 'i'){
                System.out.print("Customs fee: ");
                double fee = input.nextDouble();
                input.nextLine();
                products.add(new ImportedProduct(name, price, fee));
            }
        }
        for(Product p : products) {
            System.out.println(p.priceTag());
        }

        input.close();
    }
}