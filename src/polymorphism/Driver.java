package polymorphism;

public class Driver {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();

        Child child = new Child();
        child.m1();

        Parent p1 = new Child();
        p1.m1();

    }
}
