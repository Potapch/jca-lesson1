package ru.gb.jca.l5.hw;

public class HomeWork5 {
    public static void main (String[] args) {
        Employee[] employees = {
                new Employee("Васильев В.В.", "Директор", "vvv@firma.ru", 999009900, 100000, 50),
                new Employee("Иванов И.И." , "Менеджер", "iii@firma.ru", 910300303, 50000, 38),
                new Employee("Сидорова С.С.", "Бухгалтер", "sss@firma.ru", 925559010, 50000, 45),
                new Employee("Петров П.П.", "Водитель", "petrov@mail.ru", 912345678, 30000, 30),
                new Employee("Красавина Е.Д.", "Секретарь", "secretary@firma.ru", 901002030, 25000, 25)
        };
        for (Employee employee: employees) {
            if (employee.getAge()>40)
                employee.printInfo();
        }
    }
    }
