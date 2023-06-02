package view;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.idioma;
import model.traducao;
import services.comboServicos;
import services.factoryServicos;
import services.idiomaServicos;
import services.traducaoServicos;

public class JFDicionario extends javax.swing.JFrame {

    public JFDicionario() {
        setTitle("Dicionário");
        initComponents();
        addRowToTable();
        CarregaCombo();       
        jbEditar.setEnabled(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        DICIONARIO = new javax.swing.JLabel();
        jspPainel = new javax.swing.JScrollPane();
        jtDicionario = new javax.swing.JTable();
        ENTRADA = new javax.swing.JLabel();
        jcbEntrada = new javax.swing.JComboBox<>();
        jtEntrada = new javax.swing.JTextField();
        SAIDA = new javax.swing.JLabel();
        jcbSaida = new javax.swing.JComboBox<>();
        jtSaida = new javax.swing.JTextField();
        jbFechar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jpEscuro2 = new javax.swing.JPanel();
        ONOFF2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jFundo.setBackground(new java.awt.Color(255, 255, 255));
        jFundo.setToolTipText("");
        jFundo.setMaximumSize(new java.awt.Dimension(750, 520));
        jFundo.setMinimumSize(new java.awt.Dimension(750, 520));

        DICIONARIO.setBackground(new java.awt.Color(0, 0, 0));
        DICIONARIO.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        DICIONARIO.setText("DICIONÁRIO");

        jtDicionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Palavra", "Idioma", "Tradução", "Idioma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jtDicionario.getTableHeader().setReorderingAllowed(false);
        jtDicionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDicionarioMouseClicked(evt);
            }
        });
        jspPainel.setViewportView(jtDicionario);
        if (jtDicionario.getColumnModel().getColumnCount() > 0) {
            jtDicionario.getColumnModel().getColumn(0).setResizable(false);
            jtDicionario.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtDicionario.getColumnModel().getColumn(2).setResizable(false);
            jtDicionario.getColumnModel().getColumn(2).setPreferredWidth(50);
            jtDicionario.getColumnModel().getColumn(4).setResizable(false);
            jtDicionario.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        ENTRADA.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ENTRADA.setText("ENTRADA: ");

        jtEntrada.setToolTipText("informe a palavra em minusculo!");

        SAIDA.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        SAIDA.setText("SAIDA:");

        jtSaida.setToolTipText("informe a palavra em minusculo!");

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

        jpEscuro2.setBackground(new java.awt.Color(255, 255, 255));
        jpEscuro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpEscuro2MouseClicked(evt);
            }
        });

        ONOFF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/off.png"))); // NOI18N

        javax.swing.GroupLayout jpEscuro2Layout = new javax.swing.GroupLayout(jpEscuro2);
        jpEscuro2.setLayout(jpEscuro2Layout);
        jpEscuro2Layout.setHorizontalGroup(
            jpEscuro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ONOFF2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpEscuro2Layout.setVerticalGroup(
            jpEscuro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ONOFF2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jspPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SAIDA)
                            .addComponent(ENTRADA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEntrada))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtSaida)))
                .addGap(25, 25, 25))
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(DICIONARIO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpEscuro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DICIONARIO))
                    .addComponent(jpEscuro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ENTRADA))
                        .addGap(18, 18, 18)
                        .addComponent(jtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SAIDA))
                        .addGap(18, 18, 18)
                        .addComponent(jtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jspPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean modo;
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
        jtSaida.setText(" ");
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        traducaoServicos tServicos = factoryServicos.getTraducaoServicos();

        int linha = jtDicionario.getSelectedRow();
        int idtraducao = (int) jtDicionario.getValueAt(linha, 0);

        Object[] rep = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this, "Deseja realmente deletar esta Tradução ?",
                "Deletar", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rep, rep[0]);

        if (resposta == 0) {
            tServicos.delTraducao(idtraducao);
            addRowToTable();
            JOptionPane.showMessageDialog(this, "Tradução deletada com sucesso!.");
        } else {
            JOptionPane.showMessageDialog(this, "Opção cancelada!.");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        jbSalvar.setText("Confirmar");
        jbFechar.setText("Cancelar");

        int linha;
        linha = jtDicionario.getSelectedRow();

        jcbEntrada.setSelectedItem((String) jtDicionario.getValueAt(linha, 2));
        jtEntrada.setText((String) jtDicionario.getValueAt(linha, 1));
        jcbSaida.setSelectedItem((String) jtDicionario.getValueAt(linha, 4));
        jtSaida.setText((String) jtDicionario.getValueAt(linha, 3));
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (jbSalvar.getText().equals("Confirmar")) {
            atualizarTraducao();
        } else {
            cadastrarTraducao();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jpEscuro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEscuro2MouseClicked
        if (!modo) {
            jFundo.setBackground(Color.decode("#283482"));
            jpEscuro2.setBackground(Color.decode("#283482"));
            DICIONARIO.setForeground(Color.white);
            ENTRADA.setForeground(Color.white);
            SAIDA.setForeground(Color.white);
            ONOFF2.setIcon(new ImageIcon(JFMenu.class.getResource("/img/on.png")));
        } else {
            jFundo.setBackground(Color.white);
            jpEscuro2.setBackground(Color.white);
            DICIONARIO.setForeground(Color.black);
            ENTRADA.setForeground(Color.black);
            SAIDA.setForeground(Color.black);
            ONOFF2.setIcon(new ImageIcon(JFMenu.class.getResource("/img/off.png")));
        }
        modo = !modo;
    }//GEN-LAST:event_jpEscuro2MouseClicked

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtDicionario.getModel();
        model.getDataVector().removeAllElements();// Remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[5];
        traducaoServicos tServicos = factoryServicos.getTraducaoServicos();
        for (traducao tradutor : tServicos.getTraducao()) {
            rowData[0] = tradutor.getIdtraducao();
            rowData[1] = tradutor.getPalavra();
            rowData[2] = tradutor.getOrigem().getIdioma();
            rowData[3] = tradutor.getTraducao();
            rowData[4] = tradutor.getDestino().getIdioma();
            model.addRow(rowData);
        }
    }

    public void limparCampo() {
        jbSalvar.setText("Salvar");
        jbFechar.setText("Fechar");
        jbEditar.setEnabled(false);
        jtEntrada.setText("");
        jtSaida.setText("");
    }

    public void CarregaCombo() {
        comboServicos cServicos = factoryServicos.getComboServicos();
        try {
            ResultSet rs = cServicos.CarregaCombo();
            jcbEntrada.addItem("IDIOMAS : ");
            jcbSaida.addItem("IDIOMAS : ");

            while (rs.next()) {
                String op = rs.getString("idioma").trim();
                jcbEntrada.addItem(op);
                jcbSaida.addItem(op);

            }
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar combobox!\n" + ex.getMessage());
        }
    }

    private void cadastrarTraducao() {
        traducaoServicos tServicos = factoryServicos.getTraducaoServicos();
        idiomaServicos iServicos = factoryServicos.getIdiomaServicos();

        int idtraducao = 0;
        String palavra = jtEntrada.getText();
        String traducao = jtSaida.getText();
        idioma origem = iServicos.getIdiomabyNome((String) jcbEntrada.getSelectedItem());
        idioma destino = iServicos.getIdiomabyNome((String) jcbSaida.getSelectedItem());

        traducao t = new traducao(idtraducao, palavra, traducao, origem, destino);

        boolean traducaoJaCadastrada = tServicos.verTraducao(t);

        if (traducaoJaCadastrada) {
            JOptionPane.showMessageDialog(this, "Tradução já cadastrada!");
            jtEntrada.requestFocus();
        } else {
            tServicos.cadTraducao(t);
            limparCampo();
            addRowToTable();
        }
        t = new traducao();
    }

    private void atualizarTraducao() {
        traducaoServicos tServicos = factoryServicos.getTraducaoServicos();
        idiomaServicos iServicos = factoryServicos.getIdiomaServicos();

        int linha = jtDicionario.getSelectedRow();
        int idtraducao = (int) jtDicionario.getValueAt(linha, 0);
        String palavra = jtEntrada.getText();
        String traducao = jtSaida.getText();
        idioma origem = iServicos.getIdiomabyNome((String) jcbEntrada.getSelectedItem());
        idioma destino = iServicos.getIdiomabyNome((String) jcbSaida.getSelectedItem());

        traducao t = new traducao(idtraducao, palavra, traducao, origem, destino);

        tServicos.attTraducao(t);
        limparCampo();
        addRowToTable();
        t = new traducao();
    }

    public void recebas(String entrada, idioma origem, idioma destino) {
        jtEntrada.setText(entrada);
        jcbEntrada.setSelectedItem(origem.getIdioma());
        jcbSaida.setSelectedItem(destino.getIdioma());
        jtSaida.requestFocus();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDicionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DICIONARIO;
    private javax.swing.JLabel ENTRADA;
    private javax.swing.JLabel ONOFF2;
    private javax.swing.JLabel SAIDA;
    private javax.swing.JPanel jFundo;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbEntrada;
    private javax.swing.JComboBox<String> jcbSaida;
    private javax.swing.JPanel jpEscuro2;
    private javax.swing.JScrollPane jspPainel;
    private javax.swing.JTable jtDicionario;
    private javax.swing.JTextField jtEntrada;
    private javax.swing.JTextField jtSaida;
    // End of variables declaration//GEN-END:variables
}
