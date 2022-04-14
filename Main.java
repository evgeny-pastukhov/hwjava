public class Main {
    public static void main(String[] args) {
        //Employee employee1 = new Employee("Fedor1 Sidorov1", "QA middle1", "qwe1@qwe.ru",
          //      "89162223344",60001, 39);
        //employee1.printEmployee();

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231211", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "Engineer", "petr@mail.ru", "89231239911",31000, 31);
        persArray[2] = new Employee("Sidorov Alex", "Engineer", "alex@mail.ru", "89231231212",31000, 32);
        persArray[3] = new Employee("Alexandrov Slava", "Engineer", "slava@mail.ru", "89231231213",31000, 43);
        persArray[4] = new Employee("Slavin Nikolay", "Engineer", "nick@mail.ru", "89231231214",31000, 45);

        for (int i = 0; i < 5; i++) {
            if (persArray[i].age > 40) {
                persArray[i].printEmployee();
            }
        }

    }
}
