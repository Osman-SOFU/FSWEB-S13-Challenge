package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.run();
    }

    public void run() {
        // Healthplan nesneleri oluşturuluyor
        Healthplan basicPlan = new Healthplan(1, "Basic Plan", Plan.BASIC);
        Healthplan premiumPlan = new Healthplan(2, "Premium Plan", Plan.PREMIUM);

        // Healthplan dizisi oluşturuluyor
        String[] employeeHealthPlans = new String[2];

        // Employee nesnesi oluşturuluyor
        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", employeeHealthPlans);
        employee.addHealthPlan(0, "Basic Plan");
        employee.addHealthPlan(1, "Premium Plan");

        // Company nesnesi oluşturuluyor
        String[] developers = new String[3];
        Company company = new Company(1, "Tech Corp", 50000, developers);
        company.addEmployee(0, "Alice");
        company.addEmployee(1, "Bob");

        // toString metodlarını çağırıp sonuçları yazdırma
        System.out.println(basicPlan);
        System.out.println(premiumPlan);
        System.out.println(employee);
        System.out.println(company);
    }
}
