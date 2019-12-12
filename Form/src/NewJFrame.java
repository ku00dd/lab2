
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.me.mylib.MatrixClass;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame2 = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        filechooser = new javax.swing.JFileChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        newf = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        nt = new javax.swing.JTextField();
        mt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        sub = new javax.swing.JToggleButton();
        mul = new javax.swing.JToggleButton();
        tr = new javax.swing.JToggleButton();
        det = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        trez = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        jFrame1.setTitle("Автор");
        jFrame1.setMinimumSize(new java.awt.Dimension(100, 50));
        jFrame1.setSize(new java.awt.Dimension(100, 50));
        jFrame1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jFrame1ComponentShown(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Програму виконала\n");

        jLabel5.setText("2018 р.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/IMG_6650 — копия.jpg"))); // NOI18N

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jFrame2.setMinimumSize(new java.awt.Dimension(100, 100));
        jFrame2.setSize(new java.awt.Dimension(400, 300));
        jFrame2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jFrame2ComponentShown(evt);
            }
        });

        jLabel6.setText("В пункті \"Файл\"");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        filechooser.setDialogTitle("Вибір файлу");

        newf.setTitle("Нова матриця");
        newf.setMinimumSize(new java.awt.Dimension(350, 300));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Розмірність матриці");

        jButton1.setText("ОК");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Рядки");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Стовбці");

        javax.swing.GroupLayout newfLayout = new javax.swing.GroupLayout(newf.getContentPane());
        newf.getContentPane().setLayout(newfLayout);
        newfLayout.setHorizontalGroup(
            newfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newfLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(newfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newfLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4))
                    .addGroup(newfLayout.createSequentialGroup()
                        .addGroup(newfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(newfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nt, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(mt))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newfLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(111, 111, 111))
        );
        newfLayout.setVerticalGroup(
            newfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newfLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(newfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(newfLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51)
                        .addGroup(newfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(nt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addComponent(mt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Лабораторна 2");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Перша матриця");

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        textarea1.setColumns(20);
        textarea1.setRows(5);
        jScrollPane2.setViewportView(textarea1);

        jLabel3.setText("Друга матриця");

        jLabel8.setText("Результат");

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        mul.setText("x");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        tr.setText("Транспонувати");
        tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trActionPerformed(evt);
            }
        });

        det.setText("Визначник");
        det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detActionPerformed(evt);
            }
        });

        trez.setColumns(20);
        trez.setRows(5);
        jScrollPane3.setViewportView(trez);

        jMenu1.setText("Файл");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem8.setText("Новий");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem10.setText("Зберегти");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Вихід");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar2.add(jMenu1);

        jMenu5.setText("Обробка");

        jMenu2.setText("Операції");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText("Додавання");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        buttonGroup1.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("Віднімання");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem2);

        jMenuItem2.setText("Множення");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenu5.add(jMenu2);

        jMenuItem1.setText("Транспонування");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem3.setText("Визначник");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Допомога");

        jMenuItem13.setText("Для користувача");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuItem14.setText("Про автора");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(add)
                        .addGap(18, 18, 18)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mul)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(det)
                            .addComponent(tr)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mul)
                    .addComponent(sub)
                    .addComponent(add)
                    .addComponent(tr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(det)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       Object[] options = {"Так", "Відмінити"};
int n = JOptionPane.showOptionDialog(null,
    "Бажаєте вийти з програми?",
    "Підтвердження виходу",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,     //do not use a custom Icon
    options,  //the titles of buttons
    options[0]); //default button title
    if (n == 0) {
       System.exit(0);
     } 
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
       
        jFrame1.setVisible(true);
        jFrame1.setSize(400, 250);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        jFrame2.setVisible(true);
        jFrame1.setSize(250, 300);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jFrame2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrame2ComponentShown
        jLabel6.setText("<html>При виборі пункуту \"Новий\" можна згенерувати нову матрицю<br>"
                + "Після створення нової матриці її мажна зберегти<br>"
                + "Також доступні різні дії з матрицями</html>");
    }//GEN-LAST:event_jFrame2ComponentShown

    private void jFrame1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jFrame1ComponentShown
        jLabel2.setText("<html>Автор</html>");
        jLabel7.setText("<html>Програму виконала<br>Студентка 4 курсу<br>Групи КН-1501-2<br>Бєлая Ольга</html>");
    }//GEN-LAST:event_jFrame1ComponentShown

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
      
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(n,m);
        String arb=textarea1.getText();
        String []spb = arb.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spb1 = spb[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                b.setElement(i, j,Integer.parseInt(spb1[j]));
            }
        }
        MatrixClass add = MatrixClass.add(a,b);
            String s="";
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        s+=Integer.toString(add.getElement(i, j))+" ";
                    }s+="\n";
                }
                 trez.setText(s); 
        
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
   
        jRadioButtonMenuItem1.setSelected(false);
        jRadioButtonMenuItem2.setSelected(false);
        jMenuItem10.setVisible(false);
        jMenu5.setVisible(false);
        add.setVisible(false);
        sub.setVisible(false);
        mul.setVisible(false);
        tr.setVisible(false);
        det.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(n,m);
        String arb=textarea1.getText();
        String []spb = arb.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spb1 = spb[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                b.setElement(i, j,Integer.parseInt(spb1[j]));
            }
        }
        MatrixClass add = MatrixClass.subtract(a,b);
            String s="";
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        s+=Integer.toString(add.getElement(i, j))+" ";
                    }s+="\n";
                }
                 trez.setText(s);
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(n,m);
        String arb=textarea1.getText();
        String []spb = arb.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spb1 = spb[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                b.setElement(i, j,Integer.parseInt(spb1[j]));
            }
        }
        MatrixClass at= MatrixClass.transpone(a);
        MatrixClass bt= MatrixClass.transpone(b);
        String s=("Транспонована перша матриця:\n");
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        s+=Integer.toString(at.getElement(i, j))+" ";
                    }s+="\n";
                }
                s+="\nТранспонована друга матриця:\n";
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        s+=Integer.toString(bt.getElement(i, j))+" ";
                    }s+="\n";
                }
                 trez.setText(s);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
      
        newf.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed
double roundResult (double d, int precise) {
 
   double newd=Math.pow(10, precise);
   return Math.round(d*newd)/newd;
 
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object[] options = {"OK"};   
        String N=nt.getText();
        String M=mt.getText();
            if(N.indexOf('.')!=-1||N.indexOf(',')!=-1||M.indexOf('.')!=-1||M.indexOf(',')!=-1){
                JOptionPane.showOptionDialog(null,
    "Значення повинно бути цілим",
    "Помилка",
    JOptionPane.OK_OPTION,
    JOptionPane.ERROR_MESSAGE,
    null,     //do not use a custom Icon
    options,  //the titles of buttons
    options[0]);
            }
            else{
                jMenuItem10.setVisible(true);
                jMenu5.setVisible(true);
                add.setVisible(true);
                sub.setVisible(true);
                mul.setVisible(true);
                tr.setVisible(true);
                det.setVisible(true);
                int n=Integer.parseInt(N), m=Integer.parseInt(M);
                MatrixClass a= new MatrixClass(n,m);
                MatrixClass b= new MatrixClass(n,m);
                a.fillRandomValues();
                b.fillRandomValues();
                String ar="";
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        ar+=Integer.toString(a.getElement(i, j))+" ";
                    }ar+="\n";
                }
                 textarea.setText(ar);
                 String ar1="";
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        ar1+=Integer.toString(b.getElement(i, j))+" ";
                    }ar1+="\n";
                }
                 textarea1.setText(ar1);
            }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt","*.*");
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(filter);
        if ( fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION ) {
            File filepath=fc.getSelectedFile();
            try ( FileWriter fw = new FileWriter(filepath+".txt") ) {
                fw.write("Перша матриця\r\n"+textarea.getText()+"\r\nДруга матриця\r\n"+textarea1.getText()+"\r\nРезультат обчислень:\r\n"+trez.getText());
                Object[] options = {"OK"};
                JOptionPane.showOptionDialog(null,
    "Дані збережено у файл!",
    "Успішно",
    JOptionPane.OK_OPTION,
    JOptionPane.INFORMATION_MESSAGE,
    null,     //do not use a custom Icon
    options,  //the titles of buttons
    options[0]);
                
            }
            catch ( IOException e ) {
                Object[] options = {"OK"};
                JOptionPane.showOptionDialog(null,
    "Помилка збереження файлу",
    "Помилка",
    JOptionPane.OK_OPTION,
    JOptionPane.ERROR_MESSAGE,
    null,     //do not use a custom Icon
    options,  //the titles of buttons
    options[0]);
            
            }
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trActionPerformed
          int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(n,m);
        String arb=textarea1.getText();
        String []spb = arb.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spb1 = spb[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                b.setElement(i, j,Integer.parseInt(spb1[j]));
            }
        }
        MatrixClass at= MatrixClass.transpone(a);
        MatrixClass bt= MatrixClass.transpone(b);
        String s=("Транспонована перша матриця:\n");
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        s+=Integer.toString(at.getElement(i, j))+" ";
                    }s+="\n";
                }
                s+="\nТранспонована друга матриця:\n";
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        s+=Integer.toString(bt.getElement(i, j))+" ";
                    }s+="\n";
                }
                 trez.setText(s);
    }//GEN-LAST:event_trActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(n,m);
        String arb=textarea1.getText();
        String []spb = arb.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spb1 = spb[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                b.setElement(i, j,Integer.parseInt(spb1[j]));
            }
        }
        MatrixClass add = MatrixClass.add(a,b);
            String s="";
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        s+=Integer.toString(add.getElement(i, j))+" ";
                    }s+="\n";
                }
                 trez.setText(s); 
        
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(n,m);
        String arb=textarea1.getText();
        String []spb = arb.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spb1 = spb[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                b.setElement(i, j,Integer.parseInt(spb1[j]));
            }
        }
        MatrixClass add = MatrixClass.subtract(a,b);
            String s="";
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        s+=Integer.toString(add.getElement(i, j))+" ";
                    }s+="\n";
                }
                 trez.setText(s);
    }//GEN-LAST:event_subActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(m,n);
        b.fillRandomValues();
         String ar1="";
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        ar1+=Integer.toString(b.getElement(i, j))+" ";
                    }ar1+="\n";
                }
                 textarea1.setText(ar1);
        MatrixClass add = MatrixClass.multiply(a,b);
            String s="";
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        s+=Integer.toString(add.getElement(i, j))+"\t";
                    }s+="\n";
                }
                 trez.setText(s);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(m,n);
        b.fillRandomValues();
         String ar1="";
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        ar1+=Integer.toString(b.getElement(i, j))+" ";
                    }ar1+="\n";
                }
                 textarea1.setText(ar1);
        MatrixClass add = MatrixClass.multiply(a,b);
            String s="";
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        s+=Integer.toString(add.getElement(i, j))+"\t";
                    }s+="\n";
                }
                 trez.setText(s);
    }//GEN-LAST:event_mulActionPerformed

    private void detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detActionPerformed
        int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(n,m);
        String arb=textarea1.getText();
        String []spb = arb.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spb1 = spb[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                b.setElement(i, j,Integer.parseInt(spb1[j]));
            }
        }
        
            String s="Визначник першої матриц:\n"+Integer.toString(MatrixClass.determinant(a))+"\n\nВизначник другої матриц:\n"+Integer.toString(MatrixClass.determinant(b));
                
                 trez.setText(s);
    }//GEN-LAST:event_detActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int n,m;
        n=Integer.parseInt(nt.getText()); m=Integer.parseInt(mt.getText());
        MatrixClass a= new MatrixClass(n,m);
        String ara=textarea.getText();
        String []spa = ara.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spa1 = spa[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                a.setElement(i, j,Integer.parseInt(spa1[j]));
            }
        }
        MatrixClass b= new MatrixClass(n,m);
        String arb=textarea1.getText();
        String []spb = arb.trim().split("( \n)"); 
        for(int i=0;i<n;i++){
            String []spb1 = spb[i].trim().split(" "); 
            for(int j=0;j<m;j++){
                b.setElement(i, j,Integer.parseInt(spb1[j]));
            }
        }
        
            String s="Визначник першої матриц:\n"+Integer.toString(MatrixClass.determinant(a))+"\n\nВизначник другої матриц:\n"+Integer.toString(MatrixClass.determinant(b));
                
                 trez.setText(s);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton det;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField mt;
    private javax.swing.JToggleButton mul;
    private javax.swing.JFrame newf;
    private javax.swing.JTextField nt;
    private javax.swing.JToggleButton sub;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JToggleButton tr;
    private javax.swing.JTextArea trez;
    // End of variables declaration//GEN-END:variables
}
