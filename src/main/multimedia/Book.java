package main.multimedia;

import java.util.Scanner;

public class Book {

    Scanner sc = new Scanner(System.in);

    private int iDBook;
    private String categoryBook;
    private String nameBook;
    private String authorBook;
    private String edithorial;
    private String sipnosis;

    public Book(){}

    public Book(int iDBook, String categoryBook, String nameBook, String authorBook, String edithorial, String sipnosis) {
        this.iDBook = iDBook;
        this.categoryBook = categoryBook;
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.edithorial = edithorial;
        this.sipnosis = sipnosis;
    }

    public int getiDBook() {
        return iDBook;
    }

    public void setiDBook(int iDBook) {
        this.iDBook = iDBook;
    }

    public String getCategoryBook() {
        return categoryBook;
    }

    public void setCategoryBook(String categoryBook) {
        this.categoryBook = categoryBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getEdithorial() {
        return edithorial;
    }

    public void setEdithorial(String edithorial) {
        this.edithorial = edithorial;
    }

    public String getSipnosis(){
        return sipnosis;
    }

    public void setSipnosis(String sipnosis){
        this.sipnosis = sipnosis;
    }

    public void createBook(){
        System.out.println("Ingrese el ID del libro: ");
        iDBook = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la categoria del libro: ");
        categoryBook = sc.nextLine();
        System.out.println("Ingrese el nombre del libro: ");
        nameBook = sc.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        authorBook = sc.nextLine();
        System.out.println("Ingrese la editorial del libro: ");
        edithorial = sc.nextLine();
        System.out.println("Ingrese la sipsnosis del libro: ");
        sipnosis = sc.nextLine();
    }

    public void selectBook(){
        System.out.println("El ID del libro es: " + iDBook);
        System.out.println("La categoria del libro es: " + categoryBook);
        System.out.println("El nombre del libro es: " + nameBook);
        System.out.println("El autor del libro es: " + authorBook);
        System.out.println("La editorial del libro es: " + edithorial);
        System.out.println("Sipnosis: " + sipnosis);
    }
}
