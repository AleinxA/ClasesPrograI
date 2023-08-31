import javax.swing.*;

public class practica {
    public static void main(String[] args) {
        int mes = 0;
        double montoI,Monto=0.0,interes, MontoT, cuota = 0.0;
        String meses="",monto;
        Object[] plazo = {"Elija su plazo...", "Un año", "Un Año y Medio", "Dos años"};
        do {
            monto=(JOptionPane.showInputDialog(null,"ingrese el moto a solicitar"));
            if (monto.isEmpty()|| monto.equals("0")) {monto="0"; JOptionPane.showMessageDialog(null,"Por favor, ingrese un valor valido","Error",JOptionPane.WARNING_MESSAGE);}
            Monto=Double.parseDouble(monto);
        }while (Monto<=0);
        do {
            meses = (String) JOptionPane.showInputDialog(null, "Seleccione el plazo de pago: ", "Plazo de pago", JOptionPane.QUESTION_MESSAGE, null, plazo, plazo[0]);
        }while (meses.equals("Elija su plazo..."));
        switch (meses){
            case "Un año"->{
                mes=12;
                if (Monto<2500){
                    interes = 0.1;
                    montoI = Monto*interes;
                    MontoT = Monto + montoI;
                }
                else {
                    if (Monto<4999||Monto>=2500) {
                        interes = 0.18;
                        montoI = Monto*interes;
                        MontoT = Monto + montoI;
                    }
                    else {
                        interes=0.25;
                        montoI = Monto*interes;
                        MontoT = Monto + montoI;
                    }
                }
                cuota=MontoT/mes;
            }
            case "Un año y Medio"->mes=18;
            case "Dos años"->mes=24;
        }
        if (Monto<2500){
            interes = 0.1;
            montoI = Monto*interes;
            MontoT = Monto + montoI;
        }
        else {
            if (Monto<4999||Monto>=2500) {
                interes = 0.18;
                montoI = Monto*interes;
                MontoT = Monto + montoI;
            }
            else {
                interes=0.25;
                montoI = Monto*interes;
                MontoT = Monto + montoI;
            }
        }
        JOptionPane.showMessageDialog(null,cuota);


    }
}
