package view;

import java.awt.Color;
import model.idioma;
import services.comboServicos;
import services.factoryServicos;
import services.traducaoServicos;
import services.idiomaServicos;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JFTradutor extends javax.swing.JFrame {

    public JFTradutor() {
        setTitle("Tradutor");
        initComponents();
        CarregaCombo();

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        TRADUTOR = new javax.swing.JLabel();
        ENTRADA = new javax.swing.JLabel();
        jcbEntrada = new javax.swing.JComboBox<>();
        jtEntrada = new javax.swing.JTextArea();
        jbTraduzir = new javax.swing.JButton();
        SAIDA = new javax.swing.JLabel();
        jcbSaida = new javax.swing.JComboBox<>();
        jtSaida = new javax.swing.JTextArea();
        jbFechar = new javax.swing.JButton();
        jpEscuro = new javax.swing.JPanel();
        ONOFF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jFundo.setBackground(new java.awt.Color(255, 255, 255));

        TRADUTOR.setBackground(new java.awt.Color(0, 0, 0));
        TRADUTOR.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        TRADUTOR.setText("TRADUTOR");

        ENTRADA.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ENTRADA.setText("ENTRADA: ");

        jtEntrada.setColumns(20);
        jtEntrada.setRows(5);
        jtEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jbTraduzir.setText("Traduzir");
        jbTraduzir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTraduzir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTraduzirActionPerformed(evt);
            }
        });

        SAIDA.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        SAIDA.setText("SAIDA:");

        jtSaida.setEditable(false);
        jtSaida.setColumns(20);
        jtSaida.setRows(5);
        jtSaida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jbFechar.setText("Fechar");
        jbFechar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
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

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(TRADUTOR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(jpEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jFundoLayout.createSequentialGroup()
                                .addComponent(SAIDA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFundoLayout.createSequentialGroup()
                                .addComponent(ENTRADA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFundoLayout.createSequentialGroup()
                                .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addComponent(jbTraduzir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtSaida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtEntrada, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFundoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(TRADUTOR))
                    .addComponent(jpEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ENTRADA))
                .addGap(28, 28, 28)
                .addComponent(jtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(SAIDA))
                .addGap(18, 18, 18)
                .addComponent(jtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbTraduzir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean modo;

    private void jbTraduzirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTraduzirActionPerformed
        traducaoServicos tServicos = factoryServicos.getTraducaoServicos();
        idiomaServicos iServicos = factoryServicos.getIdiomaServicos();

        String palavra = jtEntrada.getText();
        idioma origem = iServicos.getIdiomabyNome((String) jcbEntrada.getSelectedItem());
        idioma destino = iServicos.getIdiomabyNome((String) jcbSaida.getSelectedItem());
        String traducao = tServicos.getTraducao(palavra, origem, destino);

        if (!palavra.isEmpty()) {

            if (traducao != null) {
                jtSaida.setText(traducao);
            } else {
                Object[] rep = {"Sim", "Não"};
                int resposta = JOptionPane.showOptionDialog(this, "Tradução não localizada, deseja cadastrada-la ?",
                        "Tradução não localizada", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, rep, rep[0]);

                if (resposta == 0) {
                    JFDicionario janelaTradutor = new JFDicionario();
                    janelaTradutor.setVisible(true);
                    janelaTradutor.recebas(palavra, origem, destino);

                } else {
                    JOptionPane.showMessageDialog(this, "Opção cancelada!.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Informe uma palavra para traduzir!.");
        }
    }//GEN-LAST:event_jbTraduzirActionPerformed

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jpEscuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEscuroMouseClicked
        if (!modo) {
            jFundo.setBackground(Color.decode("#283482"));
            jpEscuro.setBackground(Color.decode("#283482"));
            TRADUTOR.setForeground(Color.white);
            ENTRADA.setForeground(Color.white);
            SAIDA.setForeground(Color.white);
            ONOFF.setIcon(new ImageIcon(JFMenu.class.getResource("/img/on.png")));
        } else {
            jFundo.setBackground(Color.white);
            jpEscuro.setBackground(Color.white);
            TRADUTOR.setForeground(Color.black);
            ENTRADA.setForeground(Color.black);
            SAIDA.setForeground(Color.black);
            ONOFF.setIcon(new ImageIcon(JFMenu.class.getResource("/img/off.png")));
        }
        modo = !modo;
    }//GEN-LAST:event_jpEscuroMouseClicked

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFTradutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ENTRADA;
    private javax.swing.JLabel ONOFF;
    private javax.swing.JLabel SAIDA;
    private javax.swing.JLabel TRADUTOR;
    private javax.swing.JPanel jFundo;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbTraduzir;
    private javax.swing.JComboBox<String> jcbEntrada;
    private javax.swing.JComboBox<String> jcbSaida;
    private javax.swing.JPanel jpEscuro;
    private javax.swing.JTextArea jtEntrada;
    private javax.swing.JTextArea jtSaida;
    // End of variables declaration//GEN-END:variables
}
