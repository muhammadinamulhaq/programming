public class Bed {
    private String style;
    private int pillars;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillars, int height, int sheets, int quilt){
        this.style = style;
        this.pillars = pillars;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("Bed-> Making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillars() {
        return pillars;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
