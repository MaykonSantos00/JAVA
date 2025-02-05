package ExerciciosPOO.Exercise15.domain;

public abstract class Movement {
    private double value;
    private Category category;
    private String description;

    public Movement(double value, Category category, String description) {
        this.value = value;
        this.category = category;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movement{" +
                "value=" + value +
                ", category=" + category +
                ", description='" + description + '\'' +
                '}';
    }

    public double getValue() {
        return value;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
