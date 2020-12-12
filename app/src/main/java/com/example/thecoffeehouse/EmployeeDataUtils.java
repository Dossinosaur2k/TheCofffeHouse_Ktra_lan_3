package com.example.thecoffeehouse;

public class EmployeeDataUtils {

    public static Employee[] getEmployees() {
        Employee emp1 = new Employee("Đà Nẵng");
        Employee emp2 = new Employee("Thành Phố Hồ Chí Minh");
        Employee emp3 = new Employee("Hà Nội");
        Employee emp4 = new Employee("Quảng Ninh");
        Employee emp5 = new Employee("Khánh Hòa");
        return new Employee[]{emp1, emp2, emp3,emp4,emp5};
    }
}

