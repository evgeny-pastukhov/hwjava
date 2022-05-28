public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иван", "программист", "q@q.ru", "+79991234567",
        3000, 27);
        employee[1] = new Employee("Пётр", "программист", "w@q.ru", "+79991234567",
                2500, 23);
        employee[2] = new Employee("Семён", "программист", "e@q.ru", "+79991234567",
                3500, 34);
        employee[3] = new Employee("Евгений", "программист", "r@q.ru", "+79991234567",
                3000, 36);
        employee[4] = new Employee("Евгений", "тестировщик", "t@q.ru", "+79991234567",
                2000, 41);

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() > 40) {
                System.out.println(employee[i]);
            }
        }
    }
}
