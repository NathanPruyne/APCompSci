import java.util.ArrayList;

import javax.sound.midi.*;


public class Song {

	private String myName;
	private String myKey;
	private double myLength;
	private ArrayList<Note> myNotes = new ArrayList<Note>();
	private int myBpm;
	
	public Song(String name, String key, double length, int bpm) {
		myName = name;
		myKey = key;
		myLength = length;
		myBpm = bpm;
	}
	
	public Song(String name, String key, double length, ArrayList<Note> notes, int bpm) {
		myName = name;
		myKey = key;
		myLength = length;
		myNotes = notes;
		myBpm = bpm;
	}
	
	public String toString() {
		return myName + ": a song in " + myKey + " with bpm " + myBpm + " and length " + myLength;
	}
	
	public String getName() {
		return myName;
	}

	public void setName(String n) {
		myName = n;
	}

	public String getKey() {
		return myKey;
	}
	
	public void setKey(String k) {
		myKey = k;
	}

	public double getLength() {
		return myLength;
	}

	public void setLength(double l) {
		myLength = l;
	}

	public int getBpm() {
		return myBpm;
	}

	public void setBpm(int b) {
		myBpm = b;
	}

	public ArrayList<Note> getNotes() {
		return myNotes;
	}

	public void setNotes(ArrayList<Note> n) {
		myNotes = n;
	}

	public Note getNote(int pos) {
		return myNotes.get(pos);
	}
	
	public void changeNote(int pos, Note newNote) {
		myNotes.set(pos, newNote);
	}
	
	public void addNote(Note n) {
		myNotes.add(n);
	}
	
	public void removeNote(int pos) {
		myNotes.remove(pos);
	}
	
	public void playSong() {
		
		try {
			Synthesizer synth = MidiSystem.getSynthesizer();
			synth.open();
			
			Instrument[] instr = synth.getAvailableInstruments();
			MidiChannel[] mChannels = synth.getChannels();
			
			synth.loadInstrument(instr[0]);
			for (Note note : myNotes) {
				mChannels[0].noteOn(note.getPitch(), note.getVolume());
				try {
					Thread.sleep((long) (note.getLength() / myBpm * 60000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				mChannels[0].noteOff(note.getPitch());
			}
			
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
