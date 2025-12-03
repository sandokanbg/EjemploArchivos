package com.tecnm.morelia.itics.poo.archivos.bags;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ManejoArchivosTexto archivosTexto = new ManejoArchivosTexto();
        ManejoArchivosBinarios archivosBinarios = new ManejoArchivosBinarios();

        archivosTexto.leerArchivo("ejemplo1.txt");
        archivosTexto.escribirArchivo("ejemplo2.txt", "Este es el contenido que pongo en el archivo");


        ObjetoX objx = new ObjetoX(1,Math.random(), "Anything");

        archivosBinarios.writeObjectToFile(objx,"nombreArchivoBinario.bin");

        ObjetoX obj2 = (ObjetoX) archivosBinarios.readObjectFromFile("nombreArchivoBinario.bin");
        obj2.mostrarContenido();



    }
}
