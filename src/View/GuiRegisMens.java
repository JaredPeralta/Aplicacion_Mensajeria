/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author migue
 */
public class GuiRegisMens extends javax.swing.JFrame {

    /**
     * Creates new form GuiRegisMens
     */
    public GuiRegisMens() {
        initComponents();
        setTitle("Registro para Mensajeros");
        this.setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize  = getSize();
        setLocation((screenSize.width  - frameSize.width)  / 2, 
                    (screenSize.height - frameSize.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblPrimerNombre = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblSegundoNombre = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        lblConfCorreo = new javax.swing.JLabel();
        txtConfCorreo = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        cbxTipoIdenti = new javax.swing.JComboBox<>();
        cbxSexo = new javax.swing.JComboBox<>();
        lblDocumento = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        lblNacimiento = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        cbxVehiculo = new javax.swing.JComboBox<>();
        dFechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtPrimerApellido = new javax.swing.JTextField();
        lblPrimerApellido = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        lblSegundoApellido = new javax.swing.JLabel();
        cbxSeguSocial = new javax.swing.JComboBox<>();
        btnRegistrarse = new javax.swing.JButton();
        cbxCiudad = new javax.swing.JComboBox<>();
        txtCelular = new javax.swing.JTextField();
        lblMenuPrincipal = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblHInicial = new javax.swing.JLabel();
        lblHFinal = new javax.swing.JLabel();
        btnAgregarHorario = new javax.swing.JButton();
        cbxDIA = new javax.swing.JComboBox<>();
        cbxHInicial = new javax.swing.JComboBox<>();
        cbxHFinal = new javax.swing.JComboBox<>();
        lblTipodiligencia = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        cbxTipoTransporte = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblPrimerNombre.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblPrimerNombre.setForeground(new java.awt.Color(255, 0, 51));
        lblPrimerNombre.setText("Primer Nombre");
        lblPrimerNombre.setFocusable(false);
        lblPrimerNombre.setRequestFocusEnabled(false);

        txtPrimerNombre.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        lblCorreo.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 0, 51));
        lblCorreo.setText("Correo");
        lblCorreo.setFocusable(false);
        lblCorreo.setRequestFocusEnabled(false);

        txtCorreo.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        lblSegundoNombre.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblSegundoNombre.setForeground(new java.awt.Color(255, 0, 51));
        lblSegundoNombre.setText("Segundo Nombre");
        lblSegundoNombre.setFocusable(false);
        lblSegundoNombre.setRequestFocusEnabled(false);

        txtSegundoNombre.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        lblConfCorreo.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblConfCorreo.setForeground(new java.awt.Color(255, 0, 51));
        lblConfCorreo.setText("Confirmar Correo");
        lblConfCorreo.setFocusable(false);
        lblConfCorreo.setRequestFocusEnabled(false);

        txtConfCorreo.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        lblTelefono.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 0, 51));
        lblTelefono.setText("Numero Telefonico");
        lblTelefono.setFocusable(false);
        lblTelefono.setRequestFocusEnabled(false);

        txtTelefono.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        lblCelular.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(255, 0, 51));
        lblCelular.setText("Numero  Celular");
        lblCelular.setFocusable(false);
        lblCelular.setRequestFocusEnabled(false);

        cbxTipoIdenti.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cbxTipoIdenti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo De Identificacion", "C.C Cedula De Ciudadania", "C.E Cedula De Extranjeria" }));
        cbxTipoIdenti.setFocusable(false);
        cbxTipoIdenti.setRequestFocusEnabled(false);

        cbxSexo.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Masculino", "Femenino", "No decir" }));
        cbxSexo.setFocusable(false);

        lblDocumento.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(255, 0, 51));
        lblDocumento.setText("Numero de documento");
        lblDocumento.setFocusable(false);
        lblDocumento.setRequestFocusEnabled(false);

        txtDocumento.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        txtNacionalidad.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        lblNacimiento.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblNacimiento.setForeground(new java.awt.Color(255, 0, 51));
        lblNacimiento.setText("Fecha de nacimiento");
        lblNacimiento.setFocusable(false);
        lblNacimiento.setRequestFocusEnabled(false);

        lblNacionalidad.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblNacionalidad.setForeground(new java.awt.Color(255, 0, 51));
        lblNacionalidad.setText("Nacionalidad");
        lblNacionalidad.setFocusable(false);
        lblNacionalidad.setRequestFocusEnabled(false);

        cbxVehiculo.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cbxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de vehiculo", "Moto", "Bicicleta" }));
        cbxVehiculo.setFocusable(false);

        dFechaNacimiento.setDateFormatString("yyyy/MM/dd");

        txtPrimerApellido.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        lblPrimerApellido.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblPrimerApellido.setForeground(new java.awt.Color(255, 0, 51));
        lblPrimerApellido.setText("Primer Apellido");
        lblPrimerApellido.setFocusable(false);
        lblPrimerApellido.setRequestFocusEnabled(false);

        txtSegundoApellido.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        lblSegundoApellido.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblSegundoApellido.setForeground(new java.awt.Color(255, 0, 51));
        lblSegundoApellido.setText("Segundo Apellido");
        lblSegundoApellido.setFocusable(false);
        lblSegundoApellido.setRequestFocusEnabled(false);

        cbxSeguSocial.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cbxSeguSocial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seguridad Social", "Si", "No" }));
        cbxSeguSocial.setFocusable(false);

        btnRegistrarse.setBackground(new java.awt.Color(255, 0, 51));
        btnRegistrarse.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");

        cbxCiudad.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cbxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciudad", "Bogota", "Tunja" }));
        cbxCiudad.setFocusable(false);

        txtCelular.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cbxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrimerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrimerApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxSeguSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDocumento)
                                    .addComponent(cbxVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxTipoIdenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSegundoApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSegundoNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNacionalidad, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtConfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblConfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerNombre)
                    .addComponent(lblSegundoNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblSegundoApellido)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblPrimerApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(lblConfCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(lblCelular))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoIdenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(lblNacimiento))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacionalidad))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSeguSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblMenuPrincipal.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lblMenuPrincipal.setForeground(new java.awt.Color(0, 153, 255));
        lblMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LetrasMcQueen.png"))); // NOI18N
        lblMenuPrincipal.setFocusable(false);

        lblDia.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblDia.setForeground(new java.awt.Color(255, 0, 51));
        lblDia.setText("Día");

        lblHInicial.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblHInicial.setForeground(new java.awt.Color(255, 0, 51));
        lblHInicial.setText("Hora Inicial");

        lblHFinal.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblHFinal.setForeground(new java.awt.Color(255, 0, 51));
        lblHFinal.setText("Hora Final");

        btnAgregarHorario.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnAgregarHorario.setForeground(new java.awt.Color(255, 0, 51));
        btnAgregarHorario.setText("Agregar Horario");
        btnAgregarHorario.setFocusable(false);

        cbxDIA.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cbxDIA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lunes", "Martes", "Wednesday", "Jueves", "Viernes", "Sabado", "Domingo" }));
        cbxDIA.setFocusable(false);

        cbxHInicial.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cbxHInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "00:00:00", "01:00:00", "02:00:00", "03:00:00", "04:00:00", "05:00:00", "06:00:00", "07:00:00", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00", "18:00:00", "19:00:00", "20:00:00", "21:00:00", "22:00:00", "23:00:00" }));
        cbxHInicial.setFocusable(false);
        cbxHInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHInicialActionPerformed(evt);
            }
        });

        cbxHFinal.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cbxHFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "00:00:00", "01:00:00", "02:00:00", "03:00:00", "04:00:00", "05:00:00", "06:00:00", "07:00:00", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00", "17:00:00", "18:00:00", "19:00:00", "20:00:00", "21:00:00", "22:00:00", "23:00:00" }));
        cbxHFinal.setFocusable(false);
        cbxHFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHFinalActionPerformed(evt);
            }
        });

        lblTipodiligencia.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblTipodiligencia.setForeground(new java.awt.Color(255, 0, 51));
        lblTipodiligencia.setText("Tipo de diligencia");
        lblTipodiligencia.setFocusable(false);
        lblTipodiligencia.setRequestFocusEnabled(false);

        lblHorario.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(255, 0, 51));
        lblHorario.setText("Horario");
        lblHorario.setFocusable(false);
        lblHorario.setRequestFocusEnabled(false);

        cbxTipoTransporte.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cbxTipoTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Documento", "Pequeño paquete", "Mediano paquete", "Grande paquete" }));
        cbxTipoTransporte.setFocusable(false);

        btnVolver.setBackground(new java.awt.Color(255, 0, 51));
        btnVolver.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Rayopeque.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(119, 119, 119)
                                            .addComponent(cbxDIA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lblDia)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblHInicial)
                                                .addComponent(lblHFinal))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbxHInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbxHFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(cbxTipoTransporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(lblHorario))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(lblTipodiligencia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btnAgregarHorario)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMenuPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblMenuPrincipal))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblTipodiligencia)
                        .addGap(18, 18, 18)
                        .addComponent(cbxTipoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(lblHorario)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDia)
                                    .addComponent(cbxDIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblHInicial)
                                    .addComponent(cbxHInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHFinal))
                            .addComponent(cbxHFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(50, 50, 50))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void cbxHInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHInicialActionPerformed

    private void cbxHFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHFinalActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarHorario;
    public javax.swing.JButton btnRegistrarse;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cbxCiudad;
    public javax.swing.JComboBox<String> cbxDIA;
    public javax.swing.JComboBox<String> cbxHFinal;
    public javax.swing.JComboBox<String> cbxHInicial;
    public javax.swing.JComboBox<String> cbxSeguSocial;
    public javax.swing.JComboBox<String> cbxSexo;
    public javax.swing.JComboBox<String> cbxTipoIdenti;
    public javax.swing.JComboBox<String> cbxTipoTransporte;
    public javax.swing.JComboBox<String> cbxVehiculo;
    public com.toedter.calendar.JDateChooser dFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblConfCorreo;
    private javax.swing.JLabel lblCorreo;
    public javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDocumento;
    public javax.swing.JLabel lblHFinal;
    public javax.swing.JLabel lblHInicial;
    public javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblPrimerNombre;
    private javax.swing.JLabel lblSegundoApellido;
    private javax.swing.JLabel lblSegundoNombre;
    private javax.swing.JLabel lblTelefono;
    public javax.swing.JLabel lblTipodiligencia;
    public javax.swing.JTextField txtCelular;
    public javax.swing.JTextField txtConfCorreo;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDocumento;
    public javax.swing.JTextField txtNacionalidad;
    public javax.swing.JTextField txtPrimerApellido;
    public javax.swing.JTextField txtPrimerNombre;
    public javax.swing.JTextField txtSegundoApellido;
    public javax.swing.JTextField txtSegundoNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}