/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7dejulho;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author sergi
 */
public class WePoligono {
    private Point center;
    private double raio;
    private int nLados;
    private List<Aresta> listaDeArestas = new ArrayList<>();

    public void adicionaNaLista(Aresta aresta){
        
        this.getListaDeArestas().add(aresta);   
    }
    private List<Vertice> listaDeVertices = new ArrayList<>();
        public void adicionaNaLista(Vertice vertice){
        
            this.getListaDeVertices().add(vertice);
    }
    
    private List<Face> listaDeFaces = new ArrayList<>();
        public void adicionaNaLista(Face face){
        
            this.getListaDeFaces().add(face);
    }

    public WePoligono(Poliline poliline) {
    
    this.listaDeVertices = poliline.getListaDeVertices();
    
    }
       
        
    public List<Aresta> getListaDeArestas() {
        return listaDeArestas;
    }

    public void setListaDeArestas(List<Aresta> listaDeArestas) {
        this.listaDeArestas = listaDeArestas;
    }

    public WePoligono(Point center , double raio, double nLados) {
        this.center=center;
        this.raio=raio;
        this.nLados=this.nLados;    
    
    }

    public WePoligono() {
    }
    
    
    public void drawRegular(GraphicsContext graphicsContext){
        Point pointCentral = new Point(this.center);
        Point pIterativo = new Point(pointCentral.getX(),pointCentral.getY()+this.raio);
        /*Transladar o segmento de forma que o centro fique na 
        origem e o segmento permaneca a magnitude*/
        pointCentral.ChangeForTranslade(-this.center.getX(), -this.center.getY());
        pIterativo.ChangeForTranslade(-this.center.getX(), -this.center.getY());
        
        double constanteAngular = 360/(this.nLados);
        int i=0;
        Point pAnterior=new Point(0,0);
        
        while(i<3){
            System.out.println("Loop");
            pAnterior.setX(pIterativo.getX());
            pAnterior.setY(pIterativo.getY());
            pIterativo.ChangeForRotate(Math.toRadians(constanteAngular));
            pointCentral.ChangeForTranslade(this.center.getX(), this.center.getY());
            pIterativo.ChangeForTranslade(this.center.getX(), this.center.getY());
            graphicsContext.strokeLine(pAnterior.getX(), pAnterior.getY(), pIterativo.getX(),pIterativo.getY());
            
            pointCentral.ChangeForTranslade(-this.center.getX(), -this.center.getY());
            pIterativo.ChangeForTranslade(-this.center.getX(), -this.center.getY());
        
i++;        }

    
    }

    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    /**
     * @return the nLados
     */
    public int getnLados() {
        return nLados;
    }

    /**
     * @param nLados the nLados to set
     */
    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    /**
     * @return the listaDeVertices
     */
    public List<Vertice> getListaDeVertices() {
        return listaDeVertices;
    }

    /**
     * @param listaDeVertices the listaDeVertices to set
     */
    public void setListaDeVertices(List<Vertice> listaDeVertices) {
        this.listaDeVertices = listaDeVertices;
    }

    /**
     * @return the listaDeFaces
     */
    public List<Face> getListaDeFaces() {
        return listaDeFaces;
    }

    /**
     * @param listaDeFaces the listaDeFaces to set
     */
    public void setListaDeFaces(List<Face> listaDeFaces) {
        this.listaDeFaces = listaDeFaces;
    }
    
    
    
    
    
    
    
}
