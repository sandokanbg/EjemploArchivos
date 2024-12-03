package com.tecnm.morelia.itics.poo.archivos.bags;

public class Main {
    public static void main(String[] args)  {
        ManejoArchivos manejo1 = new ManejoArchivos();

        manejo1.leerArchivo("ejemplo1.txt");

        manejo1.escribirArchivo("ejemplo2.txt", "Este es el contenido que pongo en el archivo");
    }
}
