package main.users;

public class User {
    private int idUser;
    private String nameUser;
    private int cellphone;
    private String email;

    public User() {
    }

    public User(int idUser, String nameUser, int cellphone, String email) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.cellphone = cellphone;
        this.email = email;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
