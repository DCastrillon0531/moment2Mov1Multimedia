package main.multimedia;

import java.util.Scanner;

public class Music {

    Scanner sc = new Scanner(System.in);

    private int idSong;
    private String nameSong;
    private String composer;
    private String gender;

    public Music() {
    }

    public Music(int idSong, String nameSong, String composer, String gender) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.composer = composer;
        this.gender = gender;
    }

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void createSong(){
        System.out.println("Ingrese el ID de la cancion: ");
        idSong = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre de la cancion: ");
        nameSong = sc.nextLine();
        System.out.println("Ingrese el genero de la cancion: ");
        gender = sc.nextLine();

    }

    public void selectSong(){
        System.out.println("El ID de la cancion es: " + idSong);
        System.out.println("El nombre de la cancion es: " + nameSong);
        System.out.println("El genero de la cancion es: " + gender);
    }
}
