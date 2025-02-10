package org.example.carrera_solidaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Corredor {

    static Scanner entrada = new Scanner(System.in);
    public static int numDorsal = 1;

    private String nombre;
    private int dorsal;
    private ArrayList<String> listaPratocinadores;
    private double importe_vuelta;
    private int vueltas_completadas;


    public Corredor(String nombre, double importe_vuelta){
        this.nombre=nombre;
        dorsal=numDorsal;
        numDorsal++;
        this.importe_vuelta=importe_vuelta;
        listaPratocinadores = new ArrayList<>();

    }

    public Corredor(String nombre){
        this.nombre=nombre;
        dorsal=numDorsal;
        numDorsal++;
        importe_vuelta=0.50;
        listaPratocinadores = new ArrayList<>();

    }


    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public int getVueltas_completadas() {
        return vueltas_completadas;
    }

    public ArrayList<String> getListaPratocinadores() {
        return listaPratocinadores;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVueltas_completadas(int vueltas_completadas) {
        this.vueltas_completadas = vueltas_completadas;
    }

    public void añadirPatrocinador(){

        boolean añadir = true;
        String nombre = "";
        String opc = "";
        do {
            if(añadir){
                System.out.println("Nombre del patrocinador a añadir:");
                nombre=entrada.next();
                listaPratocinadores.add(nombre);
            }

            System.out.println("¿Quieres añadir más patrocinadores?");
            System.out.println("[S] / [N]");
            opc = entrada.next();
            switch(opc.toUpperCase()){
                case "S":
                    añadir = true;
                    break;
                case "N":
                    System.out.println("Saliendo del programa...");
                    añadir=false;
                    break;
                default:
                    System.out.println("Opción no admitida, saliendo del programa...");
                    añadir=false;
                    break;
            }


        }while (añadir);
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "dorsal=" + dorsal +
                ", listaPratocinadores=" + listaPratocinadores +
                ", importe_vuelta=" + importe_vuelta +
                ", vueltas_completadas=" + vueltas_completadas +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
