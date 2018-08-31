
import java.io.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hollow3464
 */
public class Condominio extends javax.swing.JFrame {
    
    private String nombre;
    private String cedula;
    private String username;
    private String password;
    private String nombreAC;
    private String estado;   
    private ArrayList<Residente> Residentes;
    private ArrayList<AreaComun> Areas_Comunes;
    private ArrayList<JComboBox> ListaResidentes;
    private PrintWriter salida;
    private BufferedReader entrada;
           
    public Condominio(ArrayList residentes) {
        initComponents();                         
        Residentes = residentes;
        Areas_Comunes = new ArrayList();
        ListaResidentes = new ArrayList();        
        ListaResidentes.add(AC_ResidentList);
        ListaResidentes.add(AV_ResidentList);
        ListaResidentes.add(AsV_ResidentList);
        for(JComboBox jcb: ListaResidentes){
            initListasResidentes(jcb);
        }
        initListaMorosos();
        recuperacionArea();
        
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CondControls = new javax.swing.JTabbedPane();
        ResAdmin = new javax.swing.JPanel();
        Añadir_Residente = new javax.swing.JPanel();
        AR_NameLabel = new javax.swing.JLabel();
        AR_NameText = new javax.swing.JTextField();
        AR_IDLabel = new javax.swing.JLabel();
        AR_IDText = new javax.swing.JTextField();
        AR_PasswordLabel = new javax.swing.JLabel();
        AR_PasswordText = new javax.swing.JPasswordField();
        AR_UsernameLabel = new javax.swing.JLabel();
        AR_UsernameText = new javax.swing.JTextField();
        AR_AddUserButton = new javax.swing.JButton();
        AR_CleanButton = new javax.swing.JButton();
        Añadir_Cuotas = new javax.swing.JPanel();
        AC_ResidentLabel = new javax.swing.JLabel();
        AC_ResidentList = new javax.swing.JComboBox<>();
        AC_HomeList = new javax.swing.JComboBox<>();
        AC_HomeLabel = new javax.swing.JLabel();
        AC_QuotaValueLabel = new javax.swing.JLabel();
        AC_QuotaValueText = new javax.swing.JTextField();
        AC_QuotaAddButton = new javax.swing.JButton();
        AC_QuotaDateLabel = new javax.swing.JLabel();
        AC_QuotaDateText = new javax.swing.JFormattedTextField();
        SlowPayerScroller = new javax.swing.JScrollPane();
        SlowPayerTextArea = new javax.swing.JTextArea();
        CondAdmin = new javax.swing.JPanel();
        Añadir_ÁreaComún = new javax.swing.JPanel();
        AAC_AddCommonAreaLabel = new javax.swing.JLabel();
        AAC_AddCommonAreaText = new javax.swing.JTextField();
        AAC_AddCommonAreaBT = new javax.swing.JButton();
        Añadir_Vivienda = new javax.swing.JPanel();
        AV_HomeIDLabel = new javax.swing.JLabel();
        AV_HomeIDText = new javax.swing.JTextField();
        AV_HomeTypeLabel = new javax.swing.JLabel();
        AV_HomeTypeList = new javax.swing.JComboBox<>();
        AV_SlowpayerChargeLabel = new javax.swing.JLabel();
        AV_SlowpayerChargeText = new javax.swing.JTextField();
        AV_AddHomeButton = new javax.swing.JButton();
        AV_ResidentLabel = new javax.swing.JLabel();
        AV_QuotaValueLabel = new javax.swing.JLabel();
        AV_QuotaValueText = new javax.swing.JTextField();
        AV_ResidentList = new javax.swing.JComboBox<>();
        Asignar_Vivienda = new javax.swing.JPanel();
        AsV_ResidentLabel = new javax.swing.JLabel();
        AsV_ResidentList = new javax.swing.JComboBox<>();
        AsV_HomeLabel = new javax.swing.JLabel();
        AsV_HomeList = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        AsV_QuotaValueText = new javax.swing.JTextField();
        AsV_QuotaValueLabel = new javax.swing.JLabel();
        AvailableHomeScroller = new javax.swing.JScrollPane();
        AvailableHomeList = new javax.swing.JList<>();
        AvailableAreaScroller = new javax.swing.JScrollPane();
        AvailableAreaList = new javax.swing.JList<>();
        Cambiar_DatosAcceso = new javax.swing.JPanel();
        CDA_NewUsernameLabel = new javax.swing.JLabel();
        CDA_NewPasswordLabel = new javax.swing.JLabel();
        CDA_NewUsernameText = new javax.swing.JTextField();
        CDA_NewPasswordText = new javax.swing.JTextField();
        CDA_ChangeAccessDataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(785, 451));

        CondControls.setToolTipText("");

        ResAdmin.setBackground(new java.awt.Color(204, 204, 204));

        Añadir_Residente.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Residente"));

        AR_NameLabel.setText("Nombre Completo:");

        AR_IDLabel.setText("Número de Cédula:");

        AR_PasswordLabel.setText("Contraseña:");

        AR_UsernameLabel.setText("Nombre de Usuario:");

        AR_AddUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        AR_AddUserButton.setText("Agregar");
        AR_AddUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AR_AddUserButtonActionPerformed(evt);
            }
        });

        AR_CleanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/broom.png"))); // NOI18N
        AR_CleanButton.setText("Limpiar");
        AR_CleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AR_CleanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Añadir_ResidenteLayout = new javax.swing.GroupLayout(Añadir_Residente);
        Añadir_Residente.setLayout(Añadir_ResidenteLayout);
        Añadir_ResidenteLayout.setHorizontalGroup(
            Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ResidenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Añadir_ResidenteLayout.createSequentialGroup()
                        .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AR_PasswordLabel)
                            .addComponent(AR_UsernameLabel))
                        .addGap(26, 26, 26)
                        .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AR_UsernameText)
                            .addComponent(AR_PasswordText)))
                    .addGroup(Añadir_ResidenteLayout.createSequentialGroup()
                        .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AR_NameLabel)
                            .addComponent(AR_IDLabel))
                        .addGap(33, 33, 33)
                        .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AR_IDText)
                            .addComponent(AR_NameText)))
                    .addGroup(Añadir_ResidenteLayout.createSequentialGroup()
                        .addComponent(AR_AddUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AR_CleanButton)))
                .addContainerGap())
        );
        Añadir_ResidenteLayout.setVerticalGroup(
            Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ResidenteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AR_NameLabel)
                    .addComponent(AR_NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AR_IDLabel)
                    .addComponent(AR_IDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AR_UsernameLabel)
                    .addComponent(AR_UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AR_PasswordLabel)
                    .addComponent(AR_PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AR_CleanButton)
                    .addComponent(AR_AddUserButton))
                .addContainerGap())
        );

        Añadir_Cuotas.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Cuotas"));

        AC_ResidentLabel.setText("Residente:");

        AC_HomeLabel.setText("Vivienda:");

        AC_QuotaValueLabel.setText("Valor Cuota:");

        AC_QuotaValueText.setEditable(false);

        AC_QuotaAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        AC_QuotaAddButton.setText("Añadir");
        AC_QuotaAddButton.setToolTipText("");

        AC_QuotaDateLabel.setText("Fecha de la Cuota (dd/mm/aa)");
        AC_QuotaDateLabel.setToolTipText("");

        AC_QuotaDateText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        AC_QuotaDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC_QuotaDateTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Añadir_CuotasLayout = new javax.swing.GroupLayout(Añadir_Cuotas);
        Añadir_Cuotas.setLayout(Añadir_CuotasLayout);
        Añadir_CuotasLayout.setHorizontalGroup(
            Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                        .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AC_ResidentLabel)
                            .addComponent(AC_HomeLabel))
                        .addGap(33, 33, 33)
                        .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AC_HomeList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AC_ResidentList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                        .addComponent(AC_QuotaDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AC_QuotaDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                        .addComponent(AC_QuotaValueLabel)
                        .addGap(18, 18, 18)
                        .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AC_QuotaValueText)
                            .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                                .addComponent(AC_QuotaAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        Añadir_CuotasLayout.setVerticalGroup(
            Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AC_ResidentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AC_ResidentLabel))
                .addGap(12, 12, 12)
                .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AC_HomeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AC_HomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AC_QuotaDateLabel)
                    .addComponent(AC_QuotaDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AC_QuotaValueLabel)
                    .addComponent(AC_QuotaValueText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AC_QuotaAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        SlowPayerTextArea.setColumns(20);
        SlowPayerTextArea.setRows(5);
        SlowPayerTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Residentes Morosos"));
        SlowPayerScroller.setViewportView(SlowPayerTextArea);

        javax.swing.GroupLayout ResAdminLayout = new javax.swing.GroupLayout(ResAdmin);
        ResAdmin.setLayout(ResAdminLayout);
        ResAdminLayout.setHorizontalGroup(
            ResAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Añadir_Residente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Añadir_Cuotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SlowPayerScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );
        ResAdminLayout.setVerticalGroup(
            ResAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResAdminLayout.createSequentialGroup()
                        .addComponent(Añadir_Residente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Añadir_Cuotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SlowPayerScroller))
                .addContainerGap())
        );

        CondControls.addTab("ADMINISTRAR RESIDENTES", ResAdmin);

        CondAdmin.setBackground(new java.awt.Color(204, 204, 204));

        Añadir_ÁreaComún.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Área Común"));

        AAC_AddCommonAreaLabel.setText("Área común:");

        AAC_AddCommonAreaBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        AAC_AddCommonAreaBT.setText("Agregar");
        AAC_AddCommonAreaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AAC_AddCommonAreaBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Añadir_ÁreaComúnLayout = new javax.swing.GroupLayout(Añadir_ÁreaComún);
        Añadir_ÁreaComún.setLayout(Añadir_ÁreaComúnLayout);
        Añadir_ÁreaComúnLayout.setHorizontalGroup(
            Añadir_ÁreaComúnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ÁreaComúnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AAC_AddCommonAreaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AAC_AddCommonAreaText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AAC_AddCommonAreaBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Añadir_ÁreaComúnLayout.setVerticalGroup(
            Añadir_ÁreaComúnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ÁreaComúnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Añadir_ÁreaComúnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AAC_AddCommonAreaLabel)
                    .addComponent(AAC_AddCommonAreaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AAC_AddCommonAreaBT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Añadir_Vivienda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Añadir Vivienda", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        AV_HomeIDLabel.setText("Número de la vivienda:");

        AV_HomeTypeLabel.setText("Tipo de Vivienda:");

        AV_HomeTypeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A", "B", "C" }));

        AV_SlowpayerChargeLabel.setText("Recargo:");

        AV_SlowpayerChargeText.setEditable(false);
        AV_SlowpayerChargeText.setEnabled(false);

        AV_AddHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diskette.png"))); // NOI18N
        AV_AddHomeButton.setText("Guardar");
        AV_AddHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AV_AddHomeButtonActionPerformed(evt);
            }
        });

        AV_ResidentLabel.setText("Residente:");

        AV_QuotaValueLabel.setText("Valor de la cuota mensual:");

        AV_QuotaValueText.setEditable(false);
        AV_QuotaValueText.setEnabled(false);

        AV_ResidentList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));

        javax.swing.GroupLayout Añadir_ViviendaLayout = new javax.swing.GroupLayout(Añadir_Vivienda);
        Añadir_Vivienda.setLayout(Añadir_ViviendaLayout);
        Añadir_ViviendaLayout.setHorizontalGroup(
            Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Añadir_ViviendaLayout.createSequentialGroup()
                        .addComponent(AV_ResidentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(AV_ResidentList, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Añadir_ViviendaLayout.createSequentialGroup()
                        .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AV_HomeIDLabel)
                            .addComponent(AV_HomeTypeLabel)
                            .addComponent(AV_SlowpayerChargeLabel)
                            .addComponent(AV_QuotaValueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AV_HomeIDText)
                            .addComponent(AV_HomeTypeList, 0, 117, Short.MAX_VALUE)
                            .addComponent(AV_SlowpayerChargeText)
                            .addComponent(AV_QuotaValueText))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Añadir_ViviendaLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(AV_AddHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Añadir_ViviendaLayout.setVerticalGroup(
            Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AV_ResidentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AV_ResidentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AV_HomeIDLabel)
                    .addComponent(AV_HomeIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AV_HomeTypeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AV_HomeTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AV_SlowpayerChargeLabel)
                    .addComponent(AV_SlowpayerChargeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AV_QuotaValueLabel)
                    .addComponent(AV_QuotaValueText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AV_AddHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Asignar_Vivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignar Vivienda"));

        AsV_ResidentLabel.setText("Residente:");

        AsV_HomeLabel.setText("Vivienda:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        jButton1.setText("Asignar");
        jButton1.setToolTipText("");

        AsV_QuotaValueText.setEditable(false);

        AsV_QuotaValueLabel.setText("Valor Cuotas");

        javax.swing.GroupLayout Asignar_ViviendaLayout = new javax.swing.GroupLayout(Asignar_Vivienda);
        Asignar_Vivienda.setLayout(Asignar_ViviendaLayout);
        Asignar_ViviendaLayout.setHorizontalGroup(
            Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Asignar_ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AsV_ResidentLabel)
                    .addComponent(AsV_HomeLabel)
                    .addComponent(AsV_QuotaValueLabel))
                .addGap(18, 18, 18)
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AsV_ResidentList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AsV_HomeList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Asignar_ViviendaLayout.createSequentialGroup()
                        .addComponent(AsV_QuotaValueText, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Asignar_ViviendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        Asignar_ViviendaLayout.setVerticalGroup(
            Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Asignar_ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsV_ResidentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AsV_ResidentLabel))
                .addGap(18, 18, 18)
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsV_HomeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AsV_HomeLabel))
                .addGap(18, 18, 18)
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsV_QuotaValueText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AsV_QuotaValueLabel))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AvailableHomeList.setBorder(javax.swing.BorderFactory.createTitledBorder("Viviendas Disponibles"));
        AvailableHomeScroller.setViewportView(AvailableHomeList);

        AvailableAreaList.setBorder(javax.swing.BorderFactory.createTitledBorder("Áreas Comunes Disponibles"));
        AvailableAreaScroller.setViewportView(AvailableAreaList);

        Cambiar_DatosAcceso.setBorder(javax.swing.BorderFactory.createTitledBorder("Cambiar Datos de Acceso"));

        CDA_NewUsernameLabel.setText("Nuevo Usuario:");

        CDA_NewPasswordLabel.setText("Nueva Contraseña:");

        CDA_ChangeAccessDataButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        CDA_ChangeAccessDataButton.setText("Cambiar");
        CDA_ChangeAccessDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDA_ChangeAccessDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cambiar_DatosAccesoLayout = new javax.swing.GroupLayout(Cambiar_DatosAcceso);
        Cambiar_DatosAcceso.setLayout(Cambiar_DatosAccesoLayout);
        Cambiar_DatosAccesoLayout.setHorizontalGroup(
            Cambiar_DatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cambiar_DatosAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cambiar_DatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CDA_NewPasswordLabel)
                    .addComponent(CDA_NewUsernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Cambiar_DatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CDA_NewUsernameText, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(CDA_NewPasswordText))
                .addContainerGap())
            .addGroup(Cambiar_DatosAccesoLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(CDA_ChangeAccessDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Cambiar_DatosAccesoLayout.setVerticalGroup(
            Cambiar_DatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cambiar_DatosAccesoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cambiar_DatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CDA_NewUsernameLabel)
                    .addComponent(CDA_NewUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(Cambiar_DatosAccesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CDA_NewPasswordLabel)
                    .addComponent(CDA_NewPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CDA_ChangeAccessDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CondAdminLayout = new javax.swing.GroupLayout(CondAdmin);
        CondAdmin.setLayout(CondAdminLayout);
        CondAdminLayout.setHorizontalGroup(
            CondAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CondAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CondAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Añadir_Vivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Añadir_ÁreaComún, javax.swing.GroupLayout.PREFERRED_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(Cambiar_DatosAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CondAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Asignar_Vivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AvailableHomeScroller)
                    .addComponent(AvailableAreaScroller))
                .addContainerGap())
        );
        CondAdminLayout.setVerticalGroup(
            CondAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CondAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CondAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CondAdminLayout.createSequentialGroup()
                        .addComponent(Asignar_Vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvailableHomeScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AvailableAreaScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CondAdminLayout.createSequentialGroup()
                        .addComponent(Añadir_Vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Añadir_ÁreaComún, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cambiar_DatosAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Añadir_ÁreaComún.getAccessibleContext().setAccessibleName("Agregar Área Común");
        Añadir_Vivienda.getAccessibleContext().setAccessibleName("Asignar Vivienda");

        CondControls.addTab("ADMINISTRAR CONDOMINIO", CondAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CondControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CondControls)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AV_AddHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AV_AddHomeButtonActionPerformed

    }//GEN-LAST:event_AV_AddHomeButtonActionPerformed

    private void AAC_AddCommonAreaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AAC_AddCommonAreaBTActionPerformed

        nombreAC = AAC_AddCommonAreaText.getText();
        estado = "Disponible";
        Areas_Comunes.add(new AreaComun(nombreAC, estado));
        JOptionPane.showMessageDialog(rootPane, "Se ha añadido un área");
        escrituraArea();
        
    }//GEN-LAST:event_AAC_AddCommonAreaBTActionPerformed

    private void AR_CleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AR_CleanButtonActionPerformed
        this.AR_NameText.setText("");
        this.AR_IDText.setText("");
        this.AR_UsernameText.setText("");
        this.AR_PasswordText.setText("");
    }//GEN-LAST:event_AR_CleanButtonActionPerformed

    private void AR_AddUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AR_AddUserButtonActionPerformed
        // TODO add your handling code here:

        nombre = AR_NameText.getText();
        cedula = AR_IDText.getText();
        username = AR_UsernameText.getText();
        password = AR_PasswordText.getText();
        Residentes.add(new Residente(nombre, cedula, username, password));
        AR_NameText.setText("");
        AR_IDText.setText("");
        AR_UsernameText.setText("");
        AR_PasswordText.setText("");
        escribirResidentes();

        JOptionPane.showMessageDialog(rootPane, "Se ha añadido un usuario");
    }//GEN-LAST:event_AR_AddUserButtonActionPerformed

    private void AC_QuotaDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC_QuotaDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AC_QuotaDateTextActionPerformed

    private void CDA_ChangeAccessDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDA_ChangeAccessDataButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CDA_ChangeAccessDataButtonActionPerformed


    public void recuperacionArea() {
    
        
        try {
            entrada = new BufferedReader(new FileReader("Areas.txt"));
            String s;
            while ((s = entrada.readLine()) != null) {
                String[] datos = (s.split("/"));
                String nombreAC = datos[0];
                String estado = datos[1];
                Areas_Comunes.add(new AreaComun(this.nombreAC, this.estado));
            }
            entrada.close();          

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

    }
    
    public void escrituraArea() {
        
        try {
            salida = new PrintWriter(new BufferedWriter(new FileWriter("AreasComunest.xt", false)));
        } catch (java.io.IOException e) {

        }

        for (AreaComun area : Areas_Comunes) {
            String nombreAC = area.getNombreAC();
            Boolean estado = area.getEstado();

            salida.println(nombreAC + "/" + estado);

        }
        salida.close();
    }
    
    public void escribirResidentes() {
        
        try {
            salida = new PrintWriter(new BufferedWriter(new FileWriter("Residentes.txt", false)));
        } catch (java.io.IOException e) {

        }

        for (Residente residente : Residentes) {
            if(residente.getTipoUsuario().equals("Residente")){
            String nombre= residente.getNombre();
            String cedula = residente.getCedula();
            String username = residente.getUserName();
            String password = residente.getPassword();
            Boolean moroso = residente.getMoroso();
            salida.println(nombre + "/" + cedula + "/" + username + "/" + password + "/" + moroso);
            }
        }
        salida.close();
    }
   
    public void initListasResidentes(JComboBox jcb){
        for(Residente usr: Residentes){
            jcb.addItem(usr.getNombre());
        }                
    }
    
    public void updListasResidentes(Residente res){
        for(JComboBox jcb: ListaResidentes){            
            jcb.addItem(res.getNombre());
        }
        
    }
    public void initListaMorosos(){
        for(Residente res: Residentes){
            if(res.getMoroso() == true){
            SlowPayerTextArea.append(res.toString() + "\n");
            }
        }
    }
    
// <editor-fold desc="trash-code">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AAC_AddCommonAreaBT;
    private javax.swing.JLabel AAC_AddCommonAreaLabel;
    private javax.swing.JTextField AAC_AddCommonAreaText;
    private javax.swing.JLabel AC_HomeLabel;
    private javax.swing.JComboBox<String> AC_HomeList;
    private javax.swing.JButton AC_QuotaAddButton;
    private javax.swing.JLabel AC_QuotaDateLabel;
    private javax.swing.JFormattedTextField AC_QuotaDateText;
    private javax.swing.JLabel AC_QuotaValueLabel;
    private javax.swing.JTextField AC_QuotaValueText;
    private javax.swing.JLabel AC_ResidentLabel;
    private javax.swing.JComboBox<String> AC_ResidentList;
    private javax.swing.JButton AR_AddUserButton;
    private javax.swing.JButton AR_CleanButton;
    private javax.swing.JLabel AR_IDLabel;
    private javax.swing.JTextField AR_IDText;
    private javax.swing.JLabel AR_NameLabel;
    private javax.swing.JTextField AR_NameText;
    private javax.swing.JLabel AR_PasswordLabel;
    private javax.swing.JPasswordField AR_PasswordText;
    private javax.swing.JLabel AR_UsernameLabel;
    private javax.swing.JTextField AR_UsernameText;
    private javax.swing.JButton AV_AddHomeButton;
    private javax.swing.JLabel AV_HomeIDLabel;
    private javax.swing.JTextField AV_HomeIDText;
    private javax.swing.JLabel AV_HomeTypeLabel;
    private javax.swing.JComboBox<String> AV_HomeTypeList;
    private javax.swing.JLabel AV_QuotaValueLabel;
    private javax.swing.JTextField AV_QuotaValueText;
    private javax.swing.JLabel AV_ResidentLabel;
    private javax.swing.JComboBox<String> AV_ResidentList;
    private javax.swing.JLabel AV_SlowpayerChargeLabel;
    private javax.swing.JTextField AV_SlowpayerChargeText;
    private javax.swing.JLabel AsV_HomeLabel;
    private javax.swing.JComboBox<String> AsV_HomeList;
    private javax.swing.JLabel AsV_QuotaValueLabel;
    private javax.swing.JTextField AsV_QuotaValueText;
    private javax.swing.JLabel AsV_ResidentLabel;
    private javax.swing.JComboBox<String> AsV_ResidentList;
    private javax.swing.JPanel Asignar_Vivienda;
    private javax.swing.JList<String> AvailableAreaList;
    private javax.swing.JScrollPane AvailableAreaScroller;
    private javax.swing.JList<String> AvailableHomeList;
    private javax.swing.JScrollPane AvailableHomeScroller;
    private javax.swing.JPanel Añadir_Cuotas;
    private javax.swing.JPanel Añadir_Residente;
    private javax.swing.JPanel Añadir_Vivienda;
    private javax.swing.JPanel Añadir_ÁreaComún;
    private javax.swing.JButton CDA_ChangeAccessDataButton;
    private javax.swing.JLabel CDA_NewPasswordLabel;
    private javax.swing.JTextField CDA_NewPasswordText;
    private javax.swing.JLabel CDA_NewUsernameLabel;
    private javax.swing.JTextField CDA_NewUsernameText;
    private javax.swing.JPanel Cambiar_DatosAcceso;
    private javax.swing.JPanel CondAdmin;
    private javax.swing.JTabbedPane CondControls;
    private javax.swing.JPanel ResAdmin;
    private javax.swing.JScrollPane SlowPayerScroller;
    private javax.swing.JTextArea SlowPayerTextArea;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
} 
