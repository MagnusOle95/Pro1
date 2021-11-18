package application.controller;

import application.model.Company;
import application.model.Customer;
import application.model.Employee;
import storage.Storage;

import java.util.ArrayList;

public class Controller {
    /**
     * Creates a new Company.<br />
     * Requires: hours >= 0.
     */
    public static Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        Storage.addCompany(company);
        return company;
    }

    /**
     * Deletes the company.<br />
     * Requires: The company has no employees.
     */
    public static void deleteCompany(Company company) {
        Storage.removeCompany(company);
    }

    /**
     * Updates the company.<br />
     * Requires: hours >= 0.
     */
    public static void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }

    /**
     * Get all the companies
     */
    public static ArrayList<Company> getCompanies() {
        return Storage.getCompanies();
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0.
     */
    //Tilføget employment year til, metode. og employee construktor.
    public static Employee createEmployee(String name, int wage,int employmentyear) {
        Employee employee = new Employee(name, wage,employmentyear);
        Storage.addEmployee(employee);
        return employee;
    }

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0, company!=null.
     */
    //Tilføget employment year til, metode. og employee construktor.
    public static Employee createEmployee(String name, int wage, Company company,int employmentYear) {
        Employee employee = createEmployee(name, wage,employmentYear);
        company.addEmployee(employee);
        return employee;
    }

    /**
     * Deletes the employee.
     */
    public static void deleteEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            company.removeEmployee(employee);
        }
        Storage.removeEmployee(employee);
    }

    /**
     * Updates the employee.<br />
     * Requires: wage >= 0.
     */
    public static void updateEmployee(Employee employee, String name, int wage,int employmentYear) {
        employee.setName(name);
        employee.setWage(wage);
        employee.setEmploymentYear(employmentYear);

    }
    
    /**
     * Adds the employee to the company. Removes the employee from the old company if present.
     */
    public static void addEmployeeToCompany(Employee employee, Company company) {
        company.addEmployee(employee);
    }
    
    /**
     * Removes the employee from the old company if not null.
     * @param company The old company. Can be null.
     * @param employee The employee to remove.
     */
    public static void removeEmployeeFromCompany(Employee employee, Company company) {
        if (company != null) {
            company.removeEmployee(employee);            
        }
    }

    /**
     * Get all the employees.
     */
    public static ArrayList<Employee> getEmployees() {
        return Storage.getEmployees();
    }

    // -------------------------------------------------------------------------
    //Opretter controller metoder til customer Opgave 2

    public static Customer createCustomer(String firstName, String lastName){
        Customer newC = new Customer(firstName,lastName);
        Storage.addCustomer(newC);
        return newC;
    }

    public static void addCustomerToCompany(Customer customer,Company company){
        company.addCustomer(customer);
    }

    public static void removeCustomer(Customer customer, Company company){
        company.removeCustomer(customer);
    }

    //----------------------------------------------------------------------------------


    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        //Har tilføget employment year på alle ansatte.
        Company c1 = Controller.createCompany("IBM", 37);
        Company c2 = Controller.createCompany("AMD", 40);
        Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);

        Controller.createEmployee("Bob Dole", 210, c2,2012);
        Controller.createEmployee("Alice Schmidt", 250, c1,2020);
        Controller.createEmployee("George Down", 150, c2,1997);

        Controller.createEmployee("Rita Uphill", 300,2002);

        //Opretter nogle customers Opgave 2
        Customer cus1 = Controller.createCustomer("Per","Andersen");
        Controller.addCustomerToCompany(cus1,c1);

        Customer cus2 = Controller.createCustomer("Anne","Jensen");
        Controller.addCustomerToCompany(cus2,c1 );

        Customer cus3 = Controller.createCustomer("Jens","Hansen");
        Controller.addCustomerToCompany(cus3,c2);

    }

    public static void init() {
        initStorage();

    }

}
