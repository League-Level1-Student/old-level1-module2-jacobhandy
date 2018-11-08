
public class Minion {
private String Name;
private int Eyes;
private String Color;
private String Master;
private String name;
private int eyes;
private String color;
private String master;

Minion(String Name, int Eyes, String Color, String Master){

	
	this.setName(Name);
	Eyes = this.Eyes;
	Color = this.Color;
	Master = this.Master;

}
public void setName(String name) {
	  Name = this.name;
 }
 String getName() {
	 return Name;
 }

 public void setEyes(int eyes) {
	 Eyes = this.eyes;
 }

int getEyes() {
	return Eyes;
}

public void setColor(String color) {
	Color = this.color;
	}

String getColor() {
	return Color;
}

public void setMaster(String master) {
	Master = this.master;
}


String getMaster() {
	return Master;
}












}
