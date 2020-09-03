public class Machine {
    public static void main(String args[]) {
        User t1 = new User();
        t1.setName("Neha");
        t1.setAccNo(13579);

        AccountDetails acc = new AccountDetails();
        acc.addEntry(12345, 200000);
        acc.addEntry(23456, 300000);
        acc.addEntry(34567, 400000);
        acc.addEntry(45678, 500000);
        acc.addEntry(56789, 600000);

        acc.addEntry(12345, 10000);


        //int balance = acc.CheckBalance(12555345);
        //System.out.print("The Current Balance is:" +balance);
//        System.out.println("Old Balance :: " + acc.checkBalance(12345));
//        acc.withdraw(12345,10000);
//        acc.withdraw(12345,10000);
//        acc.withdraw(12345,10000);
//        acc.withdraw(12345,10000);
//        acc.withdraw(12345,10000);
//        System.out.println("New Balance :: " + acc.checkBalance(12345));

//        acc.withdraw(1234533,10000);
//        acc.withdraw(12345,-10000);
//        acc.withdraw(12345,1000000);
//
//        acc.deposit(12345, -111);
//        acc.deposit(1234511, -111);
//        acc.deposit(12345, 111);
    }
}
