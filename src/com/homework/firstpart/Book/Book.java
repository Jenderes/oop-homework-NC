package com.homework.firstpart.Book;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private int price;
    private int qty = 0;

    public Book(String name, Author[] authors, int price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, int price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorNames(){
        String authorListString = "";
        for (Author author: authors){
           authorListString += author.getName()+", ";
        }
        return authorListString.substring(0, authorListString.length()-2);
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
