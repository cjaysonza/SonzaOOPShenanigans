import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        // ==== Frame ====
        setTitle("Login");
        setSize(1000, 1000);              // as requested
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ==== LEFT: LogoPanel ====
        JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 60));
        logoPanel.setPreferredSize(new Dimension(420, 1000));

        JPanel logoStack = new JPanel(new GridLayout(0, 1, 15, 15));
        logoStack.setPreferredSize(new Dimension(320, 520));

        // Project Logo (large)
        JLabel projectLogo = new JLabel(new ImageIcon("project_logo.png"));
        projectLogo.setPreferredSize(new Dimension(260, 260));
        projectLogo.setHorizontalAlignment(SwingConstants.CENTER);
        projectLogo.setBorder(new LineBorder(Color.BLACK, 2));

        // Project Name
        JLabel projectName = new JLabel("<Project Name>", SwingConstants.CENTER);
        projectName.setFont(new Font("SansSerif", Font.BOLD, 22));

        // Company Logo (small)
        JLabel companyLogo = new JLabel(new ImageIcon("company_logo.png"));
        companyLogo.setPreferredSize(new Dimension(120, 120));
        companyLogo.setHorizontalAlignment(SwingConstants.CENTER);
        companyLogo.setBorder(new LineBorder(Color.BLACK, 2));

        logoStack.add(projectLogo);
        logoStack.add(projectName);
        logoStack.add(companyLogo);
        logoPanel.add(logoStack);

        // ==== RIGHT: LoginPanel ====
        JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 140));

        JPanel loginStack = new JPanel(new GridLayout(0, 1, 15, 15));
        loginStack.setPreferredSize(new Dimension(360, 360));

        JLabel loginTitle = new JLabel("Login", SwingConstants.CENTER);
        loginTitle.setFont(new Font("SansSerif", Font.BOLD, 42));

        JTextField usernameField = new JTextField("<username/email>");
        usernameField.setColumns(22);

        JTextField passwordField = new JTextField("<password>");
        passwordField.setColumns(22);

        JButton loginButton = new JButton("<Log In Button>");
        JButton signupButton = new JButton("<Sign Up Button>");

        loginStack.add(loginTitle);
        loginStack.add(usernameField);
        loginStack.add(passwordField);
        loginStack.add(loginButton);
        loginStack.add(signupButton);

        loginPanel.add(loginStack);

        // ==== Add to frame ====
        add(logoPanel, BorderLayout.WEST);
        add(loginPanel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}
