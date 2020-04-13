/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.uas.cadangan;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author str5
 */
public class NewClass {
    
    
    public static void main(String[] args) {
////        
//        import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.MediaTracker;
//import java.util.logging.Level;
//import java.util.logging.Logger;
// 
///**
// *
// * @author arya
// */
//public class PanelGambar extends javax.swing.JPanel {
// 
//    /** Creates new form PanelGambar */
//    private Image image;
//    public PanelGambar() {
//        initComponents();
//    }
// 
//    public void setImage(Image image){
//        this.image = image;
//        MediaTracker mediaTracker = new MediaTracker(this);
//        mediaTracker.addImage(image, 0);
//        try {
//            mediaTracker.waitForID(0);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(PanelGambar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        initComponents();
//    }
// 
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.drawImage(image, 0, 0,getWidth(),getHeight(), this);
//    }
//}
    }
}


//       String path=null;
//    JFileChooser pilih=new JFileChooser();
//    pilih.setCurrentDirectory (new File(System.getProperty(path)));
//    FileNameExtensionFilter extension=new FileNameExtensionFilter("*images"+".jpg"+".png"+".jpeg");
//    pilih.addChoosableFileFilter(extension);
//    int filestate=pilih.showSaveDialog(null);
//    if (filestate==JFileChooser.APPROVE_OPTION) {
//    File selectedimage=pilih.getSelectedFile();
//    path=selectedimage.getAbsolutePath();
////    jLabel2.setText(path);//label disebelah tombol image
//}