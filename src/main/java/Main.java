/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SHAHEEL
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollbar1 = new java.awt.Scrollbar();
        Header = new javax.swing.JPanel();
        SystemName = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        add_student = new javax.swing.JTabbedPane();
        addStudent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Student_Details = new javax.swing.JPanel();
        sName = new javax.swing.JLabel();
        sAddress = new javax.swing.JLabel();
        sPhone = new javax.swing.JLabel();
        sNIC = new javax.swing.JLabel();
        sEmail = new javax.swing.JLabel();
        sFollowing = new javax.swing.JLabel();
        sDisability = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        sPhotoUpload = new javax.swing.JButton();
        viewStudent = new javax.swing.JPanel();
        listStudent = new javax.swing.JPanel();
        listRooms = new javax.swing.JPanel();
        leavedFromHostel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostel Management System");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setName("Hostel Management System"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1920, 800));
        setSize(new java.awt.Dimension(1920, 800));

        Header.setBackground(new java.awt.Color(51, 22, 142));
        Header.setForeground(new java.awt.Color(255, 255, 255));

        SystemName.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 48)); // NOI18N
        SystemName.setForeground(new java.awt.Color(255, 255, 255));
        SystemName.setText("Hostel Management System");
        SystemName.setIconTextGap(5);
        SystemName.setInheritsPopupMenu(false);

        Body.setBackground(new java.awt.Color(255, 255, 255));

        add_student.setBackground(new java.awt.Color(0, 51, 102));
        add_student.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        add_student.setForeground(new java.awt.Color(255, 255, 255));
        add_student.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        add_student.setAutoscrolls(true);
        add_student.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N

        addStudent.setBackground(new java.awt.Color(255, 255, 255));
        addStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addStudent.setAutoscrolls(true);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel1.setText("STUDENT DETAILS");

        Student_Details.setBackground(new java.awt.Color(238, 235, 235));
        Student_Details.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 102)));

        sName.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        sName.setText("Full Name");

        sAddress.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        sAddress.setText("Address");

        sPhone.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        sPhone.setText("Phone No.");

        sNIC.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        sNIC.setText("NIC No.");

        sEmail.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        sEmail.setText("Email Id.");

        sFollowing.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        sFollowing.setText("Followings");

        sDisability.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        sDisability.setText("Disability");

        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel14.setText(":");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel15.setText(":");

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel16.setText(":");

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel17.setText(":");

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel18.setText(":");

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel19.setText(":");

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel20.setText(":");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextField2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Yours", "Cristian", "Hindu", "Muslim", "Shinhalese" }));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel21.setEnabled(false);

        sPhotoUpload.setBackground(new java.awt.Color(79, 89, 150));
        sPhotoUpload.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        sPhotoUpload.setForeground(new java.awt.Color(255, 255, 255));
        sPhotoUpload.setText("UPLOAD");
        sPhotoUpload.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 153, 153), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0)));
        sPhotoUpload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sPhotoUpload.setName(""); // NOI18N

        javax.swing.GroupLayout Student_DetailsLayout = new javax.swing.GroupLayout(Student_Details);
        Student_Details.setLayout(Student_DetailsLayout);
        Student_DetailsLayout.setHorizontalGroup(
            Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Student_DetailsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sDisability, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Student_DetailsLayout.createSequentialGroup()
                        .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Student_DetailsLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Student_DetailsLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sFollowing, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Student_DetailsLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3))
                    .addGroup(Student_DetailsLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1))
                    .addGroup(Student_DetailsLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(sPhotoUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86))
        );
        Student_DetailsLayout.setVerticalGroup(
            Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Student_DetailsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Student_DetailsLayout.createSequentialGroup()
                        .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sFollowing, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Student_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sDisability, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sPhotoUpload))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(Student_Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(455, 455, 455))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Student_Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout addStudentLayout = new javax.swing.GroupLayout(addStudent);
        addStudent.setLayout(addStudentLayout);
        addStudentLayout.setHorizontalGroup(
            addStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addStudentLayout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        addStudentLayout.setVerticalGroup(
            addStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        add_student.addTab("Add Student", addStudent);

        javax.swing.GroupLayout viewStudentLayout = new javax.swing.GroupLayout(viewStudent);
        viewStudent.setLayout(viewStudentLayout);
        viewStudentLayout.setHorizontalGroup(
            viewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1893, Short.MAX_VALUE)
        );
        viewStudentLayout.setVerticalGroup(
            viewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        add_student.addTab("View Student", viewStudent);

        listStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 0, true));

        javax.swing.GroupLayout listStudentLayout = new javax.swing.GroupLayout(listStudent);
        listStudent.setLayout(listStudentLayout);
        listStudentLayout.setHorizontalGroup(
            listStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1893, Short.MAX_VALUE)
        );
        listStudentLayout.setVerticalGroup(
            listStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        add_student.addTab("List Students", listStudent);

        javax.swing.GroupLayout listRoomsLayout = new javax.swing.GroupLayout(listRooms);
        listRooms.setLayout(listRoomsLayout);
        listRoomsLayout.setHorizontalGroup(
            listRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1893, Short.MAX_VALUE)
        );
        listRoomsLayout.setVerticalGroup(
            listRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        add_student.addTab("List Rooms", listRooms);

        javax.swing.GroupLayout leavedFromHostelLayout = new javax.swing.GroupLayout(leavedFromHostel);
        leavedFromHostel.setLayout(leavedFromHostelLayout);
        leavedFromHostelLayout.setHorizontalGroup(
            leavedFromHostelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1893, Short.MAX_VALUE)
        );
        leavedFromHostelLayout.setVerticalGroup(
            leavedFromHostelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        add_student.addTab("Leave from Hostel", leavedFromHostel);

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add_student)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_student, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SystemName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SystemName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AcademicDetails1;
    private javax.swing.JLabel AcademicDetails2;
    private javax.swing.JLabel AcademicDetails3;
    private javax.swing.JLabel AcademicDetails4;
    private javax.swing.JPanel Body;
    private javax.swing.JLabel GardientDetails1;
    private javax.swing.JLabel GardientDetails2;
    private javax.swing.JLabel GardientDetails3;
    private javax.swing.JLabel GardientDetails4;
    private javax.swing.JPanel Header;
    private javax.swing.JSeparator Stu_sepration1;
    private javax.swing.JSeparator Stu_sepration2;
    private javax.swing.JSeparator Stu_sepration3;
    private javax.swing.JSeparator Stu_sepration4;
    private javax.swing.JLabel StudentDetails1;
    private javax.swing.JLabel StudentDetails2;
    private javax.swing.JLabel StudentDetails3;
    private javax.swing.JLabel StudentDetails4;
    private javax.swing.JPanel Student_Details;
    private javax.swing.JPanel Student_panel1;
    private javax.swing.JPanel Student_panel2;
    private javax.swing.JPanel Student_panel3;
    private javax.swing.JPanel Student_panel4;
    private javax.swing.JLabel SystemName;
    private javax.swing.JPanel addStudent;
    private javax.swing.JTabbedPane add_student;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel leavedFromHostel;
    private javax.swing.JPanel listRooms;
    private javax.swing.JPanel listStudent;
    private javax.swing.JLabel sAddress;
    private javax.swing.JLabel sAddress1;
    private javax.swing.JLabel sAddress2;
    private javax.swing.JLabel sAddress3;
    private javax.swing.JLabel sAddress4;
    private javax.swing.JTextArea sAddressInput1;
    private javax.swing.JTextArea sAddressInput2;
    private javax.swing.JTextArea sAddressInput3;
    private javax.swing.JTextArea sAddressInput4;
    private javax.swing.JLabel sDisability;
    private javax.swing.JLabel sDisability1;
    private javax.swing.JLabel sDisability2;
    private javax.swing.JLabel sDisability3;
    private javax.swing.JLabel sDisability4;
    private javax.swing.JTextArea sDisabilityInput1;
    private javax.swing.JTextArea sDisabilityInput2;
    private javax.swing.JTextArea sDisabilityInput3;
    private javax.swing.JTextArea sDisabilityInput4;
    private javax.swing.JLabel sEmail;
    private javax.swing.JLabel sEmail1;
    private javax.swing.JLabel sEmail2;
    private javax.swing.JLabel sEmail3;
    private javax.swing.JLabel sEmail4;
    private javax.swing.JTextField sEmailInput1;
    private javax.swing.JTextField sEmailInput2;
    private javax.swing.JTextField sEmailInput3;
    private javax.swing.JTextField sEmailInput4;
    private javax.swing.JLabel sFollowing;
    private javax.swing.JLabel sNIC;
    private javax.swing.JLabel sName;
    private javax.swing.JLabel sName1;
    private javax.swing.JLabel sName2;
    private javax.swing.JLabel sName3;
    private javax.swing.JLabel sName4;
    private javax.swing.JTextField sNameInput1;
    private javax.swing.JTextField sNameInput2;
    private javax.swing.JTextField sNameInput3;
    private javax.swing.JTextField sNameInput4;
    private javax.swing.JLabel sNic1;
    private javax.swing.JLabel sNic2;
    private javax.swing.JLabel sNic3;
    private javax.swing.JLabel sNic4;
    private javax.swing.JTextField sNicInput1;
    private javax.swing.JTextField sNicInput2;
    private javax.swing.JTextField sNicInput3;
    private javax.swing.JTextField sNicInput4;
    private javax.swing.JLabel sPhone;
    private javax.swing.JLabel sPhone1;
    private javax.swing.JLabel sPhone2;
    private javax.swing.JLabel sPhone3;
    private javax.swing.JLabel sPhone4;
    private javax.swing.JTextField sPhoneInput1;
    private javax.swing.JTextField sPhoneInput2;
    private javax.swing.JTextField sPhoneInput3;
    private javax.swing.JTextField sPhoneInput4;
    private javax.swing.JButton sPhotoUpload;
    private javax.swing.JLabel sReligious1;
    private javax.swing.JLabel sReligious2;
    private javax.swing.JLabel sReligious3;
    private javax.swing.JLabel sReligious4;
    private javax.swing.JComboBox<String> sReligiusInput1;
    private javax.swing.JComboBox<String> sReligiusInput2;
    private javax.swing.JComboBox<String> sReligiusInput3;
    private javax.swing.JComboBox<String> sReligiusInput4;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JPanel viewStudent;
    // End of variables declaration//GEN-END:variables
}