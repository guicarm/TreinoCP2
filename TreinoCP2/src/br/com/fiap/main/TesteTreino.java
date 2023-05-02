package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class TesteTreino {

	public static void main(String[] args) {
	
		
		Empresa objEmpresa = new Empresa(JOptionPane.showInputDialog("Nome da empresa: "),
										JOptionPane.showInputDialog("Tipo de empresa: "),
										JOptionPane.showInputDialog("CNPJ da empresa: "));
		
		
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("Logradouro: "),
											Integer.parseInt(JOptionPane.showInputDialog("Número: ")),
											JOptionPane.showInputDialog("CEP: "),
											JOptionPane.showInputDialog("Bairro: "),
											JOptionPane.showInputDialog("Município: "),
											JOptionPane.showInputDialog("Estado: "));
		
		
		Cliente objCliente = new Cliente(JOptionPane.showInputDialog("Digite o nome do cliente: "),
										JOptionPane.showInputDialog("Digite o RG do cliente: "),
										Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: ")),
										Double.parseDouble(JOptionPane.showInputDialog("Digite a renda do cliente: ")));
		
		
		System.out.println("=========== EMPRESA ===========" + 
						  "\nNome: " + objEmpresa.getNome() +
						  "\nTipo: " + objEmpresa.getTipo() + 
						  "\nCNPJ: " + objEmpresa.getCnpj() +
						  "\n=========== ENDEREÇO ===========" +
						  "\nLogradouro: " + objEndereco.getLogradouro() +
						  "\nNúmero: " + objEndereco.getNumero() +
						  "\nBairro: " + objEndereco.getBairro() +
						  "\nMunicípio: " + objEndereco.getMunicipio() +
						  "\nEstado: " + objEndereco.getEstado() +
						  "\n=========== CLIENTE ===========" +
						  "\nNome: " + objCliente.getNome() +
						  "\nRG: " + objCliente.getRg() +
						  "\nIdade: " + objCliente.getIdade() +
						  "\nRenda: " + objCliente.getRenda());
		
	
	}
}
