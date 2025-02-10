package org.example.carrera_solidaria;

public class KmSolidariosIESMutxamel {
    public static void main(String[] args) {

        //Creación de 2 corredores: Uno con importe establecido y el otro con importe por defecto.
        Corredor corredor1 = new Corredor("Pepe", 0.10);
        Corredor corredor2 = new Corredor("Paco");
        System.out.println(corredor1);
        System.out.println(corredor2);
        //Agregación de patrocinadores al corredor 2
        corredor2.añadirPatrocinador();
        System.out.println(corredor2);


        //Creación de una organización.
        Organizador organizador1 = new Organizador("IV");
        System.out.println(organizador1);
        //Agregación de 2 corredores a la organización.
        organizador1.agregarCorredores(corredor1);
        organizador1.agregarCorredores(corredor2);
        System.out.println(organizador1);
        //Muestra de corredores inscritos.
        organizador1.corredoresInscritos();
        //Establecimiento de vueltas completadas por el corredor 1.
        corredor1.setVueltas_completadas(10);
        System.out.println(corredor1);
        //Calculo de la donación total del corredor 1.
        organizador1.calcularDonacion(corredor1);

    }
}
