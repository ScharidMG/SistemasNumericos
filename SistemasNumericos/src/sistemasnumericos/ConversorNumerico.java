/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasnumericos;

/**
 *
 * @author VALENTINA
 */
public class ConversorNumerico {
     public String decimalABinario(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    
    public String decimalAOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }
    
    public String decimalAHex(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }
    
    public int binarioADecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }
    
    public int octalADecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }
    
    public int hexADecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
    
    public String operar(String num1, String num2, String base, String operacion) {
        int b = base.equals("Binario") ? 2 : base.equals("Octal") ? 8 : 16;
        int n1 = Integer.parseInt(num1, b);
        int n2 = Integer.parseInt(num2, b);
        int resultado = operacion.equals("+") ? n1 + n2 :
                        operacion.equals("-") ? n1 - n2 :
                        operacion.equals("*") ? n1 * n2 : n1 / n2;
        return Integer.toString(resultado, b).toUpperCase();
    }
}

    

