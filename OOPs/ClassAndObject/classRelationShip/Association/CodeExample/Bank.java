package OOPs.ClassAndObject.classRelationShip.Association.CodeExample;

import java.util.Set;

public class Bank{
     private String name;
     private Set<Employee>employees;
     Bank(String name)
     {
        this.name=name;
     }
     public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
 
    public void setEmployees(Set<Employee> employees)
    {
        this.employees = employees;
    }
    public Set<Employee>
    getEmployees(Set<Employee> employees)
    {
        return this.employees;
    }
     
}