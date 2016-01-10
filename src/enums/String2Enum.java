package enums;

public class String2Enum {
    private enum Currency {USD, EUR, GPD}

    public static void main(String[] args) {
        String usd = "USD";

        Enum currency = Enum.valueOf(Currency.class, usd);
        System.out.println("1st way = " + currency);

        currency = Currency.valueOf(usd);
        System.out.println("2nd way = " + currency);

        /*String INR = "INR";
        Currency rupee = Currency.valueOf("INR");*/

    }
}
