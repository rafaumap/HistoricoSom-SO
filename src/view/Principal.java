package view;

import javax.swing.JOptionPane;

import 

import controller.Historico;

public class Principal {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		Historico historico = new Historico();
		
		String[] actionButtons = { "Adicionar histórico", "Consultar último item", "Deletar último item", "Cancelar" };
		
		int opcao = 0;

		do {
			opcao = JOptionPane.showOptionDialog(null, "Qual será a ação?", "Confirmation",
					JOptionPane.INFORMATION_MESSAGE, 0, null, actionButtons, actionButtons[0]);
			
			switch (opcao) {
				case 0:
					String url = JOptionPane.showInputDialog(null, "Insira uma Url válida");
					historico.insereHistorico(pilha, url);
					break;
				case 1:
					historico.consultaHistorico(pilha);
					break;
				case 2:
					historico.removeHistorico(pilha);
					break;
			}

		} while (opcao != 3);

	}

}