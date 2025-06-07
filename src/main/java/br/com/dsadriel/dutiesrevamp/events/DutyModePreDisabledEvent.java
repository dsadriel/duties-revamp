package br.com.dsadriel.dutiesrevamp.events;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DutyModePreDisabledEvent extends Event
{
	private static final HandlerList handlers = new HandlerList();
    private Player player;
    private boolean cancelled = false;
    
    public DutyModePreDisabledEvent(Player player)
    {
    	this.player = player;
    }
    
    public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }
    
    public Player getPlayer()
    {
    	return this.player;
    }
    
    public boolean getCancelled()
    {
    	return this.cancelled;
    }
    
    public void setCancelled(boolean cancel)
    {
    	this.cancelled = cancel;
    }
}