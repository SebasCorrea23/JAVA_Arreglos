import javax.swing.*;

public class Ejercicio1 {

    public static void main(String [] args){
        int cantidadEstudiantes=Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes desea ingresar"));

        int edades[];
        edades=new int[cantidadEstudiantes];

        double notas[];
        notas=new double[cantidadEstudiantes];

        String materias[];
        materias=new String[cantidadEstudiantes];

        String estudiantes[];
        estudiantes=new String[cantidadEstudiantes];

        double totalNotas=0, promedio=0;
        int totalEdades=0, promedioEdades=0;

        for( int i = 0;i<estudiantes.length; i++){
            estudiantes[i]= JOptionPane.showInputDialog("ingrese el estudiante "+(i+1));
            System.out.println(estudiantes[i]);
        }

        System.out.println("**********************\n\n**********************");

        for( int i = 0;i<materias.length; i++){
            materias[i]= JOptionPane.showInputDialog("ingrese la materia del estudiante "+ estudiantes[i]);
            System.out.println(materias[i]);
        }

        System.out.println("**********************\n");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0 && notas[i] <= 5) {
                notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota de " + materias[i] + " del estudiante " + estudiantes[i]));
                System.out.println(notas[i]);
                totalNotas += notas[i];
            }else
                JOptionPane.showMessageDialog(null, "Ingrese una nota valida de 0 a 5");
        }

        System.out.println("**********************\n");

        for (int i = 0; i < edades.length; i++) {
            edades[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "\"ingrese la edad del estudiante " + estudiantes[i]));
            System.out.println(edades[i]);
            totalEdades*=edades[i];
        }

        System.out.println("**********************\n");
        System.out.println("La suma total de las notas es: " + totalNotas);

        promedio=totalNotas/3;
        promedioEdades=totalEdades/3;

        System.out.println("El promedio de las notas es: "+ promedio);
        System.out.println("El promedio de las edades es: "+ promedioEdades);




    }
}
