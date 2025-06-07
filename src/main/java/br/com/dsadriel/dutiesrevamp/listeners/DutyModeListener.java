package br.com.dsadriel.dutiesrevamp.listeners;

import br.com.dsadriel.dutiesrevamp.events.DutyModeDisabledEvent;
import br.com.dsadriel.dutiesrevamp.events.DutyModeEnabledEvent;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class DutyModeListener implements Listener
{
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDutyModeEnabled(DutyModeEnabledEvent event)
	{			

	}
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDutyModeDisabled(DutyModeDisabledEvent event)
	{
		
	}
	
	
}
