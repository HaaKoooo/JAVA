public class AccountingApp {
    public static void main(String[] args) {
        double ValueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;

        double vat = ValueOfSupply * vatRate;
        double total = (ValueOfSupply + (ValueOfSupply * vatRate));
        double expense = (ValueOfSupply * expenseRate);
        double income = ValueOfSupply - expense;

        double dividend1 = income * 0.5;
        double dividend2 = income * 0.3;
        double dividend3 = income * 0.2;

        System.out.println("Value of supply : " + ValueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);

        //이 프로그램을 다른 컴퓨터 (자바 버추얼머신이 설치되있지 않은 컴퓨터에서 사용하고싶을 시에는
        //launch4j 사이트에 들어가본다 그 사이트에서 도움을 받으면 이 프로그램 안에 자바 버추얼머신을 내장할수있다.
    }
}
