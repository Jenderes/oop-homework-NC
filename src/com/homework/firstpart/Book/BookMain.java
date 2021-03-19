package com.homework.firstpart.Book;

public class BookMain {
    public static void main(String[] args) {
        System.out.println("======== Class Book ========");
        Author author = new Author("kurt Vonnegut","vonnegut@gmail.com",'M');
        System.out.println(author.toString());

        System.out.println("======== Class Book ========");
        Book book = new Book("harry potter and the philosopher's stone",
                new Author[]{
                        new Author("J. K. Rowling", "rowling@gmail.com",'F'),
                        new Author("Robert Galbraith")
                },500,2);
        book.setPrice(1000);
        book.setQty(10);
        System.out.println(book.getName()+ ", Price = " + book.getPrice() + ", Qty = "+ book.getQty()+ ", Authors = " + book.getAuthorNames());

    }
}
