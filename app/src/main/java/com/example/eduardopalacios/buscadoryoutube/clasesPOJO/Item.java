package com.example.eduardopalacios.buscadoryoutube.clasesPOJO;

/**
 * Created by eduardopalacios on 17/05/18.
 */

public class Item {

    String idVideo,titulo,descripcion,imagen;

    public Item(String idVideo,String titulo,String descripcion,String imagen)
    {
        this.idVideo=idVideo;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.imagen=imagen;
    }

    public String getIdVideo() {
        return idVideo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }
}
