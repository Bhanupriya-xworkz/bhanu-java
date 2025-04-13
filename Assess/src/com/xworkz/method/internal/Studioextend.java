package com.xworkz.method.internal;

}public class Studio extends Sound {
    public void producer() {
        System.out.println("The producer is working in the studio.");
    }
    public void Dbc(Sound sound) {
        sound.play();
        sound.record();
        sound.pause();
        sound.stop();
        sound.mix();

        if (sound instanceof Studio) {
            Studio studio = (Studio) sound;
            System.out.println("This is a Studio instance of Sound.");
            studio.producer();
        }
    }
}

