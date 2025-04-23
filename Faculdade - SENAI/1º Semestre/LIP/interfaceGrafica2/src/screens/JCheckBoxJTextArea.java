package screens;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class JCheckBoxJTextArea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckBoxJTextArea frame = new JCheckBoxJTextArea();
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
	public JCheckBoxJTextArea() {
		setTitle("Dicas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JCheckBox chckbxColesterol = new JCheckBox("Colesterol Alto");
		chckbxColesterol.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxColesterol.setBounds(20, 66, 150, 38);
		contentPane.add(chckbxColesterol);

		final JCheckBox chckbxDiabetes = new JCheckBox("Diabetes");
		chckbxDiabetes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxDiabetes.setBounds(20, 106, 150, 38);
		contentPane.add(chckbxDiabetes);

		final JCheckBox chckbxHipertensao = new JCheckBox("Hipertens\u00E3o");
		chckbxHipertensao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxHipertensao.setBounds(20, 146, 150, 38);
		contentPane.add(chckbxHipertensao);

		JLabel lblTopo = new JLabel("Selecione as op\u00E7\u00F5es:");
		lblTopo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTopo.setBounds(31, 10, 196, 26);
		contentPane.add(lblTopo);

		final JTextArea textrDicas = new JTextArea();
		textrDicas.setFont(new Font("Monospaced", Font.PLAIN, 17));
		textrDicas.setBounds(176, 66, 239, 131);
		contentPane.add(textrDicas);

		JButton btnDicas = new JButton("Dicas");
		btnDicas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDicas.setBounds(57, 221, 113, 32);
		contentPane.add(btnDicas);

		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSair.setBounds(242, 221, 113, 32);
		contentPane.add(btnSair);

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnDicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textrDicas.setText("");
				if (chckbxColesterol.isSelected()) {
					textrDicas.append("Evite ingerir gordura.\n");
				}
				if (chckbxDiabetes.isSelected()) {
					textrDicas.append("Evite ingerir açúcar.\n");
				}
				if (chckbxHipertensao.isSelected()) {
					textrDicas.append("Evite ingerir sal.\n");
				}
				if (!chckbxColesterol.isSelected() && !chckbxDiabetes.isSelected() && !chckbxHipertensao.isSelected()) {
					textrDicas.append("Dieta sem restrições.\n");
				}
			}
		});
	}
}
