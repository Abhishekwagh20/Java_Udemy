public class OperatorChallange {
    public static void main(String[] args){
        double FirstDouble=20.00d;
        double SecondDouble=80.00d;
        double Totaldouble=(FirstDouble+SecondDouble)*100.00d;
        System.out.println(Totaldouble);
        double Reminder=Totaldouble % 40.00d;
        System.out.println(Reminder);
        boolean CheckTF;
        if (Reminder == 0){
            CheckTF = true;
        }
        else {
            CheckTF = false;
        }
        System.out.println(CheckTF);
        if(!CheckTF){
            System.out.println("Got some Reminder");
        }
    }
}
