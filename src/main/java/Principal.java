public class Principal {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("A", 15, 200, 80, 60);
        Personagem p2 = new Personagem("B", 10, 0, 260, 100);

        p1.exibirStatus();
        p2.exibirStatus();

        p1.atacar(p2);

        p1.exibirStatus();
        p2.exibirStatus();
    }
}
