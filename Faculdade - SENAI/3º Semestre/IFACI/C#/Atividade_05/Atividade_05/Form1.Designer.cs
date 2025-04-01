namespace Atividade_05
{
    partial class Form1
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
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.timerCOM = new System.Windows.Forms.Timer(this.components);
            this.btConectar = new System.Windows.Forms.Button();
            this.serialPort1 = new System.IO.Ports.SerialPort(this.components);
            this.btEnviar = new System.Windows.Forms.Button();
            this.textBoxEnviar = new System.Windows.Forms.TextBox();
            this.textBoxReceber = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // comboBox1
            // 
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Location = new System.Drawing.Point(33, 12);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(126, 21);
            this.comboBox1.TabIndex = 0;
            this.comboBox1.Text = "COM Ports";
            this.comboBox1.SelectedIndexChanged += new System.EventHandler(this.comboBox1_SelectedIndexChanged);
            // 
            // timerCOM
            // 
            this.timerCOM.Interval = 1000;
            this.timerCOM.Tick += new System.EventHandler(this.timerCOM_Tick);
            // 
            // btConectar
            // 
            this.btConectar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12.25F);
            this.btConectar.Location = new System.Drawing.Point(46, 222);
            this.btConectar.Name = "btConectar";
            this.btConectar.Size = new System.Drawing.Size(113, 40);
            this.btConectar.TabIndex = 1;
            this.btConectar.Text = "&Conectar";
            this.btConectar.UseVisualStyleBackColor = true;
            this.btConectar.Click += new System.EventHandler(this.btConnectar_Click);
            // 
            // btEnviar
            // 
            this.btEnviar.Font = new System.Drawing.Font("Microsoft Sans Serif", 12.25F);
            this.btEnviar.Location = new System.Drawing.Point(257, 222);
            this.btEnviar.Name = "btEnviar";
            this.btEnviar.Size = new System.Drawing.Size(113, 40);
            this.btEnviar.TabIndex = 2;
            this.btEnviar.Text = "&Enviar";
            this.btEnviar.UseVisualStyleBackColor = true;
            this.btEnviar.Click += new System.EventHandler(this.btEnviar_Click);
            // 
            // textBoxEnviar
            // 
            this.textBoxEnviar.Location = new System.Drawing.Point(46, 90);
            this.textBoxEnviar.Multiline = true;
            this.textBoxEnviar.Name = "textBoxEnviar";
            this.textBoxEnviar.Size = new System.Drawing.Size(113, 83);
            this.textBoxEnviar.TabIndex = 3;
            // 
            // textBoxReceber
            // 
            this.textBoxReceber.Location = new System.Drawing.Point(257, 90);
            this.textBoxReceber.Multiline = true;
            this.textBoxReceber.Name = "textBoxReceber";
            this.textBoxReceber.ReadOnly = true;
            this.textBoxReceber.Size = new System.Drawing.Size(113, 83);
            this.textBoxReceber.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12.25F);
            this.label1.Location = new System.Drawing.Point(42, 67);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(61, 20);
            this.label1.TabIndex = 5;
            this.label1.Text = "Enviar:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12.25F);
            this.label2.Location = new System.Drawing.Point(253, 67);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(77, 20);
            this.label2.TabIndex = 6;
            this.label2.Text = "Receber:";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(437, 290);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBoxReceber);
            this.Controls.Add(this.textBoxEnviar);
            this.Controls.Add(this.btEnviar);
            this.Controls.Add(this.btConectar);
            this.Controls.Add(this.comboBox1);
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.Timer timerCOM;
        private System.Windows.Forms.Button btConectar;
        private System.IO.Ports.SerialPort serialPort1;
        private System.Windows.Forms.Button btEnviar;
        private System.Windows.Forms.TextBox textBoxEnviar;
        private System.Windows.Forms.TextBox textBoxReceber;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
    }
}

