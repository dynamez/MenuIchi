package com.development.rayout.menuichi

/**
 * Created by dynam on 06-08-2017.
 */

class ModeloLista {


    internal var name: String = ""
    internal var precio: String = ""
    internal var descripcion: String = ""


    constructor() {}


    constructor(name: String, precio: String, descripcion: String) {
        this.name = name
        this.precio = precio
        this.descripcion = descripcion
    }


}
