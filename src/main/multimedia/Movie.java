package main.multimedia;

public class Movie {

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

    }

    public void selectMovie(){

    }
}
