package ExerciciosPOO.Exercise15.domain;

public class Revenue extends Movement {
    public Revenue(double value, Category category, String description) {
        super(value, category, description);
    }

    @Override
    public String toString() {
        return "Revenue{" +
                "value=" + super.getValue() +
                "Category =" + super.getCategory() +
                "Description" + super.getDescription() +
                "}";
    }
}
