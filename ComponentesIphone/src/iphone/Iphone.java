package iphone;

import componentes.AparelhoTelefonico;
import componentes.NavegadorInternet;
import componentes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

		public void exibirPagina() {
			System.out.println("Exibindo página web via Iphone");
		}
		public void adicionarNovaAba() {
			System.out.println("Nova aba web aberta via Iphone");
		}
		public void atualizarPagina() {
			System.out.println("Atualizando página web via Iphone");
		}
		public void tocar() {
			System.out.println("Tocando música via App Iphone");
		}
		public void pausar() {
			System.out.println("Música pausada");
		}
		public void selecionarMusica() {
			System.out.println("Selecionando nova música");
		}
		public void ligar() {
			System.out.println("Realizando chamada");
		}
		public void atender() {
			System.out.println("Atendida: Alô!?");
		}
		public void iniciarCorrerioVoz() {
			System.out.println("Correio de voz");
		}
}
