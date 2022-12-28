public class Main {
    public static void main(String[] args) {
        boolean checkLeapYear=LeapYear.isLeapYear(-1600);
        System.out.println(checkLeapYear);
        checkLeapYear =LeapYear.isLeapYear(1600);
        System.out.println(checkLeapYear);
        checkLeapYear =LeapYear.isLeapYear(2017);
        System.out.println(checkLeapYear);
        checkLeapYear =LeapYear.isLeapYear(2000);
        System.out.println(checkLeapYear);
        checkLeapYear =LeapYear.isLeapYear(1924);
        System.out.println(checkLeapYear);
    }
}
