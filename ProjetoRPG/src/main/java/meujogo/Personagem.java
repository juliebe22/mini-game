package meujogo;

public class Personagem {
    public String nome;
    public int nivel;
    public float pontosVida;
    public String especie;

    public Personagem(String nome, String especie, float vidaInicial) {
        this.nome = nome;
        this.especie = especie;
        this.nivel = 1;
        this.pontosVida = vidaInicial;
    }

    public void receberDano(float valor) {
        this.pontosVida -= valor;
        System.out.println(nome + " recebeu " + valor + " de dano. Vida: " + pontosVida);
    }

    public void ganharExperiencia(int xp) {
        this.nivel++;
        System.out.println(nome + " subiu para o nivel " + nivel + "!");
    }

    public void curar(float quantidade) {
        this.pontosVida += quantidade;
        System.out.println(nome + " foi curado. Vida atual: " + pontosVida);
    }
}