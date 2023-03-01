import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student {
    private JTextField txtstname;
    private JButton calButton;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JPanel Main;
    private JLabel tot;

    public static void main(String[] args) {
        JFrame frame = new JFrame("student");
        frame.setContentPane(new student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3;
                double avg;

                m1 = Integer.parseInt(txtMarks1.getText());
                m2 = Integer.parseInt(txtMarks2.getText());
                m3 = Integer.parseInt(txtMarks3.getText());

                int tot = m1 + m2 + m3;

                txtTotal.setText(String.valueOf(tot));

                avg = tot/3;

                txtAvg.setText(String.valueOf(avg));

                if (avg<35){
                    txtGrade.setText("fale");

                }
                else{
                    txtGrade.setText("pass");
                }



            }
        });
    }
}
