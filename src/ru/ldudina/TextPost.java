package ru.ldudina;

public class TextPost extends AbstractSocialNetworkPost implements Printable {
   //private String author; //эти поля наследуются из класса SocialNetworkPost
   //private String data;
   //private String messageText;
    // ...
   private int fontSize; // размер шрифта

   public TextPost(String author, String data, String messageText, Message message, int fontSize) {
       super (author, data, messageText, message);
       //this.author = author;
       //this.data = data;
       //this.message = message;
       this.fontSize = fontSize;
   }

    public int getFontSize () { return fontSize;}

    @Override
    public String getSize() {
        return "0,1 MБ";
    }

    @Override
    public void print() {
        System.out.println("я печатаю текст");
    }
}
