package equalshashcode;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()) return false;
        if (o == this) return true;
        Employee e = (Employee) o;
        return id == e.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
