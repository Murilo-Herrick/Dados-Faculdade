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
using System.Diagnostics;

namespace Atividade_03
{
    public partial class Form1 : Form
    {
        private int tempo = 0;
        private int tempoAmarelo = 0;
        private bool rua = false;
        private int tempoEmergencia = 0;
        private String amarelo = "E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Amarelo.bmp";
        private String verde = "E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Verde.bmp";
        private String vermelho = "E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Vermelho.bmp";


        public Form1()
        {
            InitializeComponent();
        }

        // Timer Rua
        private void timer1_Tick(object sender, EventArgs e)
        {
            tempo++;

            if (tempo % 3 == 0)
            {
                alternarSemaforoRua();
                tempo = 0;
            }
        }

        // Timer amarelo
        private void timer2_Tick(object sender, EventArgs e)
        {
            tempoAmarelo++;
            int restoDiv = 0;

            // If para deixar amarelo na avenida
            if (tempoAmarelo % 2 == restoDiv && !rua)
            {
                // Avenida Amarelo
                pictureBox2.Image = Image.FromFile(amarelo);
                pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
                pictureBox2.Tag = "Amarelo";
                restoDiv += 2;
                rua = true;
                timer2.Enabled = false;  
            }

            // if para deixar amarelo na rua
            if (tempoAmarelo % 2 == restoDiv && rua)
            {
                // Rua Amarelo
                pictureBox1.Image = Image.FromFile(amarelo);
                pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
                pictureBox1.Tag = "Amarelo";
                restoDiv += 2;
                rua = false;
                timer2.Enabled = false;
            }
        }

        private void alternarSemaforoRua()
        {
            timer2.Enabled = true;

            if (!rua)
            {
                // Rua vermelho
                pictureBox1.Image = Image.FromFile(vermelho);
                pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
                pictureBox1.Tag = "Vermelho";

                // Avenida Verde
                pictureBox2.Image = Image.FromFile(verde);
                pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
                pictureBox2.Tag = "Verde";
            }

            if (rua)
            {
                // Rua Verde
                pictureBox1.Image = Image.FromFile(verde);
                pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
                pictureBox1.Tag = "Verde";

                // Avenida Vermelho
                pictureBox2.Image = Image.FromFile(vermelho);
                pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
                pictureBox2.Tag = "Vermelho";
            }

        }


        private void Form1_Load(object sender, EventArgs e)
        {
            toolStripStatusLabel1.Text = DateTime.Now.ToLongDateString();
        }

        //Botao ligar
        private void button1_Click(object sender, EventArgs e)
        {
            timer1.Enabled = true;
        }

        //Botao deslgiar
        private void button2_Click(object sender, EventArgs e)
        {
            timer1.Enabled = false;
            timer2.Enabled = false;
        }

        // Botao Sair
        private void button3_Click(object sender, EventArgs e)
        {
            DialogResult dr;
            MessageBoxButtons mb = MessageBoxButtons.YesNo;
            MessageBoxIcon icon = MessageBoxIcon.Question;
            MessageBoxDefaultButton defaultButton = MessageBoxDefaultButton.Button1;
            dr = MessageBox.Show("Realmente deseja sair?", "Sair", mb, icon);
            switch (dr)
            {
                case DialogResult.Yes:
                    Application.Exit();
                    break;
                case DialogResult.No:
                    break;
            }
            
        }

        // Botao emergencia
        private void button4_Click(object sender, EventArgs e)
        {
            timer1.Enabled = false;
            timer2.Enabled = false;
            timer3.Enabled = true;

            // Rua Amarelo
            pictureBox1.Image = Image.FromFile(amarelo);
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox1.Tag = "Amarelo";

            // Avenida Amarelo
            pictureBox2.Image = Image.FromFile(amarelo);
            pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox2.Tag = "Amarelo";
        }

        // timer de emergencia
        private void timer3_Tick(object sender, EventArgs e)
        {
            tempoEmergencia++;

            if (tempoEmergencia % 5 == 0)
            {
                timer1.Enabled = true;
                timer3.Enabled = false;
            }
        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            Process.Start("https://www.policiamilitar.sp.gov.br/");
        }

        private void toolStripButton2_Click(object sender, EventArgs e)
        {
            Process.Start("https://www.corpodebombeiros.sp.gov.br/#/");
        }
    }
}
