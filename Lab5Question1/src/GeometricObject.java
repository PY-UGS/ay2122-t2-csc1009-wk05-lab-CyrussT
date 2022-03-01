import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated;

    public GeometricObject() {
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString() {
        return "created on " + this.dateCreated.toString() + "\ncolor: " + this.color + " and filled: " + this.filled;
    }

}