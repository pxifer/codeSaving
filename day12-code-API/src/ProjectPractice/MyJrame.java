package ProjectPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJrame extends JFrame implements ActionListener {

    JButton yesbut=new JButton("帅爆了");
    JButton midbut=new JButton("一般般");
    JButton nobut=new JButton("有点丑");
    JButton dadBut=new JButton("绕了我吧");
    boolean flag=false;

    public MyJrame(){
        initJFrame();

        initView();

        this.setVisible(true);
    }

    private void initView() {
        this.getContentPane().removeAll();
        if(flag){
            dadBut.setBounds(50,20,100,30);
            dadBut.addActionListener(this);
            this.getContentPane().add(dadBut);
        }

        JLabel text=new JLabel("你觉得你帅吗?");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);
        this.getContentPane().add(text);

        yesbut.setBounds(200,250,100,30);
        midbut.setBounds(200,325,100,30);
        nobut.setBounds(160,400,180,30);

        yesbut.addActionListener(this);
        midbut.addActionListener(this);
        nobut.addActionListener(this);

        this.getContentPane().add(yesbut);
        this.getContentPane().add(nobut);
        this.getContentPane().add(midbut);

        this.getContentPane().repaint();
    }

    private void initJFrame() {
        this.setSize(500,600);
        this.setTitle("恶搞好基友");
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj==yesbut){
            flag=true;
            showJDialog("你自信了,给你点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 60");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            initView();

        }else if(obj==midbut){
            flag=true;
            showJDialog("你还是太自信了,给你点惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 360");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            initView();

        }else if(obj==nobut){
            flag=true;
            showJDialog("有自知之明,给你点奖励");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 1200");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            initView();

        }else if(obj==dadBut){
            showJDialog("这次就放过你了");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void showJDialog(String content){
        JDialog jDialog=new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning=new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);
    }
}
