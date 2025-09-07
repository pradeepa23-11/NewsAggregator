package sample;

import java.time.LocalDateTime;

public class Article {

    private int articleId;

    private String title;

    private String category;

    private String publisher;

    private LocalDateTime publishTime;



    public Article(int articleId, String title, String category, String publisher, LocalDateTime publishTime) {

        this.articleId = articleId;
        this.title = title;
        this.category = category;
        this.publisher = publisher;
        this.publishTime = publishTime;
    }
    public int getArticleId() { return articleId; }

    public String getTitle() { return title; }

    public String getCategory() { return category; }

    public String getPublisher() { return publisher; }

    public LocalDateTime getPublishTime() { return publishTime; }

    public void displayArticle() {

        System.out.println("[" + category + "] " + title + " - " + publisher + " @ " + publishTime);

    }

}
