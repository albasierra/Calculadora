import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {

        boolean salir = false;
        while (!salir){

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Operación a realizar: \n"+
                            "1.Sumar\n"+
                            "2.Restar\n"+
                            "3.Multiplicar\n"+
                            "4.Dividir\n"+
                            "5.Salir\n"+
                            "Introduzca una opción: "
            ));
            if(opcion==5){
                salir = true;
            }else if (opcion<5 && opcion>0) {
                double sol = 0;
                double num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número: "));
                double num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número: "));
                switch (opcion) {
                    case 1:
                        Sumar sumar = new Sumar();
                        sol = sumar.sumar(num1,num2);
                        break;

                    case 2:
                        Restar restar = new Restar();
                        sol = restar.restar(num1,num2);
                        break;
                    case 3 :
                        Multiplicar mult = new Multiplicar();
                        sol = mult.operar(num1, num2);
                        break;

                    case 4:
                        Dividir div = new Dividir();
                        sol = div.operar(num1, num2);
                        break;
                }

                JOptionPane.showMessageDialog(null, "El resultado es :"+sol);
            }else {
                JOptionPane.showMessageDialog(null,"Opción no disponible");
            }

        }

    }
}
