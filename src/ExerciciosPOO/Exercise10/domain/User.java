package ExerciciosPOO.Exercise10.domain;

public abstract class User{
    private int id;
    private String name;
    private TypeUser type;

    public User(int id, String name, TypeUser type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TypeUser getType() {
        return type;
    }
}
