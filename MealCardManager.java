// MealCardManager.java
import java.util.ArrayList;
import java.util.List;

public class MealCardManager {
    private List<MealCard> mealCards;

    public MealCardManager() {
        this.mealCards = new ArrayList<>();
    }

    public void addMealCard(MealCard mealCard) {
        // Add validation if needed
        mealCards.add(mealCard);
    }

    public List<MealCard> getAllMealCards() {
        // Return a copy of the list to prevent direct modification
        return new ArrayList<>(mealCards);
    }

    public void deleteMealCard(String id) {
        // Add deletion logic based on ID
        MealCard mealCardToDelete = null;
        for (MealCard card : mealCards) {
            if (card.getId().equals(id)) {
                mealCardToDelete = card;
                break;
            }
        }

        if (mealCardToDelete != null) {
            mealCards.remove(mealCardToDelete);
        }
    }

    
}
