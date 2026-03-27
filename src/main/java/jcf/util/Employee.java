package jcf.util;

//Immutable

public class Employee {

    public String name;
    public String id;
    public double salary;

    public Employee(String name, String id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Salary: %,.2f", id, name, salary);
    }

    public String getName(){
        return this.name;  //return name; is also right as there is no chance of any ambiguity.
    }

    public String getId(){
        return this.id;
    }

    public double getSalary(){
        return  this.salary;
    }
}
