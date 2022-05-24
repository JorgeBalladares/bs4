package com.example.bs40;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    EntradaFichero entrada = new EntradaFichero();
    @GetMapping ("/valores")
    public String getValue(@Value("${VAR1}") String var1, @Value("${My.VAR2}") int var2){
        entrada.setVar1(var1);
        entrada.setVar2(var2);
        return "valor de var1 es " + entrada.getVar1()+ ", valor de var2 es "+ entrada.getVar2();
    }


    @GetMapping("/valor")
    public String obtenValor(@Value("${VAR1}") String var1, @Value("${My.VAR2}")  int var2){
        return "valor de var1 es: "+var1+ ", valor de my.var2 es: "+var2;
    }

    @GetMapping("/var3/")
    public String getVar3(@Value("${VAR3:var3 no tiene valor}") String var3){
        return  "valor de var3 es: "+var3;
    }


}
