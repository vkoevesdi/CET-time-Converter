import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeConverter extends Conversion{

    private int hoursInt;
    private String minutesInt;

    // Getter & Setter for hours and minutes input
    public void setHoursInt(int readHours) {this.hoursInt = readHours;}
    public int getHoursInt() {return this.hoursInt;}

    public void setMinutes(String readMinutes) {this.minutesInt = readMinutes;}
    public String getMinutes() {return this.minutesInt;}

    // GUI-Constructor
    TimeConverter(){
    JFrame frame = new JFrame("Convert Time to CET v0.1");

    JLabel time = new JLabel("Enter Time (HH:MM Format): ");
    time.setBounds(65,50,140,20);

    JLabel zone = new JLabel("Convert from: ");
    zone.setBounds(65,70,140,20);

    JTextField tfHours = new JTextField(5);
    tfHours.setBounds(140,50,30,20);

    JButton ok = new JButton("OK");
    ok.setBounds(100,200,30,20);

    // Timezone Array for JComboBox
    String[] timezone = new String[8];
    timezone[0]="PST (Pacific Standard Time)";
    timezone[1]="CST (Central Standard Time)";
    timezone[2]="EST (Eastern Standard Time)";
    timezone[3]="UTC (Universal Coordinated Time)";
    timezone[4]="EET (Eastern European Time)";
    timezone[5]="JST (Japan Standard Time)";
    timezone[6]="BJT (Beijing Time)";
    timezone[7]="ACT (Australian Central Time)";

    JComboBox timezones = new JComboBox (timezone);
    timezones.setBounds(100,70,140,20);

    JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(time);
        panel.add(tfHours);
        panel.add(zone);
        panel.add(timezones);
        panel.add(ok);

    frame.setContentPane(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.getRootPane().setDefaultButton(ok);
    frame.setVisible(true);

    // ActionListener to extract relevant input and convert it when pressing the OK button
    ok.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ex) {

            String time = tfHours.getText();

            //Exception handling to filter out incorrect inputs
            try {
                setHoursInt(Integer.parseInt(time.substring(0, time.indexOf(":"))));
                setMinutes(time.substring(time.indexOf(":")));

                if (getHoursInt() < 0 || getHoursInt() > 23) {
                    JOptionPane.showMessageDialog(null, "Please use the 24h-time format! (0-23)");
                } else {
                    int index = timezones.getSelectedIndex();

                    switch (index) {
                        case 0:
                            JOptionPane.showMessageDialog(null, fromPST(getHoursInt(), getMinutes()));
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, fromCST(getHoursInt(), getMinutes()));
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, fromEST(getHoursInt(), getMinutes()));
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, fromUTC(getHoursInt(), getMinutes()));
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, fromEET(getHoursInt(), getMinutes()));
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, fromJST(getHoursInt(), getMinutes()));
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, fromBJT(getHoursInt(), getMinutes()));
                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null, fromACT(getHoursInt(), getMinutes()));
                            break;
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please use the correct time format!");
                e.printStackTrace();
            }
        }
    });
    }

        public static void main(String[] args) {
            new TimeConverter();
        }
}