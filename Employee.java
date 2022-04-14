public class Employee {
    String fio;
    String profession;
    String email;
    String phone;
    int salary;
    int age;

    public  Employee(String fio, String profession, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printEmployee() {
        System.out.println(this.fio + " " + this.profession + " " + this.email + " " + this.phone + " " +
                this.salary + " " + this.age);

    }
}
