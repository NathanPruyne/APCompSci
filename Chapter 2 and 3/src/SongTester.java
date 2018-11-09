import java.util.ArrayList;

public class SongTester {

	public static void main(String[] args) {
		
		ArrayList<Note> notes = new ArrayList<Note>();
		
		
		/* notes.add(new Note(2, 60, 30));
		notes.add(new Note(2, 62, 40));
		notes.add(new Note(2, 64, 50));
		notes.add(new Note(2, 65, 60));
		notes.add(new Note(2, 67, 70));
		notes.add(new Note(2, 69, 80));
		notes.add(new Note(2, 71, 90));
		notes.add(new Note(2, 72, 100));
		
		Song mySong = new Song("Scale", "C", 2.35, notes, 100); */
		
		int C = 60;
		int D = 62;
		int E = 64;
		int F = 65;
		int G = 67;
		int vol = 80;
		
		notes.add(new Note(1, E, vol));
		notes.add(new Note(1, E, vol));
		notes.add(new Note(1, F, vol));
		notes.add(new Note(1, G, vol));
		notes.add(new Note(1, G, vol));
		notes.add(new Note(1, F, vol));
		notes.add(new Note(1, E, vol));
		notes.add(new Note(1, D, vol));
		notes.add(new Note(1, C, vol));
		notes.add(new Note(1, C, vol));
		notes.add(new Note(1, D, vol));
		notes.add(new Note(1, E, vol));
		notes.add(new Note(1.5, E, vol));
		notes.add(new Note(0.5, D, vol));
		notes.add(new Note(2, D, vol));
		notes.add(new Note(1, E, vol));
		notes.add(new Note(1, E, vol));
		notes.add(new Note(1, F, vol));
		notes.add(new Note(1, G, vol));
		notes.add(new Note(1, G, vol));
		notes.add(new Note(1, F, vol));
		notes.add(new Note(1, E, vol));
		notes.add(new Note(1, D, vol));
		notes.add(new Note(1, C, vol));
		notes.add(new Note(1, C, vol));
		notes.add(new Note(1, D, vol));
		notes.add(new Note(1, E, vol));
		notes.add(new Note(1.5, D, vol));
		notes.add(new Note(0.5, C, vol));
		notes.add(new Note(2, C, vol));
		
		Song mySong = new Song("Ode to Joy", "C", 8, notes, 120);
		
		System.out.println(mySong);
		mySong.playSong();
		
	}
	
}
