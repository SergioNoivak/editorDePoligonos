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
public class Aresta {
    
    
    private Vertice vInicial;
    private Vertice vFinal;
    
    private Face fEsq;
    private Face fDir;
    
    private Aresta FEsqArestaPred;
    private Aresta FEsqArestaSucess;
    
    
    private Aresta FDirArestaPred;
    private Aresta FDirArestaSucess;

    /**
     * @return the vInicial
     */
    public Vertice getvInicial() {
        return vInicial;
    }

    /**
     * @param vInicial the vInicial to set
     */
    public void setvInicial(Vertice vInicial) {
        this.vInicial = vInicial;
    }

    /**
     * @return the vFinal
     */
    public Vertice getvFinal() {
        return vFinal;
    }

    /**
     * @param vFinal the vFinal to set
     */
    public void setvFinal(Vertice vFinal) {
        this.vFinal = vFinal;
    }

    /**
     * @return the fEsq
     */
    public Face getfEsq() {
        return fEsq;
    }

    /**
     * @param fEsq the fEsq to set
     */
    public void setfEsq(Face fEsq) {
        this.fEsq = fEsq;
    }

    /**
     * @return the fDir
     */
    public Face getfDir() {
        return fDir;
    }

    /**
     * @param fDir the fDir to set
     */
    public void setfDir(Face fDir) {
        this.fDir = fDir;
    }

    /**
     * @return the FEsqArestaPred
     */
    public Aresta getFEsqArestaPred() {
        return FEsqArestaPred;
    }

    /**
     * @param FEsqArestaPred the FEsqArestaPred to set
     */
    public void setFEsqArestaPred(Aresta FEsqArestaPred) {
        this.FEsqArestaPred = FEsqArestaPred;
    }

    /**
     * @return the FEsqArestaSucess
     */
    public Aresta getFEsqArestaSucess() {
        return FEsqArestaSucess;
    }

    /**
     * @param FEsqArestaSucess the FEsqArestaSucess to set
     */
    public void setFEsqArestaSucess(Aresta FEsqArestaSucess) {
        this.FEsqArestaSucess = FEsqArestaSucess;
    }

    /**
     * @return the FDirArestaPred
     */
    public Aresta getFDirArestaPred() {
        return FDirArestaPred;
    }

    /**
     * @param FDirArestaPred the FDirArestaPred to set
     */
    public void setFDirArestaPred(Aresta FDirArestaPred) {
        this.FDirArestaPred = FDirArestaPred;
    }

    /**
     * @return the FDirArestaSucess
     */
    public Aresta getFDirArestaSucess() {
        return FDirArestaSucess;
    }

    /**
     * @param FDirArestaSucess the FDirArestaSucess to set
     */
    public void setFDirArestaSucess(Aresta FDirArestaSucess) {
        this.FDirArestaSucess = FDirArestaSucess;
    }
    
    
}
