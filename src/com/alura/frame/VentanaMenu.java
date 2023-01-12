package com.alura.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaMenu extends JFrame {

	
	/**
	 * Launch the application.
	 */
	
	static VentanaMenu frame = new VentanaMenu();
	
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
	public VentanaMenu() {
		setTitle("Conversor.java");
		getContentPane().setBackground(new Color(222, 213, 236));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 269);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Que tipo de convercion quiere hacer :");
		lblNewLabel.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 20));
		lblNewLabel.setBounds(99, 11, 250, 25);
		getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(44, 49, 235));
		comboBox.setBackground(new Color(122, 187, 235));
		comboBox.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		comboBox.setBounds(66, 53, 314, 35);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Monedas", "Temperatura"}));
		getContentPane().add(comboBox);
		
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setForeground(new Color(0, 0, 128));
		btnIniciar.setBackground(new Color(122, 187, 235));
		btnIniciar.setBounds(66, 138, 99, 51);
		btnIniciar.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		getContentPane().add(btnIniciar);
		
		JButton btnCancelar = new JButton("Finalizar");
		btnCancelar.setForeground(new Color(0, 0, 128));
		btnCancelar.setBackground(new Color(122, 187, 235));
		btnCancelar.setFont(new Font("Gill Sans MT Condensed", Font.BOLD, 25));
		btnCancelar.setBounds(277, 138, 103, 51);
		getContentPane().add(btnCancelar);
		
		
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccion = comboBox.getSelectedItem().toString();
				//System.out.println(seleccion);
				switch (seleccion) {
				case "Monedas": {
					VentanaConvercionMonedas.main(null);
					frame.setVisible(false);
					break;
					}
				
				case "Temperatura": {
					VentanaConvercionTemperatura.main(null);
					frame.setVisible(false);
					break;
					}
				}
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
}
