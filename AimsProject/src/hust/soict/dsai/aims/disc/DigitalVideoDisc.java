package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc {
public String title;
public String category;
public String director;
public int length;
public float cost;
private static int nbDigitalVideoDics = 0;
protected int id;

public String getTitle() {
	return title;
}
public String getCategory() {
	return category;
}
public String getDirector() {
	return director;
}
public int getLength() {
	return length;
}
public float getCost() {
	return cost;
}


public DigitalVideoDisc(String title) {
	super();
	this.title = title;
}



public void setTitle(String title) {
	this.title = title;
}
public void setCategory(String category) {
	this.category = category;
}
public void setDirector(String director) {
	this.director = director;
}
public void setLength(int length) {
	this.length = length;
}
public void setCost(float cost) {
	this.cost = cost;
}
public DigitalVideoDisc(String title, String category, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.cost = cost;
}
public DigitalVideoDisc(String title, String category, String director, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.director = director;
	this.cost = cost;
}
public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	super();
	this.title = title;
	this.category = category;
	this.director = director;
	this.length = length;
	this.cost = cost;
}

public void getDetail(DigitalVideoDisc disc)
{
	System.out.println("Title: "+ disc.getTitle()+ "\tCategory: "+ disc.getCategory()+ "\tDirector: "+ disc.getDirector()+ "\tLength: "+ disc.getLength());
	}
}


