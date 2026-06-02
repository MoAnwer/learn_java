package exersices.chapter_09;
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String s, String n)
    {
        symbol = s;
        name = n;
    }

    void setPreviousClosingPrice(double pcp)
    {
        this.previousClosingPrice = pcp;
    }

    void setCurrentPrice(double currentPrice)
    {
        this.currentPrice = currentPrice;
    }
    

    double getChangePercent() 
    {
        return this.previousClosingPrice - this.currentPrice;
    }

    public static void main(String[] args) {
        Stock s = new Stock("ORCL", "Oracle Corporation");
        s.setPreviousClosingPrice(34.5);
        s.setCurrentPrice(34.35);

        IO.println(" the price-change percentage = " + s.getChangePercent());
    }
}