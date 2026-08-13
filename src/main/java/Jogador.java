public class Jogador {
    private String nome;
    private Personagem personagemEscolhido;
    private int pontuacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public Personagem getPersonagemEscolhido() {
        return personagemEscolhido;
    }

    public Jogador(String nome, Personagem personagemEscolhido, int pontuacao){
        this.nome = nome;
        this.personagemEscolhido = personagemEscolhido;
        this.pontuacao = pontuacao;
    }

    public void exibirInfo() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação do Jogador: " + pontuacao);
        if(this.personagemEscolhido != null) {
            personagemEscolhido.exibirStatus();
        }else {
            System.out.println("Nenhum personagem foi escolhido ainda.");
        }
    }

    public void escolherPersonagem(Personagem personagem) {
        if(personagem == null) {
            System.out.println("Não é possível escolher um personagem inválido.");
        }else {
            this.personagemEscolhido = personagem;
        }
    }

    public void adicionaPontos(int pontosAdicionais) {
        if(pontosAdicionais > 0){
            this.pontuacao += pontosAdicionais;
        }

    }

    public void removerPontos(int pontosRemovidos) {
        if(pontosRemovidos > 0) {
            if(pontosRemovidos > this.pontuacao) {
                this.pontuacao = 0;
            }else {
                this.pontuacao -= pontosRemovidos;
            }
        }

    }
}
