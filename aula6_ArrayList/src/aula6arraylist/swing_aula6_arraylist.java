package aula6arraylist;

import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


public class swing_aula6_arraylist extends javax.swing.JFrame {
    
    // Antes do "=" está declarando a variável listaFuncionarios como uma ARRAYLIST
    // Depois do "=" ele instancia o construtor da ArrayList
    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public swing_aula6_arraylist() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNOME = new javax.swing.JTextField();
        txtCODIGO = new javax.swing.JTextField();
        BOTAO_CADASTRAR___ = new javax.swing.JButton();
        BOTAO_LISTAR___ = new javax.swing.JButton();
        BOTAO_SAIR___ = new javax.swing.JButton();
        BOTAO_SELECIONAR___ = new javax.swing.JButton();
        txtSETOR = new javax.swing.JTextField();
        txtSALARIO = new javax.swing.JTextField();
        txtFUNCAO = new javax.swing.JTextField();
        BOTAO_TABLE___ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLISTA = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTABLE = new javax.swing.JTable();
        BOTAO_TABLE___2 = new javax.swing.JButton();
        txtFILTRO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("Setor");

        jLabel4.setText("Função");

        jLabel5.setText("Salário");

        txtNOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOMEActionPerformed(evt);
            }
        });

        BOTAO_CADASTRAR___.setText("Cadastrar");
        BOTAO_CADASTRAR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_CADASTRAR___ActionPerformed(evt);
            }
        });

        BOTAO_LISTAR___.setText("Listar");
        BOTAO_LISTAR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_LISTAR___ActionPerformed(evt);
            }
        });

        BOTAO_SAIR___.setText("Sair");
        BOTAO_SAIR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SAIR___ActionPerformed(evt);
            }
        });

        BOTAO_SELECIONAR___.setText("Selecionar");
        BOTAO_SELECIONAR___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_SELECIONAR___ActionPerformed(evt);
            }
        });

        txtSETOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSETORActionPerformed(evt);
            }
        });

        txtSALARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSALARIOActionPerformed(evt);
            }
        });

        txtFUNCAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFUNCAOActionPerformed(evt);
            }
        });

        BOTAO_TABLE___.setText("Table");
        BOTAO_TABLE___.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_TABLE___ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtLISTA);

        txtTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(txtTABLE);

        BOTAO_TABLE___2.setText("Table2");
        BOTAO_TABLE___2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_TABLE___2ActionPerformed(evt);
            }
        });

        txtFILTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFILTROActionPerformed(evt);
            }
        });
        txtFILTRO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFILTROKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BOTAO_TABLE___, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSETOR, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSALARIO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFUNCAO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BOTAO_CADASTRAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BOTAO_LISTAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BOTAO_TABLE___2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOTAO_SELECIONAR___, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BOTAO_SAIR___, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFILTRO)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCODIGO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSETOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFUNCAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSALARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BOTAO_TABLE___2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTAO_TABLE___)
                    .addComponent(BOTAO_SAIR___))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTAO_CADASTRAR___)
                    .addComponent(BOTAO_LISTAR___)
                    .addComponent(BOTAO_SELECIONAR___))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(txtFILTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void txtNOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOMEActionPerformed

    }//GEN-LAST:event_txtNOMEActionPerformed

    private void BOTAO_SAIR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SAIR___ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BOTAO_SAIR___ActionPerformed

    private void BOTAO_LISTAR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_LISTAR___ActionPerformed
        String msg = "";
        for(Funcionario funcionario : listaFuncionarios){
            msg += funcionario.imprimir() + "\n-------------\n";
        }
        JOptionPane.showMessageDialog(this, msg);
    }//GEN-LAST:event_BOTAO_LISTAR___ActionPerformed

    private void BOTAO_CADASTRAR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_CADASTRAR___ActionPerformed
        Funcionario funcionario = new Funcionario();
        funcionario.setCodigo(Integer.parseInt(txtCODIGO.getText()));
        funcionario.setNome(txtNOME.getText());
        funcionario.setSetor(txtSETOR.getText());
        funcionario.setFuncao(txtFUNCAO.getText());
        funcionario.setSalario(Double.parseDouble(txtSALARIO.getText()));
        
        listaFuncionarios.add(funcionario);
        JOptionPane.showMessageDialog(this, "Funcionário salvo com sucesso!");
    }//GEN-LAST:event_BOTAO_CADASTRAR___ActionPerformed

    private void BOTAO_SELECIONAR___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_SELECIONAR___ActionPerformed
        
    }//GEN-LAST:event_BOTAO_SELECIONAR___ActionPerformed

    private void txtSETORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSETORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSETORActionPerformed

    private void txtSALARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSALARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSALARIOActionPerformed

    private void txtFUNCAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFUNCAOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFUNCAOActionPerformed

    private void BOTAO_TABLE___ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_TABLE___ActionPerformed
        
        DefaultListModel<String> model = new DefaultListModel<>();
        for(Funcionario funcionario : listaFuncionarios){
            model.addElement(funcionario.getCodigo() + " - " + funcionario.getNome());
        }
        txtLISTA.setModel(model);
    }//GEN-LAST:event_BOTAO_TABLE___ActionPerformed

    private void BOTAO_TABLE___2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_TABLE___2ActionPerformed
        ArrayList<String> colunas = new ArrayList<>();
        colunas.add("codigo");
        colunas.add("nome");
        
        // Na linha abaixo, o que está limitando o que será mostrado na Table é 
        // o COLUNAS que está linkado na Array COLUNAS das 3 linhas acima.
        TableModel modelTable = TableModelCreator.createTableModel(Funcionario.class, listaFuncionarios, colunas);
        txtTABLE.setModel(modelTable);
    }//GEN-LAST:event_BOTAO_TABLE___2ActionPerformed

    private void txtFILTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFILTROActionPerformed
        
    }//GEN-LAST:event_txtFILTROActionPerformed

    private void txtFILTROKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFILTROKeyReleased
        ArrayList<Funcionario> listaFiltrada = 
        listaFuncionarios.stream()
        .filter(funcionario -> 
        funcionario.getNome().startsWith(txtFILTRO.getText()))
        .collect(Collectors.toCollection(ArrayList::new));
        
        TableModel tb = TableModelCreator.createTableModel(
                Funcionario.class, listaFiltrada, null);
        
        txtTABLE.setModel(tb);
    }//GEN-LAST:event_txtFILTROKeyReleased

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(swing_aula6_arraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(swing_aula6_arraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(swing_aula6_arraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(swing_aula6_arraylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new swing_aula6_arraylist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_CADASTRAR___;
    private javax.swing.JButton BOTAO_LISTAR___;
    private javax.swing.JButton BOTAO_SAIR___;
    private javax.swing.JButton BOTAO_SELECIONAR___;
    private javax.swing.JButton BOTAO_TABLE___;
    private javax.swing.JButton BOTAO_TABLE___2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCODIGO;
    private javax.swing.JTextField txtFILTRO;
    private javax.swing.JTextField txtFUNCAO;
    private javax.swing.JList<String> txtLISTA;
    private javax.swing.JTextField txtNOME;
    private javax.swing.JTextField txtSALARIO;
    private javax.swing.JTextField txtSETOR;
    private javax.swing.JTable txtTABLE;
    // End of variables declaration//GEN-END:variables
}