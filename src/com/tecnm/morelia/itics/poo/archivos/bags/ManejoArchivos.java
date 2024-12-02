package com.tecnm.morelia.itics.poo.archivos.bags;

import java.io.*;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManejoArchivos {


    public ManejoArchivos() {
    }

    public String setPath(String fileName){
        return ("C:///Users/sando/" + fileName);
    }
    public void leerArchivo(String path) throws IOException {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            System.out.println(br.readLine());
        }
    }
}



