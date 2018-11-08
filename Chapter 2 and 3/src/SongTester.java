import java.util.ArrayList;

public class SongTester {

	public static void main(String[] args) {
		
		ArrayList<Note> notes = new ArrayList<Note>();
		
		
		notes.add(new Note(2, 56, 100));
		notes.add(new Note(2, 58, 100));
		notes.add(new Note(1.5, 60, 100));
		
		Song mySong = new Song("Daydreams", "Eb", 2.35, notes, 150);
		System.out.println(mySong);
		mySong.playSong();
		
	}
	
}
