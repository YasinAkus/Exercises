package com.company;

public class EmpDriver {

    public static void main(String[] args) {

        Employee employee1 = new Employee(2000,"Kemal",45,1985);

        System.out.println("Name: "+employee1.name);
        System.out.println("Salary: "+employee1.salary);
        System.out.println("Work Hours: "+employee1.workHours);
        System.out.println("Hire Date: "+employee1.hireYear);

        System.out.println("Tax: "+employee1.tax());
        System.out.println("Bonus: "+employee1.bonus());
        System.out.println("Raise of Salary: "+employee1.increase());
        System.out.println("Salary with tax and bonus: "+(employee1.salary+employee1.bonus()-employee1.tax()));
        System.out.println("Total Salary with raise of Salary: "+(employee1.salary+employee1.increase()));

    }
}
