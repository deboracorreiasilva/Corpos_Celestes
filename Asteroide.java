public class Asteroide extends CorpoCeleste {
    private String tipoOrbital;
    private String grupoOrbital;
    private boolean perigoso;

    public String getTipoOrbital() {
        return this.tipoOrbital;
    }

    public void setTipoOrbital(String tipoOrbital) {
        this.tipoOrbital = tipoOrbital;
    }

    public String getGrupoOrbital() {
        return this.grupoOrbital;
    }

    public void setGrupoOrbital(String grupoOrbital) {
        this.grupoOrbital = grupoOrbital;
    }

    public boolean isPerigoso() {
        return this.perigoso;
    }

    public boolean getPerigoso() {
        return this.perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }
}
