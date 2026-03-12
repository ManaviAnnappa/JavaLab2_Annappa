import java.math.BigDecimal;

public class TaxCalculationAnnappa {

    public static void main(String[] args) {

        double netPriceAnnappa = 9.99;
        double vatRateAnnappa = 0.23;

        double grossPriceAnnappa = netPriceAnnappa * (1 + vatRateAnnappa);
        double totalGrossAnnappa = grossPriceAnnappa * 10000;
        double calculatedNetAnnappa = totalGrossAnnappa / (1 + vatRateAnnappa);

        System.out.println("Using double:");
        System.out.println("Gross price: " + grossPriceAnnappa);
        System.out.println("Total gross for 10000 products: " + totalGrossAnnappa);
        System.out.println("Calculated net again: " + calculatedNetAnnappa);


        BigDecimal net = new BigDecimal("9.99");
        BigDecimal vat = new BigDecimal("0.23");

        BigDecimal gross = net.multiply(BigDecimal.ONE.add(vat));
        BigDecimal totalGross = gross.multiply(new BigDecimal("10000"));
        BigDecimal calculatedNet = totalGross.divide(BigDecimal.ONE.add(vat));

        System.out.println("\nUsing BigDecimal:");
        System.out.println("Gross price: " + gross);
        System.out.println("Total gross: " + totalGross);
        System.out.println("Calculated net again: " + calculatedNet);

        System.out.println("\nConclusion: BigDecimal provides more precise results for financial calculations.");
    }
}