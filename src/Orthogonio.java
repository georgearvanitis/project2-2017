/**
 * Created by User on 4/19/2017.
 */
public class Orthogonio extends Shape {

    private  double mikos;
    private double platos;

    public Orthogonio(String description,double mikos, double platos) {
        super(description);
        this.mikos = mikos;
        this.platos = platos;
    }

    public double getMikos() {
        return mikos;
    }

    public void setMikos(double mikos) {
        this.mikos = mikos;
    }

    public double getPlatos() {
        return platos;
    }

    @Override
    public String  toString() {
        return getDescription() +
                " \n mikos= " + mikos +
                "\n platos=" + platos +
                "\n emavado= " +computeEmvado()+
                "\n....................\n";
    }

    public void setPlatos(double platos) {
        this.platos = platos;
    }

    public double computeEmvado(){

        double result =0;
        result=getMikos()*getPlatos();
        return  result;

    }
}
