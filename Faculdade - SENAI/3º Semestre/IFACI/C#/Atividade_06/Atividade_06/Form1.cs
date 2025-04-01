using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO.Ports;

namespace Atividade_06
{
    public partial class Form1 : Form
    {
        
        private StringBuilder bufferRecebido = new StringBuilder();
        
        public Form1()
        {
            InitializeComponent();
            timerCOM.Interval = 2000;
            timerCOM.Start();
        }

        // Botao Liga/Desliga
        private void btLigar_Click(object sender, EventArgs e)
        {
            try
            {
                if (btLigar.Text == "Ligar")
                {
                    serialPort1.Write("L\n");
                    btLigar.Text = "Desligar";
                }
                else
                {
                    serialPort1.Write("D\n");
                    btLigar.Text = "Ligar";
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Erro ao enviar comando: " + ex.Message, "Erro", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void atualizaCOMs()
        {
            comboBox1.Items.Clear();
            string[] portas = SerialPort.GetPortNames();

            if (portas.Length == 0)
            {
                comboBox1.Items.Add("Nenhuma Porta Encontrada");
                comboBox1.SelectedIndex = 0;
                return;
            }

            foreach(string porta in portas)
            {
                comboBox1.Items.Add(porta);
            }
            comboBox1.SelectedIndex = 0;
        }

        private void timerCOM_Tick(object sender, EventArgs e)
        {
            atualizaCOMs();
        }

        private void btConectar_Click(object sender, EventArgs e)
        {
            if (serialPort1.IsOpen)
            {
                desconectarSerial();
            }
            else
            {
                conectarSerial();
            }
        }

        private void conectarSerial()
        {
            if (comboBox1.SelectedItem == null || comboBox1.SelectedItem.ToString() == "Nenhuma porta encontrada")
            {
                MessageBox.Show("Selecione uma porta COM valida", "Erro", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return;
            }

            try
            {
                serialPort1.PortName = comboBox1.SelectedItem.ToString();
                serialPort1.BaudRate = 9600;
                serialPort1.Parity = Parity.None;
                serialPort1.DataBits = 8;
                serialPort1.StopBits = StopBits.One;
                serialPort1.Handshake = Handshake.None;

                serialPort1.Open();
                btConectar.Text = "Desconectar";
                comboBox1.Enabled = false;
            }
            catch (Exception ex)
            {
                MessageBox.Show("Erro ao conectar: " +  ex.Message, "Erro", MessageBoxButtons.OK,MessageBoxIcon.Error);
            }
        }

        private void desconectarSerial()
        {
            try
            {
                serialPort1.Close();
                comboBox1.Enabled = true;
                btConectar.Text = "Conectar";
            }
            catch (Exception ex)
            {
                MessageBox.Show("Erro ao desconectar: " + ex.Message, "Erro", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void Form1_FormClosed(object sender, FormClosedEventArgs e)
        {
            if(serialPort1.IsOpen)
            {
                serialPort1.Close();
            }
        }
        private void serialPort1_DataReceived(Object sender, SerialDataReceivedEventArgs e)
        {
            try
            {
                bufferRecebido.Append(serialPort1.ReadExisting());

                if (bufferRecebido.ToString().Contains("\n"))
                {
                    this.Invoke(new EventHandler(trataDadosRecebidos));
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Erro ao receber dados: " + ex.Message, "Erro", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void trataDadosRecebidos(object sender, EventArgs e)
        {
            try
            {
                string[] linhas = bufferRecebido.ToString().Split('\n');
                bufferRecebido.Clear();

                if (linhas.Length > 0)
                {
                    bufferRecebido.Append(linhas[linhas.Length - 1]);
                }

                string dadoRecebido = linhas[0].Trim();

                if (double.TryParse(dadoRecebido, out double valorAnalogico))
                {
                    double tensao = valorAnalogico * (5.0 / 1023);
                    lblValor.Text = $"Tensão: {Math.Round(tensao, 1)} V";
                }
                else
                {
                    lblValor.Text = "Dados invalidos: " + dadoRecebido;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Erro ao processor dados: " + ex.Message, "Erro", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }  
    }
}
