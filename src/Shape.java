/**
 * Created by User on 4/19/2017.
 */
public abstract class Shape extends DescriptorOfShapes {

    public Shape(String description) {
        super(description);
    }

    public Shape() {
    }



    public abstract double computeEmvado();
    public abstract String toString();
}
