package builder;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new EmployeeBuilder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setCompany("Yandex Go")
                .setPosition("Accountant")
                .setSalary(100000)
                .setIsMarried(true)
                .setHasChildren(true)
                .build();

        Employee employee2 = new EmployeeBuilder()
                .setName("Olga")
                .setSurname("Smirnova")
                .setCompany("Yandex Travel")
                .setPosition("Senior Accountant")
                .setSalary(150000)
                .setIsMarried(true)
                .setHasChildren(true)
                .build();

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
