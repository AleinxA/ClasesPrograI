import javax.swing.*;
import java.text.DecimalFormat;

public class ejercicio02 {
    public static void main(String[] args) {
        double mes = 0,Monto=0.0,interes = 0, cuota = 0.0;
        String meses="",monto;
        DecimalFormat d2= new DecimalFormat("0.00");
        Object[] plazo = {"Elija su plazo...", "Un año", "Un Año y Medio", "Dos años","Tres años"};
        do {
            monto=(JOptionPane.showInputDialog(null,"Ingrese el moto a solicitar","Monto",JOptionPane.QUESTION_MESSAGE));
            //Evitamos que el  valor sea nulo o igual a cero
            if (monto.isEmpty()|| monto.equals("0")) {
                monto="0";
                JOptionPane.showMessageDialog(null,"Por favor, ingrese un valor valido","Error",JOptionPane.WARNING_MESSAGE);
            }
            Monto=Double.parseDouble(monto);
        }while (Monto<=0);
        do {
            meses = (String) JOptionPane.showInputDialog(null, "Seleccione el plazo de pago: ", "Plazo de pago", JOptionPane.QUESTION_MESSAGE, null, plazo, plazo[0]);
        }while (meses.equals("Elija su plazo..."));
        switch (meses){
            case "Un año"->{
                mes = 12;
                if (Monto<5000) interes=.10/12;
                else {
                    if (Monto>=5000 && Monto<9999) interes=.18/12;
                    else interes= .25/12;
                }
            }
            case "Un Año y Medio" ->{
                mes = 18;
                if (Monto<5000) interes=.15/12;
                else {
                    if (Monto>=5000 && Monto<9999) interes=.24/12;
                    else interes= .30/12;
                }
            }
            case "Dos años" ->{
                mes = 24;
                if (Monto<5000) interes=.20/12;
                else {
                    if (Monto>=5000 && Monto<9999) interes=.30/12;
                    else interes= .35/12;
                }
            }
            case "Tres años" ->{
                mes = 36;
                if (Monto<5000) interes=.25/12;
                else {
                    if (Monto>=5000 && Monto<9999) interes=.36/12;
                    else interes= 0.40/12;
                }
            }
        }
        double result = Math.pow((1+interes),mes);
        cuota= Monto * ((interes * result) / (result - 1));
        String message ="Resultados\nMonto Solicitado: $"+Monto+"\nPlazo(en meses): "+mes+"\nTasa Anual: "+(interes*100*12)+"%\nCuota: $"+d2.format(cuota);
        JOptionPane.showMessageDialog(null,message,"Resultados",JOptionPane.INFORMATION_MESSAGE);

    }
}
