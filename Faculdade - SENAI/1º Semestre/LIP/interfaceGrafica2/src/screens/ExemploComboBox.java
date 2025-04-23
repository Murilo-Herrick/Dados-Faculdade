package screens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploComboBox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	String[] dia = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExemploComboBox frame = new ExemploComboBox();
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
	public ExemploComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolha = new JLabel("Escolha um dia da semana");
		lblEscolha.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEscolha.setBounds(20, 38, 291, 33);
		contentPane.add(lblEscolha);
		
		final JComboBox cmbDiaDaSemana = new JComboBox();
		cmbDiaDaSemana.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmbDiaDaSemana.setModel(new DefaultComboBoxModel(dia));
		cmbDiaDaSemana.setBounds(20, 81, 210, 33);
		contentPane.add(cmbDiaDaSemana);
		
		final JLabel lblMensagem = new JLabel("");
		lblMensagem.setBackground(new Color(225, 225, 225));
		lblMensagem.setBounds(20, 124, 389, 33);
		contentPane.add(lblMensagem);
		
		cmbDiaDaSemana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText(cmbDiaDaSemana.getSelectedItem()+
				" é o " + (cmbDiaDaSemana.getSelectedIndex() + 1) + "º dia da semana");				
			}
		});
	}
}
