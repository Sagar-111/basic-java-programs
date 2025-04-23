package ch.g_Interfaces;

public class MainApplication {
    public static void main(String[] args) {
        // Create an instance of AudioPlayer
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();

        // Create an instance of VideoPlayer
        MediaPlayer videoPlayer = new VedioPlayer();
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();
    }
}

