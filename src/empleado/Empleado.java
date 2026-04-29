/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;


public class Empleado {
    int id;
    String nombre_libro;
    String autor;
    int Anio;
    int paginas;
    String genero;
    String editorial;
    String idioma;
    int carnet;
        int cantidad;

    public Empleado(int id, String nombre_libro, String autor, int Anio, int paginas, String genero, String editorial, String idioma, int carnet, int cantidad) {
        this.id = id;
        this.nombre_libro = nombre_libro;
        this.autor = autor;
        this.Anio = Anio;
        this.paginas = paginas;
        this.genero = genero;
        this.editorial = editorial;
        this.idioma = idioma;
        this.carnet = carnet;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return Anio;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getCarnet() {
        return carnet;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
}
