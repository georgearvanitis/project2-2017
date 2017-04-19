/**
 * Created by User on 4/19/2017.
 */
public class Tetragono extends Shape {

    private  double plevra;

    public Tetragono(double plevra) {
        this.plevra = plevra;
    }

    public double getPlevra() {
        return plevra;
    }

    public void setPlevra(double plevra) {
        this.plevra = plevra;
    }

    @Override
    public String toString() {
        return "Tetragono{" +
                "\n plevra=" + plevra +
                "\n emavado= " +computeEmvado()+
                '}';
    }

    @Override
    public double computeEmvado(){
       double result=0;

        result=getPlevra()*getPlevra();
        return result;

    }
}
