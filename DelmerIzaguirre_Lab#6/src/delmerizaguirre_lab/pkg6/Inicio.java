/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delmerizaguirre_lab.pkg6;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Owner
 */
public class Inicio extends javax.swing.JFrame {

    private ArrayList<Lugar> listaLugares = new ArrayList();
    private ArrayList<Carretera> listaCarreteras = new ArrayList();
    private int numero = 1;

    public Inicio() {
        initComponents();
    }

    private void ActualizarTabla() {
        tab_listar.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Tipo de objeto", "Propiedad 1", "Propiedad 2", "Propiedad 3"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        DefaultTableModel tab = (DefaultTableModel) tab_listar.getModel();

        for (Lugar lug : listaLugares) {
            if (!(lug instanceof Casa)) {
                Object[] arreglo = new Object[4];

                arreglo[0] = lug.getTipo();
                arreglo[1] = "Nombre: " + lug.getNombre();
                arreglo[2] = "Seguridad: " + lug.getNivelSeguridad();
                arreglo[3] = "Direccion: " + lug.getDireccion();
                tab.addRow(arreglo);
            }
        }
        for (Carretera car : listaCarreteras) {
            Object[] arreglo = new Object[4];

            arreglo[0] = "Carretera " + car.getNumero();
            arreglo[1] = "Inicio: " + car.getInicio();
            arreglo[2] = "Final: " + car.getFinal();
            arreglo[3] = "Distancia: " + car.getDistancia();
            tab.addRow(arreglo);
        }

    }

    private void ActualizarTablaRes() {
        tab_listar.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Tipo de objeto", "Propiedad 1", "Propiedad 2", "Propiedad 3"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        DefaultTableModel tab = (DefaultTableModel) tab_listar.getModel();
        for (Lugar lug : listaLugares) {
            if (lug instanceof Restaurante) {
                Object[] arreglo = new Object[4];

                arreglo[0] = lug.getTipo();
                arreglo[1] = "Nombre: " + lug.getNombre();
                arreglo[2] = "Seguridad: " + lug.getNivelSeguridad();
                arreglo[3] = "Direccion: " + lug.getDireccion();
                tab.addRow(arreglo);
            }
        }

    }

    private void ActualizarTablaCan() {
        tab_listar.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Tipo de objeto", "Propiedad 1", "Propiedad 2", "Propiedad 3"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        DefaultTableModel tab = (DefaultTableModel) tab_listar.getModel();
        for (Lugar lug : listaLugares) {
            if (lug instanceof Cancha) {
                Object[] arreglo = new Object[4];

                arreglo[0] = lug.getTipo();
                arreglo[1] = "Nombre: " + lug.getNombre();
                arreglo[2] = "Seguridad: " + lug.getNivelSeguridad();
                arreglo[3] = "Direccion: " + lug.getDireccion();
                tab.addRow(arreglo);
            }
        }

    }

    private void ActualizarTablaCar() {
        tab_listar.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Tipo de objeto", "Propiedad 1", "Propiedad 2", "Propiedad 3"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        DefaultTableModel tab = (DefaultTableModel) tab_listar.getModel();
        for (Carretera car : listaCarreteras) {
            Object[] arreglo = new Object[4];

            arreglo[0] = "Carretera " + car.getNumero();
            arreglo[1] = "Inicio: " + car.getInicio();
            arreglo[2] = "Final: " + car.getFinal();
            arreglo[3] = "Distancia: " + car.getDistancia();
            tab.addRow(arreglo);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nuevo_Lugar = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cb_lugar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sp_nivel = new javax.swing.JSpinner();
        jp_restaurante = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        sp_calificacion = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cb_cat1 = new javax.swing.JComboBox<>();
        jp_cancha = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cb_cat2 = new javax.swing.JComboBox<>();
        c_estado = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Nueva_Carretera = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sp_distancia = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        cb_inicia = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cb_termina = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        Listar_Arbol = new javax.swing.JDialog();
        cb_lugares = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_lugares = new javax.swing.JTree();
        Lista = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        cb_lugarList = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_lugares = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        menu_popup = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        cb_listar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_listar = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jLabel2.setText("Tipo de lugar");

        cb_lugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Restaurante", "Cancha" }));
        cb_lugar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_lugarItemStateChanged(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Direccion");

        jLabel5.setText("Nivel de Seguridad");

        sp_nivel.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jp_restaurante.setBackground(new java.awt.Color(255, 255, 255));
        jp_restaurante.setEnabled(false);

        jLabel6.setText("Categoria");

        sp_calificacion.setModel(new javax.swing.SpinnerNumberModel(Byte.valueOf((byte)1), Byte.valueOf((byte)1), Byte.valueOf((byte)5), Byte.valueOf((byte)1)));
        sp_calificacion.setEnabled(false);

        jLabel7.setText("Calificacion");

        jLabel8.setText("Restaurante");

        cb_cat1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chino", "Mexicano", "Italiano", "Comida Rapida" }));
        cb_cat1.setEnabled(false);

        javax.swing.GroupLayout jp_restauranteLayout = new javax.swing.GroupLayout(jp_restaurante);
        jp_restaurante.setLayout(jp_restauranteLayout);
        jp_restauranteLayout.setHorizontalGroup(
            jp_restauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_restauranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_restauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jp_restauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp_calificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(cb_cat1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addGroup(jp_restauranteLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_restauranteLayout.setVerticalGroup(
            jp_restauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_restauranteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(53, 53, 53)
                .addGroup(jp_restauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_cat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_restauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jp_cancha.setBackground(new java.awt.Color(255, 255, 255));
        jp_cancha.setEnabled(false);

        jLabel9.setText("Categoria");

        jLabel11.setText("Cancha");

        cb_cat2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "football", "básquet", "tenis", "volley" }));
        cb_cat2.setAutoscrolls(true);
        cb_cat2.setEnabled(false);

        c_estado.setText("Esta ocupada");
        c_estado.setAutoscrolls(true);
        c_estado.setEnabled(false);

        jLabel10.setText("Estado");

        javax.swing.GroupLayout jp_canchaLayout = new javax.swing.GroupLayout(jp_cancha);
        jp_cancha.setLayout(jp_canchaLayout);
        jp_canchaLayout.setHorizontalGroup(
            jp_canchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_canchaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jp_canchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_canchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_estado)
                    .addComponent(jLabel11)
                    .addComponent(cb_cat2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jp_canchaLayout.setVerticalGroup(
            jp_canchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_canchaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addGap(52, 52, 52)
                .addGroup(jp_canchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_cat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_canchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_estado)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cb_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(304, 304, 304))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jp_restaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jp_cancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sp_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_restaurante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_cancha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Nuevo_LugarLayout = new javax.swing.GroupLayout(Nuevo_Lugar.getContentPane());
        Nuevo_Lugar.getContentPane().setLayout(Nuevo_LugarLayout);
        Nuevo_LugarLayout.setHorizontalGroup(
            Nuevo_LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Nuevo_LugarLayout.setVerticalGroup(
            Nuevo_LugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Carretera");

        jLabel13.setText("Distancia en KM");

        sp_distancia.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jLabel14.setText("Inicia en:");

        cb_inicia.setModel(new DefaultComboBoxModel());

        jLabel15.setText("Termina en:");

        cb_termina.setModel(new DefaultComboBoxModel());

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Nueva_CarreteraLayout = new javax.swing.GroupLayout(Nueva_Carretera.getContentPane());
        Nueva_Carretera.getContentPane().setLayout(Nueva_CarreteraLayout);
        Nueva_CarreteraLayout.setHorizontalGroup(
            Nueva_CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nueva_CarreteraLayout.createSequentialGroup()
                .addGroup(Nueva_CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Nueva_CarreteraLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(Nueva_CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(Nueva_CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sp_distancia)
                            .addComponent(cb_inicia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_termina, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Nueva_CarreteraLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel12)))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nueva_CarreteraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        Nueva_CarreteraLayout.setVerticalGroup(
            Nueva_CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nueva_CarreteraLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(41, 41, 41)
                .addGroup(Nueva_CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(sp_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Nueva_CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cb_inicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Nueva_CarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cb_termina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        cb_lugares.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurantes", "Canchas" }));
        cb_lugares.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_lugaresItemStateChanged(evt);
            }
        });

        jLabel16.setText("Lugares");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Lugares");
        jt_lugares.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_lugares);

        javax.swing.GroupLayout Listar_ArbolLayout = new javax.swing.GroupLayout(Listar_Arbol.getContentPane());
        Listar_Arbol.getContentPane().setLayout(Listar_ArbolLayout);
        Listar_ArbolLayout.setHorizontalGroup(
            Listar_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Listar_ArbolLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(30, 30, 30)
                .addComponent(cb_lugares, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addGroup(Listar_ArbolLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        Listar_ArbolLayout.setVerticalGroup(
            Listar_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Listar_ArbolLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(Listar_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_lugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel17.setText("Seleccione un lugar:");

        cb_lugarList.setModel(new DefaultComboBoxModel());
        cb_lugarList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_lugarListItemStateChanged(evt);
            }
        });

        jl_lugares.setModel(new DefaultListModel()
        );
        jScrollPane3.setViewportView(jl_lugares);

        jLabel18.setText("Lugares a menos de 50 km a la redonda");

        javax.swing.GroupLayout ListaLayout = new javax.swing.GroupLayout(Lista.getContentPane());
        Lista.getContentPane().setLayout(ListaLayout);
        ListaLayout.setHorizontalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaLayout.createSequentialGroup()
                .addGroup(ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListaLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel17)
                        .addGap(35, 35, 35)
                        .addComponent(cb_lugarList, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ListaLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ListaLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel18)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        ListaLayout.setVerticalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cb_lugarList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        menu_popup.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        cb_listar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Restaurantes", "Canchas", "Carreteras" }));
        cb_listar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_listarItemStateChanged(evt);
            }
        });

        jLabel1.setText("Listar");

        tab_listar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de objeto", "Propiedad 1", "Propiedad 2", "Propiedad 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_listarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_listar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(cb_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_listar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jMenu1.setText("Administrar");

        jMenuItem1.setText("Nuevo lugar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Nueva carretera");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Listar por categoria");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Listar por cercania");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (listaLugares.size() >= 2) {
            DefaultComboBoxModel mod1 = (DefaultComboBoxModel) cb_inicia.getModel();
            DefaultComboBoxModel mod2 = (DefaultComboBoxModel) cb_termina.getModel();
            mod1.removeAllElements();
            mod2.removeAllElements();

            for (Lugar lug : listaLugares) {
                mod1.addElement(lug);
                mod2.addElement(lug);
            }

            Nueva_Carretera.setModal(true);
            Nueva_Carretera.pack();
            Nueva_Carretera.setLocationRelativeTo(this);
            Nueva_Carretera.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Deben haber almenos 2 lugares para crear una carretera");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String nombre = tf_nombre.getText();
            String direccion = tf_direccion.getText();
            int seguridad = (int) sp_nivel.getValue();

            switch (cb_lugar.getSelectedIndex()) {
                case 1: {
                    String categ = (String) cb_cat1.getSelectedItem();
                    byte calif = (byte) sp_calificacion.getValue();
                    listaLugares.add(new Restaurante(categ, calif, nombre, direccion, seguridad));
                    break;
                }
                case 2: {
                    String categ = (String) cb_cat2.getSelectedItem();
                    String estado = "Libre";
                    if (c_estado.isSelected()) {
                        estado = "Ocupada";
                    }
                    listaLugares.add(new Cancha(categ, estado, nombre, direccion, seguridad));
                    break;
                }
                default:
                    listaLugares.add(new Casa(nombre, direccion, seguridad));
                    break;
            }
            JOptionPane.showMessageDialog(Nuevo_Lugar, "Lugar agregado exitosamente");
            Nuevo_Lugar.dispose();
            ActualizarTab();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(Nuevo_Lugar, "No se pudo agregar");
            e.printStackTrace();

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_lugarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_lugarItemStateChanged
        switch (cb_lugar.getSelectedIndex()) {
            case 1:
                cb_cat1.setEnabled(true);
                sp_calificacion.setEnabled(true);
                cb_cat2.setEnabled(false);
                c_estado.setEnabled(false);
                break;
            case 2:
                cb_cat1.setEnabled(false);
                sp_calificacion.setEnabled(false);
                cb_cat2.setEnabled(true);
                c_estado.setEnabled(true);
                break;
            default:
                cb_cat1.setEnabled(false);
                sp_calificacion.setEnabled(false);
                cb_cat2.setEnabled(false);
                c_estado.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_cb_lugarItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Nuevo_Lugar.setModal(true);
        Nuevo_Lugar.pack();
        Nuevo_Lugar.setLocationRelativeTo(this);
        Nuevo_Lugar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            double distancia = (double) sp_distancia.getValue();
            Lugar inicia = (Lugar) cb_inicia.getSelectedItem();
            Lugar finaliza = (Lugar) cb_termina.getSelectedItem();
            if (!inicia.TieneSalida() && !inicia.equals(finaliza)) {
                Carretera carretera = new Carretera(numero, distancia, inicia, finaliza);
                inicia.setSalida(carretera);
                finaliza.getEntradas().add(carretera);

                listaCarreteras.add(carretera);
                numero++;
                JOptionPane.showMessageDialog(Nueva_Carretera, "Carretera creada");

                Nueva_Carretera.dispose();
                ActualizarTab();

            } else {
                JOptionPane.showMessageDialog(Nueva_Carretera, "Este lugar ya tiene una carretera de salida");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(Nueva_Carretera, "No se pudo agregar la carretera");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb_listarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_listarItemStateChanged
        ActualizarTab();
    }//GEN-LAST:event_cb_listarItemStateChanged

    private void cb_lugaresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_lugaresItemStateChanged
        actualizarTree();

    }//GEN-LAST:event_cb_lugaresItemStateChanged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        actualizarTree();

        Listar_Arbol.setModal(true);
        Listar_Arbol.pack();
        Listar_Arbol.setLocationRelativeTo(this);
        Listar_Arbol.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void cb_lugarListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_lugarListItemStateChanged
        try {
            actualizarList();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_cb_lugarListItemStateChanged

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_lugarList.getModel();
        modelo.removeAllElements();
        for (Lugar lg : listaLugares) {
            modelo.addElement(lg);
        }

        actualizarList();

        Lista.setModal(true);
        Lista.pack();
        Lista.setLocationRelativeTo(this);
        Lista.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void tab_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_listarMouseClicked
        if (evt.isMetaDown()) {
            menu_popup.show(evt.getComponent(),
                    evt.getX(), evt.getY());

        }
    }//GEN-LAST:event_tab_listarMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int pos = tab_listar.getSelectedRow();
        DefaultTableModel tab = (DefaultTableModel) tab_listar.getModel();
        tab.removeRow(pos);
        
    }//GEN-LAST:event_EliminarActionPerformed

    public void actualizarList() {
        DefaultListModel lista = (DefaultListModel) jl_lugares.getModel();
        lista.removeAllElements();

        Lugar aqui = (Lugar) cb_lugarList.getSelectedItem();
        for (Carretera ent : aqui.getEntradas()) {
            if (ent.getDistancia() < 50) {
                lista.addElement(ent.getInicio());
            }
        }
        try {
            if (aqui.getSalida().getDistancia() < 50) {
                lista.addElement(aqui.getSalida().getFinal());
            }
        } catch (Exception e) {
        }

    }

    public void actualizarTree() {
        DefaultTreeModel modelo = (DefaultTreeModel) jt_lugares.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        raiz.removeAllChildren();

        if (cb_lugares.getSelectedIndex() == 0) {
            DefaultMutableTreeNode chino = new DefaultMutableTreeNode("Chino");
            DefaultMutableTreeNode mexicano = new DefaultMutableTreeNode("Mexicano");
            DefaultMutableTreeNode italiano = new DefaultMutableTreeNode("Italiano");
            DefaultMutableTreeNode rapida = new DefaultMutableTreeNode("Comida rapida");

            for (Lugar lug : listaLugares) {

                if (lug instanceof Restaurante) {
                    switch (((Restaurante) lug).getCategoria()) {
                        case "Chino":
                            chino.add(new DefaultMutableTreeNode(lug));
                            break;
                        case "Mexicano":
                            mexicano.add(new DefaultMutableTreeNode(lug));
                            break;
                        case "Italiano":
                            italiano.add(new DefaultMutableTreeNode(lug));
                            break;
                        default:
                            rapida.add(new DefaultMutableTreeNode(lug));
                            break;
                    }
                }
            }
            raiz.add(chino);
            raiz.add(mexicano);
            raiz.add(italiano);
            raiz.add(rapida);
        } else {
            DefaultMutableTreeNode football = new DefaultMutableTreeNode("Football");
            DefaultMutableTreeNode basquet = new DefaultMutableTreeNode("Básquet");
            DefaultMutableTreeNode tenis = new DefaultMutableTreeNode("Tenis");
            DefaultMutableTreeNode volley = new DefaultMutableTreeNode("Volley");

            for (Lugar lug : listaLugares) {
                if (lug instanceof Cancha) {
                    switch (((Cancha) lug).getCategoria()) {
                        case "football":
                            football.add(new DefaultMutableTreeNode(lug));
                            break;
                        case "básquet":
                            basquet.add(new DefaultMutableTreeNode(lug));
                            break;
                        case "tenis":
                            tenis.add(new DefaultMutableTreeNode(lug));
                            break;
                        default:
                            volley.add(new DefaultMutableTreeNode(lug));
                            break;
                    }
                }
            }
            raiz.add(football);
            raiz.add(basquet);
            raiz.add(tenis);
            raiz.add(volley);
        }
        modelo.reload();
    }

    public void ActualizarTab() {
        switch (cb_listar.getSelectedIndex()) {
            case 0:
                ActualizarTabla();
                break;
            case 1:
                ActualizarTablaRes();
                break;
            case 2:
                ActualizarTablaCan();
                break;
            default:
                ActualizarTablaCar();
                break;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JDialog Lista;
    private javax.swing.JDialog Listar_Arbol;
    private javax.swing.JDialog Nueva_Carretera;
    private javax.swing.JDialog Nuevo_Lugar;
    private javax.swing.JCheckBox c_estado;
    private javax.swing.JComboBox<String> cb_cat1;
    private javax.swing.JComboBox<String> cb_cat2;
    private javax.swing.JComboBox<String> cb_inicia;
    private javax.swing.JComboBox<String> cb_listar;
    private javax.swing.JComboBox<String> cb_lugar;
    private javax.swing.JComboBox<String> cb_lugarList;
    private javax.swing.JComboBox<String> cb_lugares;
    private javax.swing.JComboBox<String> cb_termina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> jl_lugares;
    private javax.swing.JPanel jp_cancha;
    private javax.swing.JPanel jp_restaurante;
    private javax.swing.JTree jt_lugares;
    private javax.swing.JPopupMenu menu_popup;
    private javax.swing.JSpinner sp_calificacion;
    private javax.swing.JSpinner sp_distancia;
    private javax.swing.JSpinner sp_nivel;
    private javax.swing.JTable tab_listar;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
}
