package main.multimedia;

public class Music {

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

    }

    public void selectSong(){

    }
}
