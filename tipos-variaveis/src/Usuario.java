
public class Usuario {

	public static void main(String[] args) {
			SmartTv smartTv = new SmartTv();
			
			smartTv.diminuirVolume();
			smartTv.diminuirVolume();
			smartTv.diminuirVolume();
			smartTv.aumentarVolume();
			System.out.println("Volume atual: " +smartTv.volume);
			
			smartTv.mudarCanal(12);
			
			
			System.out.println("TV Ligada? " +smartTv.ligada);
			System.out.println("Canal atual: " +smartTv.canal);
			System.out.println("Volume: " +smartTv.volume);
			
			smartTv.ligar();
			System.out.println("E agora, TV Ligada? " +smartTv.ligada);
	}
}
