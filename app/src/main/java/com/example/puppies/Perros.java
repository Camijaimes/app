package com.example.puppies;

public class Perros {
    private String foto;
    private String nombre;
    private String desc;


    public Perros(String foto, String nombre, String desc) {
        this.foto = foto;
        this.nombre = nombre;
        this.desc = desc;

    }

    public String getFoto() {
        return foto;
    }

    /*  public void setFoto(String foto) {
          this.foto = foto;
      }*/

    public String getNombre() {
        return nombre;
    }

   /* public void setNombre(String nombre) {
        this.nombre = nombre;
    } */

    public String getDesc() {
        return desc;
    }

   /* public void setDesc(String desc) {
        this.desc = desc;
    }*/

}