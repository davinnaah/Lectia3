
public class Carte {
	private String name, genre;
	private int NumberOfChapters = 0;

public Carte(String name, String genre, int numberOfChapters) {

	this.name = name;
	this.genre = genre;
	NumberOfChapters = numberOfChapters;
}

public Carte(String name, String genre) {
	super();
	this.name = name;
	this.genre = genre;
}

@Override
public String toString() {
	return "Carte : " + name + " " + genre + " " + NumberOfChapters + " ";
}
public boolean equals(Carte c) {
	if((this.name.equals(c.name)) && (this.genre.equals(c.genre)))
		return true; 
	return false;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getNumberOfChapters() {
	return NumberOfChapters;
}
public void setNumberOfChapters(int NumberOfChapters) {
	this.NumberOfChapters = NumberOfChapters;
}
public void setNumberOfChapters(Carte c) {
	c.setNumberOfChapters(getNumberOfChapters());
}
}