package ExerciciosPOO.Exercise17.domain;

public abstract class Employee implements TypeOfPayment {
    private String name;
    private TypeOfEmployee typeOfEmployee;

    public Employee(String name, TypeOfEmployee typeOfEmployee) {
        this.name = name;
        this.typeOfEmployee = typeOfEmployee;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", typeOfEmployee=" + typeOfEmployee
                ;
    }

    public String getName() {
        return name;
    }

    public TypeOfEmployee getTypeOfEmployee() {
        return typeOfEmployee;
    }
}
