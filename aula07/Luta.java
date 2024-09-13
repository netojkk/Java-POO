package aula07;

import java.util.Random;

/**
 * Luta
 */
public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovada;

    public void marcarLuta(Lutador lut1, Lutador lut2) {
        if (lut1.getCategoria() == lut2.getCategoria() && lut1 != lut2) {
            this.setAprovada(true);
            this.setDesafiado(lut1);
            this.setDesafiante(lut2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);

        }
    }

    public void lutar() {
        if (aprovada) {
            System.out.println("====================================");
            System.out.println("DESAFIANTE");
            System.out.println("====================================");
            this.getDesafiante().apresentar();

            System.out.println("====================================");
            System.out.println("DESAFIADO");
            System.out.println("====================================");
            this.getDesafiado().apresentar();

            Random aleatorio = new Random();

            // Vida dos lutadores
            int vidaDesafiado = 100;
            int vidaDesafiante = 100;

            // atributos dos lutadores #1 desafiante, #2 desafiado
            int forDesafiante = (int) (this.getDesafiante().getPeso() / 4);
            int defDesafiante = (int) (this.getDesafiante().getAltura() / 0.1);

            int forDesafiado = (int) (this.getDesafiado().getPeso() / 4);
            int defDesafiado = (int) (this.getDesafiado().getAltura() / 0.1);

            // Quantidade de rounds para a luta
            int rounds = 10;

            // loop que gera as ações por quantidade de rounds
            for (int i = 1; i <= rounds; i++) {
                System.out.println("============================");
                System.out.println("ROUND: " + i);
                System.out.println("============================");

                // Dado para o ataque, que gera de 0 a 6.
                int dadoAtaque = aleatorio.nextInt(6) + 1;

                int dadoEsquiva = aleatorio.nextInt(6) + 1;

                // resultado booleano aleatorio entre true e false, para decidir quem atacará no
                // round.
                boolean desafianteInicia = aleatorio.nextBoolean();

                // Caso seja true, o desafiante inicia o ataque
                if (desafianteInicia) {

                    if (dadoEsquiva == 6) {
                        System.out.println("O " + this.getDesafiado().getName() + " fez uma esquiva!");
            
                    } else {
                        // chama um metodo para calcular o dano, recebendo atributos como a forca do
                        // atacante, defesa do defensor e o resultado do dado
                        int danoDesafiante = (int) dano(forDesafiante, defDesafiado, dadoAtaque);

                        // Caso o dado seja 6, será um dano critico
                        if (dadoAtaque == 6) {
                            System.out.println(
                                    this.getDesafiante().getName() + " acerta um crítico de " + danoDesafiante);

                        } else {
                            System.out.println("O " + this.getDesafiante().getName() + " causou " + danoDesafiante
                                    + " de dano ao " + this.getDesafiado().getName());
                        }

                        // Atualiza a vida do desafiado após o dano do desafiante
                        vidaDesafiado = vidaDesafiado - danoDesafiante;
                        System.out.println("Vida do " + this.getDesafiado().getName() + " agora é " + vidaDesafiado);

                        if (vidaDesafiado <= 0) {
                            break;
                        }
                    }

                } else {

                    if (dadoEsquiva == 6) {
                        System.out.println("O " + this.getDesafiante().getName() + " fez uma esquiva!");
                    } else {
                        int danoDesafiado = (int) dano(forDesafiado, defDesafiante, dadoAtaque);

                        // Caso o dado seja 6, será um dano critico

                        if (dadoAtaque == 6) {
                            System.out
                                    .println(this.getDesafiado().getName() + " acerta um crítico de " + danoDesafiado);

                        } else {

                            System.out.println("O " + this.getDesafiado().getName() + " causou " + danoDesafiado
                                    + " de dano ao " + this.getDesafiante().getName());
                        }
                        vidaDesafiante = vidaDesafiante - danoDesafiado;
                        System.out.println("Vida do " + this.getDesafiante().getName() + " agora é " + vidaDesafiante);

                        // verifica se o desafiante ainda tem vida para continuar a luta
                        if (vidaDesafiante <= 0) {
                            break;
                        }
                    }

                }

            }

            // Define quem ganhou segundo quem está com a maior vida
            if (rounds == 10 && vidaDesafiado > vidaDesafiante) {
                System.out.println("====================================");
                System.out.println("O vencedor.... é....");
                System.out.println("O desafiado " + this.desafiado.getName() + " vence a luta!");
                this.getDesafiado().ganharLuta();
                this.getDesafiado().status();
                this.getDesafiante().perderLuta();
            } else if (rounds == 10 && vidaDesafiante > vidaDesafiado) {
                System.out.println("====================================");
                System.out.println("O vencedor.... é....");
                System.out.println("O desafiante " + this.desafiante.getName() + " vence a luta!");
                this.getDesafiante().ganharLuta();
                this.getDesafiante().status();
                this.getDesafiado().perderLuta();
            } else {
                System.out.println("//EMPATE//");
                this.getDesafiado().empatarLuta();
                this.getDesafiante().empatarLuta();
            }

        } else {
            System.out.println("A luta não pode acontecer...");
        }

    }

    private int dano(int forAtacante, int defDefensor, int dado) {

        // Definindo o dano padrão subtraindo a defesa do lutador que receberá o dano
        int danoBase = (int) Math.max(0, (forAtacante) - (defDefensor * 0.6));

        // Dano Critico

        switch (dado) {
            case 6:
                // int danoCritico = (int) Math.max(0,danoBase * 3);
                System.out.println("Acerta um critico! QUE INCRIVEL");
                return (int) Math.max(0, danoBase * 3);

            case 5:
                System.out.println("Encaixou um execelente golpe!");
                return (int) Math.max(0, danoBase * 2.5);

            case 4:
                System.out.println("Um bom soco!");
                return Math.max(0, danoBase * 2);

            case 3:
                System.out.println("Acertou!!");
                return (int) Math.max(0, danoBase * 1.5);

            case 2:
                System.out.println("Ao menos não deixou de errar...");
                return (int) Math.max(0, danoBase);

            case 1:
                System.out.println("Que chance disperdiçada...");
                return (int) Math.max(0, danoBase * 0.5);
        }
        return danoBase;

    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}