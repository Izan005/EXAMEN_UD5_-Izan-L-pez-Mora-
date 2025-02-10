package org.example.carrera_solidaria;

import java.util.ArrayList;

public class Organizador {
    public final String ORG_DEF = "IES MUTXAMEL";

    private String nombre;
    private String edicion;
    private ArrayList<Corredor> listaCorredores;

    public Organizador(String edicion){
        nombre=ORG_DEF;
        this.edicion=edicion;
        listaCorredores = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void agregarCorredores(Corredor corredor){

        if(listaCorredores.size()>699){
            System.out.println("No se pueden agregar más corredores. Se ha excedido el cupo de 700.");
        } else {
            for (Corredor c : listaCorredores){
                if (c.getNombre().equals(corredor.getNombre()) && c.getDorsal()==corredor.getDorsal()){
                    System.out.println("El corredor ya está en la lista.");
                    return;
                }
            }
            listaCorredores.add(corredor);
        }


    }

    public void corredoresInscritos(){
        for (Corredor c : listaCorredores){
            System.out.println("["+c.getDorsal()+"]. " + c.getNombre());
        }
    }

    public void calcularDonacion(Corredor corredor){
        double donacion_total =  corredor.getImporte_vuelta()*corredor.getVueltas_completadas();
        System.out.println("El corredor " + corredor.getNombre() + " ha conseguido una donación de " + donacion_total+"€");
    }

    @Override
    public String toString() {
        return "Organizador{" +
                "nombre='" + nombre + '\'' +
                ", edicion='" + edicion + '\'' +
                ", listaCorredores=" + listaCorredores +
                '}';
    }
}
