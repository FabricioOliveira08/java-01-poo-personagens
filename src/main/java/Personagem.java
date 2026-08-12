public class Personagem {
    private String nome;
    private int nivel;
    private int vida;
    private int ataque;
    private int defesa;

    public int getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }


    public Personagem(String nome, int nivel, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }



    public void exibirStatus(){
        System.out.println("Personagem: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Nível: " + nivel);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
    }

    public void receberDano(int valorDano) {
       this.vida -= valorDano;
       if(this.vida < 0){
           this.vida = 0;
       }
    }

    public void atacar(Personagem alvo) {
       if(estaVivo()) {
           if(alvo.estaVivo()) {
               int resultadoAtaque = this.ataque - alvo.getDefesa();
               if(resultadoAtaque > 0) {
                   alvo.receberDano(resultadoAtaque);
               }else {
                   System.out.println("O ataque falhou, defesa impenetrável!");
               }
           }else {
               System.out.println("O alvo já está morto!");
           }
       }else {
           System.out.println("O personagem está morto e não pode atacar");
       }

    }

    public boolean estaVivo() {
        if(this.vida == 0) {
            return false;
        }
        return true;
    }
}
