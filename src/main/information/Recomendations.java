package main.information;

import main.multimedia.Article;
import main.multimedia.Book;
import main.multimedia.Movie;
import main.multimedia.Music;
import main.users.User;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

public class Recomendations {

    Scanner sc = new Scanner(System.in);
    LinkedHashSet<Objects> comentarys = new LinkedHashSet<>();

    private int iDRecomendation;
    Book book;
    Article article;
    Movie movie;
    Music music;
    User user;
    private int likes;
    private ArrayList<LinkedHashSet<Objects>> comentary;

    public Recomendations() {
    }

    public Recomendations(int iDRecomendation, Book book, Article article, Movie movie, Music music, User user, int likes, ArrayList<String> comentary) {
        this.iDRecomendation = iDRecomendation;
        this.book = book;
        this.article = article;
        this.movie = movie;
        this.music = music;
        this.user = user;
        this.likes = 0;
        this.comentary = new ArrayList<LinkedHashSet<Objects>>();
    }

    public int getiDRecomendation() {
        return iDRecomendation;
    }

    public void setiDRecomendation(int iDRecomendation) {
        this.iDRecomendation = iDRecomendation;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getLikes() {
        return likes;
    }

    public void addLikes(){
        likes++;
    }

    public ArrayList<LinkedHashSet<Objects>> getComentary() {
        return comentary;
    }

    public void addComentary(){
        comentary.add(comentarys);
    }

    public void registerComentary(){
        
    }
}
