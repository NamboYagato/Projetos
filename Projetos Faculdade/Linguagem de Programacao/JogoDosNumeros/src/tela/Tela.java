package tela;

import classes.CartaoAposta;
import classes.CartaoSorteio;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class Tela extends javax.swing.JFrame {

    private CartaoAposta aposta;
    private CartaoSorteio sorteio;
    private int totalSelecionado = 0;

    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
        jBVerificar.setEnabled(false);
        jBJN.setEnabled(false);
        //res.isEditable(false);

    }

    private void armazenaAposta() {
        for (int comp = 0; comp < painelNumeros.getComponentCount(); comp++) {
            if (painelNumeros.getComponent(comp) instanceof JToggleButton botao) {
                if (botao.isSelected()) {
                    int nApostado = Integer.parseInt(botao.getActionCommand());
                    int retAposta = aposta.addNumeros(nApostado);
                }
            }
        }
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLLogo = new javax.swing.JLabel();
        painelNumeros = new javax.swing.JPanel();
        jTB1 = new javax.swing.JToggleButton();
        jTB2 = new javax.swing.JToggleButton();
        jTB3 = new javax.swing.JToggleButton();
        jTB4 = new javax.swing.JToggleButton();
        jTB5 = new javax.swing.JToggleButton();
        jTB6 = new javax.swing.JToggleButton();
        jTB7 = new javax.swing.JToggleButton();
        jTB8 = new javax.swing.JToggleButton();
        jTB9 = new javax.swing.JToggleButton();
        jTB10 = new javax.swing.JToggleButton();
        jTB11 = new javax.swing.JToggleButton();
        jTB12 = new javax.swing.JToggleButton();
        jTB13 = new javax.swing.JToggleButton();
        jTB14 = new javax.swing.JToggleButton();
        jTB15 = new javax.swing.JToggleButton();
        jTB16 = new javax.swing.JToggleButton();
        jTB17 = new javax.swing.JToggleButton();
        jTB18 = new javax.swing.JToggleButton();
        jTB19 = new javax.swing.JToggleButton();
        jTB20 = new javax.swing.JToggleButton();
        jTB21 = new javax.swing.JToggleButton();
        jTB22 = new javax.swing.JToggleButton();
        jTB23 = new javax.swing.JToggleButton();
        jTB24 = new javax.swing.JToggleButton();
        jTB25 = new javax.swing.JToggleButton();
        jTB26 = new javax.swing.JToggleButton();
        jTB27 = new javax.swing.JToggleButton();
        jTB28 = new javax.swing.JToggleButton();
        jTB29 = new javax.swing.JToggleButton();
        jTB30 = new javax.swing.JToggleButton();
        jTB31 = new javax.swing.JToggleButton();
        jTB32 = new javax.swing.JToggleButton();
        jTB33 = new javax.swing.JToggleButton();
        jTB34 = new javax.swing.JToggleButton();
        jTB35 = new javax.swing.JToggleButton();
        jTB36 = new javax.swing.JToggleButton();
        jTB37 = new javax.swing.JToggleButton();
        jTB38 = new javax.swing.JToggleButton();
        jTB39 = new javax.swing.JToggleButton();
        jTB40 = new javax.swing.JToggleButton();
        jTB41 = new javax.swing.JToggleButton();
        jTB42 = new javax.swing.JToggleButton();
        jTB43 = new javax.swing.JToggleButton();
        jTB44 = new javax.swing.JToggleButton();
        jTB45 = new javax.swing.JToggleButton();
        jTB46 = new javax.swing.JToggleButton();
        jTB47 = new javax.swing.JToggleButton();
        jTB48 = new javax.swing.JToggleButton();
        jTB49 = new javax.swing.JToggleButton();
        jTB50 = new javax.swing.JToggleButton();
        jBJN = new javax.swing.JButton();
        jBVerificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLLogo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/casino-chips_2187567.png"))); // NOI18N
        jLLogo.setDoubleBuffered(isResizable());
        jLLogo.setMaximumSize(new java.awt.Dimension(256, 256));
        jLLogo.setMinimumSize(new java.awt.Dimension(256, 256));
        jLLogo.setPreferredSize(new java.awt.Dimension(256, 256));

        painelNumeros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Marque entre 6 a 10 números")));

        jTB1.setText("01");
        jTB1.setActionCommand("1");
        jTB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB2.setText("02");
        jTB2.setActionCommand("2");
        jTB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB3.setText("03");
        jTB3.setActionCommand("3");
        jTB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB4.setText("04");
        jTB4.setActionCommand("4");
        jTB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB5.setText("05");
        jTB5.setActionCommand("5");
        jTB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB6.setText("06");
        jTB6.setActionCommand("6");
        jTB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB7.setText("07");
        jTB7.setActionCommand("7");
        jTB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB8.setText("08");
        jTB8.setActionCommand("8");
        jTB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB9.setText("09");
        jTB9.setActionCommand("9");
        jTB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB10.setText("10");
        jTB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB11.setText("11");
        jTB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB12.setText("12");
        jTB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB13.setText("13");
        jTB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB14.setText("14");
        jTB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB15.setText("15");
        jTB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB16.setText("16");
        jTB16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB17.setText("17");
        jTB17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB18.setText("18");
        jTB18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB19.setText("19");
        jTB19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB20.setText("20");
        jTB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB21.setText("21");
        jTB21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB22.setText("22");
        jTB22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB23.setText("23");
        jTB23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB24.setText("24");
        jTB24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB25.setText("25");
        jTB25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB26.setText("26");
        jTB26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB27.setText("27");
        jTB27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB28.setText("28");
        jTB28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB29.setText("29");
        jTB29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB30.setText("30");
        jTB30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB31.setText("31");
        jTB31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB32.setText("32");
        jTB32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB33.setText("33");
        jTB33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB34.setText("34");
        jTB34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB35.setText("35");
        jTB35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB36.setText("36");
        jTB36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB37.setText("37");
        jTB37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB38.setText("38");
        jTB38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB39.setText("39");
        jTB39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB40.setText("40");
        jTB40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB41.setText("41");
        jTB41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB42.setText("42");
        jTB42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB43.setText("43");
        jTB43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB44.setText("44");
        jTB44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB45.setText("45");
        jTB45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB46.setText("46");
        jTB46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB47.setText("47");
        jTB47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB48.setText("48");
        jTB48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB49.setText("49");
        jTB49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        jTB50.setText("50");
        jTB50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona(evt);
            }
        });

        javax.swing.GroupLayout painelNumerosLayout = new javax.swing.GroupLayout(painelNumeros);
        painelNumeros.setLayout(painelNumerosLayout);
        painelNumerosLayout.setHorizontalGroup(
            painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNumerosLayout.createSequentialGroup()
                        .addComponent(jTB21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTB30))
                    .addGroup(painelNumerosLayout.createSequentialGroup()
                        .addComponent(jTB31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTB40))
                    .addGroup(painelNumerosLayout.createSequentialGroup()
                        .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelNumerosLayout.createSequentialGroup()
                                .addComponent(jTB41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTB50))
                            .addGroup(painelNumerosLayout.createSequentialGroup()
                                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTB11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTB12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTB13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTB14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTB5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTB15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTB16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTB7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTB17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTB18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTB8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelNumerosLayout.createSequentialGroup()
                                        .addComponent(jTB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTB10))
                                    .addGroup(painelNumerosLayout.createSequentialGroup()
                                        .addComponent(jTB19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTB20)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelNumerosLayout.setVerticalGroup(
            painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTB1)
                    .addComponent(jTB2)
                    .addComponent(jTB3)
                    .addComponent(jTB4)
                    .addComponent(jTB5)
                    .addComponent(jTB6)
                    .addComponent(jTB7)
                    .addComponent(jTB8)
                    .addComponent(jTB9)
                    .addComponent(jTB10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTB11)
                    .addComponent(jTB12)
                    .addComponent(jTB13)
                    .addComponent(jTB14)
                    .addComponent(jTB15)
                    .addComponent(jTB16)
                    .addComponent(jTB17)
                    .addComponent(jTB18)
                    .addComponent(jTB19)
                    .addComponent(jTB20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTB21)
                    .addComponent(jTB22)
                    .addComponent(jTB23)
                    .addComponent(jTB24)
                    .addComponent(jTB25)
                    .addComponent(jTB26)
                    .addComponent(jTB27)
                    .addComponent(jTB28)
                    .addComponent(jTB29)
                    .addComponent(jTB30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTB31)
                    .addComponent(jTB32)
                    .addComponent(jTB33)
                    .addComponent(jTB34)
                    .addComponent(jTB35)
                    .addComponent(jTB36)
                    .addComponent(jTB37)
                    .addComponent(jTB38)
                    .addComponent(jTB39)
                    .addComponent(jTB40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTB41)
                    .addComponent(jTB42)
                    .addComponent(jTB43)
                    .addComponent(jTB44)
                    .addComponent(jTB45)
                    .addComponent(jTB46)
                    .addComponent(jTB47)
                    .addComponent(jTB48)
                    .addComponent(jTB49)
                    .addComponent(jTB50))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBJN.setText("Jogar novamente");
        jBJN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJNActionPerformed(evt);
            }
        });

        jBVerificar.setText("Verificar");
        jBVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerificarActionPerformed(evt);
            }
        });

        res.setEditable(false);
        res.setColumns(20);
        res.setRows(5);
        jScrollPane2.setViewportView(res);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBJN, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jBVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jBVerificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBJN))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painelNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pintaAcertos(int[] acertos) {
        java.awt.Component[] component = painelNumeros.getComponents();
        for (Component componente : component) {
            if (componente instanceof JToggleButton botao) {
                if (botao.isSelected()) {
                    for (int num : acertos) {
                        if (botao.getActionCommand().equals(String.valueOf(num))) {
                            botao.setBackground(Color.blue);
                            botao.setForeground(Color.white);
                        }
                    }
                }
            }
        }
    }

    private void seleciona(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleciona
        JToggleButton botao = (JToggleButton) evt.getSource();
        //if (controleBotoes) {
        if (botao.isSelected()) {
            if (totalSelecionado >= 0 && totalSelecionado < 10) {
                totalSelecionado++;

            }else{
                JOptionPane.showMessageDialog(null, "Não é possivel selecionar mais do que 10 botões!!!", "Aviso", 0);
            }
        }else{
            totalSelecionado--;
        }
        jBVerificar.setEnabled(totalSelecionado >= 6);
    }//GEN-LAST:event_seleciona

    private void jBVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerificarActionPerformed
        aposta = new CartaoAposta(totalSelecionado);

        armazenaAposta();

        sorteio = new CartaoSorteio();
        
        Arrays.sort(sorteio.getNumeros());
        pintaAcertos(aposta.acertos(sorteio).getNumeros());
        res.setText("Aposta nº" + aposta.getNumeroAposta() + "\nNumeros Sorteados: " + sorteio.numerosCartao() + "\n" + "Valor da Aposta: R$" + aposta.calculaAposta() + "\nTotal de acertos: " + aposta.acertos(sorteio).getTotNumeros());
        jBVerificar.setEnabled(false);
        jBJN.setEnabled(true);
        totalSelecionado = 0;

//        float valorAposta = aposta.calculaAposta();
//        Cartao acertos = aposta.acertos(sorteio);
//        
//        
//        System.out.println("Números Sorteados: " + arrayToString(aposta.getNumeros()));
//    System.out.println("Números da Aposta: " + arrayToString(aposta.getNumeros()));
//    System.out.println("Números Acertados: " + arrayToString(acertos.getNumeros()));
//    System.out.println("Valor da Aposta: " + valorAposta);
//}
//
//// Método auxiliar para converter um array de inteiros para uma string formatada
//private String arrayToString(int[] array) {
//    StringBuilder result = new StringBuilder("[");
//    for (int i = 0; i < array.length; i++) {
//        result.append(array[i]);
//        if (i < array.length - 1) {
//            result.append(", ");
//        }
//    }
//    result.append("]");
//    return result.toString();
    }//GEN-LAST:event_jBVerificarActionPerformed

    private void jBJNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJNActionPerformed
        for(Component componente : painelNumeros.getComponents()){
            if (componente instanceof JToggleButton){
                JToggleButton botao = (JToggleButton) componente;
                botao.setSelected(false);
                botao.setBackground(null);
                botao.setForeground(null);
            }
        }
        totalSelecionado = 0;
        jBVerificar.setEnabled(false);
        jBJN.setEnabled(false);
        res.setText(null);
    }//GEN-LAST:event_jBJNActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBJN;
    private javax.swing.JButton jBVerificar;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jTB1;
    private javax.swing.JToggleButton jTB10;
    private javax.swing.JToggleButton jTB11;
    private javax.swing.JToggleButton jTB12;
    private javax.swing.JToggleButton jTB13;
    private javax.swing.JToggleButton jTB14;
    private javax.swing.JToggleButton jTB15;
    private javax.swing.JToggleButton jTB16;
    private javax.swing.JToggleButton jTB17;
    private javax.swing.JToggleButton jTB18;
    private javax.swing.JToggleButton jTB19;
    private javax.swing.JToggleButton jTB2;
    private javax.swing.JToggleButton jTB20;
    private javax.swing.JToggleButton jTB21;
    private javax.swing.JToggleButton jTB22;
    private javax.swing.JToggleButton jTB23;
    private javax.swing.JToggleButton jTB24;
    private javax.swing.JToggleButton jTB25;
    private javax.swing.JToggleButton jTB26;
    private javax.swing.JToggleButton jTB27;
    private javax.swing.JToggleButton jTB28;
    private javax.swing.JToggleButton jTB29;
    private javax.swing.JToggleButton jTB3;
    private javax.swing.JToggleButton jTB30;
    private javax.swing.JToggleButton jTB31;
    private javax.swing.JToggleButton jTB32;
    private javax.swing.JToggleButton jTB33;
    private javax.swing.JToggleButton jTB34;
    private javax.swing.JToggleButton jTB35;
    private javax.swing.JToggleButton jTB36;
    private javax.swing.JToggleButton jTB37;
    private javax.swing.JToggleButton jTB38;
    private javax.swing.JToggleButton jTB39;
    private javax.swing.JToggleButton jTB4;
    private javax.swing.JToggleButton jTB40;
    private javax.swing.JToggleButton jTB41;
    private javax.swing.JToggleButton jTB42;
    private javax.swing.JToggleButton jTB43;
    private javax.swing.JToggleButton jTB44;
    private javax.swing.JToggleButton jTB45;
    private javax.swing.JToggleButton jTB46;
    private javax.swing.JToggleButton jTB47;
    private javax.swing.JToggleButton jTB48;
    private javax.swing.JToggleButton jTB49;
    private javax.swing.JToggleButton jTB5;
    private javax.swing.JToggleButton jTB50;
    private javax.swing.JToggleButton jTB6;
    private javax.swing.JToggleButton jTB7;
    private javax.swing.JToggleButton jTB8;
    private javax.swing.JToggleButton jTB9;
    private javax.swing.JPanel painelNumeros;
    private javax.swing.JTextArea res;
    // End of variables declaration//GEN-END:variables
}
