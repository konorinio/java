public class CurrencyConverter implements Converter {

    int amount;
    String currency;

    public CurrencyConverter(int amount, String posjka) {
        this.amount = amount;
    }

    @Override
    public double convertToEuro(double amount) {
        return amount * 4.3;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * 3.7;
    }

    @Override
    public String getConversionRate(String currency) {
        return currency;
    }
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(10, "USD");
        System.out.println(converter.convertToEuro(10));
        System.out.println(converter.convertToUSD(10));
        System.out.println(converter.getConversionRate(converter.getConversionRate("USD")));

    }
}
