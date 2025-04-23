package screens;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JRadioButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButton frame = new JRadioButton();
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
	public JRadioButton() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSelecionar = new JLabel("Selecione sua faixa et\u00E1ria");
		lblSelecionar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelecionar.setBounds(24, 10, 214, 28);
		contentPane.add(lblSelecionar);

		final javax.swing.JRadioButton rdbtnJovem = new javax.swing.JRadioButton("0 - 15 anos");
		rdbtnJovem.setSelected(true);
		rdbtnJovem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnJovem.setBounds(29, 56, 126, 21);
		contentPane.add(rdbtnJovem);

		final javax.swing.JRadioButton rdbtnAdulto = new javax.swing.JRadioButton("16 - 65 anos");
		rdbtnAdulto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnAdulto.setBounds(24, 96, 126, 21);
		contentPane.add(rdbtnAdulto);

		javax.swing.JRadioButton rdbtnIdoso = new javax.swing.JRadioButton("acima de 65 anos");
		rdbtnIdoso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnIdoso.setBounds(24, 132, 151, 21);
		contentPane.add(rdbtnIdoso);

		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVerificar.setBounds(144, 159, 142, 39);
		contentPane.add(btnVerificar);

		final JLabel lblFaixaEtaria = new JLabel("");
		lblFaixaEtaria.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaixaEtaria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFaixaEtaria.setBounds(22, 207, 391, 46);
		contentPane.add(lblFaixaEtaria);

		bg.add(rdbtnJovem);
		bg.add(rdbtnAdulto);
		bg.add(rdbtnIdoso);

		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnJovem.isSelected()) {
					lblFaixaEtaria.setText("Jovem");
				} else if (rdbtnAdulto.isSelected()) {
					lblFaixaEtaria.setText("Adulto");
				} else {
					lblFaixaEtaria.setText("Idoso");
				}
			}
		});
	}
}
