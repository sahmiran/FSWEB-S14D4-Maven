package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products=new ProductForSale[5];
        products[0]=new Chocolate("sweet",15,"mnasödm kads");
        products[1]=new Bread("Bakery",5,"sad dsakl","einkorn","brown");
        products[2]=new Coke("Drinks",15,"asdm sda",true,2.5);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            if(product!=null){
                product.showDetails();
            }

        }
    }
}