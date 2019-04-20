package Data;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro, Molano, Manuel
 * @version Pro
 * @since 20/04/2019
 */
public class Helper {

    /**
     * Revisa que el código (si se selecciona el EAN13) tenga 12 dígitos, ni más
     * ni menos.
     * @param code.
     * @return false si no contiene los 12 dígitos o está vació, true si cumple
     * con la condición.
     */
    public static boolean checkCodeEAN13(String code) {
        if (code.isEmpty() || code.length() != 12) {
            JOptionPane.showMessageDialog(null, "El código debe contener 12 dìgitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Revisa que el código (si se selecciona el ISBN13) tenga 12, ni más ni menos,
     * además revisa que empiece por los dígitos "978".
     * @param code.
     * @return false si no tiene 12 dígitos, está vació o no empieza por "987",
     * true en caso contrario.
     */
    public static boolean checkCodeISBN13(String code) {
        if (code.isEmpty() || code.length() != 12) {
            JOptionPane.showMessageDialog(null, "El código debe contener 12 dìgitos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!code.substring(0, 3).equals("978")) {
            JOptionPane.showMessageDialog(null, "El código ISBN debe empezar por 978 siempre.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    /**
     * Despliega un JOptionPane con las intrucciones de como usar el programa.
     */
    public static void instructions() {
        JOptionPane.showMessageDialog(null, "Debe digitar primero el código de 12 dígitos"
                + ", no puede contener letras ni tampoco puede contener"
                + " menos ni más de 12 dígitos.\n Luego de digitar el código"
                + " presione el icono para generar el código."
                + " \n Debe seleccionar que tipo de código quiere, "
                + " entre EAN13 y el ISBN13.", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Cambia el icono de la ventana del frame.
     * @return image.
     */
    public Image setFavicon() {
        return new ImageIcon(getClass().getResource("/Images/Favicon-Barcode.png")).getImage();
    }

    /**
     * Impide que en el textField sea dígitado algo distinto a un número.
     * @param c.
     * @return false si se tipea algo distinto a un número, true en caso 
     * contrario.
     */
    public static boolean onlyNumber(char c) {
        String typed = String.valueOf(c);
        return !typed.matches("[0-9]");
    }

}
