public class ScentedCandle extends Candle {
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String s) {
        scent = s;
    }

    @Override
    public void setHeight(int h) {
        super.setHeight(h);
        final int PER_INCH = 3;
        super.setHeight(h);
        price = h * PER_INCH;
    }
}
