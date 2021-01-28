package ru.ldudina;

abstract class AbstractSocialNetworkPost {

    private String author;
    private String date;
    private String messageText;
    private Message message;

    public AbstractSocialNetworkPost(String writer, String date, String messageText, Message message) {
        author = writer;
        setDate(date);
        this.messageText = messageText;
        this.message = message;
    }

    public abstract String getSize();

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public Message getMessage() {
        return message;
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
