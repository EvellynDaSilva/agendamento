package br.senai.sp.jandira.teste;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

	public static void main(String[] args) {
		
		Especialidade e1 = new Especialidade("Cardiologia");
		//e1.setNome("Cardiologia");
		e1.setDescricao("Não  deixa ter um ataque.");
		
		Especialidade e2 = new Especialidade("Gatroenterologia");
		//e2.setNome("Gatroenterologia");
		e2.setDescricao("Não  deixa ficar com dor de barriga.");
		
		Especialidade e4 = new Especialidade("Otorrino","Cuida do ouvido");
		
		Especialidade e3 = new Especialidade("");
		e3.setNome("Qualquer coisa!");
                
                Especialidade e5 = new Especialidade("");
		e5.setNome("Espacialidade 5");
                
                //Exibir a quantidade de espscialidade criadas até agora
                System.out.println(e1.getco);
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);	
		especialidades.add(e2);
		System.out.println(especialidades.size());
		
		// Imprimir no console o nome da especialidades
		// que estão armazenada o arraylist
		int i = 0;
		while (i < especialidades.size()) {
	 		System.out.println(especialidades.get(i).getNome());
			i++;
		}
		// Utilização do for para iteração no arratlist
		
		for(int x = 0; x <especialidades.size(); x++) {
			System.out.println(especialidades.get(x).getNome());
		
		}
		//FOR EACH -> para cada
		for(Especialidade e : especialidades) {
			System.out.println(e.getNome());
		}
		// Criar 3 planos de saúde, armazenar em um arraylist
		//e exibir o nome da operadora de cada um deles
		// usando for each
		PlanoDeSaude p1 = new PlanoDeSaude("Amil");
		PlanoDeSaude p2 = new PlanoDeSaude("Bradesco");
		PlanoDeSaude p3 = new PlanoDeSaude("Notredame");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(p1);
		planos.add(p2);
		planos.add(p3);
		
		System.out.println("------------ for each planos ----------");
		for(PlanoDeSaude a : planos) {
			System.out.println(a.getOperadora());
			System.out.println(a.getQuantidadeidade());
			
		}
		System.out.println("-------" + PlanoDeSaude.getQuantidade());
	
		AgendaApp.main(args);
		
		System.out.println("-------" + PlanoDeSaude.getQuantidade());
		
	}

}
