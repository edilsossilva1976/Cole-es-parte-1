package br.com.exerciciomodulo11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaSexo {
	
	static Scanner sc = new Scanner(System.in);
	static String nome;
	static char sexo;
	static List<String> listaMasculina = new ArrayList<>();
	static List<String> listaFeminina = new ArrayList<>();
	
	public static void main(String[] args) {
		coletarDados();
		listarListaMasculina();
		listarListaFeminina();
	}
	
	public static void coletarDados() {
		do {
			System.out.print("Digite nome: ");
			nome = sc.next();
			System.out.print("Digite o sexo (M/F): ");
			sexo = sc.next().charAt(0);
			
			
				if(sexo == 'm' || sexo == 'M') {
					incluirListaMasculina(sexo);
				}else if(sexo == 'f' || sexo == 'F'){
					incluirListaFeminina(sexo);
				}else {
					break;
				}
		}while(sexo == 'm' || sexo == 'M' || sexo == 'f' || sexo == 'F');
			
		
	}
	
	public static void incluirListaMasculina(char sexo) {
		listaMasculina.add(nome);
	}
	
	public static void incluirListaFeminina(char sexo) {
		listaFeminina.add(nome);
	}
	
	public static void listarListaMasculina() {
		System.out.println("Lista Masculina:");
		for (String nome : listaMasculina) {
			System.out.println(nome);
		}
		System.out.println("\n");
	}
	
	public static void listarListaFeminina() {
		System.out.println("Lista Feminina:");
		for (String nome : listaFeminina) {
			System.out.println(nome);
		}
		System.out.println("\n");
	}
	
}
