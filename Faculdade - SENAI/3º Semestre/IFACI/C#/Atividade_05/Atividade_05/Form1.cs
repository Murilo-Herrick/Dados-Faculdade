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
using System.Diagnostics;

namespace Atividade_05
{
    public partial class Form1 : Form
    {

        string RxString;

        public Form1()
        {
            InitializeComponent();
            timerCOM.Enabled = true;
            Console.WriteLine("Sistema iniciado!");
        }

        private void atualizaListaCOMs()
        {

            int i;
            bool quantDiferente;

            i = 0;

            quantDiferente = false;

            // se a qauntidade de portas mudar

            if (comboBox1.Items.Count == SerialPort.GetPortNames().Length)
            {
                foreach (string s in SerialPort.GetPortNames())
                {
                    if (comboBox1.Items[i++].Equals(s) == false)
                    {
                        quantDiferente |= true;
                    }
                }
            }
            else
            {
                quantDiferente = true;
            }
            //se naõ foi detectado diferenças
            if (quantDiferente == false)
            {
                return;     //retorna 

            }

            //limpa combox
            comboBox1.Items.Clear();

            // adiciona todas as COM diponiveis na lista 
            foreach (string s in SerialPort.GetPortNames())
            {
                comboBox1.Items.Add(s);
            }
            //seleciona a primeira posição da lista 

            comboBox1.SelectedItem = 0;
        }

        private void timerCOM_Tick(object sender, EventArgs e)
        {
            atualizaListaCOMs();
        }

        private void btConnectar_Click(object sender, EventArgs e)
        {
            if (serialPort1.IsOpen == false)
            {
                try
                {
                    serialPort1.PortName = comboBox1.Items[comboBox1.SelectedIndex].ToString();
                    serialPort1.Open();
                }
                catch
                {
                    return;
                }
                if (serialPort1.IsOpen)
                {
                    btConectar.Text = "Desconectar";
                    comboBox1.Enabled = false;
                }
            }
            else
            {
                try
                {
                    serialPort1.Close();
                    comboBox1.Enabled = true;
                    btConectar.Text = "Conectar";
                }
                catch
                {
                    return;
                }
            }
        }

        private void Form1_FormClosed(object sender, FormClosedEventArgs e)
        {
                if(serialPort1.IsOpen == true)
                {
                    serialPort1.Close();
                }
            }

        private void btEnviar_Click(object sender, EventArgs e)
        {
            Console.WriteLine("Botao enviar Pressionado");
            textBoxReceber.AppendText("Enviado: " + textBoxEnviar.Text + Environment.NewLine);
            if (serialPort1.IsOpen == true)
            {
                serialPort1.Write(textBoxEnviar.Text);
            }
        }

        private void serialPort1_DataReceived(object sender, SerialDataReceivedEventArgs e)
        {
            RxString = serialPort1.ReadExisting();
            this.Invoke(new EventHandler(trataDadoRecebido));
            Console.WriteLine("Dados recebidos na porta serial.");
        }
        private void trataDadoRecebido(object sender, EventArgs e)
        {
            textBoxReceber.AppendText(RxString);
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
