import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        int nHoras, nDias, nHijos, AFP;
        double tarifa;
        double sBruto, boni, desc, sNeto;
        String afiliado;

        DecimalFormat f2 = new DecimalFormat("0.00");
        //Entrada de Datos
        do {
            nHoras = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantas horas diarias trabaja?","Entrada de Datos",JOptionPane.QUESTION_MESSAGE));
        } while (nHoras<0||nHoras>12);
        do {
            nDias = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos dias trabaja?","Entrada de Datos",JOptionPane.QUESTION_MESSAGE));
        }while (nDias<0||nDias>31);
        do {
            nHijos = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos hijos tiene?","Entrada de Datos",JOptionPane.QUESTION_MESSAGE));
        }while (nHijos<=0||nHijos>10);
        tarifa = Double.parseDouble(JOptionPane.showInputDialog(null,"¿Cual es la tarifa?","Entrada de Datos",JOptionPane.QUESTION_MESSAGE));
        //Selector yes or no
        AFP = JOptionPane.showConfirmDialog(null,"¿Está afiliado a una AFP?","Entrada de Datos",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        sBruto = nHoras*nDias*tarifa;
        if (nHijos>5 && sBruto<1000){
            boni = 0.25*sBruto;
        }
        else
            boni=0.10*sBruto;
        if (AFP==JOptionPane.YES_OPTION){
            desc=0.12*(boni+sBruto);
            afiliado = "SI";
        }
        else {
            desc=0.15*(boni+sBruto);
            afiliado = "NO";
        }
        sNeto=sBruto+boni-desc;
        //Resultados
        String mensaje = "Boleta de Pago\n";
        mensaje+="El sueldo bruto es: " + f2.format(sBruto) + "\nLa Bonificación es: " +  f2.format(boni) + "\nEl descuento es: " + f2.format(desc) + "\nEl sueldo neto es: " + f2.format(sNeto) + "\n Afiliado a AFP: " + afiliado;
        JOptionPane.showMessageDialog(null,mensaje,"Resultados",JOptionPane.INFORMATION_MESSAGE);
    }
}