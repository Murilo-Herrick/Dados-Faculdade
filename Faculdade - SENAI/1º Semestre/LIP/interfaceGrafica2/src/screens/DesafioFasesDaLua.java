package screens;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DesafioFasesDaLua extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	boolean visualizar = false;
	String [] fases ={"**Selecione uma Fase da Lua**", "Nova", "Crescente", "Cheia", "Minguante"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesafioFasesDaLua frame = new DesafioFasesDaLua();
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
	public DesafioFasesDaLua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblImagem = new JLabel("");
		lblImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagem.setBounds(10, 10, 469, 272);
		contentPane.add(lblImagem);
		
		final JComboBox cmbFasesDaLua = new JComboBox();
		cmbFasesDaLua.setModel(new DefaultComboBoxModel(fases));
		cmbFasesDaLua.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmbFasesDaLua.setBounds(83, 307, 323, 72);
		contentPane.add(cmbFasesDaLua);
		
		cmbFasesDaLua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int fase = cmbFasesDaLua.getSelectedIndex();
				
				switch(fase) {
				case 1: 
				ImageIcon Nova = new ImageIcon("imagens/Nova.jpg");
				lblImagem.setIcon(Nova);
				break;
				
				case 2:
				ImageIcon Crescente = new ImageIcon("imagens/Crescente.jpg");
				lblImagem.setIcon(Crescente);
				break;
				
				case 3:
				ImageIcon Cheia= new ImageIcon("imagens/Cheia.jpg");
				lblImagem.setIcon(Cheia);
				break;
					
				case 4:
				ImageIcon Minguante= new ImageIcon("imagens/Minguante.jpg");
				lblImagem.setIcon(Minguante);
				break;
				}
			}
		});
	}
}
