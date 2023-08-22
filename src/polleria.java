import javax.swing.*;
import java.text.DecimalFormat;

public class polleria {
    public static void main(String[] args){

        //Variables
        double costo=0,cIGV,cServicio = 0, cPropina = 0, cTotal, cTaxi = 0;
        int formaPago, tipoServicio,punto;
        String seleccion, zonaTaxi;
        final double IGV = .18;
        String []option={"Seleccione...","1/8 Pollo","1/4 Pollo","1/2 Pollo","Un Pollo","1 1/2 Pollo","Dos Pollos"};
        seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione su pedido","Pedido",JOptionPane.QUESTION_MESSAGE,null,option,option[0]);

        switch (seleccion) {
            case "1/8 Pollo" -> costo=7.5;
            case "1/4 Pollo" -> costo=14.0;
            case "1/2 Pollo" -> costo=27.0;
            case "1 Pollo" -> costo=50.0;
            case "1 1/2 Pollo" -> costo=76.0;
            case "2 Pollo" -> costo=95.0;
        }
        cIGV=IGV*costo;
        tipoServicio = JOptionPane.showConfirmDialog(null, "¿Que tipo de servicio desea?", "Consulta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (tipoServicio==JOptionPane.YES_OPTION){
            cServicio=0.10*(costo+cIGV);
            cPropina=0.05*costo;
            cTotal=costo+cIGV+cPropina+cServicio;
        }
        else {
            String []zona ={"Seleccione...","A","B","C","D"};
            zonaTaxi = (String) JOptionPane.showInputDialog(null, "Seleccione su zona: ", "Delivery",JOptionPane.QUESTION_MESSAGE,null,zona,zona[0]);
            switch (zonaTaxi){
                case "A" -> cTaxi=5.0;
                case "B" -> cTaxi=10.0;
                case "C" -> cTaxi=15.0;
                case "D" -> cTaxi=20.0;
            }
            cTotal=costo+cIGV+cTaxi;
        }
        formaPago = JOptionPane.showConfirmDialog(null, "¿Pago con tarjeta?", "Metodo de Pago",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (formaPago==JOptionPane.YES_OPTION)
            punto=2*((int) Math.floor(cTotal));
        else
            punto=(int) Math.floor(cTotal);
        String mensaje = "Boleta de Pago. \n";
        DecimalFormat f2 = new DecimalFormat("0.00");
        if (tipoServicio==JOptionPane.YES_OPTION){
            mensaje+="Servicio de Atención en Mesa\nMonto a Pagar: " + f2.format(cTotal) + "\nCosto Servicio: " + f2.format(cServicio) + "\nPropina: " + f2.format(cPropina) + "\n IGV: " + f2.format(cIGV) + "\n Ha ganado: " + punto + " punto";
        }
        else {
            mensaje+="Servicio de Atención en Mesa\nMonto a Pagar: " + f2.format(cTotal) + "\nCosto Servicio: " + f2.format(cServicio) + "\n IGV: " + f2.format(cIGV) + "\n Ha ganado: " + punto + " puntos";
        }
    }
}
