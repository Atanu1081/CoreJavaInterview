package comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

    public static void main(String[] args) {
        List employeeList = new ArrayList<>();
        Employee e1 = new Employee(1, "Prathistha");
        Employee e2 = new Employee(2, "Atanu");
        Employee e3 = new Employee(1, "Aaron");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.println(employeeList);
        Comparator<Employee> nameComparator = (e11, e21) -> e11.getName().compareTo(e21.getName());
        Comparator<Employee> idComparator = (e11, e21) -> e11.getId() - e21.getId();
        Comparator<Employee> idAndNameComparator = (s1, s2) -> {
            if (s1.getId() == s2.getId()) {
                return s1.getName().compareTo(s2.getName());
            }
            if (s1.getId() > s2.getId()) return 1;
            else return -1;
        };
        //Collections.sort(employeeList, idComparator);
        //Collections.sort(employeeList, nameComparator);
        Collections.sort(employeeList, idAndNameComparator);
        System.out.println(employeeList);

        
    }
}
