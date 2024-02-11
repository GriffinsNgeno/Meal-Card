// MealCard.java
public class MealCard {
    private static int nextId = 1;

    private String id;
    private String name;
    private String description;

    public MealCard(String name, String description) {
        this.id = generateId();
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Other getters and setters if needed

    @Override
    public String toString() {
        return "MealCard{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    private String generateId() {
        return "MC" + nextId++;
    }
}
