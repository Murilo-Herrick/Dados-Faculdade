﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EX_01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        // Botao executar
        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.Text = " ADS-Senai";
        }

        // Botao sair
        private void button2_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
