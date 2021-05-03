package Entities;

public class Game{
    public int gameId;
    public int categoryId;
    public String gameName;
    public double price;

    public Game(int gameId, int categoryId, String gameName, double price) {
        this.gameId = gameId;
        this.categoryId = categoryId;
        this.gameName = gameName;
        this.price = price;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}

