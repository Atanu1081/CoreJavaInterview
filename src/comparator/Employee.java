package comparator;

public class Employee implements Comparable<Employee>{
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

    @Override
    public int compareTo(Employee o) {
        return -(id - o.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
