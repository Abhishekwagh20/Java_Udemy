public class Main {
    public static void main(String[] args) {
        boolean sum=EqualSumChecker.hasEqualSum(1,1,1);
        System.out.println(sum);
        sum=EqualSumChecker.hasEqualSum(1,1,2);
        System.out.println(sum);
        sum=EqualSumChecker.hasEqualSum(1,-1,0);
        System.out.println(sum);
    }
}

