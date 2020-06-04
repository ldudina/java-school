package ru.ldudina;

public abstract class MediaPost extends AbstractSocialNetworkPost {
    //private String author;
    // private String data;
    //private String message;
    private boolean magazine;

    public MediaPost(String author, String data, String messageText, Message message, boolean magazine) {
        super(author, data, messageText, message);
        //this.author = author;
        //this.data = data;
        //this.message = message;
        this.magazine = magazine;
    }

    public boolean isMagazine() {return magazine;}

    public abstract String getSize();
}
