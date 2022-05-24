import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				//villians
				Monster.monsters.add(new Monster("Voldemort", 200, false, "Arena", 20));
				Monster.monsters.add(new Monster("Goblin", 18, false, "Arena", 12));
				Monster.monsters.add(new Monster("Bellatrix Lestrang", 50, false, "Arena", 15));
				Monster.monsters.add(new Monster("Basilisk", 18, false, "Arena", 10));
				Monster.monsters.add(new Monster("Minotaur", 30, false, "Arena", 20));
				Monster.monsters.add(new Monster("Acromantula", 20, false, "Arena", 16));
				Monster.monsters.add(new Monster("Dementors", 100, false, "Arena", 2));
				Monster.monsters.add(new Monster("Dolores Umbridge", 8, false, "Arena", 56));
				Monster.monsters.add(new Monster("Barty Crouch Jr.", 35, false, "Arena", 12));
				Monster.monsters.add(new Monster("Peter Pettigrew", 18, false, "Arena", 14));
				Monster.monsters.add(new Monster("Quirinus Quirrell", 10, false, "Arena", 24));
				Monster.monsters.add(new Monster("Aunt Marge", 3, false, "Arena", 2));
				Monster.monsters.add(new Monster("Lucius Malfoy", 28, false, "Arena", 12));
				Monster.monsters.add(new Monster("Fenrir Grayback", 35, false, "Arena", 10));
				
				
				ImageIcon icon = new ImageIcon(("HogwartsSeal.jpg"));
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "Start",
					"Harry Potter 1.8",
					JOptionPane.QUESTION_MESSAGE,
					icon);
				SetUp.setUp();
				SetUp.generateSituation();
			}

	}
