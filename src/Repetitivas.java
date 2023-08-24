import javax.swing.*;

public class Repetitivas {
//    public static void main(String[] args) {
//        int i=1;
//        String message = "";
//        while (i<=20)
//        {
//            message += i+"\n";
//            i++;
//        }
//        JOptionPane.showMessageDialog(null, message,"Resultado",JOptionPane.INFORMATION_MESSAGE);
//    }
    //Con Limite
//    public static void main(String[] args) {
//        int i=1;
//        String message = "";
//        int limite = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el limite"));
//        while (i<=limite)
//        {
//            message += i+"\n";
//            i++;
//        }
//        JOptionPane.showMessageDialog(null, message,"Resultado",JOptionPane.INFORMATION_MESSAGE);
//}
//public static void main(String[] args) {
//    int i=1;
//    String message = "";
//    int limite = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el limite"));
//    while (i<=limite)
//        {
//            message += i+"\n";
//            i+=2;
//        }
//    JOptionPane.showMessageDialog(null, message,"Resultado",JOptionPane.INFORMATION_MESSAGE);
//}
public static void main(String[] args) {
    int i = 1,suma = 0;
    String message = "";
    int limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el limite"));
    while (i <= limite) {
        message += i + "\n";
        suma += i;
        i += 2;
    }
    JOptionPane.showMessageDialog(null, message + "\nSumatoria: " + suma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
}
}
