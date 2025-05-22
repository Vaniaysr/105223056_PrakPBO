package auth;

import model.Player;

public class User {
    private String username;
    private String password;
    private Player character;

    public User(String username, String password, Player character) {
        this.username = username;
        this.password = password;
        this.character = character;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Player getCharacter() {
        return character;
    }
}
