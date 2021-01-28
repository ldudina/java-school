package ru.ldudina.inheritance;

import java.util.Date;

public class Picture extends Media implements Print{
    private boolean colored;

    public Picture(String autor, Date date, String message, MessageText MessageText, boolean radio, boolean colored) {
        super(autor, date, message, MessageText, radio);
        this.colored = colored;
    }


    public boolean isColored() {
        return colored;
    }

    @Override
    public String getContent() {
        final String baseContent = super.getContent();
        return baseContent + ", fontSize: " + colored;
    }

    @Override
    public String maxRecordSize() {
        return "1МБ";
    }

    @Override
    public void print() {
        System.out.println("Распечатать изображение");
    }

}
