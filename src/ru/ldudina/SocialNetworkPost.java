package ru.ldudina;

public abstract class SocialNetworkPost {

    private String author;
    private String date;
    private String messageText;
    private Message message;

    public SocialNetworkPost(String writer, String date, String messageText, Message message) {
        author = writer;
        setDate(date);
        this.messageText = messageText;
        this.message = message;
    }

    abstract String getSize();

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public Message getMessage() {
        return message;
    }

    public void printState() {
        System.out.println(author + " " + date + " " + message);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    enum Message {
        RECORD, REPOST, COMMENT;
    }
}
