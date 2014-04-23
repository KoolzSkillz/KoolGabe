package me.kyle.youtube;
 
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
 
public class BlockListener implements Listener {
private Youtube plugin;

public BlockListener(Youtube plugin) {
this.plugin = plugin;

  {
    plugin.getServer().getPluginManager().registerEvents(this, plugin); } 
  }
 
@EventHandler
public void onBlockPlace(BlockPlaceEvent e) {
  Player player = e.getPlayer();
  if(e.getBlock().getType().equals(Material.BEDROCK)) {
    if(!player.hasPermission("BEDROCK.place")) {
        player.sendMessage(ChatColor.RED + "You cannot place Bedrock!");
      e.setCancelled(true);
    	  if(e.getBlock().getType().equals(Material.TNT)) {
    	    if(!player.hasPermission("TNT.place")) {
    	        player.sendMessage(ChatColor.RED + "You cannot place Tnt!");
    	      e.setCancelled(true);
        	  if(e.getBlock().getType().equals(Material.ENDER_CHEST)) {
          	    if(!player.hasPermission("EC.place")) {
          	        player.sendMessage(ChatColor.RED + "You cannot place EnderChests!");
          	      e.setCancelled(true);
    }   
  }
}

@EventHandler
public void onBlockDestroy(BlockBreakEvent e) {
	  if(e.getBlock().getType().equals(Material.ENDER_CHEST)) {
    	    if(!player.hasPermission("EnderChest.break")) {
    	        player.sendMessage(ChatColor.RED + "You cannot break EnderChests!");
    	      e.setCancelled(true);
    		  if(e.getBlock().getType().equals(Material.ENDER_STONE)) {
    	    	    if(!player.hasPermission("EndStone.break")) {
    	    	        player.sendMessage(ChatColor.RED + "You cannot break EndStone!");
    	    	      e.setCancelled(true);
}
	
}
}
 