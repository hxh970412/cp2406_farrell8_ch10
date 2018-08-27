public class DemoRocks {
    public static void main(String[] args)
    {
        Rock r1 = new Rock(123, 4.5);
        IgneousRock r2 = new IgneousRock(234, 15.6);
        SedimentaryRock r3 = new SedimentaryRock(345, 19.6);
        MetamorphicRock r4 = new MetamorphicRock(456, 7.6);
        display(r1);
        display(r2);
        display(r3);
        display(r4);
    }
    public static void display(Rock r)
    {
        System.out.println("\nSample # " + r.getSampleNumber() + " weight " + r.getWeight());
        System.out.println("Description: " + r.getDescription());
    }
}
