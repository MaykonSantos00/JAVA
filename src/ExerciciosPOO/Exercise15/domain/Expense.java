package ExerciciosPOO.Exercise15.domain;

public class Expense extends Movement {
    public Expense(double value, Category category, String description) {
        super(value, category, description);
    }

    @Override
    public String toString() {
        return "Expense{" +
                "value=" + super.getValue() +
                "Category =" + super.getCategory() +
                "Description" + super.getDescription() +
                "}";
    }
}
