public abstract class Title {
    private String title;
    protected String literatureType;
    private static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }
,
    protected double calculateRoyalty(){
        return calculatePoints() * RATE;

    }

    protected abstract double calculatePoints();
    protected abstract double convertLiteratureType();


}
