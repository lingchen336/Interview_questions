//获取网络资源
package learTest1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
class TestURL extends JFrame implements ActionListener
{
    JTextField address  =new JTextField(18);
    JButton buttonOperate = new JButton("察看");
    JTextArea info = new JTextArea();
    JTextArea content = new JTextArea();
    TestURL()
    {
        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("网络资源地址："));
        controlPanel.add(address);
        controlPanel.add(buttonOperate);

        buttonOperate.addActionListener(this);

        JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(info), new JScrollPane(content));
        add(controlPanel, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);

        setTitle("获得URL信息和资源内容");
        setBounds(100, 100, 400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() != buttonOperate)
            return;
        try{
            info.setText("");
            content.setText("");
            String addressText = address.getText();

            //URL类的常用构造方法
            //（1）public URL(String spec) throws MalformedURLException
            //（2）public URL(String protocol, String host, String file) throws MalformedURLException
            URL url = new URL(addressText);
            info.append("Protocol: " + url.getProtocol() + "\n");
            info.append("Host: " + url.getHost() + "\n");
            info.append("Port: " + url.getPort() + "\n");
            info.append("FileName: " + url.getFile() + "\n");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            String line;
            while ((line = br.readLine()) != null)
                content.append(line + "\n");
            br.close();

        }
        catch(Exception ex){
            info.setText(ex.toString());
        }
    }
    public static void main(String[] args)
    {
        new TestURL();
    }
}