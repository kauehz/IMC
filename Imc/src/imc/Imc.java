package imc;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 31463738
 */
public class Imc {

    public static float x;

    public static float calcular(float peso, float altura) {
        x = (float) (peso / Math.pow((altura / 100), 2));
        return x;
    }

    public static void imprimiResultado() {
        //JOptionPane.showMessageDialog(null, "IMC " + x);
        DecimalFormat df = new DecimalFormat("0.##");
        String dx = df.format(x);
        
        if (x <= 18.5) {
            JOptionPane.showMessageDialog(null, "IMC: " + dx + "\nVocê está abaixo do peso.", "IMC", 2);
        } else if (x >= 18.6 && x <= 24.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + dx + "\nVocê está com o peso ideal! Parabéns!", "Parabéns!", 1);
        } else if (x >= 25 && x <= 29.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + dx + "\nVocê está acima do peso recomendado. Cuidado!", "Atenção!", 2);
        } else if (x >= 30 && x <= 34.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + dx + "\nObesidade Moderada. (CL.I", "ATENÇÃO!", 2);
        } else if (x >= 35 && x <= 39.9) {
            JOptionPane.showMessageDialog(null, "IMC: " + dx + "\nObesidade Alta. (CL. II", "ATENÇÃO!", 2);
        } else {
            JOptionPane.showMessageDialog(null, "IMC: " + dx + "\nObesidade muito alta.(CL. III)\n Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!\n", "ATENÇÃO!", 2);
        }
    }
}
