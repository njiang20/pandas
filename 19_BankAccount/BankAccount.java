/*
Triumphant Triangles--Nina Jiang, Jason Zhou, John Gupta-she
APCS
HW19: Mo Money Mo Problems...MORE AWESOME
2021-10-18
DISCO:
QCC:
*/

public class BankAccount {
    //vars
    private double balance;
    private short accPin;
    private String accName;
    private String accPss;
    private String accId;

    //constructor
    public BankAccount() {

    }
    //overloaded constructor
    public BankAccount(String name, String pss, String id, short pinnum, double setBalance) {
        balance = setBalance;
        accPin = pinnum;
        accName = name;
        accPss = pss;

        //Randomize?
        accId = id;
    }

    //methods
    public void getInfo(String pss, short pin) {
    //.equals/compareTo
        if (pss == accPss && pin == accPin) {
            System.out.println("Name: " + accName + "\nAccount Id: " + accId + "\nBalance: " + balance + "\n");
        } else {
            System.out.println("Access Denied/Account Doesn't Exist");
        }
    }

    public void changePin(short oldPin, short newPin) {
    //add superuser
        if (oldPin == accPin) {
            accPin = newPin;
        } else {
            System.out.println("Wrong Pin");
        }
    }

    public void changeName(String newName, String pss) {
        if (pss == accPss) {
            accName = newName;
        } else {
            System.out.println("Wrong Password");
        }

    }

    public void changePsswrd(String oldPss, String newPss, String newPssRepeat) {
        if (oldPss == accPss && newPss == newPssRepeat) {
            accPss = newPss;
        } else {
            System.out.println("Wrong Password");
        }
    }

    public void deposit(short pin, double amount) {
        if (pin == accPin && amount > 0) {
            balance += amount;
        } else {
            System.out.println("Wrong Pin");
        }
    }

    public void withdraw(short pin, double amount) {
        if (pin == accPin && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Wrong Pin");
        }
    }
    public static void main(String[] args) {
        BankAccount elmo = new BankAccount("elmo", "e", "101101101", (short)1011, 69);
        elmo.getInfo("e", (short)1011);
        elmo.changePin((short)1011, (short)1111);
        elmo.getInfo("e", (short)1111);
        elmo.changeName("elmoson", "e");
        elmo.getInfo("e", (short)1111);
        elmo.changePsswrd("e", "ee", "ee");
        elmo.getInfo("ee", (short)1111);
        elmo.deposit((short)1111, 69);
        elmo.getInfo("ee", (short)1111);
        elmo.withdraw((short)1111, 20);
        elmo.getInfo("ee", (short)1111);
        System.out.println(elmo);
        //correct outputs will have no errors
    }

}
