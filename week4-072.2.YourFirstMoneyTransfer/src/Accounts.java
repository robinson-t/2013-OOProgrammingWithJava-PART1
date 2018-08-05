
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account A = new Account("Matt's account" , 1000.00);
        Account B = new Account("My account" , 0.00);
        
        A.withdrawal(100.00);
        B.deposit(100.00);
        System.out.println(A);
        System.out.println(B);
    }

}
