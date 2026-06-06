package exersices.chapter_10;

public class Tax {
    /**
     *  Write a test program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
     *  income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
     *  The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
     *  are shown in Table 10.1.
     */
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int SINGLE_HEAD_OF_HOUSEHOLDFILER = 3;

    private int filingStatus;

    // Store the tax brackets for each filing status 
    private int[][] brackets;

    // Stores the tax rates for each bracket
    private double[] rates;

    // Stores teh taxable income
    private double taxableIncome;

    public Tax()
    {
        this.filingStatus = SINGLE_FILER;

        this.brackets = new int[][] {
            {8350, 33950, 82250, 171550, 372950},  // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly // -or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475},  // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
        };  

        rates = new double[] {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) 
    {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax()
    {

        if (this.filingStatus > 3) {
            throw new IllegalArgumentException("Filing status must be less than 3");
        }

        if (this.filingStatus < 0) {
            throw new IllegalArgumentException("Filing status can not be negative");
        }

        double tax = 0.0;

        tax = brackets[filingStatus][0] * rates[0];

        for (int j = 1; j < brackets[filingStatus].length; j++) {
            tax += (brackets[filingStatus][j] - brackets[filingStatus][j - 1]) * rates[j];
        }

        tax += (taxableIncome - brackets[filingStatus][brackets[filingStatus].length - 1]) * rates[rates.length - 1];

        return tax;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxbaleIncome() {
        return taxableIncome;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxbleIncome(double taxbleIncome) {
        this.taxableIncome = taxbleIncome;
    }

    public static void main(String[] args) {
        IO.println("(0-single filer, 1-married jointly or qualifying widow(er),\n" + //
                        "2-married separately, 3-head of household)");

        int filingStatus      = Integer.parseInt(IO.readln("Enter the filing status: "));
        double taxableIncome  = Double.parseDouble(IO.readln("Enter the taxable income: "));
        
        Tax taxCalc = new Tax();

        taxCalc.setFilingStatus(filingStatus);
        taxCalc.setTaxbleIncome(taxableIncome);

        System.out.println("Tax of " + taxCalc.getTaxbaleIncome() + "$ = " + taxCalc.getTax() + "$");
    }
}
