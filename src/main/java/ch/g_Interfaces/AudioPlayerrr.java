package ch.g_Interfaces;

//Interface with a variable
interface Playable {
	int MAX_VOLUME = 100; // Constant variable (implicitly public, static, and final)

	void play();

	void stop();
}

//Sub-interface extending Playable
interface AudioPlayer1 extends Playable {
	void adjustVolume(int volume);
}

//Class implementing AudioPlayer
class BasicAudioPlayer implements AudioPlayer1 {
	private int currentVolume;

	@Override
	public void play() {
		System.out.println("Playing audio...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping audio...");
	}

	@Override
	public void adjustVolume(int volume) {
		if (volume >= 0 && volume <= MAX_VOLUME) {
			currentVolume = volume;
			System.out.println("Volume adjusted to " + currentVolume);
		} else {
			System.out.println("Invalid volume level");
		}
	}

	public void currentSong(String song) {
		System.out.println(song);
	}
}

public class AudioPlayerrr {
	public static void main(String[] args) {
		BasicAudioPlayer player = new BasicAudioPlayer();
		AudioPlayer1 player2 = new BasicAudioPlayer();
		player.play();
		player.adjustVolume(75);
		player.stop();
		player.currentSong("My heart will go on......:Titanic");

		player2.play();
		player2.adjustVolume(90);
		player2.stop();
	}
}
