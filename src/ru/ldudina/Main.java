package ru.ldudina;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        AbstractSocialNetworkPost post1 = new TextPost("Lilia", "сегодня", "сообщение 1", AbstractSocialNetworkPost.Message.REPOST, 10);
        AbstractSocialNetworkPost post2 = new PicturePost("Lilia", LocalDate.now().toString(), "сообщение 2", AbstractSocialNetworkPost.Message.COMMENT, true, false);

        Stream.of(post1, post2).forEach(AbstractSocialNetworkPost::printState);
        post1.printState();
        post2.printState();
    }
}
