import java.util.ArrayList;

public class Thanksgiving {

	public static void main(String[] args) {
		FaceComponent.generate();
		
		Song thanksgivingTheme = new Song("Thanksgiving Theme", "C", 8, 140);
		
		ArrayList<Note> notes = new ArrayList<Note>();
		
		int vol = 80;
		
		notes.add(new Note(0.5, 52, vol));
		notes.add(new Note(0.5, 55, vol));
		notes.add(new Note(0.5, 60, vol));
		notes.add(new Note(0.5, 57, vol));
		notes.add(new Note(0.5, 60, vol));
		notes.add(new Note(0.5, 65, vol));
		notes.add(new Note(0.5, 59, vol));
		notes.add(new Note(0.5, 62, vol));
		notes.add(new Note(2, 67, vol));
		notes.add(new Note(0.5, 60, vol));
		notes.add(new Note(0.5, 64, vol));
		notes.add(new Note(0.5, 68, vol));
		notes.add(new Note(0.5, 62, vol));
		notes.add(new Note(0.5, 65, vol));
		notes.add(new Note(0.5, 70, vol));
		notes.add(new Note(3, 67, vol));
		notes.add(new Note(0.5, 74, vol));
		notes.add(new Note(0.5, 70, vol));
		notes.add(new Note(0.5, 65, vol));
		notes.add(new Note(0.5, 67, vol));
		notes.add(new Note(0.5, 63, vol));
		notes.add(new Note(0.5, 58, vol));
		notes.add(new Note(0.5, 72, vol));
		notes.add(new Note(0.5, 68, vol));
		notes.add(new Note(2, 63, vol));
		notes.add(new Note(0.5, 65, vol));
		notes.add(new Note(0.5, 61, vol));
		notes.add(new Note(0.5, 56, vol));
		notes.add(new Note(0.5, 53, vol));
		notes.add(new Note(0.5, 60, vol));
		notes.add(new Note(0.5, 59, vol));
		notes.add(new Note(3, 60, vol));
		
		thanksgivingTheme.setNotes(notes);
		thanksgivingTheme.playSong();
		
	}
	
}
