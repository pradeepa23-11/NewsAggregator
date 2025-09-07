package sample;

import java.util.List;

public class PaidSubscriber extends Subscriber {
    public PaidSubscriber(int id, String name, String email, List<String> preferences) {
        super(id, name, email, preferences, "Paid");
    }
    @Override

    public void buildDigest(List<Article> articles) {

        System.out.println("\nPremium Digest for " + getName() + ":");

        boolean found = false;

        for (Article a : articles) {

            if (getPreferences().contains(a.getCategory())) {

                System.out.println(" - " + a.getTitle() + " (" + a.getPublisher() + ")");
                found = true;
            }
        }

        if (!found) {

            System.out.println(" No matching articles today.");
        }
    }
}
