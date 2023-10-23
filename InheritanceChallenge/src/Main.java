public class Main {
    public static void main(String[] args) {
        Employee Khu = new Employee("Khuslen", "11/11/1998", "01/01/2023");

        System.out.println(Khu);
        System.out.println("Age = " + Khu.getAge());
        System.out.println("Pay = " + Khu.collectPay());

        Employee Joe = new Employee("Joe", "11/11/2312", "23/12/2023");
        System.out.println(Joe);
        System.out.println("Age = " + Joe.getAge());
        System.out.println("Pay = " + Joe.collectPay());
    }
}
