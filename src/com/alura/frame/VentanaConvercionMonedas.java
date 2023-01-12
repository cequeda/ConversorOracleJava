package com.alura.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.alura.modelo.ConvertirMoneda;

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

public class VentanaConvercionMonedas extends JFrame {

	private JPanel contentPane;
	private JTextField TfCantidad;
	ConvertirMoneda convertir = new ConvertirMoneda();

	/**
	 * Launch the application.
	 */
	static VentanaConvercionMonedas frame = new VentanaConvercionMonedas();
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
	public VentanaConvercionMonedas() {
		setTitle("Conversor.java");
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		getContentPane().setBackground(new Color(222, 213, 236));
		contentPane.setLayout(null);
		
		Label label = new Label("Seleciona el tipo de moneda  y a cual moneda vas a convertir");
		label.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 12));
		label.setBounds(34, 15, 350, 39);
		label.setAlignment(Label.CENTER);
		contentPane.add(label);
		
		Label LabMoneda = new Label("Moneda");
		LabMoneda.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 15));
		LabMoneda.setBounds(34, 74, 90, 22);
		contentPane.add(LabMoneda);
		
		JComboBox CbxPrincipal = new JComboBox();
		CbxPrincipal.setForeground(new Color(44, 49, 235));
		CbxPrincipal.setBackground(new Color(122, 187, 235));
		CbxPrincipal.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		CbxPrincipal.setBounds(30, 102, 94, 28);
		CbxPrincipal.setModel(new DefaultComboBoxModel(new String[] {"Colones", "Dolares", "Euros", "Libra Esterlina", "Yen", "Won SurCoreano"}));
		contentPane.add(CbxPrincipal);
		
		JComboBox CbxSecundaria = new JComboBox();
		CbxSecundaria.setForeground(new Color(44, 49, 235));
		CbxSecundaria.setBackground(new Color(122, 187, 235));
		CbxSecundaria.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		CbxSecundaria.setBounds(300, 102, 87, 28);
		CbxSecundaria.setModel(new DefaultComboBoxModel(new String[] {"Colones", "Dolares", "Euros", "Libra Esterlina", "Yen", "Won SurCoreano"}));
		contentPane.add(CbxSecundaria);
		
		Label LabMoneda_1 = new Label("A convertir");
		LabMoneda_1.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 15));
		LabMoneda_1.setBounds(300, 74, 87, 22);
		contentPane.add(LabMoneda_1);
		
		TfCantidad = new JTextField();
		TfCantidad.setFont(new Font("Gill Sans MT Condensed", Font.PLAIN, 20));
		TfCantidad.setBounds(153, 102, 122, 28);
		contentPane.add(TfCantidad);
		TfCantidad.setColumns(10);
		
		num(TfCantidad);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 20));
		lblNewLabel.setBounds(180, 74, 77, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setForeground(new Color(0, 0, 128));
		btnConvertir.setBackground(new Color(122, 187, 235));
		btnConvertir.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		btnConvertir.setBounds(153, 174, 122, 46);
		contentPane.add(btnConvertir);
		
		JButton btnInicio1 = new JButton("Inicio");
		btnInicio1.setForeground(new Color(0, 0, 128));
		btnInicio1.setBackground(new Color(122, 187, 235));
		btnInicio1.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		btnInicio1.setBounds(153, 233, 122, 39);
		contentPane.add(btnInicio1);
		
		JLabel lbtexto = new JLabel(".");
		lbtexto.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 20));
		lbtexto.setBounds(89, 149, 276, 14);
		contentPane.add(lbtexto);
		
		
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TfCantidad.getText().length()==0){
				     System.out.println("No hay texto");
				     JOptionPane.showMessageDialog(null, "Tienes que digitar un monto");
				}
				else{
				String principal = CbxPrincipal.getSelectedItem().toString();
				String secundaria = CbxSecundaria.getSelectedItem().toString();
				double cantidad = Double.parseDouble(TfCantidad.getText());
				double retorno = convertir.ConvertirCantidad(cantidad, principal, secundaria);
				lbtexto.setText("Tienes  "+ retorno + " " + secundaria);
				JOptionPane.showMessageDialog(null, "Tienes  "+ retorno +" " + secundaria);
				}
			}
		});
		CbxPrincipal.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lbtexto.setText(".");
			}
		});
		CbxSecundaria.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lbtexto.setText(".");
			}
		});
		
		btnInicio1.addActionListener(new ActionListener() {
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
