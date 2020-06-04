package ru.ldudina;

public class AudioPost extends AbstractSocialNetworkPost implements Playable {



    public AudioPost(String writer, String date, String messageText, Message message) {
        super(writer, date, messageText, message);
    }

    @Override
    public void play() {
        System.out.println("Я воспроизвожу аудио");
    }

    @Override
    public String getSize() {
        return "50 МБ";
    }
}
