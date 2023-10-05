package builder;

public class EmployeeBuilder {
    private String name;
    private String surname;
    private String company;
    private String position;
    private int salary;
    private boolean isMarried;
    private boolean hasChildren;
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public EmployeeBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public EmployeeBuilder setPosition(String position) {
        this.position = position;
        return this;
    }

    public EmployeeBuilder setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public EmployeeBuilder setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
        return this;
    }

    public EmployeeBuilder setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
        return this;
    }

    public Employee build () {
        return new Employee(name, surname, company, position, salary, isMarried, hasChildren);
    }

}
