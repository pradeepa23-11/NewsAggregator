package sample;

import java.util.*;

public class NewsService {

    private List<Source> sources = new ArrayList<>();

    private List<Article> articles = new ArrayList<>();

    public void addSource(Source s) { sources.add(s); }

    public void removeSource(Source s) { sources.remove(s); 
    public void listSources() {

        for (Source s : sources) {
            s.displaySource();

        }
    }
    public void fetchArticles() {
        articles.clear();
        int id = 1;

        for (Source s : sources) {

            for (int i = 1; i <= 2; i++) {
                articles.add(new Article(id++, s.getCategory() + " News " + i, s.getCategory(),

                                         s.getName(), LocalDateTime.now().minusHours(i)));
            }
        }
    }
    public List<Article> filter(String category) {

        List<Article> result = new ArrayList<>();

        for (Article a : articles) {

            if (a.getCategory().equalsIgnoreCase(category)) {

                result.add(a);
            }
        }
        return result;
    }

    public List<Article> filter(LocalDateTime start, LocalDateTime end) {

        List<Article> result = new ArrayList<>();

        for (Article a : articles) {

            if (a.getPublishTime().isAfter(start) && a.getPublishTime().isBefore(end)) {

                result.add(a);
            }
        }
        return result;
    }
    public List<Article> filterByKeyword(String keyword) {

        List<Article> result = new ArrayList<>();
        for (Article a : articles) {
            if (a.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
          result.add(a);

            }
        }
        return result;
    }
    public void deliverDigest(List<Subscriber> subscribers) {

        for (Subscriber s : subscribers) {
            s.buildDigest(articles);
        }
    }
}
