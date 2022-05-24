import java.util.ArrayList; 

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Hero
	{
		private String name;
		private int heroHP;
		private int luck;
		private int healthGen;
		private int maxHeroHP;

		static ArrayList <Hero> heroes = new ArrayList<Hero>();
		public Hero(String c, int b, int p, int g, int h)
			{
				name = c;
				heroHP = b;
				luck = p;
				healthGen = g;
				maxHeroHP = h;

				
			}
		public String getName()
			{
			return name;
			}
		
		public void setName(String name)
			{
			this.name = name;
			}
		public int getMaxHeroHP()
			{
			return maxHeroHP;
			}

		public void setMaxHeroHP(int maxHeroHP)
			{
			this.maxHeroHP = maxHeroHP;
			}
		public int getHeroHP()
			{
			return heroHP;
			}


		public void setHeroHP(int heroHP)
			{
			this.heroHP = heroHP;
			}
		public int getLuck()
			{
			return luck;
			}


		public void setLuck(int luck)
			{
			this.luck = luck;
			}
			
		public static void chooseAttack(int monsterNum)
		{
			if(Hero.heroes.get(0).getHeroHP() > Hero.heroes.get(0).getMaxHeroHP())
				{
				Hero.heroes.get(0).setHeroHP(Hero.heroes.get(0).getMaxHeroHP());
				}
				
		}
	}
