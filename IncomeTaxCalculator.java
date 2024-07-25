public class IncomeTaxCalculator {

    public static double calculateIncomeTax(double income, boolean isFemale) {
        double tax = 0;

        if (isFemale) {
            if (income <= 190000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = (income - 190000) * 0.1;
            } else if (income <= 800000) {
                tax = (310000 * 0.1) + (income - 500000) * 0.2;
            } else {
                tax = (310000 * 0.1) + (300000 * 0.2) + (income - 800000) * 0.3;
            }
        } else { // for general category
            if (income <= 180000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = (income - 180000) * 0.1;
            } else if (income <= 800000) {
                tax = (320000 * 0.1) + (income - 500000) * 0.2;
            } else {
                tax = (320000 * 0.1) + (300000 * 0.2) + (income - 800000) * 0.3;
            }
        }

        return tax;
    }

    public static void main(String[] args) {
        double income = 600000;
        boolean isFemale = false;

        double taxAmount = calculateIncomeTax(income, isFemale);
        System.out.println("Income Tax: " + taxAmount);
    }
}