
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
		Account matthewsAcc = new Account("Matthews account", 1000);
		Account myAcc = new Account("My account", 0);
		matthewsAcc.withdrawal(100.0);
     	myAcc.deposit(100.0);
		System.out.println(matthewsAcc.toString());
		System.out.println(myAcc.toString());
    }
}
