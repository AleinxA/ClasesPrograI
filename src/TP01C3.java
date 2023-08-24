import javax.swing.*;

public class TP01C3 {
    public static void main(String[] args) {

        //VARIABLES
        int cmll, mll,cml,dml,ml,c,d,u,cents;
        String CMLL, MLL = "", CML,DML, ML = "",C = "",D = "",U = "",CENTS;
        //ENTRADA DE DATOS
        double soles = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor: ","Entrada de Datos",JOptionPane.QUESTION_MESSAGE));
        mll=(int)soles/1000000;
        dml = (int) soles/10000;
        ml=(int) soles/1000;
        c= (int) (soles%1000)/100;
        d= (int) ((soles%1000)%100)/10;
        if (d>2){
            u= (int) ((soles%1000)%100)%10;
        }
        else u=(int) soles;
        switch(mll){
            case 1 -> MLL = "UN MILLÓN";
            case 2 -> MLL = "DOS MILLONES";
            case 3 -> MLL = "TRES MILLONES";
            case 4 -> MLL = "CUATRO MILLONES";
            case 5 -> MLL = "CINCO MILLONES";
            case 6 -> MLL = "SEIS MILLONES";
            case 7 -> MLL = "SIETE MILLONES";
            case 8 -> MLL = "OCHO MILLONES";
            case 9 -> MLL = "NUEVE MILLONES";
        }
        switch (dml){
            case 3 -> D = "TREINTA MIL";
            case 4 -> D = "CUARENTA MIL";
            case 5 -> D = "CINCUENTA MIL";
            case 6 -> D = "SESENTA MIL";
            case 7 -> D = "SETENTA MIL";
            case 8 -> D = "OCHENTA MIL";
            case 9 -> D = "NOVENTA MIL";
        }
        switch (ml){
            case 1 -> ML ="MIL";
            case 2 -> ML ="DOS MIL";
            case 3 -> ML ="TRES MIL";
            case 4 -> ML ="CUATRO MIL";
            case 5 -> ML ="CINCO MIL";
            case 6 -> ML ="SEIS MIL";
            case 7 -> ML ="SIETE MIL";
            case 8 -> ML ="OCHO MIL";
            case 9 -> ML ="NUEVE MIL";
            case 10 -> ML = "DIEZ MIL";
            case 11 -> ML = "ONCE MIL";
            case 12 -> ML = "DOCE MIL";
            case 13 -> ML = "TRECE MIL";
            case 14 -> ML = "CATORCE MIL";
            case 15 -> ML = "QUINCE MIL";
            case 16 -> ML = "DIECISEIS MIL";
            case 17 -> ML = "DIECISIETE MIL";
            case 18 -> ML = "DIECIOCHO MIL";
            case 19 -> ML = "DIECINUEVE MIL";
            case 20 -> ML = "VEINTE MIL";
            case 21 -> ML = "VEINTIUNO MIL";
            case 22 -> ML = "VEINTIDOS MIL";
            case 23 -> ML = "VEINTITRES MIL";
            case 24 -> ML = "VEINTCUATRO MIL";
            case 25 -> ML = "VEINTICINCO MIL";
            case 26 -> ML = "VEINTISEIS MIL";
            case 27 -> ML = "VEINTISIETE MIL";
            case 28 -> ML = "VEINTIOCHO MIL";
            case 29 -> ML = "VEINTINUEVE MIL";
        }
        switch(c){
            case 1 -> C = "CIEN";
            case 2 -> C = "DOCIENTOS";
            case 3 -> C = "TRECIENTOS";
            case 4 -> C = "CUATROCIENTOS";
            case 5 -> C = "QUINIENTOS";
            case 6 -> C = "SEICIENTOS";
            case 7 -> C = "SETECIENTOS";
            case 8 -> C = "OCHOCIENTOS";
            case 9 -> C = "NOVECIENTOS";
        }
        switch(d){
            case 3 -> D = "TREINTA";
            case 4 -> D = "CUARENTA";
            case 5 -> D = "CINCUENTA";
            case 6 -> D = "SESENTA";
            case 7 -> D = "SETENTA";
            case 8 -> D = "OCHENTA";
            case 9 -> D = "NOVENTA";
        }
        switch(u){
            case 1 -> U = "UN";
            case 2 -> U = "DOS";
            case 3 -> U = "TRES";
            case 4 -> U = "CUATRO";
            case 5 -> U = "CINCO";
            case 6 -> U = "SEIS";
            case 7 -> U = "SIETE";
            case 8 -> U = "OCHO";
            case 9 -> U = "NUEVE";
            case 10 -> U = "DIEZ";
            case 11 -> U = "ONCE";
            case 12 -> U = "DOCE";
            case 13 -> U = "TRECE";
            case 14 -> U = "CATORCE";
            case 15 -> U = "QUINCE";
            case 16 -> U = "DIECISEIS";
            case 17 -> U = "DIECISIETE";
            case 18 -> U = "DIECIOCHO";
            case 19 -> U = "DIECINUEVE";
            case 20 -> U = "VEINTE";
            case 21 -> U = "VEINTIUNO";
            case 22 -> U = "VEINTIDOS";
            case 23 -> U = "VEINTITRES";
            case 24 -> U = "VEINTCUATRO";
            case 25 -> U = "VEINTICINCO";
            case 26 -> U = "VEINTISEIS";
            case 27 -> U = "VEINTISIETE";
            case 28 -> U = "VEINTIOCHO";
            case 29 -> U = "VEINTINUEVE";
        }
        JOptionPane.showMessageDialog(null,MLL+ML+" "+C+" "+D+" Y "+U+" NUEVO(S) SOL(ES)");


    }
}
