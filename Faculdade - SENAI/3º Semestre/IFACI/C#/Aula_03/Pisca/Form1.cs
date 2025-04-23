using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Pisca
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            pictureBox1.Image = Image.FromFile("E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Azul.bmp");
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox1.Tag = "Azul";
        }
        // Timer
        private void timer1_Tick(object sender, EventArgs e)
        {
            if (pictureBox1.Tag.ToString() == "Azul") 
            { 
                pictureBox1.Visible = false;
                pictureBox2.Visible = true;
                pictureBox2.Image = Image.FromFile("E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Amarelo.bmp");
                pictureBox2.SizeMode = PictureBoxSizeMode.StretchImage;
                pictureBox1.Tag = "Amarelo";
            } 
            else if (pictureBox1.Tag.ToString() == "Amarelo")
            {
                pictureBox2.Visible = false;
                pictureBox1.Visible = true;
                pictureBox1.Image = Image.FromFile("E:\\Faculdade - SENAI\\3º Semestre\\IFACI\\C#\\Imagens\\Azul.bmp");
                pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
                pictureBox1.Tag = "Azul";
            }
        }
    }
}
