package ru.ldudina.inheritance;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        final TextRecord textRecord = new TextRecord(null, new Date(), "New Song", 10, MessageText.RECORD);
        final Media media = new Media("It's not a Song", null, "today", MessageText.REPOST, true);
        final Picture picture = new Picture("Malevitch", new Date(), "black square", MessageText.COMMENT, false, true);
        final Audio audio = new Audio("It's a popular Song", null, "DJ Smash", MessageText.RECORD, true, AudioFormat.MP3);


        final AbstractRecord[] socialNetwork = {textRecord, media, picture, audio};
        for (final AbstractRecord s : socialNetwork) {
            System.out.println(s.getContent());
        }
    }
}
