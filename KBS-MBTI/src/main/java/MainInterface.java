/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rosi
 */
public class MainInterface extends javax.swing.JFrame {
    
    
    public String[] question;
    public String[] choice1;
    public String[] choice2;
    public char[] selectedquestion;
    
    public int qa;

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        
        question[0] = "Bagaimanakah cara Anda merencanakan sesuatu?"; 
        question[1] = "Menurut Anda orang seperti apakah Anda?"; 
        question[2] = "Manakah yang lebih Anda sukai?"; 
        question[3] = "Jika Anda adalah seorang guru, pelajaran seperti apakah yang lebih suka Anda ajarkan?"; 
        question[4] = "Teman seperti apakah yang lebih Anda sukai?";
        question[5] = "Bagaimanakah cara Anda bekerja?";
        question[6] = "Manakah yang lebih sering menguasai Anda?"; 
        question[7] = "Bagaimana pendapat Anda tentang jadwal yang tetap?"; 
        question[8] = "Jika Anda diberikan sebuah pekerjaan yang spesial, apa yang lebih cenderung Anda lakukan?"; 
        question[9] = "Manakah yang lebih cenderung Anda lakukan?"; 
        question[10] = "Manakah yang lebih Anda kuasai?";
        question[11] = "Jika Anda dapat memilih, ingin menjadi orang seperti apakah Anda?";
        question[12] = "Bagaimanakah cara Anda membuat keputusan?"; 
        question[13] = "Manakah yang lebih sering orang katakan tentang diri Anda?"; 
        question[14] = "Dalam sebuah grup, manakah yang lebih sering Anda lakukan?"; 
        question[15] = "Bagaimanakah Anda menghabiskan waktu luang?"; 
        question[16] = "Jika dikelilingi banyak orang, bagaimanakah perasaan Anda?";
        question[17] = "Dalam sebuah pesta, manakah yang lebih sering Anda lakukan?";
        question[18] = "Manakah yang lebih mewakili Anda dalam pekerjaan sehari-hari?"; 
        question[19] = "Jika dianggap orang seperti apakah Anda lebih senang?"; 
        question[20] = "Bagaimanakah biasanya Anda berbicara?"; 
        question[21] = "Jika anda sedang membaca buku untuk hiburan, manakah yang lebih sering Anda lakukan?"; 
        question[22] = "Manakah tipe bos atau atasan yang lebih Anda sukai?";
        
        choice1[0]="dengan merencanakannya";
        choice1[1]="spontan";
        choice1[2]="mudah bersosialisasi";
        choice1[3]="mudah dipahami";
        choice1[4]="pekerja keras";
        choice1[5]="sensitif";
        choice1[6]="tergesa-gesa";
        choice1[7]="banyak bicara";
        choice1[8]="sistematik";
        choice1[9]="imajinatif";
        choice1[10]="hangat";
        choice1[11]="tenang";
        choice1[12]="analitikal";
        choice1[13]="bijaksana";
        choice1[14]="berhati lembut";
        choice1[15]="setia";
        choice1[16]="kompeten";
        choice1[17]="praktis";
        choice1[18]="hal yang abstrak";
        choice1[19]="fakta";
        choice1[20]="hal yang meyakinkan";
        choice1[21]="pernyataan";
        choice1[22]="keuntungan";
        choice1[23]="hal yang prinsip";
        choice1[24]="hal yang praktis";
        choice1[25]="penemuan baru";
        choice1[26]="teori";
        choice1[27]="orang yang imajinatif";
        choice1[28]="orang yang cerdas";
        choice1[29]="spontan";
        choice1[30]="hati";
        choice1[31]="merasa senang";
        choice1[32]="merencanakan dengan baik sebelum memulai";
        choice1[33]="mengikuti alur";
        choice1[34]="memerintah";
        choice1[35]="memiliki sedikit teman yang dekat";
        choice1[36]="membangun";
        choice1[37]="membuat rencana";
        choice1[38]="mendukung metode yang bagus";
        choice1[39]="menghasilkan";
        choice1[40]="berbicara dengan banyak orang";
        choice1[41]="bijaksana";
        choice1[42]="berdasarkan fakta";
        choice1[43]="terbuka";
        choice1[44]="memperkenalkan diri";
        choice1[45]="sulit mengobrol";
        choice1[46]="berbicara dengan orang yang dikenal";
        choice1[47]="menyendiri";
        choice1[48]="merasa termotivasi";
        choice1[49]="mudah bosan ";
        choice1[50]="banyak bicara";
        choice1[51]="menikmati alur";
        choice1[52]="bertindak seperti cara orang lain";
        choice1[53]="memikirkan apa yang akan dilakukan";
        choice1[54]="bekerja sesuai mood";
        choice1[55]="logis";
        choice1[56]="kompeten";
        choice1[57]="teman dekat";
        choice1[58]="menikmati kejanggalan";
        choice1[59]="baik meskipun tidak konsisten";
        
        choice2[0]="tanpa rencana";
        choice2[1]="terorganisir";
        choice2[2]="penyendiri";
        choice2[3]="sulit dipahami";
        choice2[4]="konseptor";
        choice2[5]="logis";
        choice2[6]="cepat merespon";
        choice2[7]="banyak terdiam";
        choice2[8]="santai";
        choice2[9]="realistis";
        choice2[10]="objektif";
        choice2[11]="penasaran";
        choice2[12]="perasa";
        choice2[13]="peduli";
        choice2[14]="keras kepala";
        choice2[15]="rajin";
        choice2[16]="murah hati";
        choice2[17]="inovatif";
        choice2[18]="hal yang konkrit";
        choice2[19]="ide";
        choice2[20]="hal yang menyentuh";
        choice2[21]="konsep";
        choice2[22]="berkah";
        choice2[23]="ilmiah";
        choice2[24]="perasaan";
        choice2[25]="hal yang terkenal";
        choice2[26]="aplikasi";
        choice2[27]="orang yang realistik";
        choice2[28]="pekerja keras";
        choice2[29]="terorganisir";
        choice2[30]="pikiran";
        choice2[31]="merasa terbatasi";
        choice2[32]="melakukan apapun asalkan dapat bertahan";
        choice2[33]="mengikuti jadwal";
        choice2[34]="bergaul";
        choice2[35]="memiliki banyak teman yang dekat";
        choice2[36]="menciptakan";
        choice2[37]="menikmati waktu";
        choice2[38]="menganalisis permasalahan";
        choice2[39]="mendesain";
        choice2[40]="berbicara secara pribadi";
        choice2[41]="menawan";
        choice2[42]="berdasarkan perasaan orang";
        choice2[43]="tertutup";
        choice2[44]="diperkenalkan";
        choice2[45]="mudah mengobrol";
        choice2[46]="bergabung dalam pembicaraan";
        choice2[47]="bersama orang lain";
        choice2[48]="merasa biasa";
        choice2[49]="selalu senang";
        choice2[50]="membiarkan orang lain berbicara";
        choice2[51]="merencanakan segala sesuatu";
        choice2[52]="bertindak dengan cara sendiri";
        choice2[53]="memulai dengan membagi-bagi pekerjaan";
        choice2[54]="mengikuti jadwal";
        choice2[55]="konsisten";
        choice2[56]="humoris";
        choice2[57]="semua orang";
        choice2[58]="berpikir seperti alur berpikir penulis";
        choice2[59]="berlidah tajam tapi logis";
        
        qa = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        jToggleButton1.setText("Next");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jRadioButton3.setText("jRadioButton1");

        jRadioButton4.setText("jRadioButton2");

        jLabel3.setText("jLabel1");

        jRadioButton5.setText("jRadioButton2");

        jLabel4.setText("jLabel1");

        jRadioButton6.setText("jRadioButton1");

        jLabel5.setText("jLabel1");

        jRadioButton7.setText("jRadioButton2");

        jRadioButton8.setText("jRadioButton1");

        jLabel6.setText("jLabel1");

        jRadioButton9.setText("jRadioButton2");

        jRadioButton10.setText("jRadioButton1");

        jLabel7.setText("jLabel1");

        jRadioButton11.setText("jRadioButton1");

        jRadioButton12.setText("jRadioButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton8)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton10)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton11)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jToggleButton1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        qa++;
        switch (qa)
        {
            case 0: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[0]);
                    jRadioButton1.setText(choice1[0]);
                    jRadioButton2.setText(choice2[0]);
                    jLabel3.setText(question[1]);
                    jRadioButton3.setText(choice1[1]);
                    jRadioButton4.setText(choice2[1]);
                    jLabel4.setText(question[1]);
                    jRadioButton5.setText(choice1[2]);
                    jRadioButton6.setText(choice2[2]);
                    jLabel5.setText(question[1]);
                    jRadioButton7.setText(choice1[3]);
                    jRadioButton8.setText(choice2[3]);
                    jLabel6.setText(question[1]);
                    jRadioButton9.setText(choice1[4]);
                    jRadioButton10.setText(choice2[4]);
                    jLabel7.setText(question[1]);
                    jRadioButton11.setText(choice1[5]);
                    jRadioButton12.setText(choice2[5]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[0] = 'J';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[0] = 'P';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[1] = 'P';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[1] = 'J';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[2] = 'E';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[2] = 'I';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[3] = 'E';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[3] = 'I';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[4] = 'S';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[4] = 'N';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[5] = 'F';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[5] = 'T';
                    }
                    break;
            case 1: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[6]);
                    jRadioButton2.setText(choice2[6]);
                    jLabel3.setText(question[1]);
                    jRadioButton3.setText(choice1[7]);
                    jRadioButton4.setText(choice2[7]);
                    jLabel4.setText(question[1]);
                    jRadioButton5.setText(choice1[8]);
                    jRadioButton6.setText(choice2[8]);
                    jLabel5.setText(question[1]);
                    jRadioButton7.setText(choice1[9]);
                    jRadioButton8.setText(choice2[9]);
                    jLabel6.setText(question[1]);
                    jRadioButton9.setText(choice1[10]);
                    jRadioButton10.setText(choice2[10]);
                    jLabel7.setText(question[1]);
                    jRadioButton11.setText(choice1[11]);
                    jRadioButton12.setText(choice2[11]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[6] = 'P';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[6] = 'J';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[7] = 'E';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[7] = 'I';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[8] = 'J';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[8] = 'P';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[9] = 'N';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[9] = 'S';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[10] = 'F';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[10] = 'T';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[11] = 'I';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[11] = 'E';
                    }
                    break;
            case 2: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[12]);
                    jRadioButton2.setText(choice2[12]);
                    jLabel3.setText(question[1]);
                    jRadioButton3.setText(choice1[13]);
                    jRadioButton4.setText(choice2[13]);
                    jLabel4.setText(question[1]);
                    jRadioButton5.setText(choice1[14]);
                    jRadioButton6.setText(choice2[14]);
                    jLabel5.setText(question[1]);
                    jRadioButton7.setText(choice1[15]);
                    jRadioButton8.setText(choice2[15]);
                    jLabel6.setText(question[1]);
                    jRadioButton9.setText(choice1[16]);
                    jRadioButton10.setText(choice2[16]);
                    jLabel7.setText(question[1]);
                    jRadioButton11.setText(choice1[17]);
                    jRadioButton12.setText(choice2[17]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[12] = 'T';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[12] = 'F';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[13] = 'T';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[13] = 'F';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[14] = 'F';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[14] = 'T';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[15] = 'F';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[15] = 'T';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[16] = 'T';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[16] = 'F';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[17] = 'S';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[17] = 'N';
                    }
                    break;
            case 3: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[18]);
                    jRadioButton2.setText(choice2[18]);
                    jLabel3.setText(question[2]);
                    jRadioButton3.setText(choice1[19]);
                    jRadioButton4.setText(choice2[19]);
                    jLabel4.setText(question[2]);
                    jRadioButton5.setText(choice1[20]);
                    jRadioButton6.setText(choice2[20]);
                    jLabel5.setText(question[2]);
                    jRadioButton7.setText(choice1[21]);
                    jRadioButton8.setText(choice2[21]);
                    jLabel6.setText(question[2]);
                    jRadioButton9.setText(choice1[22]);
                    jRadioButton10.setText(choice2[22]);
                    jLabel7.setText(question[2]);
                    jRadioButton11.setText(choice1[23]);
                    jRadioButton12.setText(choice2[23]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[18] = 'N';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[18] = 'S';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[19] = 'S';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[19] = 'N';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[20] = 'T';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[20] = 'F';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[21] = 'S';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[21] = 'N';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[22] = 'T';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[22] = 'F';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[23] = 'N';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[23] = 'S';
                    }
                    break;
            case 4: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[24]);
                    jRadioButton2.setText(choice2[24]);
                    jLabel3.setText(question[2]);
                    jRadioButton3.setText(choice1[25]);
                    jRadioButton4.setText(choice2[25]);
                    jLabel4.setText(question[3]);
                    jRadioButton5.setText(choice1[26]);
                    jRadioButton6.setText(choice2[26]);
                    jLabel5.setText(question[4]);
                    jRadioButton7.setText(choice1[27]);
                    jRadioButton8.setText(choice2[27]);
                    jLabel6.setText(question[4]);
                    jRadioButton9.setText(choice1[28]);
                    jRadioButton10.setText(choice2[28]);
                    jLabel7.setText(question[5]);
                    jRadioButton11.setText(choice1[29]);
                    jRadioButton12.setText(choice2[29]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[24] = 'T';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[24] = 'F';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[25] = 'N';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[25] = 'S';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[26] = 'S';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[26] = 'N';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[27] = 'N';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[27] = 'S';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[28] = 'N';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[28] = 'S';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[29] = 'P';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[29] = 'J';
                    }
                    break;
            case 5: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[6]);
                    jRadioButton1.setText(choice1[30]);
                    jRadioButton2.setText(choice2[30]);
                    jLabel3.setText(question[7]);
                    jRadioButton3.setText(choice1[31]);
                    jRadioButton4.setText(choice2[31]);
                    jLabel4.setText(question[8]);
                    jRadioButton5.setText(choice1[32]);
                    jRadioButton6.setText(choice2[32]);
                    jLabel5.setText(question[9]);
                    jRadioButton7.setText(choice1[33]);
                    jRadioButton8.setText(choice2[33]);
                    jLabel6.setText(question[9]);
                    jRadioButton9.setText(choice1[34]);
                    jRadioButton10.setText(choice2[34]);
                    jLabel7.setText(question[9]);
                    jRadioButton11.setText(choice1[35]);
                    jRadioButton12.setText(choice2[35]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[30] = 'F';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[30] = 'T';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[31] = 'J';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[31] = 'P';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[32] = 'J';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[32] = 'P';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[33] = 'P';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[33] = 'J';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[34] = 'J';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[34] = 'P';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[35] = 'I';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[35] = 'E';
                    }
                    break;
            case 6: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[9]);
                    jRadioButton1.setText(choice1[36]);
                    jRadioButton2.setText(choice2[36]);
                    jLabel3.setText(question[9]);
                    jRadioButton4.setText(choice1[37]);
                    jRadioButton5.setText(choice2[37]);
                    jLabel4.setText(question[9]);
                    jRadioButton5.setText(choice1[38]);
                    jRadioButton6.setText(choice2[38]);
                    jLabel5.setText(question[9]);
                    jRadioButton7.setText(choice1[39]);
                    jRadioButton8.setText(choice2[39]);
                    jLabel6.setText(question[10]);
                    jRadioButton9.setText(choice1[40]);
                    jRadioButton10.setText(choice2[40]);
                    jLabel7.setText(question[11]);
                    jRadioButton11.setText(choice1[41]);
                    jRadioButton12.setText(choice2[41]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[36] = 'S';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[36] = 'N';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[37] = 'J';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[37] = 'P';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[38] = 'S';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[38] = 'N';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[39] = 'S';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[39] = 'N';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[40] = 'E';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[40] = 'I';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[41] = 'S';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[41] = 'N';
                    }
                    break;
            case 7: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[12]);
                    jRadioButton1.setText(choice1[42]);
                    jRadioButton2.setText(choice2[42]);
                    jLabel3.setText(question[13]);
                    jRadioButton3.setText(choice1[43]);
                    jRadioButton4.setText(choice2[43]);
                    jLabel4.setText(question[14]);
                    jRadioButton5.setText(choice1[44]);
                    jRadioButton6.setText(choice2[44]);
                    jLabel5.setText(question[14]);
                    jRadioButton7.setText(choice1[45]);
                    jRadioButton8.setText(choice2[45]);
                    jLabel6.setText(question[14]);
                    jRadioButton9.setText(choice1[46]);
                    jRadioButton10.setText(choice2[46]);
                    jLabel7.setText(question[15]);
                    jRadioButton11.setText(choice1[47]);
                    jRadioButton12.setText(choice2[47]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[42] = 'T';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[42] = 'F';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[43] = 'E';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[43] = 'I';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[44] = 'E';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[44] = 'I';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[45] = 'I';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[45] = 'E';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[46] = 'I';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[46] = 'E';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[47] = 'I';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[47] = 'E';
                    }
                    break;
            case 8: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[16]);
                    jRadioButton1.setText(choice1[48]);
                    jRadioButton2.setText(choice2[48]);
                    jLabel3.setText(question[17]);
                    jRadioButton3.setText(choice1[49]);
                    jRadioButton4.setText(choice2[49]);
                    jLabel4.setText(question[17]);
                    jRadioButton5.setText(choice1[50]);
                    jRadioButton6.setText(choice2[50]);
                    jLabel5.setText(question[18]);
                    jRadioButton7.setText(choice1[51]);
                    jRadioButton8.setText(choice2[51]);
                    jLabel6.setText(question[18]);
                    jRadioButton9.setText(choice1[52]);
                    jRadioButton10.setText(choice2[52]);
                    jLabel7.setText(question[18]);
                    jRadioButton11.setText(choice1[53]);
                    jRadioButton12.setText(choice2[53]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[48] = 'E';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[48] = 'I';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[49] = 'I';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[49] = 'E';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[50] = 'E';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[50] = 'I';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[51] = 'P';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[51] = 'J';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[52] = 'S';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[52] = 'N';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[53] = 'P';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[53] = 'J';
                    }
                    break;
            case 9: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[18]);
                    jRadioButton1.setText(choice1[54]);
                    jRadioButton2.setText(choice2[54]);
                    jLabel3.setText(question[19]);
                    jRadioButton3.setText(choice1[55]);
                    jRadioButton4.setText(choice2[55]);
                    jLabel4.setText(question[19]);
                    jRadioButton5.setText(choice1[56]);
                    jRadioButton6.setText(choice2[56]);
                    jLabel5.setText(question[20]);
                    jRadioButton7.setText(choice1[57]);
                    jRadioButton8.setText(choice2[57]);
                    jLabel6.setText(question[21]);
                    jRadioButton9.setText(choice1[58]);
                    jRadioButton10.setText(choice2[58]);
                    jLabel7.setText(question[22]);
                    jRadioButton11.setText(choice1[59]);
                    jRadioButton12.setText(choice2[59]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[54] = 'P';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[54] = 'J';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[55] = 'F';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[55] = 'T';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[56] = 'T';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[56] = 'F';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[57] = 'I';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[57] = 'E';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[58] = 'N';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[58] = 'S';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[59] = 'F';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[59] = 'T';
                    }
                    break;
            default: jLabel2.setText("Halaman " + (qa+1) + " dari 10");
                    jLabel1.setText(question[0]);
                    jRadioButton1.setText(choice1[0]);
                    jRadioButton2.setText(choice2[0]);
                    jLabel3.setText(question[1]);
                    jRadioButton3.setText(choice1[1]);
                    jRadioButton4.setText(choice2[1]);
                    jLabel4.setText(question[1]);
                    jRadioButton5.setText(choice1[2]);
                    jRadioButton6.setText(choice2[2]);
                    jLabel5.setText(question[1]);
                    jRadioButton7.setText(choice1[3]);
                    jRadioButton8.setText(choice2[3]);
                    jLabel6.setText(question[1]);
                    jRadioButton9.setText(choice1[4]);
                    jRadioButton10.setText(choice2[4]);
                    jLabel7.setText(question[1]);
                    jRadioButton11.setText(choice1[5]);
                    jRadioButton12.setText(choice2[5]);
                    
                    if (jRadioButton1.isSelected())
                    {   
                        jRadioButton2.setSelected(false);
                        selectedquestion[0] = 'J';
                    }
                    if (jRadioButton2.isSelected())
                    {   
                        jRadioButton1.setSelected(false);
                        selectedquestion[0] = 'P';
                    }
                    if (jRadioButton3.isSelected())
                    {   
                        jRadioButton4.setSelected(false);
                        selectedquestion[1] = 'P';
                    }
                    if (jRadioButton4.isSelected())
                    {   
                        jRadioButton3.setSelected(false);
                        selectedquestion[1] = 'J';
                    }
                    if (jRadioButton5.isSelected())
                    {   
                        jRadioButton6.setSelected(false);
                        selectedquestion[2] = 'E';
                    }
                    if (jRadioButton6.isSelected())
                    {   
                        jRadioButton5.setSelected(false);
                        selectedquestion[2] = 'I';
                    }
                    if (jRadioButton7.isSelected())
                    {   
                        jRadioButton8.setSelected(false);
                        selectedquestion[3] = 'E';
                    }
                    if (jRadioButton8.isSelected())
                    {   
                        jRadioButton7.setSelected(false);
                        selectedquestion[3] = 'I';
                    }
                    if (jRadioButton9.isSelected())
                    {   
                        jRadioButton10.setSelected(false);
                        selectedquestion[4] = 'S';
                    }
                    if (jRadioButton10.isSelected())
                    {   
                        jRadioButton9.setSelected(false);
                        selectedquestion[4] = 'N';
                    }
                    if (jRadioButton11.isSelected())
                    {   
                        jRadioButton12.setSelected(false);
                        selectedquestion[5] = 'F';
                    }
                    if (jRadioButton12.isSelected())
                    {   
                        jRadioButton11.setSelected(false);
                        selectedquestion[5] = 'T';
                    }
                    break;
        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
