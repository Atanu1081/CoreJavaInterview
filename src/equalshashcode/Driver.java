package equalshashcode;

public class Driver {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Prathistha");
        Employee e2 = new Employee(1, "Atanu");

        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
