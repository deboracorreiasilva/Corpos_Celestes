public class CorpoCeleste {
    private String nome;
    private String locEspaco;
    private boolean luzpropria; 
    private float massa;
    private float diametro;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocEspaco() {
        return this.locEspaco;
    }

    public void setLocEspaco(String LocEspaco) {
        this.locEspaco = LocEspaco;
    }

    public boolean isLuzpropria() {
        return this.luzpropria;
    }

    public boolean getLuzpropria() {
        return this.luzpropria;
    }

    public void setLuzpropria(boolean Luzpropria) {
        this.luzpropria = Luzpropria;
    }

    public float getMassa() {
        return this.massa;
    }

    public void setMassa(float massa) {
        this.massa = massa;
    }

    public float getDiametro() {
        return this.diametro;
    }

     public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public String getComposicao() {
        return this.composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public float getOrbita() {
        return this.orbita;
    }

    public void setOrbita(float orbita) {
        this.orbita = orbita;
    }
    private String composicao;
    private float orbita;
}