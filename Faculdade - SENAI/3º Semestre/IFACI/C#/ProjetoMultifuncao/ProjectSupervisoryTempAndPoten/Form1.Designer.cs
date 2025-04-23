namespace ProjectSupervisoryTempAndPoten
{
    partial class mainForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(mainForm));
            System.Windows.Forms.AGaugeLabel aGaugeLabel3 = new System.Windows.Forms.AGaugeLabel();
            System.Windows.Forms.AGaugeRange aGaugeRange9 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeRange aGaugeRange10 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeRange aGaugeRange11 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeRange aGaugeRange12 = new System.Windows.Forms.AGaugeRange();
            this.tsMenu = new System.Windows.Forms.ToolStrip();
            this.lblCOM = new System.Windows.Forms.ToolStripLabel();
            this.cmbCOM = new System.Windows.Forms.ToolStripComboBox();
            this.btnConnect = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.btnUnconnect = new System.Windows.Forms.ToolStripButton();
            this.tsTaskBar = new System.Windows.Forms.ToolStrip();
            this.btnLogOut = new System.Windows.Forms.ToolStripButton();
            this.lblHour = new System.Windows.Forms.ToolStripLabel();
            this.tbcPages = new System.Windows.Forms.TabControl();
            this.tbpTemperaturePotentiometer = new System.Windows.Forms.TabPage();
            this.thermControl = new ThermometerControl.ThermControl();
            this.GaugePotentiometer = new System.Windows.Forms.AGauge();
            this.tbpLed = new System.Windows.Forms.TabPage();
            this.btnLED = new System.Windows.Forms.Button();
            this.pictureBoxLEDDesligado = new System.Windows.Forms.PictureBox();
            this.serialPort1 = new System.IO.Ports.SerialPort(this.components);
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.timer2 = new System.Windows.Forms.Timer(this.components);
            this.pictureBoxLEDLigado = new System.Windows.Forms.PictureBox();
            this.tsMenu.SuspendLayout();
            this.tsTaskBar.SuspendLayout();
            this.tbcPages.SuspendLayout();
            this.tbpTemperaturePotentiometer.SuspendLayout();
            this.tbpLed.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxLEDDesligado)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxLEDLigado)).BeginInit();
            this.SuspendLayout();
            // 
            // tsMenu
            // 
            this.tsMenu.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.tsMenu.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.lblCOM,
            this.cmbCOM,
            this.btnConnect,
            this.toolStripSeparator1,
            this.btnUnconnect});
            this.tsMenu.LayoutStyle = System.Windows.Forms.ToolStripLayoutStyle.HorizontalStackWithOverflow;
            this.tsMenu.Location = new System.Drawing.Point(0, 0);
            this.tsMenu.Name = "tsMenu";
            this.tsMenu.Padding = new System.Windows.Forms.Padding(0, 0, 1, 10);
            this.tsMenu.Size = new System.Drawing.Size(1057, 45);
            this.tsMenu.TabIndex = 1;
            this.tsMenu.Text = "toolStrip1";
            // 
            // lblCOM
            // 
            this.lblCOM.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCOM.Margin = new System.Windows.Forms.Padding(5, 9, 0, 0);
            this.lblCOM.Name = "lblCOM";
            this.lblCOM.Padding = new System.Windows.Forms.Padding(10, 0, 0, 0);
            this.lblCOM.Size = new System.Drawing.Size(47, 26);
            this.lblCOM.Text = "COM";
            // 
            // cmbCOM
            // 
            this.cmbCOM.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cmbCOM.FlatStyle = System.Windows.Forms.FlatStyle.Standard;
            this.cmbCOM.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cmbCOM.Items.AddRange(new object[] {
            "Selecione..."});
            this.cmbCOM.Margin = new System.Windows.Forms.Padding(1, 9, 0, 0);
            this.cmbCOM.Name = "cmbCOM";
            this.cmbCOM.Size = new System.Drawing.Size(121, 26);
            this.cmbCOM.SelectedIndexChanged += new System.EventHandler(this.cmbCOM_SelectedIndexChanged);
            // 
            // btnConnect
            // 
            this.btnConnect.Alignment = System.Windows.Forms.ToolStripItemAlignment.Right;
            this.btnConnect.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(255)))), ((int)(((byte)(192)))));
            this.btnConnect.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnConnect.Image = ((System.Drawing.Image)(resources.GetObject("btnConnect.Image")));
            this.btnConnect.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnConnect.Margin = new System.Windows.Forms.Padding(0, 9, 5, 0);
            this.btnConnect.Name = "btnConnect";
            this.btnConnect.Padding = new System.Windows.Forms.Padding(3);
            this.btnConnect.Size = new System.Drawing.Size(90, 26);
            this.btnConnect.Text = "Conectar";
            this.btnConnect.Click += new System.EventHandler(this.btnConnect_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Alignment = System.Windows.Forms.ToolStripItemAlignment.Right;
            this.toolStripSeparator1.BackColor = System.Drawing.Color.Black;
            this.toolStripSeparator1.ForeColor = System.Drawing.Color.Black;
            this.toolStripSeparator1.Margin = new System.Windows.Forms.Padding(0, 9, 5, 0);
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(6, 26);
            // 
            // btnUnconnect
            // 
            this.btnUnconnect.Alignment = System.Windows.Forms.ToolStripItemAlignment.Right;
            this.btnUnconnect.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.btnUnconnect.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnUnconnect.Image = ((System.Drawing.Image)(resources.GetObject("btnUnconnect.Image")));
            this.btnUnconnect.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnUnconnect.Margin = new System.Windows.Forms.Padding(0, 9, 5, 0);
            this.btnUnconnect.Name = "btnUnconnect";
            this.btnUnconnect.Padding = new System.Windows.Forms.Padding(3);
            this.btnUnconnect.Size = new System.Drawing.Size(111, 26);
            this.btnUnconnect.Text = "Desconectar";
            this.btnUnconnect.Click += new System.EventHandler(this.btnUnconnect_Click);
            // 
            // tsTaskBar
            // 
            this.tsTaskBar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(224)))), ((int)(((byte)(224)))));
            this.tsTaskBar.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.tsTaskBar.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnLogOut,
            this.lblHour});
            this.tsTaskBar.Location = new System.Drawing.Point(0, 652);
            this.tsTaskBar.Name = "tsTaskBar";
            this.tsTaskBar.Size = new System.Drawing.Size(1057, 34);
            this.tsTaskBar.TabIndex = 2;
            this.tsTaskBar.Text = "toolStrip1";
            // 
            // btnLogOut
            // 
            this.btnLogOut.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(192)))));
            this.btnLogOut.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnLogOut.Image = ((System.Drawing.Image)(resources.GetObject("btnLogOut.Image")));
            this.btnLogOut.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.btnLogOut.Margin = new System.Windows.Forms.Padding(5);
            this.btnLogOut.Name = "btnLogOut";
            this.btnLogOut.Padding = new System.Windows.Forms.Padding(2);
            this.btnLogOut.Size = new System.Drawing.Size(57, 24);
            this.btnLogOut.Text = "Sair";
            this.btnLogOut.Click += new System.EventHandler(this.btnLogOut_Click);
            // 
            // lblHour
            // 
            this.lblHour.Alignment = System.Windows.Forms.ToolStripItemAlignment.Right;
            this.lblHour.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblHour.Name = "lblHour";
            this.lblHour.Size = new System.Drawing.Size(57, 31);
            this.lblHour.Text = "00:00:00";
            this.lblHour.Click += new System.EventHandler(this.lblHour_Click);
            // 
            // tbcPages
            // 
            this.tbcPages.Alignment = System.Windows.Forms.TabAlignment.Bottom;
            this.tbcPages.Controls.Add(this.tbpTemperaturePotentiometer);
            this.tbcPages.Controls.Add(this.tbpLed);
            this.tbcPages.Cursor = System.Windows.Forms.Cursors.Arrow;
            this.tbcPages.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tbcPages.Font = new System.Drawing.Font("Arial", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tbcPages.Location = new System.Drawing.Point(0, 45);
            this.tbcPages.Name = "tbcPages";
            this.tbcPages.SelectedIndex = 0;
            this.tbcPages.Size = new System.Drawing.Size(1057, 607);
            this.tbcPages.TabIndex = 3;
            // 
            // tbpTemperaturePotentiometer
            // 
            this.tbpTemperaturePotentiometer.BackColor = System.Drawing.Color.White;
            this.tbpTemperaturePotentiometer.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.tbpTemperaturePotentiometer.Controls.Add(this.thermControl);
            this.tbpTemperaturePotentiometer.Controls.Add(this.GaugePotentiometer);
            this.tbpTemperaturePotentiometer.ImeMode = System.Windows.Forms.ImeMode.NoControl;
            this.tbpTemperaturePotentiometer.Location = new System.Drawing.Point(4, 4);
            this.tbpTemperaturePotentiometer.Name = "tbpTemperaturePotentiometer";
            this.tbpTemperaturePotentiometer.Padding = new System.Windows.Forms.Padding(3);
            this.tbpTemperaturePotentiometer.Size = new System.Drawing.Size(1049, 580);
            this.tbpTemperaturePotentiometer.TabIndex = 0;
            this.tbpTemperaturePotentiometer.Text = "Temperatura e Potenciômetro";
            // 
            // thermControl
            // 
            this.thermControl.Location = new System.Drawing.Point(765, 26);
            this.thermControl.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.thermControl.MinimumSize = new System.Drawing.Size(210, 339);
            this.thermControl.Name = "thermControl";
            this.thermControl.Size = new System.Drawing.Size(210, 508);
            this.thermControl.TabIndex = 2;
            this.thermControl.Value = 0;
            // 
            // GaugePotentiometer
            // 
            this.GaugePotentiometer.BackColor = System.Drawing.Color.White;
            this.GaugePotentiometer.BaseArcColor = System.Drawing.Color.Gray;
            this.GaugePotentiometer.BaseArcRadius = 100;
            this.GaugePotentiometer.BaseArcStart = 135;
            this.GaugePotentiometer.BaseArcSweep = 270;
            this.GaugePotentiometer.BaseArcWidth = 2;
            this.GaugePotentiometer.Center = new System.Drawing.Point(140, 140);
            aGaugeLabel3.Color = System.Drawing.SystemColors.WindowText;
            aGaugeLabel3.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            aGaugeLabel3.Name = "lblGaugePotentiometer";
            aGaugeLabel3.Position = new System.Drawing.Point(40, 240);
            aGaugeLabel3.Text = "Tensão potenciômetro (V)";
            this.GaugePotentiometer.GaugeLabels.Add(aGaugeLabel3);
            aGaugeRange9.Color = System.Drawing.Color.Lime;
            aGaugeRange9.EndValue = 2F;
            aGaugeRange9.InnerRadius = 65;
            aGaugeRange9.InRange = false;
            aGaugeRange9.Name = "GaugeRangeNormal";
            aGaugeRange9.OuterRadius = 100;
            aGaugeRange9.StartValue = 0F;
            aGaugeRange10.Color = System.Drawing.Color.Yellow;
            aGaugeRange10.EndValue = 3F;
            aGaugeRange10.InnerRadius = 65;
            aGaugeRange10.InRange = false;
            aGaugeRange10.Name = "GaugeRangeAlertOne";
            aGaugeRange10.OuterRadius = 100;
            aGaugeRange10.StartValue = 2F;
            aGaugeRange11.Color = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(0)))));
            aGaugeRange11.EndValue = 4F;
            aGaugeRange11.InnerRadius = 65;
            aGaugeRange11.InRange = false;
            aGaugeRange11.Name = "GaugeRangeAlertTwo";
            aGaugeRange11.OuterRadius = 100;
            aGaugeRange11.StartValue = 3F;
            aGaugeRange12.Color = System.Drawing.Color.Red;
            aGaugeRange12.EndValue = 5F;
            aGaugeRange12.InnerRadius = 65;
            aGaugeRange12.InRange = false;
            aGaugeRange12.Name = "GaugeRangeThree";
            aGaugeRange12.OuterRadius = 100;
            aGaugeRange12.StartValue = 4F;
            this.GaugePotentiometer.GaugeRanges.Add(aGaugeRange9);
            this.GaugePotentiometer.GaugeRanges.Add(aGaugeRange10);
            this.GaugePotentiometer.GaugeRanges.Add(aGaugeRange11);
            this.GaugePotentiometer.GaugeRanges.Add(aGaugeRange12);
            this.GaugePotentiometer.Location = new System.Drawing.Point(146, 141);
            this.GaugePotentiometer.MaxValue = 5F;
            this.GaugePotentiometer.MinValue = 0F;
            this.GaugePotentiometer.Name = "GaugePotentiometer";
            this.GaugePotentiometer.NeedleColor1 = System.Windows.Forms.AGaugeNeedleColor.Gray;
            this.GaugePotentiometer.NeedleColor2 = System.Drawing.Color.DimGray;
            this.GaugePotentiometer.NeedleRadius = 100;
            this.GaugePotentiometer.NeedleType = System.Windows.Forms.NeedleType.Advance;
            this.GaugePotentiometer.NeedleWidth = 2;
            this.GaugePotentiometer.ScaleLinesInterColor = System.Drawing.Color.Black;
            this.GaugePotentiometer.ScaleLinesInterInnerRadius = 88;
            this.GaugePotentiometer.ScaleLinesInterOuterRadius = 100;
            this.GaugePotentiometer.ScaleLinesInterWidth = 1;
            this.GaugePotentiometer.ScaleLinesMajorColor = System.Drawing.Color.Black;
            this.GaugePotentiometer.ScaleLinesMajorInnerRadius = 100;
            this.GaugePotentiometer.ScaleLinesMajorOuterRadius = 85;
            this.GaugePotentiometer.ScaleLinesMajorStepValue = 0.5F;
            this.GaugePotentiometer.ScaleLinesMajorWidth = 2;
            this.GaugePotentiometer.ScaleLinesMinorColor = System.Drawing.Color.Gray;
            this.GaugePotentiometer.ScaleLinesMinorInnerRadius = 100;
            this.GaugePotentiometer.ScaleLinesMinorOuterRadius = 90;
            this.GaugePotentiometer.ScaleLinesMinorTicks = 9;
            this.GaugePotentiometer.ScaleLinesMinorWidth = 1;
            this.GaugePotentiometer.ScaleNumbersColor = System.Drawing.Color.Black;
            this.GaugePotentiometer.ScaleNumbersFormat = null;
            this.GaugePotentiometer.ScaleNumbersRadius = 115;
            this.GaugePotentiometer.ScaleNumbersRotation = 0;
            this.GaugePotentiometer.ScaleNumbersStartScaleLine = 0;
            this.GaugePotentiometer.ScaleNumbersStepScaleLines = 1;
            this.GaugePotentiometer.Size = new System.Drawing.Size(278, 279);
            this.GaugePotentiometer.TabIndex = 1;
            this.GaugePotentiometer.Text = "Potenciômetro";
            this.GaugePotentiometer.Value = 0F;
            this.GaugePotentiometer.ValueInRangeChanged += new System.EventHandler<System.Windows.Forms.ValueInRangeChangedEventArgs>(this.GaugePotentiometer_ValueInRangeChanged);
            // 
            // tbpLed
            // 
            this.tbpLed.BackColor = System.Drawing.Color.White;
            this.tbpLed.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.tbpLed.Controls.Add(this.pictureBoxLEDLigado);
            this.tbpLed.Controls.Add(this.btnLED);
            this.tbpLed.Controls.Add(this.pictureBoxLEDDesligado);
            this.tbpLed.ForeColor = System.Drawing.SystemColors.ControlText;
            this.tbpLed.ImeMode = System.Windows.Forms.ImeMode.NoControl;
            this.tbpLed.Location = new System.Drawing.Point(4, 4);
            this.tbpLed.Name = "tbpLed";
            this.tbpLed.Padding = new System.Windows.Forms.Padding(3);
            this.tbpLed.Size = new System.Drawing.Size(1049, 580);
            this.tbpLed.TabIndex = 1;
            this.tbpLed.Text = "LED";
            // 
            // btnLED
            // 
            this.btnLED.Font = new System.Drawing.Font("Arial", 14F, System.Drawing.FontStyle.Bold);
            this.btnLED.Location = new System.Drawing.Point(417, 386);
            this.btnLED.Name = "btnLED";
            this.btnLED.Size = new System.Drawing.Size(181, 59);
            this.btnLED.TabIndex = 1;
            this.btnLED.Text = "Ligar";
            this.btnLED.UseVisualStyleBackColor = true;
            this.btnLED.Click += new System.EventHandler(this.btnLED_Click);
            // 
            // pictureBoxLEDDesligado
            // 
            this.pictureBoxLEDDesligado.Image = ((System.Drawing.Image)(resources.GetObject("pictureBoxLEDDesligado.Image")));
            this.pictureBoxLEDDesligado.InitialImage = ((System.Drawing.Image)(resources.GetObject("pictureBoxLEDDesligado.InitialImage")));
            this.pictureBoxLEDDesligado.Location = new System.Drawing.Point(362, 68);
            this.pictureBoxLEDDesligado.Name = "pictureBoxLEDDesligado";
            this.pictureBoxLEDDesligado.Size = new System.Drawing.Size(301, 265);
            this.pictureBoxLEDDesligado.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBoxLEDDesligado.TabIndex = 0;
            this.pictureBoxLEDDesligado.TabStop = false;
            // 
            // serialPort1
            // 
            this.serialPort1.DataReceived += new System.IO.Ports.SerialDataReceivedEventHandler(this.serialPort1_DataReceived);
            // 
            // timer1
            // 
            this.timer1.Enabled = true;
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // timer2
            // 
            this.timer2.Tick += new System.EventHandler(this.timer2_Tick);
            // 
            // pictureBoxLEDLigado
            // 
            this.pictureBoxLEDLigado.Image = ((System.Drawing.Image)(resources.GetObject("pictureBoxLEDLigado.Image")));
            this.pictureBoxLEDLigado.InitialImage = ((System.Drawing.Image)(resources.GetObject("pictureBoxLEDLigado.InitialImage")));
            this.pictureBoxLEDLigado.Location = new System.Drawing.Point(362, 68);
            this.pictureBoxLEDLigado.Name = "pictureBoxLEDLigado";
            this.pictureBoxLEDLigado.Size = new System.Drawing.Size(301, 265);
            this.pictureBoxLEDLigado.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBoxLEDLigado.TabIndex = 2;
            this.pictureBoxLEDLigado.TabStop = false;
            // 
            // mainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.BackColor = System.Drawing.SystemColors.Window;
            this.ClientSize = new System.Drawing.Size(1057, 686);
            this.Controls.Add(this.tbcPages);
            this.Controls.Add(this.tsTaskBar);
            this.Controls.Add(this.tsMenu);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "mainForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Supervisório";
            this.tsMenu.ResumeLayout(false);
            this.tsMenu.PerformLayout();
            this.tsTaskBar.ResumeLayout(false);
            this.tsTaskBar.PerformLayout();
            this.tbcPages.ResumeLayout(false);
            this.tbpTemperaturePotentiometer.ResumeLayout(false);
            this.tbpLed.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxLEDDesligado)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBoxLEDLigado)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.ToolStrip tsMenu;
        private System.Windows.Forms.ToolStripLabel lblCOM;
        private System.Windows.Forms.ToolStrip tsTaskBar;
        private System.Windows.Forms.ToolStripButton btnLogOut;
        private System.Windows.Forms.ToolStripLabel lblHour;
        private System.Windows.Forms.TabControl tbcPages;
        private System.Windows.Forms.TabPage tbpTemperaturePotentiometer;
        private System.Windows.Forms.TabPage tbpLed;
        private System.Windows.Forms.ToolStripComboBox cmbCOM;
        private System.Windows.Forms.ToolStripButton btnConnect;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripButton btnUnconnect;
        private System.Windows.Forms.AGauge GaugePotentiometer;
        private ThermometerControl.ThermControl thermControl;
        private System.IO.Ports.SerialPort serialPort1;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.Timer timer2;
        private System.Windows.Forms.Button btnLED;
        private System.Windows.Forms.PictureBox pictureBoxLEDDesligado;
        private System.Windows.Forms.PictureBox pictureBoxLEDLigado;
    }
}

