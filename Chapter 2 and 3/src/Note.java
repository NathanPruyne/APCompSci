public class Note {

	private double myLength;
	private int myPitch;
	private int myVolume;
	
	public Note(double length, int pitch, int volume) {
		myLength = length;
		myPitch = pitch;
		myVolume = volume;
	}
	
	public double getLength() {
		return myLength;
	}
	
	public void setLength(double l) {
		myLength = l;
	}
	
	public int getPitch() {
		return myPitch;
	}
	
	public void setPitch(int p) {
		myPitch = p;
	}
	
	public int getVolume() {
		return myVolume;
	}
	
	public void setVolume(int v) {
		myVolume = v;
	}
	
}
