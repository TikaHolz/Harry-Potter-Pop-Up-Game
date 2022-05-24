import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Monster extends Animal
	{
	private boolean boss;
	private String location;
	private int monsterDamage;
	static boolean apMob, unluckyMob, drainingMob, acidicMob, poisonousMob;
	static int magicRes = 1, meleeRes = 1; 
	
	static ArrayList <Monster> monsters = new ArrayList<Monster>();
	
	public Monster(String n, int h, boolean b, String l, int md)
		{
		setHitPoints(h);
		setName(n);
		boss = b;
		location = l;
		monsterDamage = md;
		}
	public boolean isBoss()
		{
		return boss;
		}

	public void setBoss(boolean boss)
		{
		this.boss = boss;
		}

	public String getLocation()
		{
		return location;
		}

	public void setLocation(String location)
		{
		this.location = location;
		}

	public int getMonsterDamage()
		{
		return monsterDamage;
		}

	public void setMonsterDamage(int monsterDamage)
		{
		this.monsterDamage = monsterDamage;
		}

	public static ArrayList<Monster> getMonsters()
		{
		return monsters;
		}

	public static void setMonsters(ArrayList<Monster> monsters)
		{
		Monster.monsters = monsters;
		}

	
	

public static void randomize()
	{
	ImageIcon icon = new ImageIcon(("warning.png"));
	JFrame frame = new JFrame();
	int monsterNumber = 0;
	if(Monster.monsters.size() > 7)
		{
		boolean check = true;
		
		while(check)
			{
			monsterNumber = (int) (Math.random() * monsters.size());
			if(!Monster.monsters.get(monsterNumber).isBoss())
				{
				JOptionPane.showMessageDialog(frame, "From around the rock, you see something rise."
						+ ".",
						"COMBAT",
						JOptionPane.QUESTION_MESSAGE,
						icon);
				
			
				
				JOptionPane.showMessageDialog(frame, "It is a " + Monster.monsters.get(monsterNumber).getName() + "!",
						"COMBAT",
						JOptionPane.QUESTION_MESSAGE,
						icon);
				check = false;
				}
			}
	
	System.out.println(monsterNumber);
	}
	}

}