
public class SilenceTv {

	int volume = 0;
	boolean mute = false;
	int preVolume = 0;

	void muteButton() {
		mute = !mute;

		if (mute == true) {
			preVolume = volume;
			volume = 0;
		} else {
			volume = preVolume;
		}
	}
}
