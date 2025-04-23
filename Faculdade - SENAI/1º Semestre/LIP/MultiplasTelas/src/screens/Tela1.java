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

public class Tela1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTela1 = new JLabel("Tela1");
		lblTela1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTela1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblTela1.setBounds(148, 82, 127, 36);
		contentPane.add(lblTela1);
		
		JButton btnTela2 = new JButton("Tela2");
		btnTela2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTela2.setBounds(148, 128, 127, 49);
		contentPane.add(btnTela2);
		
		btnTela2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela2 tela2 = new Tela2();
				//tela2.setModalityType(ModalityType.APPLICATION_MODAL); <--- Deixa a tela como foco Principal
				tela2.setVisible(true);
			}
		});
	}
}
