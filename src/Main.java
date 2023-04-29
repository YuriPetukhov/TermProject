public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов Иван Иванович", 1, 100_000);
        employeeBook.addEmployee("Петров Петр Петрович", 2, 120_000);
        employeeBook.addEmployee("Валентинова Валентина Валентиновна", 3, 110_000);
        employeeBook.addEmployee("Евгеньева Евгения Евгеньевна", 4, 105_000);
        employeeBook.addEmployee("Маратов Марат Маратович", 3, 115_000);

        System.out.println("Задачи базовой сложности");
        System.out.println("Для проверки. Получить список всех сотрудников со всеми имеющимися по ним данными");
        employeeBook.printEmployeesList();
        System.out.println();
        System.out.println("Задача 1. Получить список всех сотрудников со всеми имеющимися по ним данными toString");
        System.out.println(employeeBook);
        System.out.println();
        System.out.println("Задача 2. Посчитать сумму затрат на зарплату в месяц");
        System.out.println("Сумма затрат на зарплату за месяц составляет: " + employeeBook.findCostWages() + " рублей");
        System.out.println();
        System.out.println("Задача 3. Найти сотрудника с минимальной зарплатой");
        System.out.println("Минимальную зарплату получает " + employeeBook.findMinWageEmployee());
        System.out.println();
        System.out.println("Задача 4. Найти сотрудника с максимальной зарплатой");
        System.out.println("Максимальную зарплату получает " + employeeBook.findMaxWageEmployee());
        System.out.println();
        System.out.println("Задача 5. Подсчитать среднее значение зарплат");
        System.out.println("Средняя зарплата в месяц составляет: " + employeeBook.findAverageWage() + " рублей");
        System.out.println();
        System.out.println("Задача 6. Получить Ф. И. О. всех сотрудников");
        employeeBook.printFullNames();
        System.out.println();
        System.out.println("Задачи повышенной сложности\n");
        System.out.println("Задача 7. Проиндексировать зарплату");
        employeeBook.increaseWage(20);
        System.out.println();
        System.out.println("Для проверки");
        employeeBook.printEmployeesList();
        System.out.println();
        System.out.println("Задача 8. Найти сотрудника с минимальной зарплатой в отделе");
        System.out.println("Минимальную зарплату в данном отделе получает " + employeeBook.findMinWageUnit(3));
        System.out.println();
        System.out.println("Задача 9. Найти сотрудника с максимальной зарплатой в отделе");
        System.out.println("Максимальную зарплату в данном отделе получает " + employeeBook.findMaxWageUnit(4));
        System.out.println();
        System.out.println("Задача 10. Найти сумму затрат на зарплату по отделу");
        System.out.println("Сумма затрат на зарплату в месяц в отделе составляет: " + employeeBook.findCostWageUnit(4) + " рублей");
        System.out.println();
        System.out.println("Задача 11. Найти среднюю зарплату по отделу");
        System.out.println("Сумма затрат на зарплату в месяц в отделе составляет: " + employeeBook.findAverageWageUnit(4));
        System.out.println();
        System.out.println("Задача 12. Проиндексировать зарплату всех сотрудников отдела");
        employeeBook.increaseWageUnit(4, 15);
        System.out.println("Для проверки");
        employeeBook.printEmployeesList();
        System.out.println();
        System.out.println("Задача 13. Напечатать всех сотрудников отдела");
        employeeBook.printEmployeesUnit(2);
        System.out.println();
        System.out.println("Задача 14. Найти всех сотрудников с зарплатой меньше числа");
        employeeBook.findEmployeesLowerSalaries(135_000);
        System.out.println();
        System.out.println("Задача 15. Найти всех сотрудников с зарплатой больше (или равно) числа");
        employeeBook.findEmployeesHigherOrEqualSalaries(115_000);
        System.out.println();
        System.out.println("Задачи высокой сложности");
        System.out.println();
        System.out.println("Задача 16. Добавить сотрудников");
        employeeBook.adEmployeeByName("Олег Олегович Олегов", 10, 118_000);
        System.out.println("Для проверки. Книга включает " + employeeBook.getCurrentSize() + " сотрудников");
        System.out.println();
        System.out.println("Для проверки");
        employeeBook.printEmployeesList();
        System.out.println();
        System.out.println("Задача 17. Удалить сотрудников");
        employeeBook.findEmployee("Иванов Иван Иванович");
        employeeBook.removeEmployee("Иванов Иван Иванович");
        employeeBook.findEmployee("Иванов Иван Иванович");
        System.out.println("Для проверки. Книга включает " + employeeBook.getCurrentSize() + " сотрудников");
        System.out.println("Для проверки");
        employeeBook.printEmployeesList();
        System.out.println("Задача 18. Изменить зарплату сотрудника");
        employeeBook.changeEmployeeSalary("Олег Олегович Олегов", 123_000);
        System.out.println();
        System.out.println("Задача 19. Изменить отдел сотрудника");
        employeeBook.changeEmployeeUnit("Олег Олегович Олегов", 1);
        System.out.println();
        System.out.println("Для проверки");
        employeeBook.printEmployeesList();
        System.out.println();
        System.out.println("Задача 20. Получить Ф. И. О. всех сотрудников по отделам");
        employeeBook.printEmployeesListUnit();
    }
}