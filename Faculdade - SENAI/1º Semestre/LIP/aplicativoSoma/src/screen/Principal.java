package screen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValor1;
	private JTextField textValor2;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Somar");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 303);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabel2 = new JLabel("Valor 2");
		lblLabel2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel2.setBounds(176, 94, 63, 19);
		contentPane.add(lblLabel2);
		
		JLabel lblTitulo = new JLabel("Aplicativo Soma");
		lblTitulo.setBounds(119, 11, 176, 31);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblTitulo);
		
		JLabel lblLabel1 = new JLabel("Valor 1");
		lblLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLabel1.setBounds(50, 94, 63, 19);
		contentPane.add(lblLabel1);
		
		JLabel lblLabel3 = new JLabel("Resultado");
		lblLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLabel3.setBounds(289, 94, 94, 19);
		contentPane.add(lblLabel3);
		
		textValor1 = new JTextField();
		textValor1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textValor1.setHorizontalAlignment(SwingConstants.CENTER);
		textValor1.setBounds(39, 122, 86, 20);
		contentPane.add(textValor1);
		textValor1.setColumns(10);
		
		textValor2 = new JTextField();
		textValor2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textValor2.setHorizontalAlignment(SwingConstants.CENTER);
		textValor2.setBounds(164, 122, 86, 20);
		contentPane.add(textValor2);
		textValor2.setColumns(10);
		
		textResultado = new JTextField();
		textResultado.setEditable(false);
		textResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textResultado.setBounds(289, 124, 94, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		JLabel lblErro = new JLabel("Clique em Somar");
		lblErro.setForeground(new Color(255, 0, 0));
		lblErro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblErro.setHorizontalAlignment(SwingConstants.CENTER);
		lblErro.setBounds(59, 219, 296, 31);
		contentPane.add(lblErro);
		
		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double valor1 = Double.parseDouble(textValor1.getText().replace(",", "."));
					double valor2 = Double.parseDouble(textValor2.getText().replace(",", "."));
					double resultado = valor1 + valor2;
					textResultado.setText(("" + resultado).replace(".", ",").substring(0,9));
					lblErro.setText("Clique em Somar");
				}
				catch(Exception erro) {
					lblErro.setText("Valor(es) Incorretos(s)!");
				}
			}
		});
		btnSomar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSomar.setBounds(157, 185, 89, 23);
		contentPane.add(btnSomar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(new Color(0, 0, 0));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValor1.setText("");
				textValor2.setText("");
				textResultado.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimpar.setBounds(39, 185, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSair.setBounds(316, 223, 89, 23);
		contentPane.add(btnSair);
	}
}
