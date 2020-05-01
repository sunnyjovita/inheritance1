public class Shape {
    private String color;
    private boolean filled;

    // default constructor
    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    // constructor with arguments
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }


    // a getter for boolean variable
    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filleds){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of " + getColor() + " and " + isFilled();
    }
}
