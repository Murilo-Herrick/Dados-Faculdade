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

namespace Projeto1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        public class DadosSerial
        {
            public float temp { get; set; }
            public float tensao { get; set; }
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

                    aGauge1.Value = dadosSerial.tensao;  // Atualiza o medidor (assumindo que você tem um controle de gauge)

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

        private void aGauge1_ValueInRangeChanged(object sender, ValueInRangeChangedEventArgs e)
        {
            
        }

        private void serialPort1_DataReceived(object sender, SerialDataReceivedEventArgs e)
        {
            this.Invoke(new EventHandler(lerJson));
        }

        private void btnLigar_Click(object sender, EventArgs e)
        {
            if (txtPorta.Text != "") // Verifica se foi informada a porta
            {
                serialPort1.PortName = txtPorta.Text;
                if (!serialPort1.IsOpen)
                {
                    serialPort1.Open(); // Abre a conexão serial
                }
            }
        }
    }
}
