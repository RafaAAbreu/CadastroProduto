package com.rafael.product_backend.model;

public class Category {
    
    // Atributos da categoria
    private int id;
    private String name;

    //Método construtor
    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Construtor vazio
    public Category() {
    }

    // Métodos getters e setters
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


}
