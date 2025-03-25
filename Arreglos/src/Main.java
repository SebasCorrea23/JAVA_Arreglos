import javax.swing.*;
import java.lang.reflect.Array;

public class Main {


    public static void main(String[] args) {
        String asistentes[];
        asistentes=new String[3];

        String busqueda=JOptionPane.showInputDialog("A quien desea buscar?");

        int encuentra=0;
        for (int i = 0; i < asistentes.length; i++) {
            if(asistentes[i].equalsIgnoreCase(busqueda)) {
                System.out.println(busqueda + " es el asistente: " + (i+1));
                encuentra=1;
                break;
            }
        }

        if (encuentra==0){
            System.out.println("No esta en esta posicion");
        }











    }
}