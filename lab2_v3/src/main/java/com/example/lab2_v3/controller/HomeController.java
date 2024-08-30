package com.example.lab2_v3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Random;


@Controller
public class HomeController {

    @GetMapping("/juego")
    public String configuracionesss(){

        return "bingo";
    }


    @PostMapping("/formularioPost")
    public String guardarConfiguraciones(@RequestParam("tamanhoTarjeta") int tamanhoTarjeta,
                                         @RequestParam("numeroTarjetas") int numeroTarjetas){


        int tamanhoArreglo= tamanhoTarjeta*tamanhoTarjeta;
        int[]   Nombre_del_array = new  int[tamanhoArreglo];
        while(numeroTarjetas>0){

            for (int pos = 0; pos < tamanhoTarjeta; pos++){
                Nombre_del_array[pos] = (int)(Math.random()*99+1);

                System.out.println(Nombre_del_array[pos]);
            }
        }


        return "juego";
    }



}
