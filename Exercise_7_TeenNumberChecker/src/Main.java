public class Main {
    public static void main(String[] args) {
        boolean check =TeenNumberChecker.hasTeen(9,99,19);
        System.out.println(check);
        check=TeenNumberChecker.hasTeen(23,15,42);
        System.out.println(check);
        check=TeenNumberChecker.hasTeen(22,23,34);
        System.out.println(check);
        check=TeenNumberChecker.isTeen(9);
        System.out.println(check);
        check=TeenNumberChecker.isTeen(13);
        System.out.println(check);
    }
}
