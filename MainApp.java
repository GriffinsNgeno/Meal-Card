import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        MealCardManager mealCardManager = new MealCardManager();
        ConsoleUI consoleUI = new ConsoleUI(mealCardManager);
        consoleUI.start();
    }
}

class ConsoleUI {
    private MealCardManager mealCardManager;
    private Scanner scanner;

    public ConsoleUI(MealCardManager mealCardManager) {
        this.mealCardManager = mealCardManager;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("Meal Card Management System");
            System.out.println("1. Add Meal Card");
            System.out.println("2. View All Meal Cards");
            System.out.println("3. Delete Meal Card");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addMealCard();
                    break;
                case 2:
                    viewAllMealCards();
                    break;
                case 3:
                    deleteMealCard();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addMealCard() {
        System.out.print("Enter the name of the meal card: ");
        String name = scanner.nextLine();

        System.out.print("Enter the description of the meal card: ");
        String description = scanner.nextLine();

        MealCard mealCard = new MealCard(name, description);
        mealCardManager.addMealCard(mealCard);

        System.out.println("Meal card added successfully!");
    }

    private void viewAllMealCards() {
        List<MealCard> allMealCards = mealCardManager.getAllMealCards();

        if (allMealCards.isEmpty()) {
            System.out.println("No meal cards available.");
        } else {
            System.out.println("All Meal Cards:");
            for (MealCard card : allMealCards) {
                System.out.println(card);
            }
        }
    }

    private void deleteMealCard() {
        System.out.print("Enter the ID of the meal card to delete: ");
        String mealCardId = scanner.nextLine();

        mealCardManager.deleteMealCard(mealCardId);

        System.out.println("Meal card deleted successfully!");
    }
}
