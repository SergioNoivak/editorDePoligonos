/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7dejulho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sergi
 */
public class ListaPolilines {
    
    private List<Poliline> listaDePolilines = new ArrayList<>();
    
    public void adicionaLista(Poliline p){
        listaDePolilines.add(p);
    }
    
}
