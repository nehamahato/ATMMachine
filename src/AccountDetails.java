import java.util.*;

public class AccountDetails {
    private HashMap<Integer, Integer> record;

    public AccountDetails() {
        record = new HashMap<>();
    }

    public void addEntry(int AccNo, int balance) {
        if(record.containsKey(AccNo)) {
            System.out.println("Account " + AccNo + " already exists...");
            return;
        }
        System.out.println("Created new account : " + AccNo);
        record.put(AccNo, balance);
    }

    public int checkBalance(int AccNo) {
        if(record.containsKey(AccNo)) {
            int balance = record.get(AccNo);
            return balance;
        }
        System.out.println("Account " + AccNo + " not found");
        return -1;
    }

    public int withdraw(int AccNo, int amount) {
        if(record.containsKey(AccNo)) {
            int balance = record.get(AccNo);
            if(amount<0) {
                System.out.println("Withdrawal amount is invalid");
                return -1;
            }
            else if(amount > balance) {
                System.out.println("Not enough balance to withdraw");
                return -1;
            }
            int remaining = balance - amount;

            record.put(AccNo, remaining);
            System.out.println("The withdrawal amount = " + amount);
            System.out.println("Current account balance after withdrawal = " + remaining);
            return 1;
        }
        System.out.println("Account " + AccNo + " not found");
        return -1;
    }

    public int deposit(int AccNo, int amount) {
        if(record.containsKey(AccNo)) {
            int balance = record.get(AccNo);
            if(amount<0) {
                System.out.println("Deposit amount is invalid");
                return -1;
            }
            int newBalance = balance + amount;
            record.put(AccNo, newBalance);

            System.out.println("The deposited amount = " + amount);
            System.out.println("Current account balance after deposit = " + newBalance);
            return 1;
        }
        System.out.println("Account " + AccNo + " not found");
        return -1;
    }

}

