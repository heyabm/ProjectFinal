/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.JButton;

/**
 *
 * @author salshamsi
 */
public class Frame extends javax.swing.JFrame {

    private static int xo = 0, count = 0, ld;
    private ImageIcon x = new ImageIcon(getClass().getResource("x.png"));
    private ImageIcon o = new ImageIcon(getClass().getResource("o.png"));
    private Timer time;

    public Frame() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("Tic Tac Toe");
        labelxo.setIcon(x);

        panel2.hide();
        panel1.hide();
        panel3.hide();
        panel4.show();
        time = new Timer(40, new loading());
        time.start();

    }

    //------------------------------------------------------------------

    private class loading implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ld = load.getValue();
            if (ld < 100) {
                ld++;
                load.setValue(ld);
            } else {
                time.stop();
                panel3.show();
                panel4.hide();
            }
        }

    }

    //------------------------------------------------------------------
    private void SetIconXO(JButton bn) {
        File click = new File("click.WAV");
                PlaySound(click);
        if (xo == 0) {
            bn.setIcon(x);
            xo = 1;
            count++;
            labelxo.setIcon(o);
            player.setText(player2.getText());
            bn.setEnabled(false);
        } else {
            bn.setIcon(o);
            xo = 0;
            count++;
            labelxo.setIcon(x);
            player.setText(player1.getText());
            bn.setEnabled(false);
        }
    }

    //-----------------------------------------
    private void panel2() {
        xo = 0;
        count = 0;
        cas1.setIcon(null);
        cas1.setEnabled(true);
        cas2.setIcon(null);
        cas2.setEnabled(true);
        cas3.setIcon(null);
        cas3.setEnabled(true);
        cas4.setIcon(null);
        cas4.setEnabled(true);
        cas5.setIcon(null);
        cas5.setEnabled(true);
        cas6.setIcon(null);
        cas6.setEnabled(true);
        cas7.setIcon(null);
        cas7.setEnabled(true);
        cas8.setIcon(null);
        cas8.setEnabled(true);
        cas9.setIcon(null);
        cas9.setEnabled(true);
        labelxo.setIcon(x);
        panel2.show();
        panel1.hide();
        player.setText(player1.getText());
        
    }

    //------------------------------------------------
      static void PlaySound(File Sound)
    {
        try{
        Clip clip =  AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(Sound));
        clip.start();
        }
        
        catch(Exception e)
                {
                    
                }
        
    }
    private void casClick(JButton bn, JButton a1, JButton a2, JButton b1, JButton b2, JButton c1, JButton c2) {

        if (bn.getIcon().equals(a1.getIcon()) && bn.getIcon().equals(a2.getIcon())
                || bn.getIcon().equals(b1.getIcon()) && bn.getIcon().equals(b2.getIcon())
                || bn.getIcon().equals(c1.getIcon()) && bn.getIcon().equals(c2.getIcon())) {
                
            if (bn.getIcon().equals(x)) {
                win.setText(player1.getText() + " (x)  win ");
              
                File winSound = new File("win2.WAV");
                PlaySound(winSound);
            } else {
                win.setText(player2.getText() + " (o)  win ");
       
                  File winSound = new File("win2.WAV");
                PlaySound(winSound);
            }
            panel2();
        }
        equal();
    }

    //---------------------------------------------------------------
    private void equal() {
        if (count == 9) {
            panel2();
            win.setText("Draw");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cas1 = new javax.swing.JButton();
        cas2 = new javax.swing.JButton();
        cas3 = new javax.swing.JButton();
        cas4 = new javax.swing.JButton();
        cas5 = new javax.swing.JButton();
        cas6 = new javax.swing.JButton();
        cas7 = new javax.swing.JButton();
        cas8 = new javax.swing.JButton();
        cas9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelxo = new javax.swing.JLabel();
        player = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Restart = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        win = new javax.swing.JTextField();
        playa = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        player2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        player1 = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        load = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setPreferredSize(new java.awt.Dimension(400, 500));

        panel1.setBackground(new java.awt.Color(102, 255, 51));
        panel1.setPreferredSize(new java.awt.Dimension(400, 500));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 450));

        cas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas1ActionPerformed(evt);
            }
        });

        cas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas2ActionPerformed(evt);
            }
        });

        cas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas3ActionPerformed(evt);
            }
        });

        cas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas4ActionPerformed(evt);
            }
        });

        cas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas5ActionPerformed(evt);
            }
        });

        cas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas6ActionPerformed(evt);
            }
        });

        cas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas7ActionPerformed(evt);
            }
        });

        cas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas8ActionPerformed(evt);
            }
        });

        cas9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cas9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cas1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(cas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cas4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cas8, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(cas5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cas6, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(cas3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cas9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cas1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cas4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cas2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cas3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cas6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cas5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cas8, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(cas9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cas7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 17, -1, 320));

        jPanel2.setBackground(new java.awt.Color(153, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "turn for:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 3, 18), new java.awt.Color(255, 255, 0))); // NOI18N

        player.setFont(new java.awt.Font("Lucida Grande", 2, 24)); // NOI18N
        player.setForeground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(labelxo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelxo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 130));

        jButton1.setText("Clean");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 80, 40));

        Restart.setText("Restart");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });
        panel1.add(Restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 80, 40));

        jButton2.setText("End");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 80, 40));

        panel2.setBackground(new java.awt.Color(255, 255, 0));
        panel2.setPreferredSize(new java.awt.Dimension(400, 500));

        win.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 24)); // NOI18N
        win.setForeground(new java.awt.Color(102, 102, 255));
        win.setEnabled(false);
        win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                winActionPerformed(evt);
            }
        });

        playa.setText("Play Again");
        playa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playaActionPerformed(evt);
            }
        });

        restart.setText("Restart");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        jButton3.setText("End");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playa, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(playa)
                .addGap(29, 29, 29)
                .addComponent(restart)
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(204, 0, 0));
        panel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/tict_500x60_400x60.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Player 2:");

        player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ActionPerformed(evt);
            }
        });
        player2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                player2KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("Player 1:");

        player1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                player1KeyReleased(evt);
            }
        });

        start.setText("Start");
        start.setEnabled(false);
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jButton4.setText("End");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player2)
                            .addComponent(player1))
                        .addContainerGap())))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panel4.setBackground(new java.awt.Color(0, 0, 0));
        panel4.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/tict_500x60_400x60.jpg"))); // NOI18N

        load.setStringPainted(true);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/ttt_200x200.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas1ActionPerformed
        SetIconXO(cas1);
        casClick(cas1, cas2, cas3, cas5, cas9, cas4, cas7);
    }//GEN-LAST:event_cas1ActionPerformed

    private void cas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas2ActionPerformed
        SetIconXO(cas2);
        casClick(cas2, cas1, cas3, cas3, cas1, cas5, cas8);
    }//GEN-LAST:event_cas2ActionPerformed

    private void cas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas3ActionPerformed
        SetIconXO(cas3);
        casClick(cas3, cas6, cas9, cas5, cas7, cas2, cas1);
    }//GEN-LAST:event_cas3ActionPerformed

    private void cas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas4ActionPerformed
        SetIconXO(cas4);
        casClick(cas4, cas1, cas7, cas7, cas1, cas5, cas6);
    }//GEN-LAST:event_cas4ActionPerformed

    private void cas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas5ActionPerformed

        SetIconXO(cas5);
        casClick(cas5, cas2, cas6, cas1, cas9, cas4, cas6);
        casClick(cas5, cas2, cas6, cas1, cas9, cas7, cas3);
    }//GEN-LAST:event_cas5ActionPerformed

    private void cas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas6ActionPerformed

        SetIconXO(cas6);
        casClick(cas6, cas3, cas9, cas4, cas5, cas9, cas3);
    }//GEN-LAST:event_cas6ActionPerformed

    private void cas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas7ActionPerformed
        SetIconXO(cas7);
        casClick(cas7, cas4, cas1, cas5, cas3, cas8, cas9);
    }//GEN-LAST:event_cas7ActionPerformed

    private void cas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas8ActionPerformed
        SetIconXO(cas8);
        casClick(cas8 ,cas7,cas9,cas9,cas7,cas5,cas2);    }//GEN-LAST:event_cas8ActionPerformed

    private void cas9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cas9ActionPerformed
        SetIconXO(cas9);
        casClick(cas9 ,cas8,cas7,cas5,cas1,cas3,cas6);    }//GEN-LAST:event_cas9ActionPerformed

    private void playaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playaActionPerformed
        panel2.hide();
        panel1.show();

    }//GEN-LAST:event_playaActionPerformed

    private void winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_winActionPerformed

    }//GEN-LAST:event_winActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        panel3.hide();
        panel1.show();
        player.setText(player1.getText());
    }//GEN-LAST:event_startActionPerformed

    private void player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2ActionPerformed

    private void player1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_player1KeyReleased
        if (player1.getText().equals("") || player2.getText().equals("")) {
            start.setEnabled(false);

        } else {
            start.setEnabled(true);
        }
    }//GEN-LAST:event_player1KeyReleased

    private void player2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_player2KeyReleased
        if (player1.getText().equals("") || player2.getText().equals("")) {
            start.setEnabled(false);

        } else {
            start.setEnabled(true);
        }
    }//GEN-LAST:event_player2KeyReleased

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        panel3.show();
        panel2.hide();
        player1.setText("");
        player2.setText("");
        start.setEnabled(false);

    }//GEN-LAST:event_restartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panel2();
        panel1.show();
        panel2.hide();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
        panel2();
        panel3.show();
        panel1.hide();
        player1.setText("");
        player2.setText("");
        start.setEnabled(false);
    }//GEN-LAST:event_RestartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Restart;
    private javax.swing.JButton cas1;
    private javax.swing.JButton cas2;
    private javax.swing.JButton cas3;
    private javax.swing.JButton cas4;
    private javax.swing.JButton cas5;
    private javax.swing.JButton cas6;
    private javax.swing.JButton cas7;
    private javax.swing.JButton cas8;
    private javax.swing.JButton cas9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelxo;
    private javax.swing.JProgressBar load;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JButton playa;
    private javax.swing.JLabel player;
    private javax.swing.JTextField player1;
    private javax.swing.JTextField player2;
    private javax.swing.JButton restart;
    private javax.swing.JButton start;
    private javax.swing.JTextField win;
    // End of variables declaration//GEN-END:variables
}
