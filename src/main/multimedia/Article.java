package main.multimedia;

import java.util.Scanner;

public class Article {

    Scanner sc = new Scanner(System.in);

    private int idArticle;
    private String nameArticle;
    private String author;

    public Article(){}

    public Article(int idArticle, String nameArticle, String author) {
        this.idArticle = idArticle;
        this.nameArticle = nameArticle;
        this.author = author;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void createArticle(){
        System.out.println("Ingrese el id del articulo: ");
        idArticle = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del articulo: ");
        nameArticle = sc.nextLine();
        System.out.println("Ingrese el autor del articulo: ");
        author = sc.nextLine();
    }

    public void selectArticle(){
        System.out.println("El ID del articulo es: " + idArticle);
        System.out.println("El nombre del articulo es: " + nameArticle);
        System.out.println("El autor del articulo es: " + author);
    }
}
