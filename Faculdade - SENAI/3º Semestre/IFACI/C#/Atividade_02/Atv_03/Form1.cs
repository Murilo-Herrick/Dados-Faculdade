using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Atv_03
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            pictureBox1.Image = Image.FromFile("c:\\Imagens\\Vermelho.bmp");
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
        }

        // Botao LIGAR
        private void button1_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = Image.FromFile("c:\\Imagens\\Verde.bmp");
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            textBox1.Text = "Sistema Ligado!";
        }

        // Botao DESLIGAR
        private void button2_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = Image.FromFile("c:\\Imagens\\Vermelho.bmp");
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            textBox1.Text = "Sistema Desligado!";
        }

        // Botao SAIR
        private void button3_Click(object sender, EventArgs e)
        {
            DialogResult dr;
            MessageBoxButtons bot = MessageBoxButtons.YesNo;
            MessageBoxDefaultButton bd = MessageBoxDefaultButton.Button1;
            MessageBoxIcon icon = MessageBoxIcon.Question;
            dr = MessageBox.Show("Realmente deseja sair?", "Sair", bot, icon);

            if (dr == DialogResult.Yes)
            {
                Application.Exit();
            }
        }
    }
}
