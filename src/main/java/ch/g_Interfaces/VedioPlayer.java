package ch.g_Interfaces;

public class VedioPlayer implements MediaPlayer{

	@Override
	 public void play() {
		System.out.println("The Audio Player is Playing...");
	}

	@Override
	public void pause() {
		System.out.println("The Audio Player is Paused...");

	}

	@Override
	public void stop() {
		System.out.println("The Audio Player is Stoped...");

	}
}
