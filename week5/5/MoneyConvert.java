interface Currency {
    void moneyConversion(double amount, double conversionRate);
    void countryCurrency(String country);
}
class CurrencyConversion implements Currency {
    public void moneyConversion(double amount, double conversionRate) {
        double convertedAmount = amount * conversionRate;
        System.out.println("Converted amount: " + convertedAmount);
    }
  public void countryCurrency(String country) {
        switch(country.toLowerCase()) {
            case "usa":
                System.out.println("Currency of " + country + ": USD (United States Dollar)");
                break;
            case "japan":
                System.out.println("Currency of " + country + ": JPY (Japanese Yen)");
                break;
            case "india":
                System.out.println("Currency of " + country + ": INR (Indian Rupee)");
                break;
            case "uk":
                System.out.println("Currency of " + country + ": GBP (British Pound)");
                break;
            default:
                System.out.println("Currency information not available for " + country);
        }
    }
}

public class MoneyConvert {
    public static void main(String[] args) {
        CurrencyConversion conversion = new CurrencyConversion();
        conversion.moneyConversion(100, 0.75); 
        conversion.countryCurrency("USA");  
        conversion.countryCurrency("India"); 
    }
}
