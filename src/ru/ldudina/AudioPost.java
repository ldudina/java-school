package ru.ldudina;

public class AudioPost extends SocialNetworkPost implements Playable {



    public AudioPost(String writer, String date, String messageText, Message message) {
        super(writer, date, messageText, message);
    }

    @Override
    public void play() {
        System.out.println("Я воспроизвожу аудио");
    }

    @Override
    String getSize() {
        return "50 МБ";
    }
}
