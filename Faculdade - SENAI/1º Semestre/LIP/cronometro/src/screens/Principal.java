package screens;

import java.awt.Color;
import java.awt.Dialog.ModalityType;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Cronometro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 187);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTopo = new JLabel("Escolha o tipo de cronometro");
		lblTopo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTopo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTopo.setBounds(67, 11, 283, 43);
		contentPane.add(lblTopo);
		
		JButton btnCrescente = new JButton("Crescente");
		btnCrescente.setFocusTraversalKeysEnabled(false);
		btnCrescente.setFocusable(false);
		btnCrescente.setFocusPainted(false);
		btnCrescente.setBackground(new Color(224, 224, 224));
		btnCrescente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCrescente.setBounds(10, 65, 195, 72);
		contentPane.add(btnCrescente);
		
		JButton btnDecrescente = new JButton("Decrescente");
		btnDecrescente.setFocusPainted(false);
		btnDecrescente.setFocusTraversalKeysEnabled(false);
		btnDecrescente.setFocusable(false);
		btnDecrescente.setBackground(new Color(224, 224, 224));
		btnDecrescente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDecrescente.setBounds(215, 65, 195, 72);
		contentPane.add(btnDecrescente);
		
		btnCrescente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Crescente crescente = new Crescente();
				crescente.setModalityType(ModalityType.APPLICATION_MODAL);
				crescente.setVisible(true);
			}
		});
		
		btnDecrescente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Decrescente decrescente = new Decrescente();
				decrescente.setVisible(true);
			}
		});
	}
}
