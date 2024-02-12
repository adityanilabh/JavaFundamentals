package OOPs.ClassAndObject.classRelationShip.Association.CodeExample;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        Bank bank= new Bank("ICICI");
        Employee emp= new Employee("Ridhi");
        @SuppressWarnings({ "rawtypes", "unchecked" })
        Set<Employee> employees= new HashSet();
        employees.add(emp);
        bank.setEmployees(employees);
        System.out.println(emp.getEmployeeName()
                           + " belongs to bank "
                           + bank.getBankName());
    }
}
