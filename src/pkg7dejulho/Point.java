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
public class Point {
 
    double x;
    double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void ChangeForRotate(double anguloEmRadianos){
      this.x = Math.cos(anguloEmRadianos)*this.x -Math.cos(anguloEmRadianos)*this.y;
      this.y = Math.sin(anguloEmRadianos)*this.x +Math.cos(anguloEmRadianos)*this.y;
    }
    public void ChangeForTranslade(double Tx, double Ty){
        this.x = this.x + Tx;
        this.y = this.y + Ty;        
    }
    public void exibe(){
        System.out.println("( "+this.x+" , "+this.y+" )");
    }
    public double getDistanceOf(Point finalPoint){
        
        double distance = Math.sqrt(Math.pow(this.x - finalPoint.getX(),2) + Math.pow(this.y-finalPoint.getY(), 2));
        return Math.abs(distance);
        
    }

    public Point(Point p) {
        this.x=p.getX();
        this.y=p.getY();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
