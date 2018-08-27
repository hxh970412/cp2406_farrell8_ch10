public class DemoCandles {
    public static void main(String[] args)
    {
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();
        candle.setHeight(10);
        candle.setColor("Black");
        scentedCandle.setHeight(15);
        scentedCandle.setColor("White");
        scentedCandle.setScent("gardinal");
        System.out.println("The " + candle.getHeight() + " inch " + candle.getColor() + "candle cost $" +
                candle.getPrice());
        System.out.println("The " + scentedCandle.getHeight() + " inch " + scentedCandle.getScent() + " " +
                scentedCandle.getColor() + " candle cost $" + scentedCandle.getPrice());
    }
}
