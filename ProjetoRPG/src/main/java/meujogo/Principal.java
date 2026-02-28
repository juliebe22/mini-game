package meujogo;

public class Principal {
    public static void main(String[] args) {
        Personagem player = new Personagem("Aragon", "Humano", 100.0f);

        System.out.println("--- JOGO INICIADO ---");
        player.receberDano(20.0f);
        player.curar(10.0f);
        player.ganharExperiencia(100);
        System.out.println("--- FIM DO TESTE ---");
    }
}