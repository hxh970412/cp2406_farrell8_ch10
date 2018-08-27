public class Candle {
    private int height;
    protected int price;
    private String color;

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getPrice() {
        return price;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void setHeight(int h)
    {
        final int PER_INCH = 2;
        height = h;
        price = height * PER_INCH;
    }

}
