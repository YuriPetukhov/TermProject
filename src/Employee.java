import java.util.Arrays;

class Employee {
    private String fullName;
    private int unitNumber;
    private double salary;
    public static int id = 0;

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
        System.out.printf("| %s | %-30s | %5s | %9s |", "№", "ФИО", "Отдел", "Зарплата");
        System.out.println();
        System.out.println("==========================================================");
        for (int i = 0; i < id; i++) {
            System.out.printf("| %d | %-30s | %5d | %.2f |", i + 1, fullName[i], unitNumber[i], salary[i]);
            System.out.println();
            System.out.println("----------------------------------------------------------");
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
    public static void printAAverageWages(double[] salary) {
        double costWages = Arrays.stream(salary).sum();
        System.out.printf("Средняя зарплата в месяц составляет: %.2f рублей\n", costWages/id);

    }
    public static void printFullNames(String[] fullNames) {
        for (int i = 0; i < id; i++) {
            System.out.println(fullNames[i]);
        }
    }

}
