package me.eaglehawk;

import java.awt.EventQueue;

import me.eaglehawk.gui.MainMenu;

public class Main
{
	public static void main(String[] args)
	{
		/**
		 * Create the GUI
		 */
		
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					MainMenu window = new MainMenu();
					window.getFrame().setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
}
