public class Employee {
    private String fullName;
    private int unitNumber;
    private float salary;
    private int id;
    static int counter = 1;

    public Employee(String fullName, int unitNumber, float salary) {
        this.fullName = fullName;
        this.unitNumber = unitNumber;
        this.salary = salary;
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary < 50_000) {
            System.out.println("Зарплата не может быть меньше 50_000 руб.");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n" + fullName + ", отдел: " + unitNumber + ", зарплата: " + salary;
    }
}