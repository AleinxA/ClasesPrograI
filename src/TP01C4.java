import javax.swing.*;

public class TP01C4 {

    public static void main(String[] args) {
        //variables y entrada
        int  u, d, c, m;
        String U="", D="", C="", M="";
        int numeroNormal = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor. Ingrese el numero: ", "Números en Romanos", JOptionPane.QUESTION_MESSAGE));
        //Operaciones
        u = ((numeroNormal%1000)%100)%10;
        d = ((numeroNormal%1000)%100)/10;
        c = (numeroNormal%1000)/100;
        m = numeroNormal/1000;

        switch(u){
            case 1 -> U = "I";
            case 2 -> U = "II";
            case 3 -> U = "III";
            case 4 -> U = "IV";
            case 5 -> U = "V";
            case 6 -> U = "VI";
            case 7 -> U = "VII";
            case 8 -> U = "VIII";
            case 9 -> U = "IX";
        }
        switch(d){
            case 1 -> D = "X";
            case 2 -> D = "XX";
            case 3 -> D = "XXX";
            case 4 -> D = "XL";
            case 5 -> D = "L";
            case 6 -> D = "LX";
            case 7 -> D = "LXX";
            case 8 -> D = "LXXX";
            case 9 -> D = "XC";
        }
        switch(c){
            case 1 -> C = "C";
            case 2 -> C = "CC";
            case 3 -> C = "CCC";
            case 4 -> C = "CD";
            case 5 -> C = "D";
            case 6 -> C = "DC";
            case 7 -> C = "DCC";
            case 8 -> C = "DCCC";
            case 9 -> C = "CM";
        }
        switch(m){
            case 1 -> M = "M";
            case 2 -> M = "MM";
            case 3 -> M = "MMM";
        }

        JOptionPane.showMessageDialog(null, M+C+D+U, "Numeros en Romanos",JOptionPane.INFORMATION_MESSAGE);

    }

}
