import java.util.*;
import java.io.*;   
import java.awt.event.*;
import javax.swing.*;

class SubjectsMenu extends javax.swing.JFrame {

    public SubjectsMenu() {
        initComponents();
    }

    private void initComponents() {

        heading = new javax.swing.JLabel();
        math = new javax.swing.JButton();
        oop = new javax.swing.JButton();
        dsd = new javax.swing.JButton();
        english = new javax.swing.JButton();
        back = new javax.swing.JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setText("   SUBJECTS");

        math.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mathActionPerformed(evt);
            }
        });

        oop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oopActionPerformed(evt);
            }
        });

        dsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsdActionPerformed(evt);
            }
        });

        english.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishActionPerformed(evt);
            }
        });

        math.setText("Maths");

        oop.setText("Object Oriented Programing");

        dsd.setText("Digital System Design");

        english.setText("English");

        back.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(english, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(math, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)
                        .addGap(100, 100, 100)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(math)
                .addGap(18, 18, 18)
                .addComponent(oop)
                .addGap(18, 18, 18)
                .addComponent(dsd)
                .addGap(18, 18, 18)
                .addComponent(english)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt)
        {
        AdminPage page = new AdminPage();
        page.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }

        private void mathActionPerformed(java.awt.event.ActionEvent evt)
        {
        ExamPage page = new ExamPage(0);
        page.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }

        private void oopActionPerformed(java.awt.event.ActionEvent evt)
        {
        ExamPage page = new ExamPage(1);
        page.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }

        private void dsdActionPerformed(java.awt.event.ActionEvent evt)
        {
        ExamPage page = new ExamPage(2);
        page.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }

        private void englishActionPerformed(java.awt.event.ActionEvent evt)
        {
        ExamPage page = new ExamPage(3);
        page.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }

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
            java.util.logging.Logger.getLogger(SubjectsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton dsd;
    private javax.swing.JButton english;
    private javax.swing.JLabel heading;
    private javax.swing.JButton math;
    private javax.swing.JButton oop;
    // End of variables declaration//GEN-END:variables
}

class Student implements Serializable
{
    String name;
    String regNo;
    String DOB;
    String branch;
    int year;
    Subject x;

    Student()
    {
        name = regNo = DOB = branch = "uninit";
        year = -1; 
        x = new Subject();
    }
}

class Subject implements Serializable
{
    double ses1[];
    double ses2[];
    double ends[];
    int attendance[];
    Subject()
    {
        ses1 = new double[4];
        ses2 = new double[4];
        ends = new double[4];
        attendance = new int[4];
    }
}

class BadInputException extends Exception
{
    BadInputException()
    {
        System.out.println("One or more incorrect entries made. Try again?");
    }
}

class StudentReader
{
    public static ArrayList<Student> returnDatabase() 
    {
        ArrayList<Student> data = new ArrayList<Student>();

        try
        {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream("database.txt"));
            while(true)
            {
                Student s = (Student)o.readObject();
                if(s.name.equals("uninit")) break;
                data.add(s);
            }
            o.close();
        }
        catch(Exception e)
        {
            System.out.println("Error." + e);
        }

    return data;
    }
}

class ExamPage extends javax.swing.JFrame {

    /**
     * Creates new form ExamPage
     */

    int topic;

    public ExamPage(int x) 
    {
        topic = x;
        initComponents();
    }

    private void initComponents() {

        heading = new javax.swing.JLabel();
        labelsess1 = new javax.swing.JLabel();
        labelsess2 = new javax.swing.JLabel();
        labelends = new javax.swing.JLabel();
        ses1text = new javax.swing.JTextField();
        ses2text = new javax.swing.JTextField();
        endstext = new javax.swing.JTextField();
        maxsess2 = new javax.swing.JLabel();
        maxsess1 = new javax.swing.JLabel();
        maxends = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        regnolabel = new javax.swing.JLabel();
        regnotext = new javax.swing.JTextField();
        submit = new javax.swing.JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setText("    EXAMS");

        labelsess1.setText("Sessionals 1 :");

        labelsess2.setText("Sessionals 2 :");

        labelends.setText("End Semester :");

        maxsess2.setText("/15");

        maxsess1.setText("/15");

        maxends.setText("/50");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        regnolabel.setText("Registration No. :");

        submit.setText("Submit");

        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submittextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelends)
                            .addComponent(labelsess2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelsess1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ses2text, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ses1text)
                            .addComponent(endstext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(maxsess1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxends)
                                    .addComponent(maxsess2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regnolabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(regnotext, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)
                        .addGap(106, 106, 106)
                        .addComponent(heading))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(submit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(heading)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regnolabel)
                            .addComponent(regnotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelsess1)
                            .addComponent(ses1text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxsess1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelsess2)
                            .addComponent(ses2text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxsess2))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelends)
                            .addComponent(endstext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxends))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(23, 23, 23))
        );


        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_backActionPerformed
        SubjectsMenu page = new SubjectsMenu();
        page.setVisible(true);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_backActionPerformed

    private void submittextActionPerformed(java.awt.event.ActionEvent evt) 
    {
    //GEN-FIRST:event_ses1textActionPerformed
        Boolean valid = true;
        double one = 0;
        double two = 0;
        double three = 0;

        try
        {
            one = Double.parseDouble(ses1text.getText());
            two = Double.parseDouble(ses2text.getText());
            three = Double.parseDouble(endstext.getText());
            if(one < 1 || two < 1 || three < 1 || one > 15 || two > 15 || three > 50)
            {
                valid = false;
                throw new BadInputException();
            } 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        } 

        if(valid)
        {
            ArrayList<Student> a = StudentReader.returnDatabase();
            String stu = regnotext.getText();
            Student obj = null; 
            for(int i = 0; i < a.size(); i++)
            {
                if(a.get(i).regNo.equals(stu))
                {
                    obj = a.remove(i);
                    break;
                }
            }

            try
            {
                if(obj == null)
                {
                    valid = false;
                    throw new BadInputException();
                }
                obj.x.ses1[topic] = one;
                obj.x.ses2[topic] = two;
                obj.x.ends[topic] = three;  
                a.add(obj);
            }
            catch(BadInputException e)
            {
                JOptionPane.showMessageDialog(this, "Invalid Registration Number" , "Error", JOptionPane.ERROR_MESSAGE);
            }

            try
            {
                ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("database.txt"));
                for(int i = 0; i < a.size(); i++)
                o.writeObject(a.get(i));
                o.writeObject(new Student());
                o.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e , "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if(valid)
        JOptionPane.showMessageDialog(this, "Marks successfully updated." , "Updated", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_ses1textActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField endstext;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel labelends;
    private javax.swing.JLabel labelsess1;
    private javax.swing.JLabel labelsess2;
    private javax.swing.JLabel maxends;
    private javax.swing.JLabel maxsess1;
    private javax.swing.JLabel maxsess2;
    private javax.swing.JLabel regnolabel;
    private javax.swing.JTextField regnotext;
    private javax.swing.JTextField ses1text;
    private javax.swing.JTextField ses2text;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
