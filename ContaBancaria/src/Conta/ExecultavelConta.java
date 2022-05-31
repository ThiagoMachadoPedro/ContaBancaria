package Conta;

import javax.swing.JOptionPane;

public class ExecultavelConta {
public static void main(String[] args) {
	Usuario usuario =new Usuario();
	ContaIndividual contaUsuario=new ContaIndividual();
	
	
	String login = JOptionPane.showInputDialog(null, "Qual o LOGIN");
	String senha = JOptionPane.showInputDialog(null, "Qual a SENHA");
	
	if(usuario.getLogin().equalsIgnoreCase(login) && usuario.getSenha().equalsIgnoreCase(senha) ) {
		JOptionPane.showMessageDialog(null, "Acesso Permitido " );
	
		
	contaUsuario.setConta(null);
	contaUsuario.setNome("Thiago");
	contaUsuario.setDeposito(2000);
	contaUsuario.setPagamento(300);
	
	
	
	
	System.out.println(contaUsuario.getSaldo());
	
	
	
	
	
	}else {
		JOptionPane.showMessageDialog(null, "Usuario e senha incorretos");
	}
	}
	
}
