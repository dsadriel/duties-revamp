package br.com.dsadriel.dutiesrevamp.listeners;

import br.com.dsadriel.dutiesrevamp.Duties;
import br.com.dsadriel.dutiesrevamp.ModeSwitcher;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener{

	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerQuit(PlayerQuitEvent event) 
	{
		if(!Duties.Memories.containsKey(event.getPlayer().getName())){return;}
		
		new ModeSwitcher(event.getPlayer()).DisableDutyMode();
	}
	
}
