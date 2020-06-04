package ru.ldudina;

public class PicturePost extends MediaPost implements Printable {
    private boolean multiColored;

    public PicturePost(String author, String data, String messageText, Message message, boolean magazine, boolean multiColored) {
        super(author, data, messageText, message, magazine);
        this.multiColored = multiColored;
    }

    public boolean isMultiColored() {return multiColored;}

    @Override
    public String getSize() {
        return "2 МБ";
    }

    @Override
    public void print() {
        System.out.println("я печатаю изображение");
    }
}
