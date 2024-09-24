import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends JFrame {
    
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat; 
    private Timer timer;

    public Clock() {

        setTitle("Clock Display");
        setSize(600, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeFormat = new SimpleDateFormat("HH:mm:ss");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Helvetica", Font.PLAIN, 50));  
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER); 

        add(timeLabel, BorderLayout.CENTER);

        timer = new Timer(1000, e -> updateTime());
        timer.start();  

        setVisible(true);
    }

    private void updateTime() {
        String currentTime = timeFormat.format(new Date());
        timeLabel.setText(currentTime);  
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(Clock::new);
    }
}
