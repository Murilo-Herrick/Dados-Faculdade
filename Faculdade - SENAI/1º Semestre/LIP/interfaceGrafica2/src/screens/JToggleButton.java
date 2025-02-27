package screens;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JToggleButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JToggleButton frame = new JToggleButton();
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
	public JToggleButton() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("Interrupitor Digital");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(61, 10, 162, 34);
		contentPane.add(lblTitulo);

		final JLabel lblImagem = new JLabel("");
		lblImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagem.setBounds(10, 38, 264, 363);
		contentPane.add(lblImagem);
		ImageIcon img = new ImageIcon("imagens/OFF.png");
		lblImagem.setIcon(img);

		final javax.swing.JToggleButton tglbtnOnOff = new javax.swing.JToggleButton("ON");
		tglbtnOnOff.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tglbtnOnOff.setBounds(56, 411, 173, 41);
		contentPane.add(tglbtnOnOff);

		tglbtnOnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnOnOff.isSelected()) {
					ImageIcon img = new ImageIcon("imagens/ON.png");
					lblImagem.setIcon(img);
					tglbtnOnOff.setText("OFF");
				} else {
					ImageIcon img = new ImageIcon("imagens/OFF.png");
					lblImagem.setIcon(img);
					tglbtnOnOff.setText("ON");
				}
			}
		});
	}
}
