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

namespace Atividade_04
{
    public partial class Form1 : Form
    {
        private String tanqueOff = "F:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\tanque_pulmao_Off.png";
        private String tanqueOn = "F:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\tanque_pulmao_On.png";
        private int tempoLiga;
        private int tempoDesliga;

        public Form1()
        {
            InitializeComponent();
            pictureBox1.Image = Image.FromFile(tanqueOff);
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            progressBar1.Value = 20;
            progressBar1.Step = 20;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            toolStripStatusLabel1.Text = DateTime.Now.ToLongDateString();
        }

        // Botao liga
        private void button1_Click(object sender, EventArgs e)
        {
            tempoLiga = 0;
            timer1.Enabled = true;
            pictureBox1.Image = Image.FromFile(tanqueOn);
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
        }

        // Timer para o botao liga
        private void timer1_Tick(object sender, EventArgs e)
        {
            tempoLiga++;
            progressBar1.Step = +20;
            if (tempoLiga <= 4)
            {
                progressBar1.PerformStep();
                label2.Text = progressBar1.Value.ToString();
            }
            if (tempoLiga == 4)
            {
                timer1.Enabled = false;
            }   
        }

        // Botao desliga
        private void button2_Click(object sender, EventArgs e)
        {
            tempoDesliga = 0;
            timer2.Enabled = true;
            pictureBox1.Image = Image.FromFile(tanqueOff);
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
        }

        // Timer para o botao desliga
        private void timer2_Tick(object sender, EventArgs e)
        {
            tempoDesliga++;
            progressBar1.Step = -20;
            if (tempoDesliga <= 4)
            {
                progressBar1.PerformStep();
                label2.Text = progressBar1.Value.ToString();
            }
            if (tempoDesliga == 4)
            {
                timer1.Enabled = false;
            }
        }

        // Botao sair
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

        //Botao Emergencia
        private void button4_Click(object sender, EventArgs e)
        {
            timer1.Enabled = false;
            timer2.Enabled = false;
        }

        // Botoes toolstrip
        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            Process.Start("calc");
        }

        private void toolStripLabel1_Click(object sender, EventArgs e)
        {
            Process.Start("calc");
        }

        private void toolStripButton2_Click(object sender, EventArgs e)
        {
            Process.Start("notepad");
        }

        private void toolStripLabel2_Click(object sender, EventArgs e)
        {
            Process.Start("notepad");
        }

        // Timer de Hora
        private void timer3_Tick(object sender, EventArgs e)
        {
            toolStripStatusLabel2.Text = "Horario: " + DateTime.Now.ToLongTimeString();
        }
    }
}