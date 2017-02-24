// Factory client code
public class Factory {
    public static void main(String args[]) {
        String country = args[0];
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getSymbol());
    }
}
