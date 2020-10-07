/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7dejulho;

import java.util.ArrayList;
import java.util.List;
import static java.util.Spliterators.iterator;

/**
 *
 * @author sergi
 */
public class Poliline {
    
    private List<Vertice> listaDeVertices  =new ArrayList<>();
    public void adicionaLista(Vertice vertice){
        listaDeVertices.add(vertice);
    } 

    public List<Vertice> getListaDeVertices() {
        return listaDeVertices;
    }
    
    
    
    
    public void exibe(){
    int i;
    for(i=0;i<listaDeVertices.size();i++){
        System.out.print("\n (");
        System.out.print(listaDeVertices.get(i).getCoordenadas().getX()+" , ");
        System.out.print(listaDeVertices.get(i).getCoordenadas().getY());
        System.out.print(") \n ");
    }
}
    
    public void erase(){
        
        this.listaDeVertices=null;
        
    }
    
}
