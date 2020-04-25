/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculadora;
import java.lang.Math;

/**
 *
 * @author cedewolf
 */
public class Calculadora {

    public double operacion(String cad) {
        String[] cadena;
        double num,num2,x;
        
        if(cad.indexOf("/")>-1){
            cadena = cad.split("\\/");
            num = Double.parseDouble(cadena[0]);
            num2 = Double.parseDouble(cadena[1]);
            x = num/num2;
            return x;
        }
        else if(cad.indexOf("+")>-1){
            cadena = cad.split("\\+");
            num = Double.parseDouble(cadena[0]);
            num2 = Double.parseDouble(cadena[1]);
            x = num+num2;
            return x;
        }
        else if(cad.indexOf("-")>-1){
            cadena = cad.split("\\-");
            num = Double.parseDouble(cadena[0]);
            num2 = Double.parseDouble(cadena[1]);
            x = num-num2;
            return x;
        }
        else if(cad.indexOf("*")>-1){
            cadena = cad.split("\\*");
            num = Double.parseDouble(cadena[0]);
            num2 = Double.parseDouble(cadena[1]);
            x = num*num2;
            return x;
        }
        
        else if(cad.indexOf("sin")>-1){
            cadena = cad.split("sin");
            num = Double.parseDouble(cadena[1]);
            x = Math.sin(num);
            return x;
        }
        else if(cad.indexOf("cos")>-1){
            cadena = cad.split("cos");
            num = Double.parseDouble(cadena[1]);
            x = Math.cos(num);
            return x;
        }
        else if(cad.indexOf("tan")>-1){
            cadena = cad.split("tan");
            num = Double.parseDouble(cadena[1]);
            x = Math.tan(num);
            return x;
        }
        else if(cad.indexOf("inv")>-1){
            cadena = cad.split("inv");
            num = Double.parseDouble(cadena[1]);
            x = Math.pow(num,-1);
            return x;
        }
        else if(cad.indexOf("2pow")>-1){
            cadena = cad.split("2pow");
            num = Double.parseDouble(cadena[1]);
            x = Math.pow(num,2);
            return x;
        }
        else if(cad.indexOf("3pow")>-1){
            cadena = cad.split("3pow");
            num = Double.parseDouble(cadena[1]);
            x = Math.pow(num,3);
            return x;
        }
        else if(cad.indexOf("√")>-1){
            cadena = cad.split("√");
            num = Double.parseDouble(cadena[1]);
            x = Math.pow(num,0.5);
            return x;
        }
        else if(cad.indexOf("3√")>-1){
            cadena = cad.split("3√");
            num = Double.parseDouble(cadena[1]);
            x = Math.pow(num,0.3333333333333);
            return x;
        }
        else if(cad.indexOf("log")>-1){
            cadena = cad.split("log");
            num = Double.parseDouble(cadena[1]);
            x = Math.log10(num);
            return x;
        }
        else if(cad.indexOf("ln")>-1){
            cadena = cad.split("ln");
            num = Double.parseDouble(cadena[1]);
            x = Math.log(num);
            return x;
        }


        return 0;
    }

}
