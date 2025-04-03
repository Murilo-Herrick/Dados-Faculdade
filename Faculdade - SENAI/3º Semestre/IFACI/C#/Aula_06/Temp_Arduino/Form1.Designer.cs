namespace Temp_Arduino
{
    partial class Termometro
    {
        /// <summary>
        /// Variável de designer necessária.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpar os recursos que estão sendo usados.
        /// </summary>
        /// <param name="disposing">true se for necessário descartar os recursos gerenciados; caso contrário, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código gerado pelo Windows Form Designer

        /// <summary>
        /// Método necessário para suporte ao Designer - não modifique 
        /// o conteúdo deste método com o editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Termometro));
            this.btIniciar = new System.Windows.Forms.Button();
            this.btFinalizar = new System.Windows.Forms.Button();
            this.txPorta = new System.Windows.Forms.TextBox();
            this.lblPort = new System.Windows.Forms.Label();
            this.thermControl1 = new ThermometerControl.ThermControl();
            this.serialPort1 = new System.IO.Ports.SerialPort(this.components);
            this.SuspendLayout();
            // 
            // btIniciar
            // 
            this.btIniciar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btIniciar.Location = new System.Drawing.Point(21, 531);
            this.btIniciar.Name = "btIniciar";
            this.btIniciar.Size = new System.Drawing.Size(125, 44);
            this.btIniciar.TabIndex = 1;
            this.btIniciar.Text = "Iniciar";
            this.btIniciar.UseVisualStyleBackColor = true;
            this.btIniciar.Click += new System.EventHandler(this.btIniciar_Click);
            // 
            // btFinalizar
            // 
            this.btFinalizar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btFinalizar.Location = new System.Drawing.Point(188, 531);
            this.btFinalizar.Name = "btFinalizar";
            this.btFinalizar.Size = new System.Drawing.Size(125, 44);
            this.btFinalizar.TabIndex = 2;
            this.btFinalizar.Text = "Finalizar";
            this.btFinalizar.UseVisualStyleBackColor = true;
            this.btFinalizar.Click += new System.EventHandler(this.btFinalizar_Click);
            // 
            // txPorta
            // 
            this.txPorta.AllowDrop = true;
            this.txPorta.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F);
            this.txPorta.Location = new System.Drawing.Point(154, 470);
            this.txPorta.Multiline = true;
            this.txPorta.Name = "txPorta";
            this.txPorta.Size = new System.Drawing.Size(122, 20);
            this.txPorta.TabIndex = 3;
            // 
            // lblPort
            // 
            this.lblPort.AutoSize = true;
            this.lblPort.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPort.Location = new System.Drawing.Point(50, 470);
            this.lblPort.Name = "lblPort";
            this.lblPort.Size = new System.Drawing.Size(91, 20);
            this.lblPort.TabIndex = 5;
            this.lblPort.Text = "PortaCOM";
            this.lblPort.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // thermControl1
            // 
            this.thermControl1.Location = new System.Drawing.Point(54, 28);
            this.thermControl1.MinimumSize = new System.Drawing.Size(180, 315);
            this.thermControl1.Name = "thermControl1";
            this.thermControl1.Size = new System.Drawing.Size(222, 403);
            this.thermControl1.TabIndex = 4;
            this.thermControl1.TabStop = false;
            this.thermControl1.Value = 0;
            // 
            // serialPort1
            // 
            this.serialPort1.DataReceived += new System.IO.Ports.SerialDataReceivedEventHandler(this.serialPort1_DataReceived);
            // 
            // Termometro
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Window;
            this.ClientSize = new System.Drawing.Size(344, 610);
            this.Controls.Add(this.lblPort);
            this.Controls.Add(this.thermControl1);
            this.Controls.Add(this.txPorta);
            this.Controls.Add(this.btFinalizar);
            this.Controls.Add(this.btIniciar);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Termometro";
            this.Text = "Termometro";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btIniciar;
        private System.Windows.Forms.Button btFinalizar;
        private System.Windows.Forms.TextBox txPorta;
        private System.Windows.Forms.Label lblPort;
        private ThermometerControl.ThermControl thermControl1;
        private System.IO.Ports.SerialPort serialPort1;
    }
}

