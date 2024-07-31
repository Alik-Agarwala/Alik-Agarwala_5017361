package Week1.Module2DataStructuresAndAlgorithms.Ex4EmployeeManagementSystem;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;
    private int capacity;

    public EmployeeManagementSystem(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        if (size < capacity) {
            employees[size++] = employee;
        } else {
            System.out.println("Cannot add employee. The array is full.");
        }
    }

    // Method to search for an employee by ID
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    // Method to delete an employee by ID
    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[size - 1] = null; // Nullify the last element
            size--;
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Method to traverse and display all employees
    public void displayEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        // Adding employees
        ems.addEmployee(new Employee(1, "Alice", "Manager", 75000));
        ems.addEmployee(new Employee(2, "Bob", "Developer", 50000));
        ems.addEmployee(new Employee(3, "Charlie", "Designer", 40000));

        // Displaying all employees
        System.out.println("All Employees:");
        ems.displayEmployees();

        // Searching for an employee
        System.out.println("\nSearching for employee with ID 2:");
        Employee foundEmployee = ems.searchEmployee(2);
        System.out.println(foundEmployee != null ? foundEmployee : "Employee not found");

        // Deleting an employee
        System.out.println("\nDeleting employee with ID 2:");
        ems.deleteEmployee(2);
        ems.displayEmployees();
    }
}
