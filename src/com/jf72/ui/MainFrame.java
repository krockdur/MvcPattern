package com.jf72.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	
	private JButton btnTest = new JButton("Connect");
	private JButton btnDisconnect = new JButton("Disconnect");
	private JTextArea txtAreaDebug = new JTextArea();
	
	public MainFrame() {
		setSize(new Dimension(300, 200));
		setTitle("MvcPattern");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel panelNorth = new JPanel();
		panelNorth.setLayout(new GridLayout());
		panelNorth.add(btnTest);
		panelNorth.add(btnDisconnect);
		
		
		this.getContentPane().add(panelNorth, BorderLayout.NORTH);
		this.getContentPane().add(new JScrollPane(txtAreaDebug));

		this.setVisible(true);
	}
	
	public JButton getBtnTest() {
		return this.btnTest;
	}
	
	public JButton getBtnDisconnect() {
		return this.btnDisconnect;
	}
	
	public JTextArea getTxtAreaDebug() {
		return this.txtAreaDebug;
	}
}
