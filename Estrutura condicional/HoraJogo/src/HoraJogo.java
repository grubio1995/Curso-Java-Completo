import java.util.Scanner;

/**
 * 
 * @author Gabriel Rubio
 * 
 * Exerc�cio 4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo,
 * sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 
 * hora e m�xima de 24 horas
 * 
 */



public class HoraJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial,horaFinal,duracao;

		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
	
		if(horaFinal == horaInicial)
			duracao = 24;	
		
		else if(horaInicial > horaFinal)
			duracao = 24 - (horaInicial - horaFinal);
	
		else
			duracao = horaFinal - horaInicial ;
		
		if(duracao > 1 && duracao < 25)
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		
		
		sc.close();

	}
}
