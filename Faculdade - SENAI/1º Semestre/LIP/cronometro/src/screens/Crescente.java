package screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class Crescente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	Timer t;
	int contadorSeg = 0;
	int contadorMin = 0;
	int contadorHora = 0;
	boolean pausar = false;
	boolean funcionando = false;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		try {
			Crescente dialog = new Crescente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	public Crescente() {
		setResizable(false);
		setTitle("Cronometro Crescente");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JButton btnZerar = new JButton("Zerar");
		btnZerar.setEnabled(false);
		btnZerar.setFocusPainted(false);
		btnZerar.setFocusable(false);
		btnZerar.setFocusTraversalKeysEnabled(false);
		btnZerar.setBackground(new Color(224, 224, 224));
		btnZerar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnZerar.setBounds(291, 185, 133, 53);
		contentPanel.add(btnZerar);

		JButton btnPausar = new JButton("Pausar");
		btnPausar.setEnabled(false);
		btnPausar.setFocusTraversalKeysEnabled(false);
		btnPausar.setFocusable(false);
		btnPausar.setFocusPainted(false);
		btnPausar.setBackground(new Color(224, 224, 224));
		btnPausar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPausar.setBounds(154, 185, 125, 53);
		contentPanel.add(btnPausar);

		JLabel lblSegundos = new JLabel("00");
		lblSegundos.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSegundos.setBounds(251, 76, 51, 53);
		contentPanel.add(lblSegundos);

		JLabel lblMinutos = new JLabel("00");
		lblMinutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinutos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMinutos.setBounds(174, 76, 51, 53);
		contentPanel.add(lblMinutos);

		JLabel lblHoras = new JLabel("00");
		lblHoras.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHoras.setBounds(103, 76, 51, 53);
		contentPanel.add(lblHoras);

		JLabel lblDoispontos1 = new JLabel(":");
		lblDoispontos1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoispontos1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDoispontos1.setBounds(149, 76, 27, 53);
		contentPanel.add(lblDoispontos1);

		JLabel lblDoispontos2 = new JLabel(":");
		lblDoispontos2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoispontos2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDoispontos2.setBounds(225, 76, 27, 53);
		contentPanel.add(lblDoispontos2);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBackground(new Color(224, 224, 224));
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIniciar.setBounds(10, 185, 133, 53);
		contentPanel.add(btnIniciar);

		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciar.setEnabled(false);
				t = new Timer(1000, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						btnZerar.setEnabled(false);
						btnPausar.setEnabled(isEnabled());
						
						pausar = false;
						if (!pausar) {
							contadorSeg++;
							if (contadorSeg < 60) {
								if (contadorSeg < 10) {
									lblSegundos.setText("0" + contadorSeg);
								} else {
									lblSegundos.setText("" + contadorSeg);
								}
							} else {
								contadorSeg = 0;
								lblSegundos.setText("00");
								contadorMin++;
								if (contadorMin < 60) {
									if (contadorMin < 10) {
										lblMinutos.setText("0" + contadorMin);
									} else {
										lblMinutos.setText("" + contadorMin);
									}
								} else {
									contadorMin = 0;
									lblMinutos.setText("00");
									contadorHora++;

									if (contadorHora < 10) {
										lblHoras.setText("0" + contadorMin);
									}
								}
							}
						}

					}
				});
				t.start();
			}
		});

		btnPausar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciar.setEnabled(true);
				btnZerar.setEnabled(true);
				btnPausar.setEnabled(false);
				t.stop();
				pausar = true;
			}
		});
		
		btnZerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorSeg = 0;
				contadorMin = 0;
				contadorHora = 0;
				
				lblSegundos.setText("00");
				lblMinutos.setText("00");
				lblHoras.setText("00");
				
				btnZerar.setEnabled(false);
			}
		});
	}

}
