package ru.ldudina.inheritance;

import java.util.Date;

public abstract class Media extends AbstractRecord {
    //private String author; //эти поля наследуются из класса AbstractRecord
    //private String data;
    //private String message;
    //private MessageFormat TypeOfMessage
    private boolean radio;


    public Media(String autor, Date date, String message, MessageText MessageText, boolean radio) {
        super(autor, date, message, MessageText);
        this.radio = radio;
    }

    public boolean isRadio() {
        return radio;
    }

    @Override
    public String getContent() {
        final String baseContent = super.getContent();
        return baseContent + ", radio: " + radio;
    }

    @Override
    public String maxRecordSize() {
        return null;
    }

    @Override
    public void print() {
        return;
    }

    @Override
    public abstract void play();
}
