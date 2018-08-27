public class ItemSold {
    private int invoiceNumber;
    private double price;
    private String description;

    public double getPrice() {
        return price;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        description = d;
    }
    public void setInvoiceNumber(int iN){
        invoiceNumber = iN;
    }
    public void setPrice(double p)
    {
        price = p;
    }
}
