/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuloto;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author bast
 */
public class OptionDlg extends javax.swing.JDialog {
    private int choixOpt = 1; //entier qui va permettre d'avoir le numéro du choix
    private int nbCol = 5; //entier permettant de choisir le nombre de colonne
    private int nbNum = 4; //entier permettant d'avoir un nombre de numéros
    private boolean ok = false;//boolean pour avoir une information sur la fermeture de la boite de dialogue
    
    public int getNbCol(){//getter pour récupérer l'attribut nbCol
        return this.nbCol;
    }
    
    public int getChoix(){//getter pour réccupérer l'attribut choixOpt
        return this.choixOpt;
    }
    
    public int getNbNum(){//getter pour récupérer l'attribut nbNum
        return this.nbNum;
    }
    
    public boolean getOk(){//getter pour récupérer l'attribut ok
        return this.ok;
    }
    /**
     * Creates new form OptionDlg
     */
    public OptionDlg(java.awt.Frame parent, boolean modal,boolean ca,int nc,int nn) {//cpnstructeur de OptionDlg
        super(parent, modal);//appel du constructeur de la classe mère
        initComponents();//initialisation des composants
        remplirComboCol();//méthodes pour remplir la JComboBox
        Radio1.setSelected(true);//on sélectionne la premiere option par défaut
        this.choixOpt = 1;//choixOpt passe à 1 pour la premiere option
        if(!ca){// si ca est à false
            this.nbCol = 5;
            this.nbNum = 5;
        }
        else{//si ca est à true
            this.nbCol = nc;//on affcete nc à nbCol
            this.nbNum = nn;//on affecte nn à nbNum
            NbNumero.setText(""+nn);//on affiche le numéro
            
            int x = ComboCol.getSelectedIndex();//on récupère l'index sélectionné
            this.nbCol = x;//on affecte le nombre de colonne à nbCol
            
            NbNumero.setEnabled(false);//on empeche la possibilité de rentré des choses dans NbNumero
            
            JOptionPane option1 = new JOptionPane();//on affiche un message
            option1.showMessageDialog(this, "Nombre de colonnes et de numéros non modifiables","Jeu Loto",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void remplirComboCol(){//remplissage de la JComboBox
        int choix1 = 5;
        int choix2 = 6;
        int choix3 = 7;
        int choix4 = 8;
        int choix5 = 9;
        
        ComboCol.addItem(""+choix1);
        ComboCol.addItem(""+choix2);
        ComboCol.addItem(""+choix3);
        ComboCol.addItem(""+choix4);
        ComboCol.addItem(""+choix5);
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
        PTitre = new javax.swing.JPanel();
        Titre = new javax.swing.JLabel();
        PCentre = new javax.swing.JPanel();
        PGauche = new javax.swing.JPanel();
        PTitreGauche = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PCentreGauche = new javax.swing.JPanel();
        Radio1 = new javax.swing.JRadioButton();
        Radio2 = new javax.swing.JRadioButton();
        Radio3 = new javax.swing.JRadioButton();
        PFootGauche = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        PDroit = new javax.swing.JPanel();
        PTitreDroit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PFootDroit = new javax.swing.JPanel();
        Valider = new javax.swing.JButton();
        PCentreDroit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ComboCol = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        NbNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PTitre.setLayout(new java.awt.GridLayout(1, 1));

        Titre.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titre.setText("Option de Jeu");
        PTitre.add(Titre);

        getContentPane().add(PTitre, java.awt.BorderLayout.PAGE_START);

        PCentre.setLayout(new java.awt.GridLayout(1, 2));

        PGauche.setLayout(new java.awt.BorderLayout());

        PTitreGauche.setLayout(new java.awt.GridLayout(1, 1));

        jLabel1.setText("Comment voulez-vous jouer ?");
        PTitreGauche.add(jLabel1);

        PGauche.add(PTitreGauche, java.awt.BorderLayout.PAGE_START);

        PCentreGauche.setLayout(new java.awt.GridLayout(3, 1));

        buttonGroup1.add(Radio1);
        Radio1.setText("Quine - Une ligne complète");
        PCentreGauche.add(Radio1);

        buttonGroup1.add(Radio2);
        Radio2.setText("Double Quine - Deux lignes complètes");
        PCentreGauche.add(Radio2);

        buttonGroup1.add(Radio3);
        Radio3.setText("Carton plein - Trois lignes complètes");
        PCentreGauche.add(Radio3);

        PGauche.add(PCentreGauche, java.awt.BorderLayout.CENTER);

        PFootGauche.setLayout(new java.awt.GridLayout(1, 1));

        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PFootGauche.add(jButton1);

        PGauche.add(PFootGauche, java.awt.BorderLayout.PAGE_END);

        PCentre.add(PGauche);

        PDroit.setLayout(new java.awt.BorderLayout());

        PTitreDroit.setLayout(new java.awt.GridLayout(1, 1));

        jLabel2.setText("Configuration des cartons");
        PTitreDroit.add(jLabel2);

        PDroit.add(PTitreDroit, java.awt.BorderLayout.PAGE_START);

        PFootDroit.setLayout(new java.awt.GridLayout(1, 1));

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        PFootDroit.add(Valider);

        PDroit.add(PFootDroit, java.awt.BorderLayout.PAGE_END);

        PCentreDroit.setLayout(new java.awt.GridLayout(3, 2));

        jLabel3.setText("Combien de colonnes ?");
        PCentreDroit.add(jLabel3);

        PCentreDroit.add(ComboCol);

        jLabel4.setText("Combien de numéros ?");
        PCentreDroit.add(jLabel4);
        PCentreDroit.add(NbNumero);

        PDroit.add(PCentreDroit, java.awt.BorderLayout.CENTER);

        PCentre.add(PDroit);

        getContentPane().add(PCentre, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        dispose();//on ferme la boite de dialogue
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        if(Radio1.isSelected()){//si l'option 1 est sélectionné
            this.choixOpt = 1;
        }
        else if(Radio2.isSelected()){//si l'option 2 est sélectionné
            this.choixOpt = 2;
        }
        else if(Radio3.isSelected()){//si l'option 3 est sélectionné
            this.choixOpt = 3;
        }
        
        int nbcol = 5+ComboCol.getSelectedIndex();//on ajoute l'index à 5 pour donner le nombre de colonne
        this.nbCol = nbcol;//on affecte la valeur des colonnes
      
        
        if(NbNumero.getText().equals("")){//si il n'y a pas de numéros rentré, on affiche un message
            JOptionPane option2 = new JOptionPane();
            option2.showMessageDialog(this, "Nombre de numéros incomplet","Jeu Loto",JOptionPane.WARNING_MESSAGE);
        }
        else{
            String nbnumstring = NbNumero.getText();//sinon on continue
            int n = Integer.parseInt(nbnumstring);
            if(n<5 || n>this.nbCol*3){// si le numéro ne correspond pas aux critères
                JOptionPane option3 = new JOptionPane();
                option3.showMessageDialog(this, "Nombre de numéros inférieur à 5 et/ou nombre de numéros trop important","Jeu Loto",JOptionPane.WARNING_MESSAGE);
            }
            else{//sinon on affcete les valeurs aux attributs qui leurs sont dédiés
                this.nbNum = n;
                this.ok = true;
                setVisible(false);
            }
        }
    }//GEN-LAST:event_ValiderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCol;
    private javax.swing.JTextField NbNumero;
    private javax.swing.JPanel PCentre;
    private javax.swing.JPanel PCentreDroit;
    private javax.swing.JPanel PCentreGauche;
    private javax.swing.JPanel PDroit;
    private javax.swing.JPanel PFootDroit;
    private javax.swing.JPanel PFootGauche;
    private javax.swing.JPanel PGauche;
    private javax.swing.JPanel PTitre;
    private javax.swing.JPanel PTitreDroit;
    private javax.swing.JPanel PTitreGauche;
    private javax.swing.JRadioButton Radio1;
    private javax.swing.JRadioButton Radio2;
    private javax.swing.JRadioButton Radio3;
    private javax.swing.JLabel Titre;
    private javax.swing.JButton Valider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}