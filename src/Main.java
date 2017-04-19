import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Tetragono t1=new Tetragono(5);
        Orthogonio o1=new Orthogonio(10,20);
        Trapezio tr1 =new Trapezio(10.0,5.0,20.0);
        Cyclos c1= new  Cyclos(10.0);

        String[] sximata =new String[4];

        sximata[0]=t1.toString();
        sximata[1]=o1.toString();
        sximata[2]=tr1.toString();
        sximata[3]=c1.toString();


        for (int i = 0; i < sximata.length; i++) {
            String s = sximata[i];

            System.out.println(s);

        }


        System.out.println("............................................b");

        ArrayList<Shape> shapes = new ArrayList<>();
        Shape s1=t1;
        shapes.add(s1);
        Shape s2=o1;
        shapes.add(s2);
        Shape  s3=tr1;
        shapes.add(s3);
        Shape s4=c1;
        shapes.add(s4);
        for (Shape s: shapes
             ) {
            System.out.println("Sxima  emvado "+s.computeEmvado()+ "\n");
        }


    }
}
