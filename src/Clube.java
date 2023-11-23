import java.util.ArrayList;

public class Clube {
    private String nome;
    private String cidade;
    private ArrayList<Socio> socios;

    public Clube(String nome, String cidade) {
        this.cidade = cidade;
        this.nome = nome;
        this.socios = new ArrayList<Socio>();
    }

    public void imprimirSocios() {
        for (Socio soc : this.socios) {
            System.out.println(soc.toString());
        }
    }

    public void imprimirSociosMenoresDeIdade() {
        for (Socio soc : this.socios) {
            System.out.println("Melhores de idade:");
            if (soc.getIdade() < 18) {
                System.out.println(soc.toString());
            }
        }
    }

    public double getIdadeMediaSocios() {
        double soma = 0;
        for (Socio soc : this.socios) {
            soma = soma + soc.getIdade();
        }
        return soma / socios.size();
    }

    public void imprimirSociosIdadeMaiorQueMedia() {
        for (Socio soc : this.socios) {
            if (soc.getIdade() > getIdadeMediaSocios()) {
                System.out.println(soc.toString());
            }
        }
    }

    public void addSocio(Socio soc) {
        this.socios.add(soc);
    }

    public double arrecadacaoMensalidade() {
        double valor = 0;
        for (Socio soc : this.socios) {
            valor = valor + soc.getValorMensalidade();
        }
        return valor;
    }

    public boolean removerSocio(int matricula) {
        int posicao = -1;
        //PROCURAR O INDEX
        for (int i = 0; i < this.socios.size(); i++) {
            Socio soc = this.socios.get(i);
            if (soc.getMatricula() == matricula) {
                posicao = i;
            }
        }

        //REMOVER O INDEX
        if (posicao >= 0) {
            this.socios.remove(posicao);
            return true;
        } else {
            return false;
        }
    }
}