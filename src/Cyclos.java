/**
 * Created by User on 4/19/2017.
 */
public class Cyclos  extends Shape{
    private double aktina;

    public Cyclos(double aktina) {
        this.aktina=aktina;
    }

    public double getAktina() {
        return aktina;
    }

    public void setAktina(double aktina) {
        this.aktina = aktina;
    }

    @Override
    public double computeEmvado() {
        return  getAktina()*getAktina()*Math.PI;
    }

    @Override
    public String toString() {
        return "Cyclos{" +
                "\n aktina=" + aktina +
                "\n emavado= " +computeEmvado()+
                '}';
    }
}
