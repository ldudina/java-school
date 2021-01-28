package ru.ldudina.inheritance;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        final TextRecord textRecord = new TextRecord(null, new Date(), "New Song", 10, AbstractRecord.MessageText.RECORD);
        final Media media = new Media("It's not a Song", null, "today", AbstractRecord.MessageText.REPOST, true) {
            @Override
            public void play() {

            }
        };
        final Picture picture = new Picture("Malevitch", new Date(), "black square", AbstractRecord.MessageText.COMMENT, false, true);
        final Audio audio = new Audio("It's a popular Song", null, "DJ Smash", AbstractRecord.MessageText.RECORD, true, Audio.AudioFormat.MP3);


        final AbstractRecord [] socialNetwork = {textRecord, media, picture, audio};
        for (final AbstractRecord s : socialNetwork) {
            System.out.println(s.getContent());
        }
    }
}
