package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.idioma;
import services.factoryServicos;
import services.idiomaServicos;
import view.modoVisao;

public class JFIdiomas extends javax.swing.JFrame {

    public JFIdiomas() {
        setTitle("Idiomas");
        initComponents();
        addRowToTable();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        IDIOMAS = new javax.swing.JLabel();
        JSeparas = new javax.swing.JSeparator();
        jspPainel = new javax.swing.JScrollPane();
        jtDicionario = new javax.swing.JTable();
        jtEntrada = new javax.swing.JTextField();
        jbFechar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jpEscuro = new javax.swing.JPanel();
        ONOFF = new javax.swing.JLabel();
        ENTRADA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 350));
        setPreferredSize(new java.awt.Dimension(500, 350));
        setResizable(false);

        jFundo.setBackground(new java.awt.Color(255, 255, 255));
        jFundo.setToolTipText("");
        jFundo.setMaximumSize(new java.awt.Dimension(750, 520));
        jFundo.setMinimumSize(new java.awt.Dimension(750, 520));

        IDIOMAS.setBackground(new java.awt.Color(0, 0, 0));
        IDIOMAS.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        IDIOMAS.setText("IDIOMAS");

        jtDicionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Idioma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtDicionario.getTableHeader().setReorderingAllowed(false);
        jtDicionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDicionarioMouseClicked(evt);
            }
        });
        jspPainel.setViewportView(jtDicionario);
        if (jtDicionario.getColumnModel().getColumnCount() > 0) {
            jtDicionario.getColumnModel().getColumn(0).setResizable(false);
            jtDicionario.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtDicionario.getColumnModel().getColumn(1).setResizable(false);
        }

        jtEntrada.setToolTipText("informe a palavra em minusculo!");
        jtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEntradaActionPerformed(evt);
            }
        });

        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jpEscuro.setBackground(new java.awt.Color(255, 255, 255));
        jpEscuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEscuroMouseClicked(evt);
            }
        });

        ONOFF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/off.png"))); // NOI18N

        javax.swing.GroupLayout jpEscuroLayout = new javax.swing.GroupLayout(jpEscuro);
        jpEscuro.setLayout(jpEscuroLayout);
        jpEscuroLayout.setHorizontalGroup(
            jpEscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ONOFF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpEscuroLayout.setVerticalGroup(
            jpEscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscuroLayout.createSequentialGroup()
                .addComponent(ONOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        ENTRADA.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ENTRADA.setText("ENTRADA ");

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSeparas)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(IDIOMAS)
                .addGap(103, 103, 103)
                .addComponent(jpEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jspPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtEntrada)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(ENTRADA)))
                .addGap(25, 285, Short.MAX_VALUE))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addComponent(jpEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                        .addComponent(IDIOMAS)
                        .addGap(20, 20, 20)))
                .addComponent(JSeparas, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jspPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ENTRADA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDicionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDicionarioMouseClicked
        jbEditar.setEnabled(true);
    }//GEN-LAST:event_jtDicionarioMouseClicked

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        if (jbFechar.getText().equals("Fechar")) {
            this.dispose();
        } else {
            jbSalvar.setText("Salvar");
            jbFechar.setText("Fechar");
            jbEditar.setEnabled(false);
        }
        jtEntrada.setText(" ");
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        idiomaServicos iServicos = factoryServicos.getIdiomaServicos();

        int linha = jtDicionario.getSelectedRow();
        int ididioma = (int) jtDicionario.getValueAt(linha, 0);

        Object[] rep = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this, "Deseja realmente deletar este Idioma ?",
                "Remover idioma", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rep, rep[0]);

        if (resposta == 0) {
            iServicos.delTraducao(ididioma);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Idioma deletado com sucesso!.");
        } else {
            JOptionPane.showMessageDialog(this, "Opção cancelada!.");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jbSalvar.setText("Confirmar");
        jbFechar.setText("Cancelar");

        int linha;
        linha = jtDicionario.getSelectedRow();

        jtEntrada.setText((String) jtDicionario.getValueAt(linha, 1));

    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (jbSalvar.getText().equals("Confirmar")) {
            atualizarIdioma();
        } else {
            cadastrarIdioma();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jpEscuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEscuroMouseClicked
        boolean modoAtivado = modoVisao.isDarkModeOn();
        if (!modoAtivado) {
            jFundo.setBackground(Color.decode("#283482"));
            jpEscuro.setBackground(Color.decode("#283482"));
            IDIOMAS.setForeground(Color.white);
            ENTRADA.setForeground(Color.white);
            ONOFF.setIcon(new ImageIcon(JFMenu.class.getResource("/img/on.png")));
        } else {
            jFundo.setBackground(Color.white);
            jpEscuro.setBackground(Color.white);
            IDIOMAS.setForeground(Color.black);
            ENTRADA.setForeground(Color.black);
            ONOFF.setIcon(new ImageIcon(JFMenu.class.getResource("/img/off.png")));
        }
        modoVisao.toggleVisao();
    }//GEN-LAST:event_jpEscuroMouseClicked

    private void jtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEntradaActionPerformed

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtDicionario.getModel();
        model.getDataVector().removeAllElements();// Remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[2];
        idiomaServicos iServicos = factoryServicos.getIdiomaServicos();

        for (idioma idioma : iServicos.getIdioma()) {
            rowData[0] = idioma.getIdidioma();
            rowData[1] = idioma.getIdioma();
            model.addRow(rowData);
        }
    }

    public void limparCampo() {
        jbSalvar.setText("Salvar");
        jbFechar.setText("Fechar");
        jbEditar.setEnabled(false);
        jtEntrada.setText("");
    }

    private void cadastrarIdioma() {
        idiomaServicos iServicos = factoryServicos.getIdiomaServicos();

        int ididioma = 0;
        String idioma = jtEntrada.getText();

        idioma i = new idioma(ididioma, idioma);

        boolean idiomaJaCadastrado = iServicos.verTraducao(i);

        if (idiomaJaCadastrado) {
            JOptionPane.showMessageDialog(this, "Idioma já cadastrado!");
            jtEntrada.requestFocus();
        } else {
            iServicos.cadTraducao(i);
            limparCampo();
            addRowToTable();
        }
        i = new idioma();
    }

    private void atualizarIdioma() {
        idiomaServicos iServicos = factoryServicos.getIdiomaServicos();

        int linha = jtDicionario.getSelectedRow();
        int ididioma = (int) jtDicionario.getValueAt(linha, 0);
        String idiomma = jtEntrada.getText();

        idioma i = new idioma(ididioma, idiomma);

        iServicos.attTraducao(i);
        limparCampo();
        addRowToTable();
        i = new idioma();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFIdiomas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ENTRADA;
    private javax.swing.JLabel IDIOMAS;
    private javax.swing.JSeparator JSeparas;
    private javax.swing.JLabel ONOFF;
    private javax.swing.JPanel jFundo;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpEscuro;
    private javax.swing.JScrollPane jspPainel;
    private javax.swing.JTable jtDicionario;
    private javax.swing.JTextField jtEntrada;
    // End of variables declaration//GEN-END:variables
}
