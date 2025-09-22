public class Principal {
    public static void main(String[] args) {
      
    Asteroide Ceres = new Asteroide();
    Ceres.setNome("Ceres");
    Ceres.setDiametro(939.4f);
    Ceres.setMassa(9.393e20f);
    Ceres.setLocEspaco("Cinturão de Asteroides");
    Ceres.setLuzpropria(false);
    Ceres.setComposicao("Rochoso");
    Ceres.setTipoOrbital("Asteroide");
    Ceres.setGrupoOrbital("Cinturão Principal");
    Ceres.setPerigoso(false);
    

    Asteroide Vesta = new Asteroide();
    Vesta.setNome("Vesta");
    Vesta.setDiametro(525.4f);
    Vesta.setMassa(2.59076e20f);
    Vesta.setLocEspaco("Cinturão de Asteroides");
    Vesta.setLuzpropria(false);
    Vesta.setComposicao("Rochoso");
    Vesta.setTipoOrbital("Asteroide");
    Vesta.setGrupoOrbital("Cinturão Principal");
    Vesta.setPerigoso(false);


    Estrela Sol = new Estrela();
    Sol.setNome("Sol");
    Sol.setDiametro(1.3927e6f);
    Sol.setMassa(1.989e30f);
    Sol.setLocEspaco("Centro do Sistema Solar");
    Sol.setLuzpropria(true);
    Sol.setComposicao("Hidrogênio e Hélio");
    Sol.setTipoEspectral("G");
    Sol.setLuminosidade("1 L☉");
    Sol.setEstagioEvolutivo("Sequência Principal");
    Sol.setTipo("Amarelo");
    Sol.setTemperatura("5.778 K");

    Estrela Sirius = new Estrela();
    Sirius.setNome("Sirius");
    Sirius.setDiametro(2.3756e6f);
    Sirius.setMassa(4.018e30f);
    Sirius.setLocEspaco("Constelação de Cão Maior");
    Sirius.setLuzpropria(true);
    Sirius.setComposicao("Hidrogênio e Hélio");
    Sirius.setTipoEspectral("A");
    Sirius.setLuminosidade("25.4 L☉");
    Sirius.setEstagioEvolutivo("Sequência Principal");

    Planeta Terra = new Planeta();
    Terra.setNome("Terra");
    Terra.setDiametro(12742f);
    Terra.setMassa(5.972e24f);
    Terra.setLocEspaco("Sistema Solar");
    Terra.setLuzpropria(false);
    Terra.setComposicao("Rochoso");
    Terra.setQntdLuas(1);
    Terra.setAneis(false);
    Terra.setVida(true);

    Planeta Saturno = new Planeta();
    Saturno.setNome("Saturno");
    Saturno.setDiametro(116460f);
    Saturno.setMassa(5.683e26f);
    Saturno.setLocEspaco("Sistema Solar");
    Saturno.setLuzpropria(false);
    Saturno.setComposicao("Gasoso");
    Saturno.setQntdLuas(83);
    Saturno.setAneis(true);
    Saturno.setVida(false);
    }
}


