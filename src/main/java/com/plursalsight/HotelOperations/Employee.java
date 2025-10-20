package com.plursalsight.HotelOperations;

public class Employee {
    private  int employeeId;
    private String name;
    private  String department;
    private  double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, double payRate, String department, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.payRate = payRate;
        this.department = department;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getTotalPay(){
        return 0;
    }
    public  double getRegularHours(){
        return 0;
    }
    public  double getOvertimeHours(){
        return 0;
    }
}
