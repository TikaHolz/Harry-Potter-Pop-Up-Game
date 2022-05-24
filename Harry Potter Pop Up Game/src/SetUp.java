import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SetUp
	{
	public static void setUp()
	{
	ImageIcon icon = new ImageIcon(("HogwartsSeal.jpg"));
	String chosenName = "";
	int chosenClass = 0;
	JFrame frame = new JFrame();
	chosenName = JOptionPane.showInputDialog(frame, "What do you want to be called?");
	Hero.heroes.add(new Hero(chosenName, 20, 1, 0, 30)); 

	}
	public static void generateSituation()
		{
		int situationNum = (int) (Math.random() * 5) + 1;
		switch(situationNum)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			{
			//MONSTER
			int monsterNum = Monster.randomize();
			while(Monster.monsters.get(monsterNum).getHitPoints() > 0)
				{
				Hero.chooseAttack(monsterNum);
				}
			Monster.monsters.remove(monsterNum);
			break;
			}
		
		}
	}
	
	}
