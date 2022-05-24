package com.example.bs40 ;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EntradaFichero {

    String var1;
    int var2;

    public EntradaFichero(String var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public EntradaFichero() {
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    /* --- Entrando a fichero para leer datos --- */
    @PostConstruct
    public void entraFichero(){
        InputStream entrada;
        Properties propiedades = new Properties();
        try {
            entrada = new FileInputStream("C:\\Users\\jorge.balladares\\Desktop\\bs4.0\\src\\main\\resources\\application.yml");
            propiedades.load(entrada);
            System.out.println(propiedades.getProperty("VAR1"));
            System.out.println(propiedades.getProperty("My.VAR2"));

        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Valor no existe");
    }
}
