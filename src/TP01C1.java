import javax.swing.*;
import java.text.DecimalFormat;

public class TP01C1 {
    public static void main(String[] args) {

        //Variables
        int nPlatos, psPlatos, secPista;
        long nSector;
        double bytes,kilobytes, megabytes, gigabytes, terabytes;
        String mensajeA,mensajeB;
        DecimalFormat f2 = new DecimalFormat("0.00");
        mensajeA = "Bienvenido\nLe ayudaremos a saber la capacidad de su disco duro según sus caracteristicas.\nPor favor, ingrese los datos solicitados.\n";
        //Entrada de datos
        nPlatos = Integer.parseInt(JOptionPane.showInputDialog(null, mensajeA+"¿Cuantos platos tiene el disco?","Número de platos",JOptionPane.QUESTION_MESSAGE));
        psPlatos = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantas pistas tiene el plato?", "Número de pistas por plato",JOptionPane.QUESTION_MESSAGE));
        secPista = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos sectores tiene cada pista?", "Numero de sectores por pista",JOptionPane.QUESTION_MESSAGE));
        nSector=(long) nPlatos*psPlatos*secPista;
        //Proceso
        bytes = nSector*512;
        kilobytes = bytes/1024;
        megabytes = kilobytes/1024;
        gigabytes = megabytes/1024;
        terabytes = gigabytes/1024;
        mensajeB = "Resultados\n" + "Bytes: " + f2.format(bytes) + " bytes"+"\nKilobytes: " + f2.format(kilobytes) + "Kb"+"\nMegabytes: " + f2.format(megabytes) + "Mb"+"\nGigabytes: " + f2.format(gigabytes) + "Gb"+"\nTerabytes: " + f2.format(terabytes) + "Tb";
        //Salida
        JOptionPane.showMessageDialog(null,mensajeB,"Capacidad de Disco",JOptionPane.INFORMATION_MESSAGE);

    }
}
