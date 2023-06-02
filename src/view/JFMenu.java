package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import view.modoVisao;

public class JFMenu extends javax.swing.JFrame {

    public JFMenu() {
        setTitle("Menu Tradutor");
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundo = new javax.swing.JPanel();
        jpEscuro = new javax.swing.JPanel();
        ONOFF = new javax.swing.JLabel();
        TRADUTOR = new javax.swing.JLabel();
        jpTradutor = new javax.swing.JPanel();
        jlTradutor = new javax.swing.JLabel();
        CADASTRO = new javax.swing.JLabel();
        jpDicionario = new javax.swing.JPanel();
        jlDicionario = new javax.swing.JLabel();
        jpIdioma = new javax.swing.JPanel();
        jlIdioma = new javax.swing.JLabel();
        LIBRAS = new javax.swing.JLabel();
        jpTLibra = new javax.swing.JPanel();
        jlTLibra = new javax.swing.JLabel();
        jpCLibra = new javax.swing.JPanel();
        jlCLibra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(385, 586));
        setMinimumSize(new java.awt.Dimension(385, 586));
        setResizable(false);

        jFundo.setBackground(new java.awt.Color(255, 255, 255));

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

        TRADUTOR.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        TRADUTOR.setText("TRADUTOR");

        jpTradutor.setBackground(new java.awt.Color(204, 204, 204));
        jpTradutor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, java.awt.Color.darkGray));
        jpTradutor.setForeground(new java.awt.Color(255, 255, 255));
        jpTradutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpTradutor.setPreferredSize(new java.awt.Dimension(152, 77));
        jpTradutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpTradutorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpTradutorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpTradutorMouseExited(evt);
            }
        });

        jlTradutor.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jlTradutor.setText("TRADUZIR");

        javax.swing.GroupLayout jpTradutorLayout = new javax.swing.GroupLayout(jpTradutor);
        jpTradutor.setLayout(jpTradutorLayout);
        jpTradutorLayout.setHorizontalGroup(
            jpTradutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTradutorLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jlTradutor)
                .addGap(27, 27, 27))
        );
        jpTradutorLayout.setVerticalGroup(
            jpTradutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTradutorLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlTradutor)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        CADASTRO.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        CADASTRO.setText("CADASTRAR");

        jpDicionario.setBackground(new java.awt.Color(204, 204, 204));
        jpDicionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, java.awt.Color.darkGray));
        jpDicionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpDicionario.setPreferredSize(new java.awt.Dimension(152, 77));
        jpDicionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpDicionarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpDicionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpDicionarioMouseExited(evt);
            }
        });

        jlDicionario.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jlDicionario.setText("TRADUÇÕES");

        javax.swing.GroupLayout jpDicionarioLayout = new javax.swing.GroupLayout(jpDicionario);
        jpDicionario.setLayout(jpDicionarioLayout);
        jpDicionarioLayout.setHorizontalGroup(
            jpDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDicionarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlDicionario)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpDicionarioLayout.setVerticalGroup(
            jpDicionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDicionarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlDicionario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jpIdioma.setBackground(new java.awt.Color(204, 204, 204));
        jpIdioma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, java.awt.Color.darkGray));
        jpIdioma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpIdioma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpIdiomaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpIdiomaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpIdiomaMouseExited(evt);
            }
        });

        jlIdioma.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jlIdioma.setText("IDIOMA");

        javax.swing.GroupLayout jpIdiomaLayout = new javax.swing.GroupLayout(jpIdioma);
        jpIdioma.setLayout(jpIdiomaLayout);
        jpIdiomaLayout.setHorizontalGroup(
            jpIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIdiomaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlIdioma)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jpIdiomaLayout.setVerticalGroup(
            jpIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIdiomaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jlIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        LIBRAS.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        LIBRAS.setText("LIBRAS");

        jpTLibra.setBackground(new java.awt.Color(204, 204, 204));
        jpTLibra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, java.awt.Color.darkGray));
        jpTLibra.setForeground(new java.awt.Color(255, 255, 255));
        jpTLibra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpTLibra.setPreferredSize(new java.awt.Dimension(152, 77));
        jpTLibra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpTLibraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpTLibraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpTLibraMouseExited(evt);
            }
        });

        jlTLibra.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jlTLibra.setText("TRADUTOR");

        javax.swing.GroupLayout jpTLibraLayout = new javax.swing.GroupLayout(jpTLibra);
        jpTLibra.setLayout(jpTLibraLayout);
        jpTLibraLayout.setHorizontalGroup(
            jpTLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTLibraLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jlTLibra)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jpTLibraLayout.setVerticalGroup(
            jpTLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTLibraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlTLibra)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jpCLibra.setBackground(new java.awt.Color(204, 204, 204));
        jpCLibra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, java.awt.Color.darkGray));
        jpCLibra.setForeground(new java.awt.Color(255, 255, 255));
        jpCLibra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpCLibra.setPreferredSize(new java.awt.Dimension(152, 77));
        jpCLibra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCLibraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCLibraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCLibraMouseExited(evt);
            }
        });

        jlCLibra.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        jlCLibra.setText("CONVERSOR");

        javax.swing.GroupLayout jpCLibraLayout = new javax.swing.GroupLayout(jpCLibra);
        jpCLibra.setLayout(jpCLibraLayout);
        jpCLibraLayout.setHorizontalGroup(
            jpCLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCLibraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlCLibra)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpCLibraLayout.setVerticalGroup(
            jpCLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCLibraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlCLibra)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFundoLayout = new javax.swing.GroupLayout(jFundo);
        jFundo.setLayout(jFundoLayout);
        jFundoLayout.setHorizontalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(102, 351, Short.MAX_VALUE)
                .addComponent(jpEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jFundoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jFundoLayout.createSequentialGroup()
                            .addComponent(jpIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpDicionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jFundoLayout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(CADASTRO)))
                    .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jFundoLayout.createSequentialGroup()
                            .addComponent(jpTLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jpCLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jFundoLayout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(LIBRAS))
                        .addGroup(jFundoLayout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TRADUTOR)
                                .addComponent(jpTradutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jFundoLayout.setVerticalGroup(
            jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoLayout.createSequentialGroup()
                .addComponent(jpEscuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(TRADUTOR)
                .addGap(18, 18, 18)
                .addComponent(jpTradutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(CADASTRO)
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpDicionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(LIBRAS)
                .addGap(20, 20, 20)
                .addGroup(jFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpTLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpCLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        LIBRAS.getAccessibleContext().setAccessibleDescription("");

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

    private void jpDicionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDicionarioMouseEntered
        jpDicionario.setBackground(Color.decode("#5293F8"));
        jlDicionario.setForeground(Color.white);
    }//GEN-LAST:event_jpDicionarioMouseEntered

    private void jpDicionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDicionarioMouseExited
        jpDicionario.setBackground(Color.decode("#CCCCCC"));
        jlDicionario.setForeground(Color.black);
    }//GEN-LAST:event_jpDicionarioMouseExited

    private void jpDicionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpDicionarioMouseClicked
        JFDicionario janelaTradutor = new JFDicionario();
        janelaTradutor.setVisible(true);
    }//GEN-LAST:event_jpDicionarioMouseClicked

    private void jpTradutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTradutorMouseClicked
        JFTradutor janelaTradutor = new JFTradutor();
        janelaTradutor.setVisible(true);
    }//GEN-LAST:event_jpTradutorMouseClicked

    private void jpTradutorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTradutorMouseEntered
        jpTradutor.setBackground(Color.decode("#5293F8"));
        jlTradutor.setForeground(Color.white);
    }//GEN-LAST:event_jpTradutorMouseEntered

    private void jpTradutorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTradutorMouseExited
        jpTradutor.setBackground(Color.decode("#CCCCCC"));
        jlTradutor.setForeground(Color.black);
    }//GEN-LAST:event_jpTradutorMouseExited

    private void jpIdiomaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIdiomaMouseClicked
        JFIdiomas janelaIdioma = new JFIdiomas();
        janelaIdioma.setVisible(true);
    }//GEN-LAST:event_jpIdiomaMouseClicked

    private void jpIdiomaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIdiomaMouseEntered
        jpIdioma.setBackground(Color.decode("#5293F8"));
        jlIdioma.setForeground(Color.white);
    }//GEN-LAST:event_jpIdiomaMouseEntered

    private void jpIdiomaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpIdiomaMouseExited
        jpIdioma.setBackground(Color.decode("#CCCCCC"));
        jlIdioma.setForeground(Color.black);
    }//GEN-LAST:event_jpIdiomaMouseExited

    private void jpTLibraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTLibraMouseClicked
        JFLibra janelaTradutor = new JFLibra();
        janelaTradutor.setVisible(true);
    }//GEN-LAST:event_jpTLibraMouseClicked

    private void jpTLibraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTLibraMouseEntered
        jpTLibra.setBackground(Color.decode("#5293F8"));
        jlTLibra.setForeground(Color.white);
    }//GEN-LAST:event_jpTLibraMouseEntered

    private void jpTLibraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpTLibraMouseExited
        jpTLibra.setBackground(Color.decode("#CCCCCC"));
        jlTLibra.setForeground(Color.black);
    }//GEN-LAST:event_jpTLibraMouseExited

    private void jpCLibraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCLibraMouseClicked
        JFPortugues janelaTradutor = new JFPortugues();
        janelaTradutor.setVisible(true);
    }//GEN-LAST:event_jpCLibraMouseClicked

    private void jpCLibraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCLibraMouseEntered
        jpCLibra.setBackground(Color.decode("#5293F8"));
        jlCLibra.setForeground(Color.white);
    }//GEN-LAST:event_jpCLibraMouseEntered

    private void jpCLibraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCLibraMouseExited
        jpCLibra.setBackground(Color.decode("#CCCCCC"));
        jlCLibra.setForeground(Color.black);
    }//GEN-LAST:event_jpCLibraMouseExited

    private void jpEscuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpEscuroMouseClicked
        boolean modoAtivado = modoVisao.isDarkModeOn();

        if (!modoAtivado) {
            jFundo.setBackground(Color.decode("#283482"));
            jpEscuro.setBackground(Color.decode("#283482"));
            LIBRAS.setForeground(Color.white);
            TRADUTOR.setForeground(Color.white);
            CADASTRO.setForeground(Color.white);
            ONOFF.setIcon(new ImageIcon(JFMenu.class.getResource("/img/on.png")));
        } else {
            jFundo.setBackground(Color.white);
            jpEscuro.setBackground(Color.white);
            LIBRAS.setForeground(Color.black);
            TRADUTOR.setForeground(Color.black);
            CADASTRO.setForeground(Color.black);
            ONOFF.setIcon(new ImageIcon(JFMenu.class.getResource("/img/off.png")));
        }
        modoVisao.toggleVisao();
    }//GEN-LAST:event_jpEscuroMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CADASTRO;
    private javax.swing.JLabel LIBRAS;
    private javax.swing.JLabel ONOFF;
    private javax.swing.JLabel TRADUTOR;
    private javax.swing.JPanel jFundo;
    private javax.swing.JLabel jlCLibra;
    private javax.swing.JLabel jlDicionario;
    private javax.swing.JLabel jlIdioma;
    private javax.swing.JLabel jlTLibra;
    private javax.swing.JLabel jlTradutor;
    private javax.swing.JPanel jpCLibra;
    private javax.swing.JPanel jpDicionario;
    private javax.swing.JPanel jpEscuro;
    private javax.swing.JPanel jpIdioma;
    private javax.swing.JPanel jpTLibra;
    private javax.swing.JPanel jpTradutor;
    // End of variables declaration//GEN-END:variables
}
