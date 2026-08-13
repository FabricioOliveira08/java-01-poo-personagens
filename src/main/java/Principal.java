public class Principal {
    public static void main(String[] args) {
        Personagem mago = new Personagem("Mago", 10, 200, 80, 70);
        Personagem lancador = new Personagem("Lançador", 10, 200, 100, 80);
        Personagem arqueira = new Personagem("Arqueira", 10, 200, 50, 50);

        Jogador fb = new Jogador("Fb", lancador, 10);

        System.out.println("\n-----------infoJogador-----------\n");

        fb.exibirInfo();

        System.out.println("\n-----------infoPersonagens-----------\n");

        mago.exibirStatus();
        System.out.println("\n--------------\n");
        lancador.exibirStatus();
        System.out.println("\n--------------\n");
        arqueira.exibirStatus();

        System.out.println("\n-----------luta-----------\n");

        mago.atacar(lancador);
        System.out.println("\n--------------\n");
        arqueira.atacar(mago);

        System.out.println("\n-----------infoPersonagens-----------\n");

        mago.exibirStatus();
        System.out.println("\n--------------\n");
        lancador.exibirStatus();
        System.out.println("\n--------------\n");
        arqueira.exibirStatus();
    }
}
