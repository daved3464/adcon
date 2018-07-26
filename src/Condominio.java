
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
        ListaResidentes.add(RA_ResCB);
        ListaResidentes.add(CA_AV_ResCB);
        ListaResidentes.add(CA_ASV_ResCB);
        for(JComboBox jcb: ListaResidentes){
            initListasResidentes(jcb);
        }
        initListaMorosos();
        recuperacionArea();
        
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_botones = new javax.swing.ButtonGroup();
        CondControls = new javax.swing.JTabbedPane();
        ResAdmin = new javax.swing.JPanel();
        Añadir_Residente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AR_fullnameTB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AR_idTB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AR_passwordTB = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        AR_usernameTB = new javax.swing.JTextField();
        AR_addResBT = new javax.swing.JButton();
        limpiarResidente = new javax.swing.JButton();
        Añadir_Cuotas = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        RA_ResCB = new javax.swing.JComboBox<>();
        RA_ViviendaCB = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        addCuota = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        AR_ACDateField = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        AR_slowpayerTA = new javax.swing.JTextArea();
        CondAdmin = new javax.swing.JPanel();
        Añadir_ÁreaComún = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        CA_AddAreaBT = new javax.swing.JButton();
        Añadir_Vivienda = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        CA_numViviendaTB = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CA_HouseTypeCB = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CA_RecargoTB = new javax.swing.JTextField();
        CA_Add_ViviendaBT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CA_VrCuotaTB = new javax.swing.JTextField();
        CA_AV_ResCB = new javax.swing.JComboBox<>();
        Asignar_Vivienda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CA_ASV_ResCB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        CA_ASV_ViviendaCB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(785, 451));

        CondControls.setToolTipText("");

        ResAdmin.setBackground(new java.awt.Color(204, 204, 204));

        Añadir_Residente.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Residente"));

        jLabel2.setText("Nombre Completo:");

        jLabel5.setText("Número de Cédula:");

        jLabel7.setText("Contraseña:");

        jLabel6.setText("Nombre de Usuario:");

        AR_addResBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        AR_addResBT.setText("Agregar");
        AR_addResBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AR_addResBTActionPerformed(evt);
            }
        });

        limpiarResidente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/broom.png"))); // NOI18N
        limpiarResidente.setText("Limpiar");
        limpiarResidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarResidenteActionPerformed(evt);
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
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AR_usernameTB)
                            .addComponent(AR_passwordTB)))
                    .addGroup(Añadir_ResidenteLayout.createSequentialGroup()
                        .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AR_idTB)
                            .addComponent(AR_fullnameTB)))
                    .addGroup(Añadir_ResidenteLayout.createSequentialGroup()
                        .addComponent(AR_addResBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpiarResidente)))
                .addContainerGap())
        );
        Añadir_ResidenteLayout.setVerticalGroup(
            Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ResidenteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AR_fullnameTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AR_idTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AR_usernameTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AR_passwordTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)
                .addGroup(Añadir_ResidenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarResidente)
                    .addComponent(AR_addResBT))
                .addContainerGap())
        );

        Añadir_Cuotas.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Cuotas"));

        jLabel13.setText("Residente:");

        jLabel14.setText("Vivienda:");

        jLabel15.setText("Valor Cuota:");

        jTextField1.setEditable(false);

        addCuota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        addCuota.setText("Añadir");
        addCuota.setToolTipText("");

        jLabel17.setText("Fecha de la Cuota (dd/mm/aa)");
        jLabel17.setToolTipText("");

        AR_ACDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        AR_ACDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AR_ACDateFieldActionPerformed(evt);
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
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(33, 33, 33)
                        .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RA_ViviendaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RA_ResCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AR_ACDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                                .addComponent(addCuota)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField1))))
                .addContainerGap())
        );
        Añadir_CuotasLayout.setVerticalGroup(
            Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_CuotasLayout.createSequentialGroup()
                .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RA_ResCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RA_ViviendaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(AR_ACDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Añadir_CuotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addCuota)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        AR_slowpayerTA.setColumns(20);
        AR_slowpayerTA.setRows(5);
        AR_slowpayerTA.setBorder(javax.swing.BorderFactory.createTitledBorder("Residentes Morosos"));
        jScrollPane2.setViewportView(AR_slowpayerTA);

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        CondControls.addTab("ADMINISTRAR RESIDENTES", ResAdmin);

        CondAdmin.setBackground(new java.awt.Color(204, 204, 204));

        Añadir_ÁreaComún.setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Área Común"));

        jLabel4.setText("Área común:");

        CA_AddAreaBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        CA_AddAreaBT.setText("Agregar");
        CA_AddAreaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA_AddAreaBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Añadir_ÁreaComúnLayout = new javax.swing.GroupLayout(Añadir_ÁreaComún);
        Añadir_ÁreaComún.setLayout(Añadir_ÁreaComúnLayout);
        Añadir_ÁreaComúnLayout.setHorizontalGroup(
            Añadir_ÁreaComúnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ÁreaComúnLayout.createSequentialGroup()
                .addGroup(Añadir_ÁreaComúnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Añadir_ÁreaComúnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                    .addGroup(Añadir_ÁreaComúnLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Añadir_ÁreaComúnLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(CA_AddAreaBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Añadir_ÁreaComúnLayout.setVerticalGroup(
            Añadir_ÁreaComúnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ÁreaComúnLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CA_AddAreaBT)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Añadir_Vivienda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Añadir Vivienda", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel8.setText("Número de la vivienda:");

        jLabel9.setText("Tipo de Vivienda:");

        CA_HouseTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A", "B", "C" }));

        jLabel10.setText("Recargo:");

        CA_RecargoTB.setEditable(false);
        CA_RecargoTB.setEnabled(false);

        CA_Add_ViviendaBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diskette.png"))); // NOI18N
        CA_Add_ViviendaBT.setText("Guardar");
        CA_Add_ViviendaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA_Add_ViviendaBTActionPerformed(evt);
            }
        });

        jLabel3.setText("Residente:");

        jLabel11.setText("Valor de la cuota mensual:");

        CA_VrCuotaTB.setEditable(false);
        CA_VrCuotaTB.setEnabled(false);

        CA_AV_ResCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));

        javax.swing.GroupLayout Añadir_ViviendaLayout = new javax.swing.GroupLayout(Añadir_Vivienda);
        Añadir_Vivienda.setLayout(Añadir_ViviendaLayout);
        Añadir_ViviendaLayout.setHorizontalGroup(
            Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Añadir_ViviendaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(CA_AV_ResCB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Añadir_ViviendaLayout.createSequentialGroup()
                        .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CA_numViviendaTB)
                            .addComponent(CA_HouseTypeCB, 0, 117, Short.MAX_VALUE)
                            .addComponent(CA_RecargoTB)
                            .addComponent(CA_VrCuotaTB))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Añadir_ViviendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CA_Add_ViviendaBT)
                .addGap(111, 111, 111))
        );
        Añadir_ViviendaLayout.setVerticalGroup(
            Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Añadir_ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CA_AV_ResCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CA_numViviendaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CA_HouseTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CA_RecargoTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Añadir_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CA_VrCuotaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CA_Add_ViviendaBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Asignar_Vivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignar Vivienda"));

        jLabel1.setText("Residente:");

        jLabel12.setText("Vivienda:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus.png"))); // NOI18N
        jButton1.setText("Asignar");
        jButton1.setToolTipText("");

        jTextField2.setEditable(false);

        jLabel16.setText("Valor Cuotas");

        javax.swing.GroupLayout Asignar_ViviendaLayout = new javax.swing.GroupLayout(Asignar_Vivienda);
        Asignar_Vivienda.setLayout(Asignar_ViviendaLayout);
        Asignar_ViviendaLayout.setHorizontalGroup(
            Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Asignar_ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CA_ASV_ResCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CA_ASV_ViviendaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Asignar_ViviendaLayout.createSequentialGroup()
                        .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Asignar_ViviendaLayout.setVerticalGroup(
            Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Asignar_ViviendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CA_ASV_ResCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CA_ASV_ViviendaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(Asignar_ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(6, 6, 6))
        );

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Viviendas Disponibles"));
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout CondAdminLayout = new javax.swing.GroupLayout(CondAdmin);
        CondAdmin.setLayout(CondAdminLayout);
        CondAdminLayout.setHorizontalGroup(
            CondAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CondAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CondAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Añadir_Vivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Añadir_ÁreaComún, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CondAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Asignar_Vivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
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
                        .addComponent(jScrollPane1))
                    .addGroup(CondAdminLayout.createSequentialGroup()
                        .addComponent(Añadir_Vivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Añadir_ÁreaComún, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void CA_Add_ViviendaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA_Add_ViviendaBTActionPerformed

    }//GEN-LAST:event_CA_Add_ViviendaBTActionPerformed

    private void CA_AddAreaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA_AddAreaBTActionPerformed

        nombreAC = txtArea.getText();
        estado = "Disponible";
        Areas_Comunes.add(new AreaComun(nombreAC, estado));
        JOptionPane.showMessageDialog(rootPane, "Se ha añadido un área");
        escrituraArea();
        
    }//GEN-LAST:event_CA_AddAreaBTActionPerformed

    private void limpiarResidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarResidenteActionPerformed
        this.AR_fullnameTB.setText("");
        this.AR_idTB.setText("");
        this.AR_usernameTB.setText("");
        this.AR_passwordTB.setText("");
    }//GEN-LAST:event_limpiarResidenteActionPerformed

    private void AR_addResBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AR_addResBTActionPerformed
        // TODO add your handling code here:

        nombre = AR_fullnameTB.getText();
        cedula = AR_idTB.getText();
        username = AR_usernameTB.getText();
        password = AR_passwordTB.getText();
        Residentes.add(new Residente(nombre, cedula, username, password));
        AR_fullnameTB.setText("");
        AR_idTB.setText("");
        AR_usernameTB.setText("");
        AR_passwordTB.setText("");
        escribirResidentes();

        JOptionPane.showMessageDialog(rootPane, "Se ha añadido un usuario");
    }//GEN-LAST:event_AR_addResBTActionPerformed

    private void AR_ACDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AR_ACDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AR_ACDateFieldActionPerformed


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
            AR_slowpayerTA.append(res.toString() + "\n");
            }
        }
    }
    
// <editor-fold desc="trash-code">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField AR_ACDateField;
    private javax.swing.JButton AR_addResBT;
    private javax.swing.JTextField AR_fullnameTB;
    private javax.swing.JTextField AR_idTB;
    private javax.swing.JPasswordField AR_passwordTB;
    private javax.swing.JTextArea AR_slowpayerTA;
    private javax.swing.JTextField AR_usernameTB;
    private javax.swing.JPanel Asignar_Vivienda;
    private javax.swing.JPanel Añadir_Cuotas;
    private javax.swing.JPanel Añadir_Residente;
    private javax.swing.JPanel Añadir_Vivienda;
    private javax.swing.JPanel Añadir_ÁreaComún;
    private javax.swing.JComboBox<String> CA_ASV_ResCB;
    private javax.swing.JComboBox<String> CA_ASV_ViviendaCB;
    private javax.swing.JComboBox<String> CA_AV_ResCB;
    private javax.swing.JButton CA_AddAreaBT;
    private javax.swing.JButton CA_Add_ViviendaBT;
    private javax.swing.JComboBox<String> CA_HouseTypeCB;
    private javax.swing.JTextField CA_RecargoTB;
    private javax.swing.JTextField CA_VrCuotaTB;
    private javax.swing.JTextField CA_numViviendaTB;
    private javax.swing.JPanel CondAdmin;
    private javax.swing.JTabbedPane CondControls;
    private javax.swing.JComboBox<String> RA_ResCB;
    private javax.swing.JComboBox<String> RA_ViviendaCB;
    private javax.swing.JPanel ResAdmin;
    private javax.swing.JButton addCuota;
    private javax.swing.ButtonGroup grupo_botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton limpiarResidente;
    private javax.swing.JTextField txtArea;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
} 
