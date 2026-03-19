package com.rafael.product_backend.model;

public class Product {
    
    // Atributos do produto
    private int id;
    private String name;
    private double price;

    // Métodos getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    //  this.atributo = parametro; 
    // para diferenciar o atributo do parâmetro, usamos o this. para referenciar o atributo da classe.

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

}
