public class Square extends Rectangle{
    // default constructor with no argument
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);

    }

    public double getSide(){
        return getWidth();
        }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A square with side: " + getSide() + " which is a subclass of " + super.toString();
    }
}
