import auth.User;
import inventory.Backpack;
import model.Player;
import model.Elf;
import model.Warrior;
import enemy.Beast;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<User> users = new ArrayList<>();
    private Scanner scanner;
    private User currentUser;
    private Backpack backpack;

    public Game(Scanner scanner) {
        this.scanner = scanner;
        this.backpack = new Backpack();
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> login();
                case 2 -> signUp();
                case 3 -> {
                    System.out.println("Thanks for playing. Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }

    private void signUp() {
        System.out.print("Enter a username: ");
        String username = scanner.next();
        System.out.print("Enter a password: ");
        String password = scanner.next();

        System.out.println("Choose your role:");
        System.out.println("1. Elf");
        System.out.println("2. Warrior");
        System.out.print("Your choice: ");
        int role = scanner.nextInt();

        Player player = null;
        if (role == 1) player = new Elf(username);
        else if (role == 2) player = new Warrior(username);
        else {
            System.out.println("Invalid role choice.");
            return;
        }

        User user = new User(username, password, player);
        users.add(user);
        System.out.println("Sign up successful! You can now log in.");
    }

    private void login() {
        System.out.print("Username: ");
        String username = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Login successful. Welcome, " + username + "!");
                gameLoop();
                return;
            }
        }
        System.out.println("Login failed. Please check your credentials.");
    }

    private void gameLoop() {
        Player player = currentUser.getCharacter();

        while (true) {
            System.out.println("\n--- Game Menu ---");
            System.out.println("1. Explore Forest");
            System.out.println("2. View Status");
            System.out.println("3. Open Backpack");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> explore(player);
                case 2 -> player.showStatus();
                case 3 -> backpack.showItems();
                case 4 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void explore(Player player) {
        Beast beast = new Beast("Dark Wolf", 30, 8);
        System.out.println("You encountered a " + beast.getName() + "!");

        while (beast.getHealth() > 0 && player.getHealth() > 0) {
            System.out.println("1. Attack");
            System.out.println("2. Run");
            System.out.print("Your choice: ");
            int fightChoice = scanner.nextInt();

            if (fightChoice == 1) {
                double damageDealt = player.attack();
                beast.setHealth(beast.getHealth() - damageDealt);
                System.out.println("You hit the beast for " + damageDealt + " damage. Beast HP: " + beast.getHealth());

                if (beast.getHealth() > 0) {
                    player.setHealth(player.getHealth() - beast.getAttackPower());
                    System.out.println("Beast attacks! Your HP: " + player.getHealth());
                }
            } else if (fightChoice == 2) {
                System.out.println("You ran away!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        if (beast.getHealth() <= 0) {
            System.out.println("You defeated the beast! You obtained an Herb.");
            backpack.addItem("Herb");
            player.levelUp();
        }

        if (player.getHealth() <= 0) {
            System.out.println("You have been defeated! Game over.");
            System.exit(0);
        }
    }
}
