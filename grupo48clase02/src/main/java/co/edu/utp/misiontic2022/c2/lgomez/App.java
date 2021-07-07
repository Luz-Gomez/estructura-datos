package co.edu.utp.misiontic2022.c2.lgomez;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // var input = new Scanner(System.in);
        // var input = new BuffereReader(new InputStreamReader(System.in));
        System.out.print("Favor Ingrese fecha de nacimiento (dd/mm/aaa): ");
        // var fecha = input.nextLine();
        String fecha = JOptionPane.showInputDialog(null, "Ingrese fecha de nacimiento (dd/mm/aaa): ");
        JOptionPane.showMessageDialog(null, String.format("Número de la suerte: %d ", calcularNumeroSuerte(fecha)));
        // System.out.printf( "Número de la suerte: %d \n",calcularNumeroSuerte(fecha));
        // input.close();
    }

    public static Integer calcularNumeroSuerte(String fechaNacimiento) {
        // "dd/mm"aaa"
        var datos = fechaNacimiento.split("/");
        var dia = Integer.valueOf(datos[0]);
        var mes = Integer.valueOf(datos[1]);
        var ano = Integer.valueOf(datos[2]);

        var suma = dia + mes + ano;
        var numeroSuerte = 0;
        while (suma != 0) {
            numeroSuerte += suma % 10;
            suma /= 10;
        }
        return numeroSuerte;
    }
}
