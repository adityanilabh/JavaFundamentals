package OOPs.ClassAndObject.MethodsOfCreatingObject;

import java.io.Serializable;
import java.lang.reflect.Constructor;

// using all except one type to declare person
class Person implements Cloneable,Serializable{
    private String name;
    public Person(String string) {
        //TODO Auto-generated constructor stub
        this.name= string;
    }

    // using setter method.
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName() {
        return name;
    }

    // Clone method for object cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static Person createPerson() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPerson'");
    }
}
// using factory class
class PersonFactory{
    public static Person createPerson(){
          return new Person("Satyam Aditya");
    } 
}
public class CodeOne {
    public static void main(String[] args) throws Exception
    {
        // usign new method
        Person p1= new Person("Nilabh Aditya");

        // usign clone method
        @SuppressWarnings("unused")
        Person p2= (Person)p1.clone();

        // using reflection
        /*  this method is used heavily,reating objects through reflection in 
        Java allows for dynamic instantiation of classes at runtime. This means 
        that you can create objects without knowing their class names until runtime
        Frameworks like Spring heavily rely on reflection to create and manage 
        objects based on configuration files or annotations. This allows for 
        loose coupling and easier management of dependencies.
        */
        @SuppressWarnings("rawtypes")
        Class classClone= Person.class;
        @SuppressWarnings({ "rawtypes", "unchecked" })
        Constructor classCloneConstructor= classClone.getDeclaredConstructor(String.class);
        classCloneConstructor.setAccessible(true);
        @SuppressWarnings("unused")
        Person person3= (Person) classCloneConstructor.newInstance("Bob");

        // Using factory method
        @SuppressWarnings("unused")
        Person person4= PersonFactory.createPerson();

        //using static factory method
        @SuppressWarnings("unused")
        Person person6= Person.createPerson();

        
    }
}
