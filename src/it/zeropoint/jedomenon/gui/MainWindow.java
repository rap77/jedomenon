/*
 * MainWindow.java
 *
 * Created on January 23, 2009, 10:46 AM
 */

package it.zeropoint.jedomenon.gui;
import it.zeropoint.jedomenon.gui.util.DatabaseTreeBuilder;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
/**
 *
 * @author  mohsinhijazee
 */
public class MainWindow extends javax.swing.JFrame {
  
  private DefaultMutableTreeNode tree;
  /** Creates new form MainWindow */
  public MainWindow()
  {
    try
    {
      
      DatabaseTreeBuilder treeBuilder = new DatabaseTreeBuilder();
      tree = treeBuilder.buildTreeFrom("http://localhost:3000"); 
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(this, e);
      e.printStackTrace();
    }
    initComponents();

  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    toolBarPanel = new javax.swing.JPanel();
    mainPanel = new javax.swing.JPanel();
    splitPane = new javax.swing.JSplitPane();
    jScrollPane1 = new javax.swing.JScrollPane();
    treeDatabases = new JTree(tree);
    jScrollPane2 = new javax.swing.JScrollPane();
    tableItemDetails = new javax.swing.JTable();
    statusPanel = new javax.swing.JPanel();
    progressBar = new javax.swing.JProgressBar();
    labelStatusMessage = new javax.swing.JLabel();
    mainMenuBar = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 419, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 112, Short.MAX_VALUE)
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    javax.swing.GroupLayout toolBarPanelLayout = new javax.swing.GroupLayout(toolBarPanel);
    toolBarPanel.setLayout(toolBarPanelLayout);
    toolBarPanelLayout.setHorizontalGroup(
      toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 544, Short.MAX_VALUE)
    );
    toolBarPanelLayout.setVerticalGroup(
      toolBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 38, Short.MAX_VALUE)
    );

    mainPanel.setLayout(new java.awt.BorderLayout());

    splitPane.setOneTouchExpandable(true);

    jScrollPane1.setViewportView(treeDatabases);

    splitPane.setLeftComponent(jScrollPane1);

    tableItemDetails.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane2.setViewportView(tableItemDetails);

    splitPane.setRightComponent(jScrollPane2);

    mainPanel.add(splitPane, java.awt.BorderLayout.CENTER);

    statusPanel.setLayout(new javax.swing.BoxLayout(statusPanel, javax.swing.BoxLayout.LINE_AXIS));
    statusPanel.add(progressBar);

    labelStatusMessage.setText("                        ");
    statusPanel.add(labelStatusMessage);

    jMenu1.setText("File");
    mainMenuBar.add(jMenu1);

    jMenu2.setText("Edit");
    mainMenuBar.add(jMenu2);

    setJMenuBar(mainMenuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(toolBarPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(statusPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(toolBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel labelStatusMessage;
  private javax.swing.JMenuBar mainMenuBar;
  private javax.swing.JPanel mainPanel;
  private javax.swing.JProgressBar progressBar;
  private javax.swing.JSplitPane splitPane;
  private javax.swing.JPanel statusPanel;
  private javax.swing.JTable tableItemDetails;
  private javax.swing.JPanel toolBarPanel;
  private javax.swing.JTree treeDatabases;
  // End of variables declaration//GEN-END:variables
  
}
