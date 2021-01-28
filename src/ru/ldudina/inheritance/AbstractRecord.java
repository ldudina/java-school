package ru.ldudina.inheritance;

import java.util.Date;

public abstract class AbstractRecord {
    private final String autor;
    private final Date date;
    private final String message;
    private final MessageText messageText;

    public AbstractRecord(String autor, Date date, String message, MessageText messageText) {
        this.autor = autor;
        this.date = date;
        this.message = message;
        this.messageText = messageText;
        }

    public String getAutor() {return autor;}
    public Date getDate() {return date;}
    public String getMessage() {return message;}
    public MessageText getMessageText() {return messageText;}

    public String getContent() {
       return String.format("autor: %s, date: %s, message: %s, MessageText: %s", autor, date, message, messageText);
    }

    public abstract String maxRecordSize();

    enum MessageText {
    RECORD, REPOST, COMMENT;
    }

    public void print() {
        System.out.println(autor + " " + date + " " + message);
    }

    public void play() {
        System.out.println(autor + " " + date + " " + message);
    }

}

