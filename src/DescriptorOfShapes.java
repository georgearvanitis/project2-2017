/**
 * Created by User on 4/20/2017.
 */
public abstract class DescriptorOfShapes {

    protected String description;

    public DescriptorOfShapes(String description) {
        this.description = description;
    }

    public DescriptorOfShapes() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "I am a geometric Shape \n " +
                "description='" + description + "\n" +
                '\n';
    }


}
