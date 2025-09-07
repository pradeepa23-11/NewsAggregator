package sample;
import java.util.List;
public class Subscriber {

    private int userId; 

    private String fullName;

    private String emailAddr;

    private List<String> prefs; 
    protected String subscriptionPlan; 

    public Subscriber(int id, String name, String email, List<String> preferences, String plan) {

        this.userId = id;

        this.fullName = name;

        this.emailAddr = email;

        this.prefs = preferences;

        this.subscriptionPlan = plan;

    }
    public int getId() {
        return userId;

    }
    public String getName() {

        return fullName;

    }
    public String getEmail() {

        return emailAddr;

    }



    public List<String> getPreferences() {
        return prefs;

    }
    public String getPlan() {

        return subscriptionPlan;
    }

    public void setName(String n) { 
        this.fullName = n; 

    }
    public void setEmail(String e) { 
        this.emailAddr = e; 
   }
    public void setPreferences(List<String> preferences) {

        this.prefs = preferences;
    }
    public void setPlan(String p) {

        this.subscriptionPlan = p;
    }
    public void showInfo() {

        String details = "Subscriber: " + fullName + " , Plan: " + subscriptionPlan + 

           " , Preferences: " + prefs;

        System.out.println(details);

    }
    public void buildDigest(List<Article> articles) {

        System.out.println("General digest for " + fullName);

        for (Article art : articles) {

            System.out.println(" - " + art.getTitle());

        }

    }


}
