package com.zubiri.Jframe.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Color;

public class Jcheckbox_example extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jcheckbox_example frame = new Jcheckbox_example();
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
	public Jcheckbox_example() {
		setTitle("Examen_Jcheckbox");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 138);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setBackground(Color.YELLOW);
		panel.add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setBackground(Color.MAGENTA);
		panel.add(chckbxB);
		
		JCheckBox chckbxC = new JCheckBox("C");
		chckbxC.setBackground(Color.ORANGE);
		panel.add(chckbxC);
		
		JCheckBox chckbxD = new JCheckBox("D");
		chckbxD.setBackground(Color.GREEN);
		panel.add(chckbxD);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setForeground(Color.WHITE);
		btnOk.setBackground(Color.BLUE);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("----------------------------------");
				if(chckbxA.isSelected()){
					System.out.println("A");
				}
				if(chckbxB.isSelected()){
					System.out.println("B");
				}
				if(chckbxC.isSelected()){
					System.out.println("C");
				}
				if(chckbxD.isSelected()){
					System.out.println("D");
				}
			}
		});
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		panel_1.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(Color.RED);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxA.setSelected(false);
				chckbxB.setSelected(false);
				chckbxC.setSelected(false);
				chckbxD.setSelected(false);
			}
		});
		panel_1.add(btnCancel);
	}

}
