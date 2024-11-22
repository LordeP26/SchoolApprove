package entities;

public class Student {
	
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double finalNote() {
		return (note1) + (note2) + (note3);
	}
	public double failedNote() {
		return 60.00 - finalNote();
	}

}
