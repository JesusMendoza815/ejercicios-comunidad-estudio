import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * La empresa Coca cola Company solicita un sistema que determine los dias de vacaciones a los que tiene derecho un
         * trabajador, tomando en cuenta las siguiel caracteristicas:
         * Existen tres departamentos dentro de la empresa con sus respectivas claves:
         * 1. Departamento de atencion a clientes. (Clave 1)
         * 2. Departamento de logistca. (Clave 2)
         * 3. Gerencia. (Clave 3)
         * Trabajadores con clave 1
         * * Con 1 año de servicio, reciben 6 dias de vacaciones.
         * * Con 2 a 6 años de servicio, reciben 14 dias de vacaciones.
         * * A partir de 7 años de servicio, reciben 20 dias de vacaciones.
         * Trabajadores con clave 2
         * * Con 1 año de servicio, reciben 7 dias de vacaciones.
         * * Con 2 a 6 años de servicio, reciben 15 dias de vacaciones.
         * * A partir de 7 años de servicio, reciben 22 dias de vacaciones.
         * Trabajadores con clave 3
         * * Con 1 año de servicio, reciben 10 dias de vacaciones
         * * Con 2 a 6 años de servicio, reciben 20 dias de vacaciones.
         * * A partir de 7 años de servicio, reciben 30 dias de vacaciones.
         * */
        String optionStr = JOptionPane.showInputDialog(null,
                """
                        Ingresa la clave de tu departamento:\s
                        1.- Servicio al cliente\s
                        2.- Logística\s
                        3.- Gerencia""");
        short selectedOption = Short.parseShort(optionStr);

        String yearsStr = JOptionPane.showInputDialog(null, "Cuántos años tienes laborando en esta empresa: ");
        short years = Short.parseShort(yearsStr);

        switch (selectedOption) {
            case 1: {
                if (years == 1) JOptionPane.showMessageDialog(null, "Tienes 6 días de vacaciones");
                else if (years >= 2 && years <= 6) JOptionPane.showMessageDialog(null, "Tienes 14 días de vacaciones");
                else if (years >= 7) JOptionPane.showMessageDialog(null, "Tienes 20 días de vacaciones");
                else if (years < 1) JOptionPane.showMessageDialog(null, "Aún no tienes vacaciones");
                break;
            }
            case 2: {
                if (years == 1) JOptionPane.showMessageDialog(null, "Tienes 7 días de vacaciones");
                else if (years >= 2 && years <= 6) JOptionPane.showMessageDialog(null, "Tienes 15 días de vacaciones");
                else if (years >= 7) JOptionPane.showMessageDialog(null, "Tienes 22 días de vacaciones");
                else if (years < 1) JOptionPane.showMessageDialog(null, "Aún no tienes vacaciones");
                break;
            }
            case 3: {
                if (years == 1) JOptionPane.showMessageDialog(null, "Tienes 10 días de vacaciones");
                else if (years >= 2 && years <= 6) JOptionPane.showMessageDialog(null, "Tienes 20 días de vacaciones");
                else if (years >= 7) JOptionPane.showMessageDialog(null, "Tienes 30 días de vacaciones");
                else if (years < 1) JOptionPane.showMessageDialog(null, "Aún no tienes vacaciones");
                break;
            }

            default: {
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
            }
        }
    }
}
