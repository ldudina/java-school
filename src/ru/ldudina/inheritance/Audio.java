package ru.ldudina.inheritance;

import java.util.Date;

public class Audio extends Media implements Play {
    private AudioFormat audioFormat;

    public Audio(String autor, Date date, String message, MessageText MessageText, boolean radio, AudioFormat audioFormat) {
        super(autor, date, message, MessageText, radio);
        this.audioFormat = audioFormat;
    }

    @Override
    public String maxRecordSize() {
        return "4МБ";
    }

    enum AudioFormat {
        CD, DVD, MP3;
    }

    @Override
    public void play() {
        System.out.println(("Воспроизвести аудио"));
    }
}
