public class Main {
    public static void main(String[] args) {
        Employee Khu = new Employee("Khuslen", "11/11/1998", "01/01/2023");

        System.out.println(Khu);
        System.out.println("Age = " + Khu.getAge());
        System.out.println("Pay = " + Khu.collectPay());

        SalariedEmployee Joe = new SalariedEmployee("Joe", "11/11/2312", "23/12/2023", 35000);
        System.out.println(Joe);
        System.out.println("Age = " + Joe.getAge());
        System.out.println("Pay = " + Joe.collectPay());

        System.out.println("Joe's paycheck = $ " + Joe + Joe.collectPay());

        Joe.retire();
        System.out.println("Joe's pension check = $ " + Joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1940", "09/09/2021", 15 );
        System.out.println(mary);
        System.out.println("Mary's paycheck = $ " + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $ " + mary.getDoublePay());
    }
}
