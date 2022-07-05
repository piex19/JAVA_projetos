package br.com.senaibrasilia.projetoinicial;

import java.awt.Color;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	private JButton btnLogar, btnApagar;
	private FlowLayout layout;     // importe FlowLayour
	private Container container;   // importe Container
	private JLabel label1, label2, label3, tentativaLabel, loginID, loginSenha;
	private JTextField textField;
	private JPasswordField senhaField;
	private String text1 = "Digite seu usuário e sua senha.", userIDText = "Usuário: ", 
			senhaText = "Senha: ", usuario = "senaibrasilia", password = "senai";
	//
	
	public Login() {
		super();
		layout = new FlowLayout(FlowLayout.CENTER);
		container = getContentPane();
		label1 = new JLabel(text1);
		label2 = new JLabel(userIDText);
		label3 = new JLabel(senhaText);
		loginID = new JLabel(usuario);
		loginSenha = new JLabel(password);
		
		btnLogar = new JButton("Login");
		btnApagar = new JButton("Apagar");
		tentativaLabel = new JLabel();
		textField = new JTextField(20);
		senhaField = new JPasswordField(20);
		
		add(label1); 
		add(label2);
		add(textField); 
		add(label3);
		add(senhaField);
		add(tentativaLabel);
		add(btnLogar);
		
		setTitle("SENAI BRASILIA - JAVA");
		setLayout(layout);
		setSize(250,300);
		setLayout(layout);
		setSize(250,300);
		
		btnLogar.addActionListener(this);
		add(btnApagar);
		btnApagar.addActionListener(this);
		
		//tentativaLabel.setBounds(125,250,250,35);
		//tentativaLabel.setFont(new Font(null,Font.BOLD,25));
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent ae) {
		//if(ae.getActionCommand().equals("Login")
		if(ae.getActionCommand().equals("Apagar")) {
			textField.setText("");
			senhaField.setText("");
		}
		
		if(ae.getActionCommand().equals("Login")){
			System.out.println("Usuário: " + textField.getText() + "\nSenha: " + senhaField.getText());
			
			if (ae.getSource() == loginID && ae.getSource() == loginSenha) {
				tentativaLabel.setForeground(Color.green);
				tentativaLabel.setText("Login successful");
				dispose();
				
			  }
			}
		  }
		}
	 