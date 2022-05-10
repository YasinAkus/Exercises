package com.company;

public class Employee {

    public double salary;
    public String name;
    public int workHours;
    public int hireYear;


    public Employee(double salary, String name, int workHours, int hireYear) {
        this.salary = salary;
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary>=1000){
        return salary*0.03;
    }
        return 0.0;
    }

    public double bonus(){
        return 30*(this.workHours-40);
    }

    public double increase(){
        int year= 2022 - this.hireYear;
        if(year<10){
            return salary*0.05;
        }else if(year>=10 && year<20){
            return salary*0.10;
        }else{
            return salary*0.15;
        }
    }
}
