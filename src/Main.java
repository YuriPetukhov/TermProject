
public class Main {
    public static void main(String[] args) {

        String [] fullNames = new String [10];
        int [] unitNumbers = new int [10];
        double [] salaries = new double[10];
        Employee employee1 = new Employee("Иванов Иван Иванович", 1, 100_000);
        fullNames[0] = employee1.getFullName();
        unitNumbers[0] = employee1.getUnitNumber();
        salaries[0] = employee1.getSalary();

        Employee employee2 = new Employee("Петров Петр Петрович", 2, 120_000);
        fullNames[1] = employee2.getFullName();
        unitNumbers[1] = employee2.getUnitNumber();
        salaries[1] = employee2.getSalary();

        Employee employee3 = new Employee("Валентинова Валентина", 3, 110_000);
        fullNames[2] = employee3.getFullName();
        unitNumbers[2] = employee3.getUnitNumber();
        salaries[2] = employee3.getSalary();

        Employee employee4 = new Employee("Евгеньева Евгения Евгеньевна", 4, 105_000);
        fullNames[3] = employee4.getFullName();
        unitNumbers[3] = employee4.getUnitNumber();
        salaries[3] = employee4.getSalary();

        Employee employee5 = new Employee("Маратов Марат Маратович", 5, 115_000);
        fullNames[4] = employee5.getFullName();
        unitNumbers[4] = employee5.getUnitNumber();
        salaries[4] = employee5.getSalary();

        System.out.println("Задача 1");
        Employee.printEmployeesList(fullNames, unitNumbers, salaries);

        System.out.println("Задача 2");
        Employee.printCostWages(salaries);

        System.out.println("Задача 3");
        Employee.printMinWageEmployee(fullNames, salaries);

        System.out.println("Задача 4");
        Employee.printMaxWageEmployee(fullNames, salaries);

        System.out.println("Задача 5");
        Employee.printAAverageWages(salaries);

        System.out.println("Задача 6");
        Employee.printFullNames(fullNames);

    }
}