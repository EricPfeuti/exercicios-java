import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite abaixo a hora inicial e hora final do jogo:");

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int hora;

        if (horaInicial < horaFinal) {
			hora = horaFinal - horaInicial;
		}
		else {
			hora = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + hora + " hora(s);");
        
        sc.close();
    }
}
