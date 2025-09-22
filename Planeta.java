public class Planeta extends CorpoCeleste {
    private int qntdLuas;
    private boolean aneis;
    private boolean vida;

    public int getQntdLuas() {
        return this.qntdLuas;
    }

    public void setQntdLuas(int qntdLuas) {
        this.qntdLuas = qntdLuas;
    }

    public boolean isAneis() {
        return this.aneis;
    }

    public boolean getAneis() {
        return this.aneis;
    }

    public void setAneis(boolean aneis) {
        this.aneis = aneis;
    }

    public boolean isVida() {
        return this.vida;
    }

    public boolean getVida() {
        return this.vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public String getSistema() {
        return this.sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    private String sistema;
}
