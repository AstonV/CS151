package com.example;

public final class Product{
    final String productName;
    final String productDescription;
    final double productPrice;
    final int maxQuantity;

    public Product(String productName, String productDescription, double productPrice, int maxQuantity){
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.maxQuantity = maxQuantity;
    }

    public String getproductName(){
        return productName;
    }

    public String getproductDescription(){
        return productDescription;
    }

    public double getproductPrice(){
        return productPrice;
    }

    public int getmaxQuantity(){
        return maxQuantity;
    }

    @Override
    public String toString() {
        return "productName=" + productName + ", productDescription=" + productDescription + ", productPrice="+ productPrice + ", maxQuantity=" + maxQuantity;
    }


}