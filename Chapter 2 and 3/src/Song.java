import java.util.ArrayList;


public class Song {

	private String name;
	private String key;
	private double length;
	private ArrayList<Note> notes = new ArrayList<Note>();
	private int bpm;
	
	public Song(String n, String k, double l, int b) {
		name = n;
		key = k;
		length = l;
		bpm = b;
	}
	
	public Song(String n, String k, double l, ArrayList<Note> noteList, int b) {
		name = n;
		key = k;
		length = l;
		notes = noteList;
		bpm = b;
	}
	
	public String toString() {
		return name + ": a song in " + key + " with bpm " + bpm + " and length " + length;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getKey() {
		return key;
	}
	
	public void setKey(String k) {
		key = k;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double l) {
		length = l;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int b) {
		bpm = b;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> n) {
		notes = n;
	}

	public Note getNote(int pos) {
		return notes.get(pos);
	}
	
	public void changeNote(int pos, Note newNote) {
		notes.set(pos, newNote);
	}
	
	public void addNote(Note n) {
		notes.add(n);
	}
	
	public void removeNote(int pos) {
		notes.remove(pos);
	}
	
}
