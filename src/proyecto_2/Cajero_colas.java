package proyecto_2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cajero_colas {

    public static int[] ATM_1 = new int[5];
    public static int[] ATM_2 = new int[5];
    public static int[] ATM_3 = new int[5];
    public static int[] ATM_4 = new int[5];

    public static void main(String[] args) {
        rellenar_ATM();
        ATMS();
    }

    public static void rellenar_ATM() {
        for (int i = 0; i < 5; i++) {
            ATM_1[i] = 0;
            ATM_2[i] = 0;
            ATM_3[i] = 0;
            ATM_4[i] = 0;
        }
    }

    public static void ATMS() {
        int opcion = 0;

        while (opcion != 4) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "***Menu de cajero***\n1."
                    + " Insertar un cliente al cajero\n2."
                    + " Atender cliente\n3."
                    + " Mostar espacios en cajeros\n4."
                    + " Salir"));

            if (opcion == 1) {
                int x = 0;
                int cont_1 = 0;
                int cont_2 = 0;
                int cont_3 = 0;
                int cont_4 = 0;
                for (int i = 0; i < 5; i++) {
                    if (ATM_1[i] == 1) {
                        cont_1 = cont_1 + 1;
                    }
                }
                for (int i = 0; i < 5; i++) {
                    if (ATM_2[i] == 1) {
                        cont_2 = cont_2 + 1;
                    }
                }
                for (int i = 0; i < 5; i++) {
                    if (ATM_3[i] == 1) {
                        cont_3 = cont_3 + 1;
                    }
                }
                for (int i = 0; i < 5; i++) {
                    if (ATM_4[i] == 1) {
                        cont_4 = cont_4 + 1;
                    }
                }
                if (x == 0) {
                    if (cont_1 <= cont_2 && cont_1 <= cont_3 && cont_1 <= cont_4) {
                        if (cont_1 == 0) {
                            ATM_1[0] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el primer puesto del cajero 1");
                        }
                        if (cont_1 == 1) {
                            ATM_1[1] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el segundo puesto del cajero 1");
                        }
                        if (cont_1 == 2) {
                            ATM_1[2] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el tercer puesto del cajero 1");
                        }
                        if (cont_1 == 3) {
                            ATM_1[3] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el cuarto puesto del cajero 1");
                        }
                        if (cont_1 == 4) {
                            ATM_1[4] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el quinto puesto del cajero 1");
                        }
                        x = 1;
                    }
                }
                if (x == 0) {
                    if (cont_2 <= cont_1 && cont_2 <= cont_3 && cont_2 <= cont_4) {
                        if (cont_2 == 0) {
                            ATM_2[0] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el primer puesto del cajero 2");
                        }
                        if (cont_2 == 1) {
                            ATM_2[1] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el segundo puesto del cajero 2");
                        }
                        if (cont_2 == 2) {
                            ATM_2[2] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el tercer puesto del cajero 2");
                        }
                        if (cont_2 == 3) {
                            ATM_2[3] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el cuarto puesto del cajero 2");
                        }
                        if (cont_2 == 4) {
                            ATM_2[4] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el quinto puesto del cajero 2");
                        }
                        x = 1;
                    }
                }
                if (x == 0) {
                    if (cont_3 <= cont_2 && cont_3 <= cont_1 && cont_3 <= cont_4) {
                        if (cont_3 == 0) {
                            ATM_3[0] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el primer puesto del cajero 3");
                        }
                        if (cont_3 == 1) {
                            ATM_3[1] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el segundo puesto del cajero 3");
                        }
                        if (cont_3 == 2) {
                            ATM_3[2] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el tercer puesto del cajero 3");
                        }
                        if (cont_3 == 3) {
                            ATM_3[3] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el cuarto puesto del cajero 3");
                        }
                        if (cont_3 == 4) {
                            ATM_3[4] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el quinto puesto del cajero 3");
                        }
                        x = 1;
                    }
                }
                if (x == 0) {
                    if (cont_4 <= cont_2 && cont_4 <= cont_3 && cont_4 <= cont_1) {
                        if (cont_4 == 0) {
                            ATM_4[0] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el primer puesto del cajero 4");
                        }
                        if (cont_4 == 1) {
                            ATM_4[1] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el segundo puesto del cajero 4");
                        }
                        if (cont_4 == 2) {
                            ATM_4[2] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el tercer puesto del cajero 4");
                        }
                        if (cont_4 == 3) {
                            ATM_4[3] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el cuarto puesto del cajero 4");
                        }
                        if (cont_4 == 4) {
                            ATM_4[4] = 1;
                            JOptionPane.showMessageDialog(null, "Fue colocado en el quinto puesto del cajero 4");
                        }
                        x = 1;
                    }
                }
                if (ATM_1[4] == 1 && ATM_2[4] == 1 && ATM_3[4] == 1 && ATM_4[4] == 1) {
                    JOptionPane.showMessageDialog(null, "Cajeros llenos, no quedan campos, por favcor espere.");
                }
            }
            if (opcion == 2) {
                int ATM = 0;
                int cont = 0;
                ATM = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número del cajero al cual desea realizarle un tramite."));
                if (ATM == 1) {
                    for (int i = 0; i < 5; i++) {
                        if (ATM_1[i] == 1) {
                            cont = cont + 1;
                        }
                    }
                    if (cont == 1) {
                        ATM_1[0] = 0;
                    }
                    if (cont == 2) {
                        ATM_1[0] = 1;
                        ATM_1[1] = 0;
                    }
                    if (cont == 3) {
                        ATM_1[0] = 1;
                        ATM_1[1] = 1;
                        ATM_1[2] = 0;
                    }
                    if (cont == 4) {
                        ATM_1[0] = 1;
                        ATM_1[1] = 1;
                        ATM_1[2] = 1;
                        ATM_1[3] = 0;
                    }
                    if (cont == 5) {
                        ATM_1[0] = 1;
                        ATM_1[1] = 1;
                        ATM_1[2] = 1;
                        ATM_1[3] = 1;
                        ATM_1[4] = 0;
                    }
                    if (cont == 0) {
                        JOptionPane.showMessageDialog(null, "El cajero no contiene cliente, está vacío.");
                    }
                }

                if (ATM == 2) {
                    for (int i = 0; i < 5; i++) {
                        if (ATM_2[i] == 1) {
                            cont = cont + 1;
                        }
                    }
                    if (cont == 1) {
                        ATM_2[0] = 0;
                    }
                    if (cont == 2) {
                        ATM_2[0] = 1;
                        ATM_2[1] = 0;
                    }
                    if (cont == 3) {
                        ATM_2[0] = 1;
                        ATM_2[1] = 1;
                        ATM_2[2] = 0;
                    }
                    if (cont == 4) {
                        ATM_2[0] = 1;
                        ATM_2[1] = 1;
                        ATM_2[2] = 1;
                        ATM_2[3] = 0;
                    }
                    if (cont == 5) {
                        ATM_2[0] = 1;
                        ATM_2[1] = 1;
                        ATM_2[2] = 1;
                        ATM_2[3] = 1;
                        ATM_2[4] = 0;
                    }
                    if (cont == 0) {
                        JOptionPane.showMessageDialog(null, "El cajero no contiene cliente, está vacío.");
                    }
                }

                if (ATM == 3) {
                    for (int i = 0; i < 5; i++) {
                        if (ATM_3[i] == 1) {
                            cont = cont + 1;
                        }
                    }
                    if (cont == 1) {
                        ATM_3[0] = 0;
                    }
                    if (cont == 2) {
                        ATM_3[0] = 1;
                        ATM_3[1] = 0;
                    }
                    if (cont == 3) {
                        ATM_3[0] = 1;
                        ATM_3[1] = 1;
                        ATM_3[2] = 0;
                    }
                    if (cont == 4) {
                        ATM_3[0] = 1;
                        ATM_3[1] = 1;
                        ATM_3[2] = 1;
                        ATM_3[3] = 0;
                    }
                    if (cont == 5) {
                        ATM_3[0] = 1;
                        ATM_3[1] = 1;
                        ATM_3[2] = 1;
                        ATM_3[3] = 1;
                        ATM_3[4] = 0;
                    }
                    if (cont == 0) {
                        JOptionPane.showMessageDialog(null, "El cajero no contiene cliente, está vacío.");
                    }
                }

                if (ATM == 4) {
                    for (int i = 0; i < 5; i++) {
                        if (ATM_4[i] == 1) {
                            cont = cont + 1;
                        }
                    }
                    if (cont == 1) {
                        ATM_4[0] = 0;
                    }
                    if (cont == 2) {
                        ATM_4[0] = 1;
                        ATM_4[1] = 0;
                    }
                    if (cont == 3) {
                        ATM_4[0] = 1;
                        ATM_4[1] = 1;
                        ATM_4[2] = 0;
                    }
                    if (cont == 4) {
                        ATM_4[0] = 1;
                        ATM_4[1] = 1;
                        ATM_4[2] = 1;
                        ATM_4[3] = 0;
                    }
                    if (cont == 5) {
                        ATM_4[0] = 1;
                        ATM_4[1] = 1;
                        ATM_4[2] = 1;
                        ATM_4[3] = 1;
                        ATM_4[4] = 0;
                    }
                    if (cont == 0) {
                        JOptionPane.showMessageDialog(null, "El cajero no contiene cliente, está vacío.");
                    }
                }

            }
            if (opcion == 3) {
                String print_1 = "ATM 1:";
                String print_2 = "ATM 2:";
                String print_3 = "ATM 3:";
                String print_4 = "ATM 4:";
                
                for (int i = 0; i < 5; i++) {
                    print_1 = print_1 + " " + ATM_1[i];
                }
                for (int i = 0; i < 5; i++) {
                    print_2 = print_2 + " " + ATM_2[i];
                }
                for (int i = 0; i < 5; i++) {
                    print_3 = print_3 + " " + ATM_3[i];
                }
                for (int i = 0; i < 5; i++) {
                    print_4 = print_4 + " " + ATM_4[i];
                }
                JOptionPane.showMessageDialog(null, print_1 + "\n" + print_2 + "\n" + print_3 + "\n" + print_4);
            }
            if (opcion != 3 && opcion != 1 && opcion != 2 && opcion != 4) {
                JOptionPane.showMessageDialog(null, "Opción invalida, digite una que sea entre 1 y 4");
                opcion = 0;
            }

        }

    }
}
