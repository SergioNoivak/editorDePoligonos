/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7dejulho;

/**
 *
 * @author sergi
 */
public class Vertice {
   private Point coordenadas;
    
   private Aresta arestaIncidente;

    public Point getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Point coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Vertice(Point coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Vertice(Point coordenadas, Aresta arestaIncidente) {
        this.coordenadas = coordenadas;
        this.arestaIncidente = arestaIncidente;
    }



    public Aresta getArestaIncidente1() {
        return arestaIncidente;
    }

    public void setArestaIncidente(Aresta arestaIncidente) {
        this.arestaIncidente = arestaIncidente;
    }

  
    
}
