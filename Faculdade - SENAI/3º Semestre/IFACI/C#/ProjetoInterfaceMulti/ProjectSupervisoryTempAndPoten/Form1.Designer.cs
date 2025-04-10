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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(mainForm));
            System.Windows.Forms.AGaugeLabel aGaugeLabel1 = new System.Windows.Forms.AGaugeLabel();
            System.Windows.Forms.AGaugeRange aGaugeRange1 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeRange aGaugeRange2 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeRange aGaugeRange3 = new System.Windows.Forms.AGaugeRange();
            System.Windows.Forms.AGaugeRange aGaugeRange4 = new System.Windows.Forms.AGaugeRange();
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
            this.GaugePotentiometer = new System.Windows.Forms.AGauge();
            this.tbpLed = new System.Windows.Forms.TabPage();
            this.thermControl = new ThermometerControl.ThermControl();
            this.tsMenu.SuspendLayout();
            this.tsTaskBar.SuspendLayout();
            this.tbcPages.SuspendLayout();
            this.tbpTemperaturePotentiometer.SuspendLayout();
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
            // 
            // lblHour
            // 
            this.lblHour.Alignment = System.Windows.Forms.ToolStripItemAlignment.Right;
            this.lblHour.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblHour.Name = "lblHour";
            this.lblHour.Size = new System.Drawing.Size(57, 31);
            this.lblHour.Text = "00:00:00";
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
            // GaugePotentiometer
            // 
            this.GaugePotentiometer.BackColor = System.Drawing.Color.White;
            this.GaugePotentiometer.BaseArcColor = System.Drawing.Color.Gray;
            this.GaugePotentiometer.BaseArcRadius = 100;
            this.GaugePotentiometer.BaseArcStart = 135;
            this.GaugePotentiometer.BaseArcSweep = 270;
            this.GaugePotentiometer.BaseArcWidth = 2;
            this.GaugePotentiometer.Center = new System.Drawing.Point(140, 140);
            aGaugeLabel1.Color = System.Drawing.SystemColors.WindowText;
            aGaugeLabel1.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            aGaugeLabel1.Name = "lblGaugePotentiometer";
            aGaugeLabel1.Position = new System.Drawing.Point(40, 240);
            aGaugeLabel1.Text = "Tensão potenciômetro (V)";
            this.GaugePotentiometer.GaugeLabels.Add(aGaugeLabel1);
            aGaugeRange1.Color = System.Drawing.Color.Lime;
            aGaugeRange1.EndValue = 2F;
            aGaugeRange1.InnerRadius = 65;
            aGaugeRange1.InRange = false;
            aGaugeRange1.Name = "GaugeRangeNormal";
            aGaugeRange1.OuterRadius = 100;
            aGaugeRange1.StartValue = 0F;
            aGaugeRange2.Color = System.Drawing.Color.Yellow;
            aGaugeRange2.EndValue = 3F;
            aGaugeRange2.InnerRadius = 65;
            aGaugeRange2.InRange = false;
            aGaugeRange2.Name = "GaugeRangeAlertOne";
            aGaugeRange2.OuterRadius = 100;
            aGaugeRange2.StartValue = 2F;
            aGaugeRange3.Color = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(128)))), ((int)(((byte)(0)))));
            aGaugeRange3.EndValue = 4F;
            aGaugeRange3.InnerRadius = 65;
            aGaugeRange3.InRange = false;
            aGaugeRange3.Name = "GaugeRangeAlertTwo";
            aGaugeRange3.OuterRadius = 100;
            aGaugeRange3.StartValue = 3F;
            aGaugeRange4.Color = System.Drawing.Color.Red;
            aGaugeRange4.EndValue = 5F;
            aGaugeRange4.InnerRadius = 65;
            aGaugeRange4.InRange = false;
            aGaugeRange4.Name = "GaugeRangeThree";
            aGaugeRange4.OuterRadius = 100;
            aGaugeRange4.StartValue = 4F;
            this.GaugePotentiometer.GaugeRanges.Add(aGaugeRange1);
            this.GaugePotentiometer.GaugeRanges.Add(aGaugeRange2);
            this.GaugePotentiometer.GaugeRanges.Add(aGaugeRange3);
            this.GaugePotentiometer.GaugeRanges.Add(aGaugeRange4);
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
            // 
            // tbpLed
            // 
            this.tbpLed.BackColor = System.Drawing.Color.White;
            this.tbpLed.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.tbpLed.ForeColor = System.Drawing.SystemColors.ControlText;
            this.tbpLed.ImeMode = System.Windows.Forms.ImeMode.NoControl;
            this.tbpLed.Location = new System.Drawing.Point(4, 4);
            this.tbpLed.Name = "tbpLed";
            this.tbpLed.Padding = new System.Windows.Forms.Padding(3);
            this.tbpLed.Size = new System.Drawing.Size(1049, 580);
            this.tbpLed.TabIndex = 1;
            this.tbpLed.Text = "LED";
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
    }
}

