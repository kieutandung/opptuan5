package Product;

import java.sql.Array;

public class Store {
    private java.util.List<Product>productList;
    public Store(){
        this.productList = new java.util.ArrayList<>();
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void remoteProduct(String productName){
        productList.removeIf(product -> product.getName().equals(productName));

    }
    public double findPriceByName(String productName){
        for (Product product : productList){
            if (product.getName().equals(productName)){
                return product.getPrice();
            }
        }
        return -1;
    }
    public void sortProductByPrice(boolean ascending){
        if (ascending ){
            productList.sort(java.util.Comparator.comparing(Product::getPrice));
        }else {
            productList.sort(java.util.Comparator.comparing(Product::getPrice).reversed());

        }
    }
    public double claculateTotalValue(){
        double totalValue = 0;
        for (Product product : productList){
            totalValue += product.getPrice() * product.getQuantity();

        }
        return totalValue;
    }
}
