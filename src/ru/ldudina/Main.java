package ru.ldudina;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        SocialNetworkPost post1 = new TextPost("Lilia", "сегодня", "сообщение 1", SocialNetworkPost.Message.REPOST, 10);
        SocialNetworkPost post2 = new PicturePost("Lilia", LocalDate.now().toString(), "сообщение 2", SocialNetworkPost.Message.COMMENT, true, false);

        Stream.of(post1, post2).forEach(SocialNetworkPost::printState);
        post1.printState();
        post2.printState();
    }
}
