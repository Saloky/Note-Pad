import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NoteBook extends JFrame implements ActionListener {
	JMenuBar menuBar = new JMenuBar();
	JMenu File = new JMenu("File");
	JMenu Edit = new JMenu("Edit");
	JMenu Help = new JMenu("Help");

	JMenuItem NewFile = new JMenuItem("New");
	JMenuItem OpenFile = new JMenuItem("Open");
	JMenuItem SaveFile = new JMenuItem("Save");
	JMenuItem PrintFile = new JMenuItem("Print");
	JMenuItem ExitFile = new JMenuItem("Exit");

	JMenuItem Cut = new JMenuItem("Cut");
	JMenuItem Copy = new JMenuItem("Copy");
	JMenuItem Paste = new JMenuItem("Paste");
	JMenuItem Selectall = new JMenuItem("Select All");

	JMenuItem About = new JMenuItem("About");
	JTextArea TextArea = new JTextArea();

	NoteBook() {
		setTitle("Note it Down");
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon(getClass().getResource("notepad.png"));
		setIconImage(icon.getImage());

		// Adding MenuBar
		setJMenuBar(menuBar);
		menuBar.add(File);
		menuBar.add(Edit);
		menuBar.add(Help);

		// Option Inside the File tab
		File.add(NewFile);
		File.add(OpenFile);
		File.add(SaveFile);
		File.add(PrintFile);
		File.add(ExitFile);

		// Option Inside the Edit Tab
		Edit.add(Cut);
		Edit.add(Copy);
		Edit.add(Paste);
		Edit.add(Selectall);

		JScrollPane scrollpane = new JScrollPane(TextArea);
		add(scrollpane);
		TextArea.setFont((new Font(Font.SANS_SERIF, Font.PLAIN, 20)));
		scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollpane.setBorder(BorderFactory.createEmptyBorder());
		TextArea.setLineWrap(true);
		TextArea.setWrapStyleWord(true);

		NewFile.addActionListener(this);
		OpenFile.addActionListener(this);
		SaveFile.addActionListener(this);
		PrintFile.addActionListener(this);
		ExitFile.addActionListener(this);
		Cut.addActionListener(this);
		Copy.addActionListener(this);
		Paste.addActionListener(this);
		Selectall.addActionListener(this);
		About.addActionListener(this);

	}

	public static void main(String[] args) {
		new NoteBook().setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
