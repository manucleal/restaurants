/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistaEscritorio;

import controlador.ControladorMozo;
import controlador.VistaMozoInterface;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.ItemServicio;
import modelo.Mesa;


/**
 *
 * @author ecoitino
 */
public class VistaMozo extends javax.swing.JDialog implements VistaMozoInterface {

    public ControladorMozo controladorMozo;
    /**
     * Creates new form vistaMozo
     */
    public VistaMozo(java.awt.Frame parent, boolean modal, Conexion conexion) {
        super(parent, modal);
        setLocationRelativeTo(parent);
        initComponents();
        setSize(new Dimension(1000, 800));
        controladorMozo = new ControladorMozo(this, conexion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelButtons = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        buttonAgregarProducto = new javax.swing.JButton();
        labelMesa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatosServicio = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelButtons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelButtons.setMinimumSize(new java.awt.Dimension(500, 100));
        panelButtons.setSize(new java.awt.Dimension(500, 100));
        panelButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar");

        jButton3.setText("Transferir");

        buttonAgregarProducto.setText("Agregar Producto");
        buttonAgregarProducto.setDoubleBuffered(true);
        buttonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarProductoActionPerformed(evt);
            }
        });

        labelMesa.setEditable(false);
        labelMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelMesaActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Cantidad:");

        tableDatosServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cantidad", "Descripción", "Precio Unitario", "Sub total", "Comentarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDatosServicio);
        if (tableDatosServicio.getColumnModel().getColumnCount() > 0) {
            tableDatosServicio.getColumnModel().getColumn(0).setResizable(false);
            tableDatosServicio.getColumnModel().getColumn(1).setResizable(false);
            tableDatosServicio.getColumnModel().getColumn(2).setResizable(false);
            tableDatosServicio.getColumnModel().getColumn(3).setResizable(false);
            tableDatosServicio.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMesa)
                            .addComponent(buttonAgregarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMesa)
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(28, 28, 28)
                        .addComponent(buttonAgregarProducto))
                    .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelMesaActionPerformed
        
    }//GEN-LAST:event_labelMesaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgregarProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgregarProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField labelMesa;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JTable tableDatosServicio;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarNombreUsuario(String nombreCompleto) {
        setTitle("Atención de mesas | Mozo: " + nombreCompleto);
    }

    @Override
    public void mostrarMesas(ArrayList<Mesa> mesas) {
        panelButtons.setLayout(new GridLayout(2, 3));        
        for (Mesa mesa : mesas) {
            Clicklistener click = new Clicklistener();
            JButtonMesa button = new JButtonMesa("Mesa " + mesa.getNumero());
            button.setMesa(mesa);
            button.addActionListener(click);            
            button.setMargin(new Insets(2, 2, 2, 2));
            button.setOpaque(true);
            panelButtons.add(button);
        }
    }
    
    @Override
    public void mostrarLabelMesa(int nombreMesa) {
        labelMesa.setText("Mesa " + nombreMesa);
    }
    
    @Override
    public void mostrarDatosServicio(ArrayList<ItemServicio> items) {
        DefaultTableModel modelTable = new DefaultTableModel();
        modelTable.addColumn("Cantidad");
        modelTable.addColumn("Descripción");
        modelTable.addColumn("Precio Unitario");
        modelTable.addColumn("Sub total");
        modelTable.addColumn( "Comentarios");
        modelTable.setRowCount(items.size());
        int contador = 0;
        
        for(ItemServicio item : items) {
            modelTable.setValueAt(item.getCantidad(), contador , 0);
            modelTable.setValueAt(item.getDescripcion(), contador , 1);
            modelTable.setValueAt(item.getProducto().getPrecio(), contador , 2);
            modelTable.setValueAt(item.getSubTotal(), contador , 3);
            modelTable.setValueAt("", contador , 4);
            contador++;
        }
        tableDatosServicio.setModel(modelTable);
    }
    
    private class Clicklistener implements ActionListener {        
        @Override
        public void actionPerformed(ActionEvent e) {
            JButtonMesa jButtonMesa = (JButtonMesa)e.getSource();
            Mesa mesa = jButtonMesa.getMesa();
            controladorMozo.cargarDatosMesaSeleccionada(mesa);
        }    
    }
    
    private class JButtonMesa extends JButton {
    
        private Mesa mesa;

        public JButtonMesa(String text) {
            super(text);
        }

        public Mesa getMesa() {
            return mesa;
        }

        public void setMesa(Mesa mesa) {
            this.mesa = mesa;
        }                    
    }       
}
