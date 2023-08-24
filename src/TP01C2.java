import javax.swing.*;
import java.text.DecimalFormat;

public class TP01C2 {
    public static void main(String[] args) {
        //Variables
        double a,b,c,d,r;
        double pRealS, pRealR,pRealP1,pRealP2,pRealM,pRealD, pImgS,pImgR,pImgP1,pImgP2,pImgM,pImgD;
        String complejoA, complejoB;
        String complejoRS, complejoRR,complejoRP1,complejoRP2,complejoRM,complejoRD;
        DecimalFormat f2 = new DecimalFormat("0.00");
        //Entrada
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la parte REAL del PRIMER Numero Complejo", "Datos A",JOptionPane.QUESTION_MESSAGE));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la parte IMAGINARIA del PRIMER Numero Complejo", "Datos A",JOptionPane.QUESTION_MESSAGE));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la parte REAL del SEGUNDO Numero Complejo", "Datos B",JOptionPane.QUESTION_MESSAGE));
        d = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la parte IMAGINARIA del PRIMER Numero Complejo", "Datos B",JOptionPane.QUESTION_MESSAGE));
        //PROCESO
        //SUMA
        pRealS=a+c;
        pImgS=b+d;
        //Resta
        pRealR=a-c;
        pImgR=b-d;
        //Producto por escalar
        r = Double.parseDouble(JOptionPane.showInputDialog(null, "Es necesario un escalar para continuar con una de las operaciones\nPor favor. Ingrese un escalar:", "Producto por escalar",JOptionPane.QUESTION_MESSAGE));
        pRealP1=r*a; pRealP2=r*c;
        pImgP1=r*b; pImgP2=r*d;
        //Multiplicación
        pRealM=(a*c)-(b*d);
        pImgM=(a*d)+(c*b);
        //División
        double denominador = Math.pow(c, 2) + Math.pow(d, 2);
        pRealD=((a*c)+(b*d))/denominador;
        pImgD=((a*c)-(b*d))/ denominador;
        //Salida
        complejoA="\nPrimer Numero Complejo:\n Z1 = "+ f2.format(a)+" + "+f2.format(b)+"i";
        complejoB="\nSegundo Numero Complejo:\n Z2 = "+f2.format(c)+" + "+f2.format(d)+"i";
        complejoRS="\nResultados\nSuma:\n R = "+ f2.format(pRealS)+" + "+ f2.format(pImgS)+"i";
        complejoRR="\nResta:\n R = "+f2.format(pRealR)+" + "+f2.format(pImgR)+"i";
        complejoRP1="\nProducto por escalar(Primer Complejo):\n R1 = "+f2.format(pRealP1)+" + "+f2.format(pImgP1)+"i";
        complejoRP2="\nProducto por escalar(Segundo Complejo):\n R1 = "+f2.format(pRealP2)+" + "+f2.format(pImgP2)+"i";
        complejoRM="\nMultiplicación:\n R = "+f2.format(pRealM)+" + "+f2.format(pImgM)+"i";
        complejoRD ="\nDivisión:\n R = "+f2.format(pRealD)+" + "+f2.format(pImgD)+"i";
        JOptionPane.showMessageDialog(null,complejoA+complejoB+complejoRS+complejoRR+complejoRP1+complejoRP2+complejoRM+complejoRD,"Resultados",JOptionPane.INFORMATION_MESSAGE);
    }
}
