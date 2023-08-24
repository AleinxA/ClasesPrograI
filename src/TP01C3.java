import javax.swing.*;

public class TP01C3 {
    public static void main(String[] args) {

        //VARIABLES
        int mll,cml,dml,ml,c,d,u, cents;
        String MLL = "", CML = "",DML = "", ML = "",C = "",D = "",U = "";
        //ENTRADA DE DATOS
        double soles = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor: ","Entrada de Datos",JOptionPane.QUESTION_MESSAGE));
        mll=(int)soles/1000000;
        cml =(int)(soles%1000000)/100000;
        dml = (int) ((soles%1000000)%100000)/10000;
        if (dml>2){
            ml = (int) (((soles%1000000)%100000)%10000)/1000;
        }else ml = (int) (soles%100000)/1000;
        c = (int) (soles%1000)/100;
        d = (int) ((soles%1000)%100)/10;
        if (d>2){
            u= (int) ((soles%1000)%100)%10;
        }
        else u=(int) ((soles%1000)%100);
        cents =(int) Math.round((((soles%1000)%100)%1)*100);

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
        switch(d){
            case 3 -> {if(u>0) D="TREINTA Y ";else  D = "TREINTA";}
            case 4 -> {if(u>0) D="CUARENTA Y ";else  D = "CUARENTA";}
            case 5 -> {if(u>0) D="CINCUENTA Y ";else  D = "CINCUENTA";}
            case 6 -> {if(u>0) D="SESENTA Y ";else  D = "SESENTA";}
            case 7 -> {if(u>0) D="SETENTA Y ";else  D = "SETENTA";}
            case 8 -> {if(u>0) D="OCHENTA Y ";else  D = "OCHENTA";}
            case 9 -> {if(u>0) D="NOVENTA Y ";else D = "NOVENTA";}
        }
        switch(c){
            case 1 -> {if (d != 0 || u != 0) C = "CIENTO "; else C = "CIEN";}
            case 2 -> C = "DOCIENTOS";
            case 3 -> C = "TRECIENTOS";
            case 4 -> C = "CUATROCIENTOS";
            case 5 -> C = "QUINIENTOS";
            case 6 -> C = "SEICIENTOS";
            case 7 -> C = "SETECIENTOS";
            case 8 -> C = "OCHOCIENTOS";
            case 9 -> C = "NOVECIENTOS";
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
            case 24 -> ML = "VEINTICUATRO MIL";
            case 25 -> ML = "VEINTICINCO MIL";
            case 26 -> ML = "VEINTISEIS MIL";
            case 27 -> ML = "VEINTISIETE MIL";
            case 28 -> ML = "VEINTIOCHO MIL";
            case 29 -> ML = "VEINTINUEVE MIL";
        }
        switch (dml){
            case 3 -> {if(ml>0) DML="TREINTA Y ";else  DML = "TREINTA";}
            case 4 -> {if(ml>0) DML="CUARENTA Y ";else  DML = "CUARENTA";}
            case 5 -> {if(ml>0) DML="CINCUENTA Y ";else  DML = "CINCUENTA";}
            case 6 -> {if(ml>0) DML="SESENTA Y ";else  DML = "SESENTA";}
            case 7 -> {if(ml>0) DML="SETENTA Y ";else  DML = "SETENTA";}
            case 8 -> {if(ml>0) DML="OCHENTA Y ";else  DML = "OCHENTA";}
            case 9 -> {if(ml>0) DML="NOVENTA Y ";else DML = "NOVENTA";}
        }
        switch(cml){
            case 1 -> {if (dml != 0 || ml != 0) CML = "CIENTO "; else CML = "CIEN"; if (ml == 1) CML = "CIENTO UN ";}
            case 2 -> CML = "DOCIENTOS";
            case 3 -> CML = "TRECIENTOS";
            case 4 -> CML = "CUATROCIENTOS";
            case 5 -> CML = "QUINIENTOS";
            case 6 -> CML = "SEICIENTOS";
            case 7 -> CML = "SETECIENTOS";
            case 8 -> CML = "OCHOCIENTOS";
            case 9 -> CML = "NOVECIENTOS";
        }
        switch(mll){
            case 1 -> MLL = "UN MILLÓN ";
            case 2 -> MLL = "DOS MILLONES ";
            case 3 -> MLL = "TRES MILLONES ";
            case 4 -> MLL = "CUATRO MILLONES ";
            case 5 -> MLL = "CINCO MILLONES ";
            case 6 -> MLL = "SEIS MILLONES ";
            case 7 -> MLL = "SIETE MILLONES ";
            case 8 -> MLL = "OCHO MILLONES ";
            case 9 -> MLL = "NUEVE MILLONES ";
        }

        JOptionPane.showMessageDialog(null,MLL+CML+" "+DML+ML+" "+C+" "+D+U+" CON "+cents+"/100 NUEVO(S) SOL(ES)");


    }
}
