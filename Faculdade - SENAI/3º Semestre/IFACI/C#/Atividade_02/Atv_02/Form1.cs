using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Atv_02
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        // Botao LIGAR
        private void button1_Click(object sender, EventArgs e)
        {
            MessageBoxButtons bot = MessageBoxButtons.OK;
            MessageBoxIcon icon = MessageBoxIcon.Information;
            MessageBox.Show("Sistema Ligado!", "Ligar", bot, icon);
        }

        // Botao DESLIGAR
        private void button2_Click(object sender, EventArgs e)
        {
            MessageBoxButtons bot = MessageBoxButtons.OK;
            MessageBoxIcon icon = MessageBoxIcon.Information;
            MessageBox.Show("Sistema Desligado!", "Desligar", bot, icon);
        }

        // Botao ERRO
        private void button3_Click(object sender, EventArgs e)
        {
            DialogResult bc;
            MessageBoxButtons bot = MessageBoxButtons.OK;
            MessageBoxIcon icon = MessageBoxIcon.Error;
            bc = MessageBox.Show("Erro no sistema!", "Erro", bot, icon);
        }

        // Botao SAIR
        private void button4_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
