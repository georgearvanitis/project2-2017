/**
 * Created by User on 4/19/2017.
 */
public class Trapezio extends Shape {
    private  double  basi_mikri;
    private  double  basi_megali;
    private  double  height;

    public Trapezio(String description,double basi_mikri, double basi_megali, double height) {
        super(description);
        this.basi_mikri = basi_mikri;
        this.basi_megali = basi_megali;
        this.height = height;
    }

    public double getBasi_mikri() {
        return basi_mikri;
    }

    public void setBasi_mikri(double basi_mikri) {
        this.basi_mikri = basi_mikri;
    }

    public double getBasi_megali() {
        return basi_megali;
    }

    public void setBasi_megali(double basi_megali) {
        this.basi_megali = basi_megali;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  getDescription() +
                " \n basi_mikri=" + basi_mikri +
                " \n basi_megali=" + basi_megali +
                " \n height=" + height +
                " \n emavado= " +computeEmvado()+
                "\n....................\n";
    }

    public double computeEmvado() {
       double result=0;
        result=(getBasi_megali()+getBasi_mikri())*getHeight()/2;

        return  result;
    }
}
