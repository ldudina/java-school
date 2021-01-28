package ru.ldudina.inheritance;

import java.util.Date;

public class TextRecord extends AbstractRecord implements Print {
    private int fontSize; // размер шрифта

    public TextRecord(String autor, Date date, String message, int fontSize, MessageText MessageText) {
        super(autor, date, message, MessageText);
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }


    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String getContent() {
        final String baseContent = super.getContent();
        return baseContent + ", fontSize: " + fontSize;
    }

    public String maxRecordSize() {
        return "2MБ";
    }

    @Override
    public void print() {
        System.out.println("Распечатать текст");
    }

}