public class Estrela extends CorpoCeleste {
    private String tipoEspectral;
    private String luminosidade;
    private String estagioEvolutivo;
    private String tipo;
    private String temperatura;

    public String getTipoEspectral() {
        return this.tipoEspectral;
    }

    public void setTipoEspectral(String tipoEspectral) {
        this.tipoEspectral = tipoEspectral;
    }

    public String getLuminosidade() {
        return this.luminosidade;
    }

    public void setLuminosidade(String luminosidade) {
        this.luminosidade = luminosidade;
    }

    public String getEstagioEvolutivo() {
        return this.estagioEvolutivo;
    }

    public void setEstagioEvolutivo(String estagioEvolutivo) {
        this.estagioEvolutivo = estagioEvolutivo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        if (tipoEspectral.equals("O") ) {
            this.tipo = "Azul";
        } else if (tipoEspectral.equals("B")) {
            this.tipo = "Azul-Branco";
        } else if (tipoEspectral.equals("A")) {
            this.tipo = "Branco";
        } else if (tipoEspectral.equals("F")) {
            this.tipo = "Amarelo-Branco";
        } else if (tipoEspectral.equals("G")) {
            this.tipo = "Amarelo";
        } else if (tipoEspectral.equals("K")) {
            this.tipo = "Laranja-Claro";
        } else if (tipoEspectral.equals("M")) {
            this.tipo = "Vermelho-Alaranjado";
        }
    }

    public String getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
 
}

