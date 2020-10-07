/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7dejulho;

import static java.lang.System.gc;
import java.net.URL;
import java.sql.Time;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Reflection;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import sun.misc.GC;

/**
 *
 * @author sergi
 */
public class FXMLDocumentController implements Initializable {

    int codigoDaOperacao = 0;
    Poliline poliline_i = new Poliline();
    ListaPoligonos listaDePoligonos = new ListaPoligonos();
    boolean clickNaCanvas = false;
    double angulo_i=0;
    Point pInicial = null;
    Point pFinal = null;
    Point pPrimeiro = null;
               WePoligono poligono;

    
    @FXML
    Button btnPoligonoIrregular;
    
    @FXML
    TextField numeroDeLados;
    @FXML
    Canvas canvas = new Canvas(130.0, 4.0);
    GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

    @FXML
    private void clickButtonRegular(Event e) {
       
        if (codigoDaOperacao != 2) {
            codigoDaOperacao = 2;
        } else {
            zeraElementos();
            codigoDaOperacao = 0;

        }
    }    
    
    
    @FXML
    private void clickButtonPoligonoIrregular(Event e) {
       
        if (codigoDaOperacao != 1) {
            codigoDaOperacao = 1;
        } else {
            zeraElementos();
            codigoDaOperacao = 0;

        }
    }
    
    boolean primeiroClick=false;
    @FXML
    private void clickCanvas(MouseEvent e) {
        
        graphicsContext.setLineWidth(3.0);
        switch (codigoDaOperacao) {

            case 1:
                casoPoligonoIrregular(e);
                break;
            case 2:
                casoRegular(e);
                break;
                
                
        }

    }
    
   private void casoRegular(MouseEvent e) {

       if(primeiroClick==false)
       {   this.zeraElementos();
           primeiroClick=true;
           poligono = new WePoligono();
           pInicial = new Point(e.getX(), e.getY());
           pPrimeiro = new Point(pInicial.getX(), pInicial.getY());
       }
       
       if(primeiroClick==true){
           pFinal = new Point(e.getX(), e.getY());
           poligono.setCenter(pPrimeiro);
           poligono.setRaio(4);
           poligono.setnLados(3);
           poligono.drawRegular(graphicsContext);
           graphicsContext = canvas.getGraphicsContext2D();
       }
       
       
       
       
       
       
       
       
   }
    
    
    private void casoPoligonoIrregular(MouseEvent e) {
   
        int codigoDoCaso1 = 0;
        if (pInicial == null) {
            codigoDoCaso1 = 1;
        }
        if (pInicial != null) {
            codigoDoCaso1 = 2;
        }
        
        switch (codigoDoCaso1) {
            //ponto p0
            case 1:
               poliline_i.adicionaLista(new Vertice(new Point(e.getX(),e.getY())));
                pInicial = new Point(e.getX(), e.getY());
                pPrimeiro = new Point(pInicial.getX(), pInicial.getY());
                graphicsContext = canvas.getGraphicsContext2D();
                break;
            //fazer p1 ligado com p0
            case 2:
                pFinal = new Point(e.getX(), e.getY());
                if(e.getButton()==MouseButton.PRIMARY){
                if (pFinal.getX() != pInicial.getX() || pFinal.getY() != pInicial.getY()) {
                    graphicsContext.strokeLine(pInicial.getX(), pInicial.getY(), pFinal.getX(), pFinal.getY());
                    poliline_i.adicionaLista(new Vertice(pFinal));
                    graphicsContext = canvas.getGraphicsContext2D();                   
                }
            
                 pInicial.setX(pFinal.getX());
                 pInicial.setY(pFinal.getY());
                }
                if(e.getButton()==MouseButton.SECONDARY){
                    
                    listaDePoligonos.adicionaNaLista(new WePoligono(poliline_i));
                    pFinal.setX(pPrimeiro.getX());
                    pFinal.setY(pPrimeiro.getY());
      
                    graphicsContext.strokeLine(pInicial.getX(), pInicial.getY(), pFinal.getX(), pFinal.getY());
                    zeraElementos();
                    graphicsContext = canvas.getGraphicsContext2D();
                    //Termina poligono                  
                }
                 break;
        }

    }

    public void zeraElementos(){
        
                    poliline_i = null;  
                    poliline_i = new Poliline();
                    pInicial= null;
                    pFinal = null;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
