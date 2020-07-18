package com.example.animallist;
// class hewan digunakan untuk menghubungkan data dari data.java dengan listAdapter.java
public class Hewan {
 private String name;

 private String info;
 private int foto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo(){ return info;}
    public void setInfo(String info) {this.info = info;}

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

}
