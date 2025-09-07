package sample;

import java.util.List;

public class FreeSubscriber extends Subscriber {

    private static final int FREE_LIMIT = 2;
    public FreeSubscriber(int id, String name, String email, List<String> preferences) {
    super(id, name, email, preferences, "Free");

    }
    @Override

    public void buildDigest(List<Article> articles) {

        System.out.println("\nDaily Free Digest for " + getName() + ":");

        int count = 0;

        for (Article a : articles) {

            if (getPreferences().contains(a.getCategory())) {

                System.out.println(" - " + a.getTitle());

                count++;

                if (count >= FREE_LIMIT) break;
            }
        }
        if (count == 0) {

            System.out.println(" No matching articles today.");

        } else {

            System.out.println(" Upgrade to Paid for more stories");

        }

    }

}
