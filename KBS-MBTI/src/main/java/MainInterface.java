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
        
        choice1[0]="dengan merencakannya";
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jToggleButton1)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1)
                .addContainerGap(183, Short.MAX_VALUE))
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
            case 0: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[0]);
                    jRadioButton1.setText(choice1[0]);
                    jRadioButton2.setText(choice2[0]);
                    break;
            case 1: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[1]);
                    jRadioButton2.setText(choice2[1]);
                    break;
            case 2: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[2]);
                    jRadioButton2.setText(choice2[2]);
                    break;
            case 3: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[3]);
                    jRadioButton2.setText(choice2[3]);
                    break;
            case 4: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[4]);
                    jRadioButton2.setText(choice2[4]);
                    break;
            case 5: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[5]);
                    jRadioButton2.setText(choice2[5]);
                    break;
            case 6: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[6]);
                    jRadioButton2.setText(choice2[6]);
                    break;
            case 7: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[7]);
                    jRadioButton2.setText(choice2[7]);
                    break;
            case 8: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[8]);
                    jRadioButton2.setText(choice2[8]);
                    break;
            case 9: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[9]);
                    jRadioButton2.setText(choice2[9]);
                    break;
            case 10: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[10]);
                    jRadioButton2.setText(choice2[10]);
                    break;
            case 11: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[11]);
                    jRadioButton2.setText(choice2[11]);
                    break;
            case 12: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[12]);
                    jRadioButton2.setText(choice2[12]);
                    break;  
            case 13: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[13]);
                    jRadioButton2.setText(choice2[13]);
                    break; 
            case 14: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[14]);
                    jRadioButton2.setText(choice2[14]);
                    break;
            case 15: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[15]);
                    jRadioButton2.setText(choice2[15]);
                    break;
            case 16: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[16]);
                    jRadioButton2.setText(choice2[16]);
                    break;
            case 17: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[1]);
                    jRadioButton1.setText(choice1[17]);
                    jRadioButton2.setText(choice2[17]);
                    break;
            case 18: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[18]);
                    jRadioButton2.setText(choice2[18]);
                    break;
            case 19: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[19]);
                    jRadioButton2.setText(choice2[19]);
                    break;
            case 20: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[20]);
                    jRadioButton2.setText(choice2[20]);
                    break;
            case 21: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[21]);
                    jRadioButton2.setText(choice2[21]);
                    break;
            case 22: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[22]);
                    jRadioButton2.setText(choice2[22]);
                    break;
            case 23: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[23]);
                    jRadioButton2.setText(choice2[23]);
                    break;
            case 24: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[24]);
                    jRadioButton2.setText(choice2[24]);
                    break;
            case 25: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[2]);
                    jRadioButton1.setText(choice1[25]);
                    jRadioButton2.setText(choice2[25]);
                    break;
            case 26: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[3]);
                    jRadioButton1.setText(choice1[26]);
                    jRadioButton2.setText(choice2[26]);
                    break;
            case 27: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[4]);
                    jRadioButton1.setText(choice1[27]);
                    jRadioButton2.setText(choice2[27]);
                    break;
            case 28: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[4]);
                    jRadioButton1.setText(choice1[28]);
                    jRadioButton2.setText(choice2[28]);
                    break;
            case 29: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[5]);
                    jRadioButton1.setText(choice1[29]);
                    jRadioButton2.setText(choice2[29]);
                    break;
            case 30: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[6]);
                    jRadioButton1.setText(choice1[30]);
                    jRadioButton2.setText(choice2[30]);
                    break;
            case 31: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[7]);
                    jRadioButton1.setText(choice1[31]);
                    jRadioButton2.setText(choice2[31]);
                    break;   
            case 32: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[8]);
                    jRadioButton1.setText(choice1[32]);
                    jRadioButton2.setText(choice2[32]);
                    break;
            case 33: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[9]);
                    jRadioButton1.setText(choice1[33]);
                    jRadioButton2.setText(choice2[33]);
                    break;
            case 34: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[9]);
                    jRadioButton1.setText(choice1[34]);
                    jRadioButton2.setText(choice2[34]);
                    break;
            case 35: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[9]);
                    jRadioButton1.setText(choice1[35]);
                    jRadioButton2.setText(choice2[35]);
                    break;
            case 36: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[9]);
                    jRadioButton1.setText(choice1[36]);
                    jRadioButton2.setText(choice2[36]);
                    break;
            case 37: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[9]);
                    jRadioButton1.setText(choice1[37]);
                    jRadioButton2.setText(choice2[37]);
                    break;
            case 38: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[9]);
                    jRadioButton1.setText(choice1[38]);
                    jRadioButton2.setText(choice2[38]);
                    break;
            case 39: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[9]);
                    jRadioButton1.setText(choice1[39]);
                    jRadioButton2.setText(choice2[39]);
                    break;
            case 40: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[10]);
                    jRadioButton1.setText(choice1[40]);
                    jRadioButton2.setText(choice2[40]);
                    break;
            case 41: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[11]);
                    jRadioButton1.setText(choice1[41]);
                    jRadioButton2.setText(choice2[41]);
                    break;
            case 42: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[12]);
                    jRadioButton1.setText(choice1[42]);
                    jRadioButton2.setText(choice2[42]);
                    break;
            case 43: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[13]);
                    jRadioButton1.setText(choice1[43]);
                    jRadioButton2.setText(choice2[43]);
                    break;
            case 44: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[14]);
                    jRadioButton1.setText(choice1[44]);
                    jRadioButton2.setText(choice2[44]);
                    break;
            case 45: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[14]);
                    jRadioButton1.setText(choice1[45]);
                    jRadioButton2.setText(choice2[45]);
                    break;
            case 46: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[14]);
                    jRadioButton1.setText(choice1[46]);
                    jRadioButton2.setText(choice2[46]);
                    break;
            case 47: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[15]);
                    jRadioButton1.setText(choice1[47]);
                    jRadioButton2.setText(choice2[47]);
                    break;
            case 48: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[16]);
                    jRadioButton1.setText(choice1[48]);
                    jRadioButton2.setText(choice2[48]);
                    break;
            case 49: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[17]);
                    jRadioButton1.setText(choice1[49]);
                    jRadioButton2.setText(choice2[49]);
                    break;
            case 50: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[17]);
                    jRadioButton1.setText(choice1[50]);
                    jRadioButton2.setText(choice2[50]);
                    break;
            case 51: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[18]);
                    jRadioButton1.setText(choice1[51]);
                    jRadioButton2.setText(choice2[51]);
                    break;
            case 52: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[18]);
                    jRadioButton1.setText(choice1[52]);
                    jRadioButton2.setText(choice2[52]);
                    break;
            case 53: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[18]);
                    jRadioButton1.setText(choice1[53]);
                    jRadioButton2.setText(choice2[53]);
                    break;
            case 54: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[18]);
                    jRadioButton1.setText(choice1[54]);
                    jRadioButton2.setText(choice2[54]);
                    break;
            case 55: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[19]);
                    jRadioButton1.setText(choice1[55]);
                    jRadioButton2.setText(choice2[55]);
                    break;
            case 56: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[19]);
                    jRadioButton1.setText(choice1[56]);
                    jRadioButton2.setText(choice2[56]);
                    break;
            case 57: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[20]);
                    jRadioButton1.setText(choice1[57]);
                    jRadioButton2.setText(choice2[57]);
                    break;
            case 58: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[21]);
                    jRadioButton1.setText(choice1[58]);
                    jRadioButton2.setText(choice2[58]);
                    break;
            case 59: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[22]);
                    jRadioButton1.setText(choice1[59]);
                    jRadioButton2.setText(choice2[59]);
                    break;
            default: jLabel2.setText("Pertanyaan " + (qa+1) + " dari 60");
                    jLabel1.setText(question[0]);
                    jRadioButton1.setText(choice1[0]);
                    jRadioButton2.setText(choice2[0]);
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
