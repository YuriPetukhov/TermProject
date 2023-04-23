import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String fullName, int unitNumber, float salary) {
        if (size >= employees.length) {
            System.out.println("Книга сотрудников переполнена. Невозможно добавить нового сотрудника.");
        }
        Employee newEmployee = new Employee(fullName, unitNumber, salary);
        employees[size++] = newEmployee;
    }

    public void removeEmployee(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                System.out.println("Сотрудник " + employees[i].getFullName() + " удален(а)");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;

            }
        }
    }

    public void adEmployeeByName(String fullName, int unitNumber, float salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                addEmployee(fullName, unitNumber, salary);
                System.out.println("Добавлен новый сотрудник " + fullName);
                return;

            }
        }
    }

    public void findEmployee(String fullName) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getFullName().equals(fullName)) {
                System.out.println(employee.getFullName() + ": " + employee.getUnitNumber());
                return;
            }
        }
        System.out.println("Сотрудник " + fullName + " не найден.");
    }

    public void printEmployeesList() {
        System.out.println("Список сотрудников:");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("| %s | %-40s | %5s | %9s |", "№", "ФИО", "Отдел", "Зарплата");
        System.out.println();
        System.out.println("====================================================================");
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.printf("| %d | %-40s | %5d | %.2f |\n", i + 1, employee.getFullName(), employee.getUnitNumber(), employee.getSalary());
            System.out.println("--------------------------------------------------------------------");
        }
    }

    public int getCurrentSize() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(employees);
    }

    public float findCostWages() {
        float sum = 0;
        for (int i = 0; i < getCurrentSize(); i++) {
            Employee employee = employees[i];
            sum += employee.getSalary();
        }
        return sum;

    }

    public String findMinWageEmployee() {
        double minWage = 200_000;
        String fullName = "";

        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (minWage > employee.getSalary()) {
                minWage = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        return fullName;
    }

    public String findMaxWageEmployee() {
        double maxWage = 0;
        String fullName = "";
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (maxWage < employee.getSalary()) {
                maxWage = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        return fullName;

    }

    public float findAverageWage() {

        return findCostWages() / getCurrentSize();
    }

    public void printFullNames() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFullName());
        }
    }

    public void increaseWage(int percent) {
        float wage;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            wage = employee.getSalary() + employee.getSalary() / 100 * percent;
            employee.setSalary(wage);
        }
    }

    public String findMinWageUnit(int unit) {
        double minWage = 200_000;
        String fullName = "";
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getUnitNumber() == unit && minWage > employee.getSalary()) {
                minWage = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        return fullName;
    }

    public String findMaxWageUnit(int unit) {
        double maxWage = 0;
        String fullName = "";
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getUnitNumber() == unit && maxWage < employee.getSalary()) {
                maxWage = employee.getSalary();
                fullName = employee.getFullName();
            }
        }
        return fullName;
    }

    public double findCostWageUnit(int unit) {
        double wageUnitCost = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getUnitNumber() == unit) {
                wageUnitCost += employee.getSalary();
            }
        }
        return wageUnitCost;

    }

    public double findAverageWageUnit(int unit) {
        double wageUnitSum = 0;
        int number = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getUnitNumber() == unit) {
                number++;
                wageUnitSum += employee.getSalary();
            }
        }
        return wageUnitSum / number;
    }

    public void increaseWageUnit(int unit, int percent) {
        for (int i = 0; i < size; i++) {
            float salary = 0;
            Employee employee = employees[i];
            if (employee.getUnitNumber() == unit) {
                salary += employee.getSalary() + employee.getSalary() / 100 * percent;
                employees[i].setSalary(salary);
                return;
            }
        }
    }

    public void printEmployeesUnit(int unit) {
        System.out.println("Список сотрудников отдела:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %s | %-40s | %9s |", "№", "ФИО", "Зарплата");
        System.out.println();
        System.out.println("============================================================");
        int num = 1;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getUnitNumber() == unit) {
                System.out.printf("| %d | %-40s | %.2f |", num, employee.getFullName(), employee.getSalary());
                System.out.println();
                System.out.println("------------------------------------------------------------");
                num++;
            }
        }
    }

    public void findEmployeesLowerSalaries(int salaryLevel) {
        System.out.println("Список сотрудников с более низкой зарплатой, чем: " + salaryLevel + " рублей:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %s | %-40s | %9s |", "ID", "ФИО", "Зарплата");
        System.out.println();
        System.out.println("============================================================");
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < salaryLevel) {
                System.out.printf("| %2d | %-40s | %.2f |\n", employee.getId(), employee.getFullName(), employee.getSalary());
                System.out.println("-------------------------------------------------------------");
            }
        }

    }

    public void findEmployeesHigherOrEqualSalaries(int salaryLevel) {
        System.out.println("Список сотрудников с более высокой зарплатой, чем: " + salaryLevel + " рублей:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %s | %-40s | %9s |", "ID", "ФИО", "Зарплата");
        System.out.println();
        System.out.println("============================================================");
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= salaryLevel) {
                System.out.printf("| %2d | %-40s | %.2f |\n", employee.getId(), employee.getFullName(), employee.getSalary());
                System.out.println("-------------------------------------------------------------");
            }
        }

    }

    public void changeEmployeeSalary(String fullName, float salary) {

        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
                System.out.printf("Сотрудник %s получает %.2f рублей", fullName, salary);
                return;
            }
        }
    }

    public void changeEmployeeUnit(String fullName, int unitNumber) {

        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setUnitNumber(unitNumber);
                System.out.printf("Сотрудник %s переведен в отдел %d", fullName, unitNumber);
                return;
            }
        }

    }

    public void printEmployeesListUnit() {
        System.out.println("Список сотрудников по отделам:");
        for (int j = 1; j <= 5; j++) {
            System.out.println("Список сотрудников " + j + " отдела:");
            for (int i = 0; i < size; i++) {
                Employee employee = employees[i];
                if (employee.getUnitNumber() == j) {
                    System.out.println(employee.getFullName());
                }
            }
        }
    }

}