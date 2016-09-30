/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import static imc.Imc.calcular;
import static imc.Imc.imprimiResultado;
import java.io.IOException;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author 31463738
 */
public class Usuario {

    public static void main(String[] args) {

        float peso = 0, altura = 0;
        
        int s = JOptionPane.showConfirmDialog(null, "Bem vindo ao cálculo de IMC.\n Deseja realizar o cálculo?", "IMC", JOptionPane.YES_NO_OPTION, 1);

        if (s == JOptionPane.YES_OPTION) {            
            try {
                while (altura <= 0) {
                    altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Calculando IMC.\nDigite sua altura: \n(Em metros) ", "Altura", 1));
                }
                while (peso <= 0) {
                    peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Calculando IMC.\nDigite seu peso: \n(Em Kg)", "Peso", 1));
                }

                calcular(peso, altura);
                imprimiResultado();
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro na entrada de dados! Favor não digitar letras ou números com vírgula.\n Obs: Somente valores inteiros.", "ERRO!", 0);   
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Tchau!", "IMC", 2);
        }
    }
    
    
}
