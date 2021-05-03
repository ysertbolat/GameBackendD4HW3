package Entities;

public class Gamer extends User {
    public int gamerId;
    public String email;
    public Gamer(int gamerId, String tckn, String firstName, String lastName, String dateOfBirth ,String email) {
        super(tckn, firstName, lastName, dateOfBirth);
        this.gamerId = gamerId;
        this.email = email;
    }

    public Gamer(String tckn, String firstName, String lastName, String dateOfBirth) {
        super(tckn, firstName, lastName, dateOfBirth);
    }

    public int getGamerId() {
        return gamerId;
    }

    public void setGamerId(int gamerId) {
        this.gamerId = gamerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}