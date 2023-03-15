package Guia04;

import java.util.ArrayList;

/**
 *
 * @author j0k3r.rg
 */
public class ejercicio01 {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        for (int i = 0; i < 10000000; i++) {
            if (i % 2 == 0) lista.add(i);
        }
    }
    
}
