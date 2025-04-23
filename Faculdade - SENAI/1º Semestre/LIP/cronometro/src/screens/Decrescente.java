
package screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Decrescente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	Timer t;
	int contadorSeg = 60;
	int contadorMin = 0;
	int contadorHora = 0;
	boolean pausar = false;
	boolean funcionando = false;
	boolean selecionado = false;
	ButtonGroup bg = new ButtonGroup();
	boolean primeiravez = true;
	int minutos = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Decrescente dialog = new Decrescente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Decrescente() {
		setResizable(false);
		setTitle("Cronometro Decrescente");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 433, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setEnabled(false);
		btnIniciar.setFocusable(false);
		btnIniciar.setFocusTraversalKeysEnabled(false);
		btnIniciar.setFocusPainted(false);
		btnIniciar.setBackground(new Color(224, 224, 224));
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnIniciar.setBounds(20, 205, 119, 45);
		contentPanel.add(btnIniciar);

		JButton btnPausar = new JButton("Pausar");
		btnPausar.setEnabled(false);
		btnPausar.setFocusPainted(false);
		btnPausar.setFocusTraversalKeysEnabled(false);
		btnPausar.setFocusable(false);
		btnPausar.setBackground(new Color(224, 224, 224));
		btnPausar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPausar.setBounds(149, 205, 119, 45);
		contentPanel.add(btnPausar);

		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setEnabled(false);
		btnReiniciar.setFocusable(false);
		btnReiniciar.setFocusTraversalKeysEnabled(false);
		btnReiniciar.setFocusPainted(false);
		btnReiniciar.setBackground(new Color(224, 224, 224));
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReiniciar.setBounds(278, 205, 119, 45);
		contentPanel.add(btnReiniciar);

		JLabel lblHoras = new JLabel("00");
		lblHoras.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblHoras.setBounds(100, 93, 51, 53);
		contentPanel.add(lblHoras);

		JLabel lblDoispontos1 = new JLabel(":");
		lblDoispontos1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoispontos1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDoispontos1.setBounds(146, 93, 27, 53);
		contentPanel.add(lblDoispontos1);

		JLabel lblMinutos = new JLabel("00");
		lblMinutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinutos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMinutos.setBounds(171, 93, 51, 53);
		contentPanel.add(lblMinutos);

		JLabel lblDoispontos2 = new JLabel(":");
		lblDoispontos2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoispontos2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDoispontos2.setBounds(222, 93, 27, 53);
		contentPanel.add(lblDoispontos2);

		JLabel lblSegundos = new JLabel("00");
		lblSegundos.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSegundos.setBounds(248, 93, 51, 53);
		contentPanel.add(lblSegundos);

		JRadioButton rdbtn15min = new JRadioButton("15 min");
		rdbtn15min.setBackground(new Color(255, 255, 255));
		rdbtn15min.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtn15min.setBounds(42, 20, 109, 23);
		contentPanel.add(rdbtn15min);

		JRadioButton rdbtn10min = new JRadioButton("10 min");
		rdbtn10min.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtn10min.setBackground(Color.WHITE);
		rdbtn10min.setBounds(159, 20, 109, 23);
		contentPanel.add(rdbtn10min);

		JRadioButton rdbtn5min = new JRadioButton("5 min");
		rdbtn5min.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtn5min.setBackground(Color.WHITE);
		rdbtn5min.setBounds(270, 20, 109, 23);
		contentPanel.add(rdbtn5min);

		bg.add(rdbtn15min);
		bg.add(rdbtn10min);
		bg.add(rdbtn5min);

		rdbtn15min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMinutos.setText("15");
				contadorMin = 15;
				selecionado = true;
				btnIniciar.setEnabled(true);
				minutos = 15;
			}
		});

		rdbtn10min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMinutos.setText("10");
				contadorMin = 10;
				selecionado = true;
				btnIniciar.setEnabled(true);
				minutos = 10;
			}
		});

		rdbtn5min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMinutos.setText("05");
				contadorMin = 1;
				selecionado = true;
				btnIniciar.setEnabled(true);
				minutos = 5;
			}
		});

		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciar.setEnabled(false);
				btnReiniciar.setEnabled(false);
				rdbtn15min.setEnabled(false);
				rdbtn10min.setEnabled(false);
				rdbtn5min.setEnabled(false);
								

				t = new Timer(1000, new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						pausar = false;
						btnPausar.setEnabled(true);
												
						if (selecionado) {
							if (primeiravez) {
								contadorMin += -1;
								primeiravez = false;
							}
							if (!pausar) {
								contadorSeg--;
								if(contadorMin < 10) {
									lblMinutos.setText("0" + contadorMin);
								} else {
									lblMinutos.setText("" + contadorMin);
								}
								
								lblSegundos.setText("59");
								if (contadorSeg > 9) {
									lblSegundos.setText("" + contadorSeg);
								} else {
									lblSegundos.setText("0" + contadorSeg);
								}
								if (contadorSeg == 0 && contadorMin != 0) {
									lblSegundos.setText("00");
									contadorSeg = 60;
									contadorMin += -1;
								}
								if (contadorMin == 0 && contadorSeg == 0) {
									btnPausar.setEnabled(false);
									rdbtn15min.setEnabled(true);
									rdbtn10min.setEnabled(true);
									rdbtn5min.setEnabled(true);
									t.stop();
									pausar = true;
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
				btnReiniciar.setEnabled(true);
				btnPausar.setEnabled(false);
				t.stop();
				pausar = true;
			}
		});
		
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnReiniciar.setEnabled(false);
				rdbtn15min.setEnabled(true);
				rdbtn10min.setEnabled(true);
				rdbtn5min.setEnabled(true);
				primeiravez = true;
				
				switch(minutos) {
				case 15: 
					lblMinutos.setText("15");
					lblSegundos.setText("00");
					contadorMin = 15;
					contadorSeg = 60;
					break;
				
				case 10: 
					lblMinutos.setText("10");
					lblSegundos.setText("00");
					contadorMin = 10;
					contadorSeg = 60;
					break;
					
				case 5:
					lblMinutos.setText("05");
					lblSegundos.setText("00");
					contadorMin = 5;
					contadorSeg = 60;
					break;
				
				default:
					
				}
			}
		});
	}
}
