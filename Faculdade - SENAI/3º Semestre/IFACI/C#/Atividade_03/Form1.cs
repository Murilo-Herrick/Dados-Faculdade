using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Atividade_03
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            // Rua

            pictureBox2.Image = Image.FromFile("E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Amarelo.bmp");
            pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox3.Image = Image.FromFile("E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Verde.bmp");
            pictureBox3.SizeMode = PictureBoxSizeMode.StretchImage;

            // Avenida
            pictureBox4.Image = Image.FromFile("E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Vermelho.bmp");
            pictureBox4.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox5.Image = Image.FromFile("E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Amarelo.bmp");
            pictureBox5.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox6.Image = Image.FromFile("E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Verde.bmp");
            pictureBox6.SizeMode = PictureBoxSizeMode.StretchImage;
        }

        // Timer Rua
        private void timer1_Tick(object sender, EventArgs e)
        {
            pictureBox1.Image = Image.FromFile("E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Vermelho.bmp");
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox1.Tag = "Vermehlo";
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            toolStripStatusLabel1.Text = DateTime.Now.ToLongDateString();
        }
    }
}
