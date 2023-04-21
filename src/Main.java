
public class Main {
    public static void main(String[] args) {

        String[] fullNames = new String[10];
        int[] unitNumbers = new int[10];
        double[] salaries = new double[10];
        int[] idNum = new int[10];
        Employee employee1 = new Employee("Иванов Иван Иванович", 1, 100_000);
        fullNames[0] = employee1.getFullName();
        unitNumbers[0] = employee1.getUnitNumber();
        salaries[0] = employee1.getSalary();
        idNum[0] = Employee.id;

        Employee employee2 = new Employee("Петров Петр Петрович", 2, 120_000);
        fullNames[1] = employee2.getFullName();
        unitNumbers[1] = employee2.getUnitNumber();
        salaries[1] = employee2.getSalary();
        idNum[1] = Employee.id;

        Employee employee3 = new Employee("Валентинова Валентина Валентиновна", 3, 110_000);
        fullNames[2] = employee3.getFullName();
        unitNumbers[2] = employee3.getUnitNumber();
        salaries[2] = employee3.getSalary();
        idNum[2] = Employee.id;

        Employee employee4 = new Employee("Евгеньева Евгения Евгеньевна", 4, 105_000);
        fullNames[3] = employee4.getFullName();
        unitNumbers[3] = employee4.getUnitNumber();
        salaries[3] = employee4.getSalary();
        idNum[3] = Employee.id;

        Employee employee5 = new Employee("Маратов Марат Маратович", 5, 115_000);
        fullNames[4] = employee5.getFullName();
        unitNumbers[4] = employee5.getUnitNumber();
        salaries[4] = employee5.getSalary();
        idNum[4] = Employee.id;

        System.out.println("Задача 1");
        Employee.printEmployeesList(fullNames, unitNumbers, salaries);

        System.out.println("Задача 2");
        Employee.printCostWages(salaries);

        System.out.println("Задача 3");
        Employee.printMinWageEmployee(fullNames, salaries);

        System.out.println("Задача 4");
        Employee.printMaxWageEmployee(fullNames, salaries);

        System.out.println("Задача 5");
        Employee.printAverageWages(salaries);

        System.out.println("Задача 6");
        Employee.printFullNames(fullNames);

        System.out.println("Задача повышенной сложности 1");
        int percent = 20;
        Employee.increaseWage(fullNames, salaries, percent);

        System.out.println("Задача повышенной сложности 2");
        int unitMin = 3;
        Employee.printMinWageUnit(fullNames, salaries, unitNumbers, unitMin);

        System.out.println("Задача повышенной сложности 3");
        int unitMax = 4;
        Employee.printMaxWageUnit(fullNames, salaries, unitNumbers, unitMax);

        System.out.println("Задача повышенной сложности 4");
        int unitSalaryCost = 3;
        Employee.printCostWagesUnit(salaries, unitNumbers, unitSalaryCost);

        System.out.println("Задача повышенной сложности 5");
        int unitAverage = 1;
        Employee.printAverageWageUnit(salaries, unitNumbers, unitAverage);

        System.out.println("Задача повышенной сложности 6");
        int unitIncrease = 1;
        int unitPercent = 10;
        Employee.increaseWageUnit(fullNames, salaries, unitNumbers, unitIncrease, unitPercent);

        System.out.println("Задача повышенной сложности 7");
        int unitInfo = 5;
        Employee.printEmployeesUnit(fullNames, unitNumbers, salaries, unitInfo);

        System.out.println("Задача повышенной сложности 8");
        int salaryLevelMax = 140_000;
        Employee.employeesLowerSalaries(idNum, fullNames, unitNumbers, salaries, salaryLevelMax);

        System.out.println("Задача повышенной сложности 9");
        int salaryLevelMin = 130_000;
        Employee.employeesHigherSalaries(idNum, fullNames, unitNumbers, salaries, salaryLevelMin);
    }
}