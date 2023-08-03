package com.workintech.abstraction.main;

import com.workintech.abstraction.product.Bread;
import com.workintech.abstraction.product.Chocolate;
import com.workintech.abstraction.product.Coke;
import com.workintech.abstraction.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products= new ProductForSale[5];
        products[0]= new Chocolate("Sweets", 15, "çok sevilen",
                "brown", true);
        products[1]= new Bread("Bakery", 12, "taze ekmek","einkorn",
                "brown");
        products[2]= new Coke("Drinks", 14, "soguk iç ", true);
        listProducts(products);
        listProducts(null);
    }

    public static void listProducts(ProductForSale[] products) {
        if(products != null) {
            for(ProductForSale product: products){
                if(product != null) {
                    product.showDetails();
                }
            }
        }
    }
}