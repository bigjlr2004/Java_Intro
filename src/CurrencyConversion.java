public class CurrencyConversion {

    public static void main(String args[] ){
            double amountInUSD = 100.0;
            double exchangeRateUSDtoEUR = .85;

            double converted_rate = amountInUSD * exchangeRateUSDtoEUR;

            System.out.println("Converted Money:  " + converted_rate);

            double after_expenditure = converted_rate - 55;

            System.out.println("After expenditure:  " + after_expenditure);
            amountInUSD = after_expenditure/.85;

            System.out.printf("$%.2f", amountInUSD);

    }
}
