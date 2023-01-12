package com.alura.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.alura.modelo.ConvertirTemperatura;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaConvercionTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField TfCantidad2;
	ConvertirTemperatura convertir = new ConvertirTemperatura();

	/**
	 * Launch the application.
	 */
	static VentanaConvercionTemperatura frame = new VentanaConvercionTemperatura();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaConvercionTemperatura() {
		setTitle("Conversor.java");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		getContentPane().setBackground(new Color(222, 213, 236));
		contentPane.setLayout(null);
		
		Label label = new Label("Selecione las medidas de temperatura a convertir");
		label.setBounds(34, 15, 350, 39);
		label.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 12));
		label.setAlignment(Label.CENTER);
		contentPane.add(label);
		
		Label LabMoneda = new Label("Principal");
		LabMoneda.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 15));
		LabMoneda.setBounds(30, 74, 94, 22);
		contentPane.add(LabMoneda);
		
		JComboBox CbxPrincipal2 = new JComboBox();
		CbxPrincipal2.setForeground(new Color(44, 49, 235));
		CbxPrincipal2.setBackground(new Color(122, 187, 235));
		CbxPrincipal2.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		CbxPrincipal2.setBounds(30, 102, 111, 31);
		CbxPrincipal2.setModel(new DefaultComboBoxModel(new String[] {"Fahrenheit", "Celsius","Kelvin"}));
		contentPane.add(CbxPrincipal2);
		
		JComboBox CbxSecundaria2 = new JComboBox();
		CbxSecundaria2.setForeground(new Color(44, 49, 235));
		CbxSecundaria2.setBackground(new Color(122, 187, 235));
		CbxSecundaria2.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		CbxSecundaria2.setBounds(300, 102, 124, 31);
		CbxSecundaria2.setModel(new DefaultComboBoxModel(new String[] {"Fahrenheit", "Celsius","Kelvin"}));
		contentPane.add(CbxSecundaria2);
		
		Label LabMoneda_1 = new Label("A convertir");
		LabMoneda_1.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 15));
		LabMoneda_1.setBounds(300, 74, 84, 22);
		contentPane.add(LabMoneda_1);
		
		TfCantidad2 = new JTextField();
		TfCantidad2.setFont(new Font("Gill Sans MT Condensed", Font.PLAIN, 20));
		TfCantidad2.setBounds(151, 102, 139, 31);
		contentPane.add(TfCantidad2);
		TfCantidad2.setColumns(10);
		
		num(TfCantidad2);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setFont(new Font("Gill Sans MT Condensed", Font.PLAIN, 20));
		lblNewLabel.setBounds(193, 74, 63, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnConvertir2 = new JButton("Convertir");
		btnConvertir2.setForeground(new Color(0, 0, 128));
		btnConvertir2.setBackground(new Color(122, 187, 235));
		btnConvertir2.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		btnConvertir2.setBounds(151, 169, 139, 46);
		contentPane.add(btnConvertir2);
		
		JButton btnIinicio2 = new JButton("Inicio");
		btnIinicio2.setForeground(new Color(0, 0, 128));
		btnIinicio2.setBackground(new Color(122, 187, 235));
		btnIinicio2.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		btnIinicio2.setBounds(151, 226, 139, 39);
		contentPane.add(btnIinicio2);
		
		JLabel lbtexto = new JLabel(".");
		lbtexto.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 12));
		lbtexto.setBounds(88, 144, 236, 14);
		contentPane.add(lbtexto);
		
		
		btnConvertir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TfCantidad2.getText().length()==0){
				     System.out.println("No hay texto");
				     JOptionPane.showMessageDialog(null, "Tienes que digitar un monto");
				}
				else{
				String principal = CbxPrincipal2.getSelectedItem().toString();
				String secundaria = CbxSecundaria2.getSelectedItem().toString();
				double cantidad = Double.parseDouble(TfCantidad2.getText());
				double retorno = convertir.ConvertirTemperaturas(cantidad, principal, secundaria);
				lbtexto.setText("Tienes  "+ retorno + " " + secundaria);
				JOptionPane.showMessageDialog(null, "Tienes  "+ retorno +" " + secundaria);
				}
			}
		});
		CbxPrincipal2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lbtexto.setText(".");
			}
		});
		CbxSecundaria2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lbtexto.setText(".");
			}
		});
		
		btnIinicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu.main(null);
				frame.setVisible(false);
			}
		});
	}
	private void num(JTextField a) {
		a.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c) && c !='.') {
					e.consume();
				}
				if(c == '.' && a.getText().contains(".")) {
					e.consume();
				}
			}
		});
	}
}
