public class Poem {
    private String title;
    private int lines;

    public int getLines() {
        return lines;
    }

    public String getTitle() {
        return title;
    }
    public Poem(String name, int numlines)
    {
        title = name;
        lines = numlines;
    }
}
