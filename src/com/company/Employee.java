package com.company;


public class Employee {
    private String Name;
    private int Year;
    private String Address;

    public Employee(String name, int year, String address) {
        Name = name;
        Year = year;
        Address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Year=" + Year +
                ", Address='" + Address + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreat");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);


    }
}
