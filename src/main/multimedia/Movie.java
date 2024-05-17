package main.multimedia;

import java.util.Scanner;

public class Movie {

    Scanner sc = new Scanner(System.in);

    private int idMovie;
    private String nameMovie;
    private String gender;

    public Movie(){}

    public Movie(int idMovie, String nameMovie, String gender) {
        this.idMovie = idMovie;
        this.nameMovie = nameMovie;
        this.gender = gender;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void createMovie(){
        System.out.println("Ingrese el ID de la pelicula: ");
        idMovie = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre de la pelicula: ");
        nameMovie = sc.nextLine();
        System.out.println("Ingrese el genero de la pelicula: ");
        gender = sc.nextLine();
    }

    public void selectMovie(){
        System.out.println("El ID de la pelicula es: " + idMovie);
        System.out.println("El nombre de la pelicula es: " + nameMovie);
        System.out.println("El genero de la pelicula es: " + gender);
    }
}
