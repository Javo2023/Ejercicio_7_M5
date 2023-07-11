package com.example.ejercicio_7_m5;

public class Presentador {
    private Modelo modelo;
    private VistaPresentador vistaPresentador;

    public Presentador(VistaPresentador vistaPresentador) {
        this.vistaPresentador = vistaPresentador;

        modelo =new Modelo();
    }

    public void evaluarClave(String password){
        int nivelFuerza = modelo.validarClave(password);

        if(nivelFuerza==Modelo.DEBIL){
           this.vistaPresentador.mostrarDebil();

        }
        else if(nivelFuerza==Modelo.MEDIA){
            this.vistaPresentador.mostrarMedio();

        }
        else if(nivelFuerza==Modelo.FUERTE){
            this.vistaPresentador.mostrarFuerte();

        }
        else{ this.vistaPresentador.mostrarError();

        }




    }
}
