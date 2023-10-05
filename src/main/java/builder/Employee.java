package builder;

public class Employee {
    private String name;
    private String surname;
    private String company;
    private String position;
    private int salary;
    private boolean isMarried;
    private boolean hasChildren;

    public Employee(String name, String surname, String company, String position, int salary, boolean isMarried, boolean hasChildren) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.position = position;
        this.salary = salary;
        this.isMarried = isMarried;
        this.hasChildren = hasChildren;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name:'"+ name + '\'' +
                ", surname:'" + surname + '\'' +
                ", company:'" + company + '\'' +
                ", position:'" + position + '\'' +
                ", salary:" + salary +
                ", isMarried:" + isMarried +
                ", hasChildren:" + hasChildren +
                '}';
    }
}
