package sample;

import java.util.*;

public class NewsAppMain {

    public static void main(String[] args) {

        NewsService service = new NewsService();



        // Add sources

        service.addSource(new Source(1, "TechCrunch", "Tech", 4.5));

        service.addSource(new Source(2, "PlayZone", "Sports", 4.2));

        System.out.println(" ");



        System.out.println(" WELCOME TO PERSONAL NEWS HUB ");



        System.out.println(" ");



        System.out.println("We have added a few trusted news sources for you:");

        System.out.println(" ");

        service.listSources();



        // Fetch simulated articles

        service.fetchArticles();



        // Add subscribers

        List<Subscriber> subscribers = new ArrayList<>();

        subscribers.add(new FreeSubscriber(101, "Pradeepa", "pradeepa@mail.com", Arrays.asList("Tech")));

        subscribers.add(new PaidSubscriber(102, "Harsha", "harsha@mail.com", Arrays.asList("Tech", "Sports")));



        System.out.println("\nYour personalized digests are ready:");

        service.deliverDigest(subscribers);



        System.out.println("\nThank you for using the news app!");

    }

}

