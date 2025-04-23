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
using System.Linq.Expressions;
using System.Text.Json;
using ThermometerControl;
using System.Diagnostics;
using static ProjectSupervisoryTempAndPoten.mainForm;

namespace ProjectSupervisoryTempAndPoten
{
    public partial class mainForm : Form
    {
        public mainForm()
        {
            InitializeComponent();
            timer2.Enabled = true;
        }

        public class DadosSerial
        {
            public float temp { get; set; }
            public float tensao { get; set; }
            public string led{ get; set; }
        }

        private void atualizaListaCOMs()
        {
            int i;
            bool quantDiferente; // flag para sinalizar que a qunatidade de portas mudou

            i = 0;
            quantDiferente = false;

            // se a quantidade de portas mudou
            if (cmbCOM.Items.Count == SerialPort.GetPortNames().Length)
            {
                foreach (string s in SerialPort.GetPortNames())
                {
                    if (cmbCOM.Items[i++].Equals(s) == false)
                    {
                        quantDiferente = true;
                    }
                }
            }
            else
            {
                quantDiferente = true;
            }

            //Se não foi detectado diferença
            if (quantDiferente == false)
            {
                return; // retorna
            }

            // Limpa comboBox
            cmbCOM.Items.Clear();

            //adiciona todas as COM disponíveis na lista
            foreach (string s in SerialPort.GetPortNames())
            {
                cmbCOM.Items.Add(s);
            }
            //seleciona a primeira posição da lista
            cmbCOM.SelectedIndex = -1;
        }



        private void lerJson(Object sender, EventArgs e)
        {
            try
            {
                // Verificar se a porta serial está aberta
                if (serialPort1.IsOpen)
                {
                    // Lê a string JSON que chega da porta serial
                    string jsonString = serialPort1.ReadLine();

                    // Deserializa a string JSON para a classe DadosSerial
                    DadosSerial dadosSerial = JsonSerializer.Deserialize<DadosSerial>(jsonString);
                    Console.Write(dadosSerial);

                    GaugePotentiometer.Value = dadosSerial.tensao;  // Atualiza o medidor (assumindo que você tem um controle de gauge

                    // Limpa os buffers da porta serial
                    serialPort1.DiscardInBuffer();
                    serialPort1.DiscardOutBuffer();
                }
            }
            catch (Exception ex)
            {
                // Caso ocorra um erro, exibe uma mensagem de erro
                MessageBox.Show($"Erro ao ler ou deserializar os dados: {ex.Message}");
            }
        }

        private void GaugePotentiometer_ValueInRangeChanged(object sender, ValueInRangeChangedEventArgs e)
        {

        }

        private void serialPort1_DataReceived(object sender, SerialDataReceivedEventArgs e)
        {
            this.Invoke(new EventHandler(lerJson));
            this.Invoke(new EventHandler(lerTemperatura)); 
        }

        private void cmbCOM_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            atualizaListaCOMs();
        }

        private void btnConnect_Click(object sender, EventArgs e)
        {
            if (cmbCOM.SelectedIndex > 0) // Verifica se foi informada uma porta
            {
                try
                {
                    serialPort1.PortName = cmbCOM.SelectedItem.ToString(); // Configura a porta serial
                }
                catch
                {
                    MessageBox.Show($"Erro selecione uma porta COM:");
                }
            }
            if (!serialPort1.IsOpen)
            {
                try
                {
                    serialPort1.Open(); // Abre a conexão serial
                    cmbCOM.Enabled = false;
                }
                catch 
                {
                    MessageBox.Show($"Erro ao abrir conexão com a porta serial:");
                }

            }

        }

        private void btnUnconnect_Click(object sender, EventArgs e)
        {
            if (serialPort1.IsOpen)
            {
                try
                {
                    serialPort1.DiscardInBuffer();
                    serialPort1.DiscardOutBuffer();

                    thermControl.UpdateControl(Convert.ToInt32(0));
                    GaugePotentiometer.Value = 0;
                    serialPort1.Close(); //Fecha a conexão serial
                    cmbCOM.Enabled = true;
                } catch
                {
                    MessageBox.Show($"Erro ao desconectar:");
                }

            }
        }

        private void lerTemperatura(object sender, EventArgs e)
        {
            try
            {
                if (serialPort1.IsOpen) // Se rebebeu dados
                {
                    string jsonString = serialPort1.ReadLine();

                    DadosSerial dadosSerial = JsonSerializer.Deserialize<DadosSerial>(jsonString);

                    thermControl.UpdateControl(Convert.ToInt32(dadosSerial.temp));

                    // Limpa Buffer da porta serial
                    serialPort1.DiscardInBuffer();
                    serialPort1.DiscardOutBuffer();
                } 
            } catch (Exception ex)
            {
                MessageBox.Show($"Erro ao ler temperatura: {ex}");
            }
        }

        private void btnLogOut_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void lblHour_Click(object sender, EventArgs e)
        {

        }

        private void timer2_Tick(object sender, EventArgs e)
        {
            lblHour.Text = DateTime.Now.ToLongTimeString();
        }

        private void btnLED_Click(object sender, EventArgs e)
        {

        }
    }
}
