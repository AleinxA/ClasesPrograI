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
//public static void main(String[] args) {
//    int i = 1,suma = 0;
//    String message = "";
//    int limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el limite"));
//    while (i <= limite) {
//        message += i + "\n";
//        suma += i;
//        i += 2;
//    }
//    JOptionPane.showMessageDialog(null, message + "\nSumatoria: " + suma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
//}
//}
//
//public static void main(String[] args) {
//    int i=1, nota;
//    String name;
//    while (i<=3){
//        do {
//            name =JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
//            if (name.isEmpty());
//            nota=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nota:"));
//        }while (nota<0 || nota>20);
//        if (nota<=11) JOptionPane.showMessageDialog(null,"El estudiante "+name+" a Desaprobado");
//        else JOptionPane.showMessageDialog(null,"El estudiante "+name+" a Aprobado.");
//        i++;
//    }
//    JOptionPane.showMessageDialog(null, "Fin del programa;");
//}
//    public static void main(String[] args) {
//
//        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese b:","b", JOptionPane.QUESTION_MESSAGE));
//        int e = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese e:","e", JOptionPane.QUESTION_MESSAGE));
//        int i=1, resultado=b;
//        while(i<e){
//            resultado *=b;
//            i++;
//        }
//        JOptionPane.showMessageDialog(null,resultado);
//    }

//    public static void main(String[] args) {
//        int number = 0, mayor=0, i=1;
//        String numero ="", message="";
//        do{
//            do{
//                numero = JOptionPane.showInputDialog(null, "Ingrese el número");
//                if (numero.isEmpty()) numero = String.valueOf((int) 0);
//                number = Integer.parseInt(numero);
//                if (number<0) JOptionPane.showMessageDialog(null,"Ingrese un valor positivo.");
//            }while (number<0);
//            message+=number+"\n";
//            if (i>10) {message+="\f";i=1;}
//            else i++;
//            if (number>mayor) mayor=number;
//            if (number==0) JOptionPane.showMessageDialog(null, "Operación terminada.");
//        }while(number!=0);
//        JOptionPane.showMessageDialog(null, message+ "El número mayor de todos los ingresados es: "+mayor);
//    }
//public static void main(String[] args) {
//    int potencia = 2, suma=0;
//    String menssage = "Potencias de 2\n";
//    while (potencia < 5000){
//        menssage+=potencia+"\n";
//        suma+=potencia;
//        potencia*=2;
//    }
//    JOptionPane.showMessageDialog(null, menssage + "\n Sumatoria" + suma, "Potencias de 2", JOptionPane.INFORMATION_MESSAGE);
//}
//    public static void main(String[] args) {
//        long potencia = 2, suma=0;
//        long limite = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese un limite: ", "Limite", JOptionPane.QUESTION_MESSAGE));
//        String menssage = "Potencias de 2\n";
//        while (potencia < limite){
//            menssage+=potencia+"\n";
//            suma+=potencia;
//            potencia*=2;
//        }
//        JOptionPane.showMessageDialog(null, menssage + "\nSumatoria: " + suma, "Potencias de 2", JOptionPane.INFORMATION_MESSAGE);
//    }

//public static void main(String[] args) {
//    int number, contador=2, comparador;
//    do {
//        number= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero que desee"));
//        if (number<0) JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor entero positivo.");
//    }while (number<0);
//    switch (number){
//        case 1  -> comparador=0;
//        case 2-> comparador=1;
//        default -> {do {
//            comparador = number % contador;
//            contador++;
//            if (comparador==0) break;
//        }while(contador<number/2);
//        }
//    }
//    if(comparador==0) JOptionPane.showMessageDialog(null, "El numero"+number+"no es primo.");
//    else JOptionPane.showMessageDialog(null, "El numero "+number+" es primo.");
//}
//    //Problema 15
//public static void main(String[] args) {
//    int number, contador=2, comparador;
//    do {
//        number= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero que desee"));
//        if (number<0) JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor entero positivo.");
//    }while (number<0);
//    switch (number){
//        case 1  -> comparador=0;
//        case 2-> comparador=1;
//        default -> {do {
//            comparador = number % contador;
//            contador++;
//        }while(contador<number/2);
//        }
//    }
//    if(comparador==0) JOptionPane.showMessageDialog(null, "El numero"+number+"no es primo.");
//    else JOptionPane.showMessageDialog(null, "El numero "+number+" es primo.");
//}

//Problema 16
//public static void main(String[] args) {
//    int number=0, negativos=0, positivos=0, suma=0, i=0, pares=0,impares=0, promedio;
//    String numero ="" ,ing= "Numeros Ingresados\n";
//    do {
//        numero = (JOptionPane.showInputDialog(null,"Ingrese los numeros.", "Datos de Entrada",JOptionPane.QUESTION_MESSAGE));
//        if (numero.isEmpty()) numero="0";
//        number = Integer.parseInt(numero);
//        if (number<0) negativos++; else positivos++;
//        if(number%2==0) pares++; else impares++;
//        if (number!=0){
//            ing+=number+" ";
//            suma+=number;
//            i++;}
//    }while (number!=0);
//    promedio=suma/i;
//    String message ="Resultados\n" +
//            "N° de Negativos: " + negativos+"\n" +
//            "N° de Positivos: " + positivos+"\n" +
//            "N° de Pares: " + pares +"\n" +
//            "N° de Impares: " + impares+"\n" +
//            "Sumatoria: "+suma+"\n" +
//            "Promedio: "+promedio;
//    JOptionPane.showMessageDialog(null,ing, "Datos Ingresados",JOptionPane.INFORMATION_MESSAGE);
//    JOptionPane.showMessageDialog(null,message, "Resultados",JOptionPane.INFORMATION_MESSAGE);
//}
//Problema 19
public static void main(String[] args) {
    int aleatorio, intentos=9, comp=0;
    aleatorio= (int) (Math.random() * 200) + 1;
    int ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivine el numero por favor :) :"));
    while (ingreso!=aleatorio && intentos>0){
        if (ingreso>aleatorio) {
            intentos--;
            JOptionPane.showMessageDialog(null, "Se pasó XD. ;(\n Le quedan "+intentos+" intentos.");
            ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivine el numero por favor :) :"));
        }
        else
        {
            intentos--;
            JOptionPane.showMessageDialog(null, "Se quedo corto XD. ;(\n Le quedan "+intentos+" intentos.");
            ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivine el numero por favor :) :"));
        }

    }
    if (ingreso==aleatorio){
        JOptionPane.showMessageDialog(null, "¡¡¡¡Encontro el numero!!!!"+"(\n Le quedaron "+intentos+" intentos.");
    }else {
        JOptionPane.showMessageDialog(null, "¡¡¡¡Encontro el numero!!!!"+"(\n No le quedan intentos.");
    }
}
}

