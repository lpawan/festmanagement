import javax.swing.JOptionPane;
public class sclass {
    public static void main(String args[])
     {
        splashloadscreen ss1=new splashloadscreen();
        ss1.setVisible(true);
        startpage sp=new startpage();
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(15);
                ss1.jLabel3.setText(Integer.toString(i)+"%");
                ss1.jProgressBar2.setValue(i);
                if(i==100)
                {
                  sp.setVisible(true);
                  ss1.setVisible(false);
                }    
            } 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
