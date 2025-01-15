package ExerciciosPOO.Exercise8;

public class Test {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("MK",1526,60,25,TypeEmployee.WORKHOUR);
        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("Cr7",3000, 500,TypeEmployee.COMMISSIONED);

        System.out.println(hourlyEmployee);
        System.out.println("-------------------");
        System.out.println(commissionedEmployee);


    }
}
