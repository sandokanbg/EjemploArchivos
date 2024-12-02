package com.tecnm.morelia.itics.poo.archivos.bags;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ManejoArchivos manejo1 = new ManejoArchivos();
        //System.out.print(manejo1.setPath("ejemplo1.txt"));
        manejo1.leerArchivo(manejo1.setPath("ejemplo1.txt"));
    }
}
