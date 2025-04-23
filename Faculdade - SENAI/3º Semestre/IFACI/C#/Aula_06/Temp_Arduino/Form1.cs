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

namespace Temp_Arduino
{
    public partial class Termometro : Form
    {
        public Termometro()
        {
            InitializeComponent(); // Iinicializa componentes do 
        }
        private void lerTemperatura(Object sender, EventArgs e)
        {
            byte[] dados = new byte[2]; //Buffer para dados(nao utilizados)
            string valor; //Variavel para armazenamento de leitura

            valor = serialPort1.ReadExisting(); // Le todods os dados que serao disponiveis pela porta serial
            if (valor != "")
            {
                thermControl1.UpdateControl(Convert.ToInt32(valor));

                // Limpa buffer da Porta Serial
                serialPort1.DiscardInBuffer();
                serialPort1.DiscardOutBuffer();
            }
        }

        private void serialPort1_DataReceived(object sender, SerialDataReceivedEventArgs e)
        {
            this.Invoke(new EventHandler(lerTemperatura)); // Chama ler temperatura na tread da UI
        }

        private void btIniciar_Click(object sender, EventArgs e)
        {
            if(txPorta.Text != "") // Verifica se foi informada a porta
            {
                serialPort1.PortName = txPorta.Text;
                if (!serialPort1.IsOpen)
                {
                    serialPort1.Open(); // Abre a conexão serial
                }
            }
        }

        private void btFinalizar_Click(object sender, EventArgs e)
        {
            if (serialPort1.IsOpen) // Verifica se foi informada a porta
            {
                serialPort1.Close();
            }
            Application.Exit();
        }
    }
}
