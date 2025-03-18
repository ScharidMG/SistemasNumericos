/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasnumericos;

import javax.swing.JOptionPane;

/**
 *
 * @author VALENTINA
 */
public class ControladorConversor {
    private ConversorNumerico modelo; 
    private VistaConversor vista; 

    public ControladorConversor(VistaConversor vista) {
        this.vista = vista;
        modelo = new ConversorNumerico(); 
        
    }
    
    public void convertir(){
        String input = vista.getTxtNumeroConversor().getText();
        String base = (String) vista.getCmbConvertorTipo().getSelectedItem();
        int decimal = base.equals("Decimal") ? Integer.parseInt(input) :
                      base.equals("Binario") ? modelo.binarioADecimal(input) :
                      base.equals("Octal") ? modelo.octalADecimal(input) : modelo.hexADecimal(input);
        vista.getTxtDecimal().setText(String.valueOf(decimal));
        vista.getTxtBinario().setText(modelo.decimalABinario(decimal));
        vista.getTxtOctal().setText(modelo.decimalAOctal(decimal));
        vista.getTxtHexadecimal().setText(modelo.decimalAHex(decimal));
        
      
    }
    
     public void operar() {
        String num1 = vista.getTxtNum1().getText();
        String num2 = vista.getTxtNum2().getText();
        String base = (String) vista.getCmbOpSistema().getSelectedItem();
        String operacion = (String) vista.getCmbOperacionTipo().getSelectedItem();
        
        vista.getTxtResultado().setText(modelo.operar(num1, num2, base, operacion));
    }
}
