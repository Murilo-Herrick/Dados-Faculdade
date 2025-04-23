package principal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTela;
	private JTextField textHistorico;

	private boolean btnClicked = false;
	String valor1 = "";
	String valor2 = "";
	String operador = "";
	double resultado;
	boolean ponto = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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

	public Calculadora() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textTela = new JTextField();
		textTela.setBackground(new Color(255, 255, 255));
		textTela.setEditable(false);
		textTela.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textTela.setHorizontalAlignment(SwingConstants.RIGHT);
		textTela.setBounds(10, 30, 485, 133);
		contentPane.add(textTela);
		textTela.setColumns(10);

		textHistorico = new JTextField();
		textHistorico.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textHistorico.setBackground(new Color(255, 255, 255));
		textHistorico.setEditable(false);
		textHistorico.setHorizontalAlignment(SwingConstants.RIGHT);
		textHistorico.setBounds(10, 182, 287, 53);
		contentPane.add(textHistorico);
		textHistorico.setColumns(10);

		JButton btnN7 = new JButton("7");
		btnN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "7");
			}
		});
		btnN7.setBackground(new Color(240, 240, 240));
		btnN7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnN7.setBounds(10, 246, 89, 73);
		contentPane.add(btnN7);

		JButton btnN8 = new JButton("8");
		btnN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "8");
			}
		});
		btnN8.setBackground(new Color(240, 240, 240));
		btnN8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnN8.setBounds(109, 246, 89, 73);
		contentPane.add(btnN8);

		JButton btnN9 = new JButton("9");
		btnN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "9");
			}
		});
		btnN9.setBackground(new Color(240, 240, 240));
		btnN9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnN9.setBounds(208, 246, 89, 73);
		contentPane.add(btnN9);

		JButton btnCE = new JButton("CE");
		btnCE.setBackground(new Color(240, 240, 240));
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText("");
				btnClicked = false;
				ponto = false;
			}
		});
		btnCE.setBounds(307, 246, 89, 73);
		contentPane.add(btnCE);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTela.setText("");
				textHistorico.setText("");
				btnClicked = false;
				ponto = false;
			}
		});
		btnC.setBackground(new Color(240, 240, 240));
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnC.setBounds(406, 246, 89, 73);
		contentPane.add(btnC);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!btnClicked) {
					valor1 = textTela.getText();
					operador = " / ";
					textHistorico.setText(valor1 + operador);
					textTela.setText("");
					btnClicked = true;
					ponto = false;
				}
			}
		});
		btnDiv.setBackground(new Color(240, 240, 240));
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiv.setBounds(307, 330, 89, 73);
		contentPane.add(btnDiv);

		JButton btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!btnClicked) {
					valor1 = textTela.getText();
					operador = " * ";
					textHistorico.setText(valor1 + operador);
					textTela.setText("");
					btnClicked = true;
					ponto = false;
				}
			}
		});
		btnMult.setBackground(new Color(240, 240, 240));
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMult.setBounds(406, 330, 89, 73);
		contentPane.add(btnMult);

		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!btnClicked) {
					valor1 = textTela.getText();
					operador = " + ";
					textHistorico.setText(valor1 + operador);
					textTela.setText("");
					btnClicked = true;
					ponto = false;
				}
			}
		});
		btnSoma.setBackground(new Color(240, 240, 240));
		btnSoma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSoma.setBounds(406, 414, 89, 159);
		contentPane.add(btnSoma);

		JButton btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!btnClicked) {
					valor1 = textTela.getText();
					operador = " - ";
					textHistorico.setText(valor1 + operador);
					textTela.setText("");
					btnClicked = true;
					ponto = false;
				}
			}
		});
		btnMenos.setBackground(new Color(240, 240, 240));
		btnMenos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMenos.setBounds(307, 414, 89, 70);
		contentPane.add(btnMenos);

		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor1 = textHistorico.getText();
				valor2 = textTela.getText();

				double v1 = Double.parseDouble((valor1).replace(operador, ""));
				double v2 = Double.parseDouble(valor2);

				switch (operador) {

				case " + ":
					resultado = v1 + v2;
					textTela.setText("" + resultado);
					break;

				case " - ":
					resultado = v1 - v2;
					textTela.setText("" + resultado);
					break;

				case " / ":
					resultado = v1 / v2;
					textTela.setText("" + resultado);
					break;

				case " * ":
					resultado = v1 * v2;
					textTela.setText("" + resultado);
					break;
				}
				btnClicked = false;
			}
		});
		btnResultado.setBackground(new Color(240, 240, 240));
		btnResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnResultado.setBounds(307, 501, 89, 72);
		contentPane.add(btnResultado);

		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!ponto) {
					valor1 = textTela.getText();
					textTela.setText(valor1 + ".");
					ponto = true;
				}
			}
		});
		btnPonto.setBackground(new Color(240, 240, 240));
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPonto.setBounds(208, 501, 89, 72);
		contentPane.add(btnPonto);

		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "0");
			}
		});
		btnZero.setBackground(new Color(240, 240, 240));
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnZero.setBounds(10, 501, 188, 72);
		contentPane.add(btnZero);

		JButton btnN4 = new JButton("4");
		btnN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "4");
			}
		});
		btnN4.setBackground(new Color(240, 240, 240));
		btnN4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnN4.setBounds(10, 330, 89, 73);
		contentPane.add(btnN4);

		JButton btnN1 = new JButton("1");
		btnN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "1");
			}
		});
		btnN1.setBackground(new Color(240, 240, 240));
		btnN1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnN1.setBounds(10, 414, 89, 70);
		contentPane.add(btnN1);

		JButton btnN5 = new JButton("5");
		btnN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "5");
			}
		});
		btnN5.setBackground(new Color(240, 240, 240));
		btnN5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnN5.setBounds(109, 330, 89, 73);
		contentPane.add(btnN5);

		JButton btnN6 = new JButton("6");
		btnN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "6");
			}
		});
		btnN6.setBackground(new Color(240, 240, 240));
		btnN6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnN6.setBounds(208, 330, 89, 73);
		contentPane.add(btnN6);

		JButton btnN2 = new JButton("2");
		btnN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "2");
			}
		});
		btnN2.setBackground(new Color(240, 240, 240));
		btnN2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnN2.setBounds(109, 414, 89, 70);
		contentPane.add(btnN2);

		JButton btnN3 = new JButton("3");
		btnN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = textTela.getText();
				textTela.setText(valor1 + "3");
			}
		});
		btnN3.setBackground(new Color(240, 240, 240));
		btnN3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnN3.setBounds(208, 414, 89, 70);
		contentPane.add(btnN3);
	}
}
