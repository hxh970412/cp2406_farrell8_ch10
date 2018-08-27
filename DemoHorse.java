public class DemoHorse {
    public static void main(String[] args)
    {
        Horse Fhorse = new Horse();
        RaceHorse Shorse = new RaceHorse();
        Fhorse.setName("FFF");
        Fhorse.setColor("black");
        Fhorse.setBirthYear(2011);
        Shorse.setName("GGG");
        Shorse.setColor("white");
        Shorse.setBirthYear(2009);
        Shorse.setRaces(5);
        System.out.println("The horse name is " + Fhorse.getName() + " is " + Fhorse.getColor() + " was born in "
        + Fhorse.getBirthYear() +". ");
        System.out.println("The house name is " + Shorse.getName() + " is " + Shorse.getColor() + " was born in "
        + Shorse.getBirthYear() + " and it is belong in " + Shorse.getRaces() + " races.");
    }
}
