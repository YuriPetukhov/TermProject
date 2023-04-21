import java.util.Arrays;

class Employee {
    private String fullName;
    private int unitNumber;
    private double salary;
    public static int id;

    public Employee(String fullName, int unitNumber, double salary) {
        this.fullName = fullName;
        this.unitNumber = unitNumber;
        this.salary = salary;
        id++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName.isEmpty()) {
            System.out.println("Поле не может быть пустым");
        } else {
            this.fullName = fullName;
        }
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        if (unitNumber > 1 && unitNumber < 5) {
            System.out.println("Номер отдела должен находиться в интервале от 1 до 5");
        }
        this.unitNumber = unitNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary < 50_000) {
            System.out.println("Зарплата не может быть меньше 50_000 руб.");
        }
        this.salary = salary;
    }

    public static void printEmployeesList(String[] fullName, int[] unitNumber, double[] salary) {
        System.out.println("Список сотрудников:");
        System.out.println("--------------------------------------------------------------------");
        System.out.printf("| %s | %-40s | %5s | %9s |", "№", "ФИО", "Отдел", "Зарплата");
        System.out.println();
        System.out.println("====================================================================");
        for (int i = 0; i < id; i++) {
            System.out.printf("| %d | %-40s | %5d | %.2f |\n", i + 1, fullName[i], unitNumber[i], salary[i]);
            System.out.println("--------------------------------------------------------------------");
        }
    }

    public static void printCostWages(double[] salary) {
        double costWages = Arrays.stream(salary).sum();
        System.out.printf("Сумма затрат на зарплату в месяц составляет: %.2f рублей\n", costWages);

    }

    public static void printMinWageEmployee(String[] fullName, double[] salary) {
        double minWage = salary[0];
        int num = 0;
        for (int i = 1; i < id; i++) {
            if (minWage > salary[i]) {
                minWage = salary[i];
                num = i;
            }
        }
        System.out.printf("Минимальную зарплату %.2f рублей получает %s\n", minWage, fullName[num]);

    }

    public static void printMaxWageEmployee(String[] fullName, double[] salary) {
        double maxWage = salary[0];
        int num = 0;
        for (int i = 1; i < id; i++) {
            if (maxWage < salary[i]) {
                maxWage = salary[i];
                num = i;
            }
        }
        System.out.printf("Максимальную зарплату %.2f рублей получает %s\n", maxWage, fullName[num]);

    }

    public static void printAverageWages(double[] salary) {
        double costWages = Arrays.stream(salary).sum();
        System.out.printf("Средняя зарплата в месяц составляет: %.2f рублей\n", costWages / id);

    }

    public static void printFullNames(String[] fullNames) {
        for (int i = 0; i < id; i++) {
            System.out.println(fullNames[i]);
        }
    }

    public static void increaseWage(String[] fullNames, double[] salary, int percent) {
        for (int i = 0; i < id; i++) {
            salary[i] += salary[i] / 100 * percent;
            System.out.printf("%s получает теперь %.2f рублей в месяц\n", fullNames[i], salary[i]);
        }
    }

    public static void printMinWageUnit(String[] fullName, double[] salary, int[] unitNumber, int unit) {
        double minWage = 200_000;
        int element = 0;
        for (int i = 0; i < id; i++) {
            if (unitNumber[i] == unit && minWage > salary[i]) {
                minWage = salary[i];
                element = i;
            }
        }
        System.out.printf("Минимальную зарплату %.2f рублей в отделе %d получает %s\n", minWage, unit, fullName[element]);
    }

    public static void printMaxWageUnit(String[] fullName, double[] salary, int[] unitNumbers, int unit) {
        double maxWage = 0;
        int element = 0;
        for (int i = 0; i < id; i++) {
            if (unitNumbers[i] == unit && maxWage < salary[i]) {
                maxWage = salary[i];
                element = i;
            }
        }
        System.out.printf("Максимальную зарплату %.2f рублей в отделе %d получает %s\n", maxWage, unit, fullName[element]);
    }

    public static void printCostWagesUnit(double[] salary, int[] unitNumbers, int unit) {
        double wageUnitCost = 0;
        for (int i = 0; i < id; i++) {
            if (unitNumbers[i] == unit) {
                wageUnitCost += salary[i];
            }
        }
        System.out.printf("Сумма затрат на зарплату в месяц в отделе %d составляет: %.2f рублей\n", unit, wageUnitCost);

    }

    public static void printAverageWageUnit(double[] salary, int[] unitNumbers, int unit) {
        double wageUnitSum = 0;
        int number = 0;
        for (int i = 0; i < id; i++) {
            if (unitNumbers[i] == unit) {
                number++;
                wageUnitSum += salary[i];
            }
        }
        System.out.printf("Средняя зарплата в месяц в отделе %s составляет: %.2f рублей\n", unit, wageUnitSum / number);
    }

    public static void increaseWageUnit(String[] fullNames, double[] salary, int[] unitNumbers, int unit, int percent) {
        for (int i = 0; i < id; i++) {
            if (unitNumbers[i] == unit) {
                salary[i] += salary[i] / 100 * percent;
                System.out.printf("%s в отделе %s получает теперь %.2f рублей в месяц\n", fullNames[i], unit, salary[i]);
            }
        }
    }

    public static void printEmployeesUnit(String[] fullName, int[] unitNumbers, double[] salary, int unit) {
        System.out.println("Список сотрудников отдела:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %s | %-40s | %9s |", "№", "ФИО", "Зарплата");
        System.out.println();
        System.out.println("============================================================");
        int num = 1;
        for (int i = 0; i < id; i++) {
            if (unitNumbers[i] == unit) {
                System.out.printf("| %d | %-40s | %.2f |", num, fullName[i], salary[i]);
                System.out.println();
                System.out.println("------------------------------------------------------------");
                num++;
            }
        }
    }

    public static void employeesLowerSalaries(int[] idNum, String[] fullName, int[] unitNumbers, double[] salary, int salaryLevel) {
        System.out.println("Список сотрудников с более низкой зарплатой:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %s | %-40s | %9s |", "ID", "ФИО", "Зарплата");
        System.out.println();
        System.out.println("============================================================");
        for (int i = 0; i < id; i++) {
            if (salary[i] < salaryLevel) {
                System.out.printf("| %2d | %-40s | %.2f |\n", idNum[i], fullName[i], salary[i]);
                System.out.println("-------------------------------------------------------------");
            }
        }

    }

    public static void employeesHigherSalaries(int[] idNum, String[] fullName, int[] unitNumbers, double[] salary, int salaryLevel) {
        System.out.println("Список сотрудников с более высокой зарплатой:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %s | %-40s | %9s |", "ID", "ФИО", "Зарплата");
        System.out.println();
        System.out.println("============================================================");
        for (int i = 0; i < id; i++) {
            if (salary[i] > salaryLevel) {
                System.out.printf("| %2d | %-40s | %.2f |\n", idNum[i], fullName[i], salary[i]);
                System.out.println("-------------------------------------------------------------");
            }
        }

    }
}
