package level1.application;

import level1.exceptions.EmptySaleException;
import level1.model.Product;
import level1.model.Sale;

import java.util.ArrayList;
import java.util.List;

public class ProgramRunner {
    public static void run(){

        Sale emptySale = new Sale();
        try {
            emptySale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }


        Sale saleWithProducts = new Sale();
        List<Product> products = List.of(
                new Product("Shirt", 25.99),
                new Product("Pants", 35.50)
        );
        for (Product product : products) {
            saleWithProducts.addProduct(product);
        }

        try {
            saleWithProducts.calculateTotal();
            System.out.println("Sale total: " + saleWithProducts.getTotalPrice() + ",  Here its your recipt for the purchase : " + saleWithProducts.toString());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        try {
            List<String> list = new ArrayList<>();
            String element = list.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

