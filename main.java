public class Main {
    public static void main(String[] args) {
        CreditcardAccount creditCard = new CreditcardAccount();
        creditCard.setAccountID("1111-2222-3333-4444");
        creditCard.setInterestRate(0.015);
        creditCard.setLimit(1000000); // $10,000 limit
        
        System.out.println(creditCard.accountInfo());
        
        creditCard.debit(50000); // Spend $500.00
        System.out.println("After spending $500: \n" + creditCard.accountInfo());
        
        creditCard.applyInterest();
        System.out.println("After applying interest: \n" + creditCard.accountInfo());
    }
}
