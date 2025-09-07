
package sample;
public class Source {

    private int sourceId;
    private String name;
    private String category;
    private double trustScore;



    public Source(int sourceId, String name, String category, double trustScore) {

        this.sourceId = sourceId;
        this.name = name;
        this.category = category;
        this.trustScore = trustScore;
    }
    public int getSourceId() { return sourceId; }

    public String getName() { return name; }

    public String getCategory() { return category; }

    public double getTrustScore() { return trustScore; }

    public void setTrustScore(double trustScore) { this.trustScore = trustScore; }

    public void displaySource() {

        System.out.println("Source: " + name + " , Category: " + category + " ,Trust Score: " + trustScore);

    }

}
