package me.kyle.youtube;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import me.kyle.youtube.BlockListener;

public class Youtube extends JavaPlugin {
	
	public Permission playerPermission1 = new Permission("bedrock.place"); 
    public Permission playerPermission2 = new Permission("TNT.place");
    public Permission playerPermission4 = new Permission("EC.place");
    public Permission playerPermission5 = new Permission("MineSkillz.command");
    public Permission playerPermission6 = new Permission("MainRules.command");
    public Permission playerPermission7 = new Permission("Donate.command");
    public Permission playerPermission8 = new Permission("Idea.command");
    public Permission playerPermission9 = new Permission("Website.command");
    public Permission playerPermission10 = new Permission("Staff.command");
    public Permission playerPermission11 = new Permission("News.command");
    public Permission playerPermission12 = new Permission("SetTime.command");
    public Permission playerPermission13 = new Permission("Heal.Heal");
    public Permission playerPermission14 = new Permission("Vip.command");
    public Permission playerPermission15 = new Permission("Vip+.command");
    public Permission playerPermission16 = new Permission("EnderChest.break");
    public Permission playerPermission17 = new Permission("EndStone.break");
    public Permission playerPermission18 = new Permission("EndPortalFrame.break");
    public Permission playerPermission19 = new Permission("Netherrack.break");
    
    
    
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Youtube plugin;
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
	}
	
	  public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new BlockListener(this), this);
	    PluginDescriptionFile p = getDescription();
	    this.logger.info(p.getName() + " V" + p.getVersion() + " Has been enabled!");
	    getConfig().options().copyDefaults(true);
	    saveConfig();
	    pm.addPermission(this.playerPermission1);
		
		ShapelessRecipe cobblestone = new ShapelessRecipe(new ItemStack(
				Material.COBBLESTONE, 32)).addIngredient(Material.DIAMOND);
		ShapelessRecipe Pumpkin = new ShapelessRecipe(new ItemStack(
				Material.PUMPKIN)).addIngredient(Material.PUMPKIN_SEEDS);
				
		getServer().addRecipe(Pumpkin);
		getServer().addRecipe(cobblestone);
				
	}
				
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		World world = player.getWorld();
		if(commandLabel.equalsIgnoreCase("MineSkillz") &&
		    player.hasPermission("MineSkillz.command")){
			player.sendMessage(ChatColor.GREEN + "------------------------------");
			player.sendMessage(ChatColor.GOLD + "         MineSkillz");
			player.sendMessage(ChatColor.GOLD + "     Running Version 3.3");
			player.sendMessage(ChatColor.GOLD + " Commands This Plugin Comes with");
			player.sendMessage(ChatColor.GOLD + " /MineSkillz this command");
			player.sendMessage(ChatColor.GOLD + " /MainRules shows the main rules");
			player.sendMessage(ChatColor.GOLD + " /Donate shows info on donating");
			player.sendMessage(ChatColor.GOLD + " /ideas Hvae idaes for the server go here");
			player.sendMessage(ChatColor.GOLD + " More To Come");
			player.sendMessage(ChatColor.BLUE + " --KoolzSkillz--");
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
		}else if (commandLabel.equalsIgnoreCase("MineSkillz") &&
			player.hasPermission("MainRules.command")){
			player.sendMessage(ChatColor.GREEN + "------------------------------");
			player.sendMessage(ChatColor.GOLD + "         MainRules");
			player.sendMessage(ChatColor.GOLD + "      The Main Rules are");
			player.sendMessage(ChatColor.GOLD + "    1.No Hacking instant ban");
			player.sendMessage(ChatColor.GOLD + "    2.No Raiding Admins");
			player.sendMessage(ChatColor.GOLD + " Raiding Normal Players is allowed");
			player.sendMessage(ChatColor.BLUE + "    3. Dont Ask For Ranks");
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
		}else if (commandLabel.equalsIgnoreCase("Donate") &&
				player.hasPermission("Donate.command")){
			player.sendMessage(ChatColor.GREEN + "------------------------------");
			player.sendMessage(ChatColor.GOLD + "           Donate ");
			player.sendMessage(ChatColor.GOLD + "      The Way To Donate Is");
			player.sendMessage(ChatColor.GOLD + "    www.mineskillz.enjin.com/donate");
			player.sendMessage(ChatColor.GOLD + "    You Can Get Awesome Stuff");
			player.sendMessage(ChatColor.GOLD + "Like Custom Swords, Diamonds and");
			player.sendMessage(ChatColor.BLUE + "        SurpriseEggs!!!");
			player.sendMessage(ChatColor.GOLD + "  Donating Lets Me Get more Ram");
			player.sendMessage(ChatColor.GOLD + "    For The Server (Less Lag)");
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
		}else if (commandLabel.equalsIgnoreCase("Ideas") &&
	        player.hasPermission("Idea.command")){
			player.sendMessage(ChatColor.GREEN + "------------------------------");
			player.sendMessage(ChatColor.BOLD + "  Have An Idea For The Server? ");
			player.sendMessage(ChatColor.GOLD + "  Write It In A Book And Put It");
			player.sendMessage(ChatColor.GOLD + "     The Hopper At Spawn");
			player.sendMessage(ChatColor.GOLD + "   You Can Almost Make A Forum");
			player.sendMessage(ChatColor.GOLD + "    About it on the website");
			player.sendMessage(ChatColor.GOLD + "  But Put A Pole So People Can ");
			player.sendMessage(ChatColor.GOLD + "      Vote On Your Idea");
			player.sendMessage(ChatColor.GOLD + "    MineSkillz.enjin.com ");
			player.sendMessage(ChatColor.GOLD + "       Is The Website ");
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
		}else if (commandLabel.equalsIgnoreCase("Website") &&
		        player.hasPermission("Website.command")){
			player.sendMessage(ChatColor.GREEN + "------------------------------");
			player.sendMessage(ChatColor.GOLD + "    MineSkillz.enjin.com ");
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
		}else if (commandLabel.equalsIgnoreCase("Staff") &&
		        player.hasPermission("Staff.command")){
			player.sendMessage(ChatColor.GREEN + "------------------------------");
			player.sendMessage(ChatColor.GOLD + "  Staff The Staff Members are ");
			player.sendMessage(ChatColor.GOLD + "  Mods: BurntxxOnion, Minecrafer_201 ");
			player.sendMessage(ChatColor.GOLD + "  Devs: Lach678, DarlikDestroyer ");
			player.sendMessage(ChatColor.GOLD + "  Smods: J_8724, Aidinator0202");
			player.sendMessage(ChatColor.GOLD + "  Admins: Gabe, Jkl882 ");
			player.sendMessage(ChatColor.GOLD + "  Head-Admin: Lach678");
			player.sendMessage(ChatColor.GOLD + "  Co-Owners: stew6000, Zomcal ");
			player.sendMessage(ChatColor.GOLD + "  Owner: KoolzSkillz ");
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
		}else if (commandLabel.equalsIgnoreCase("News") &&
		        player.hasPermission("News.command")){
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
			player.sendMessage(ChatColor.GOLD + "   Server News Will Come Here");
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
		}else if (commandLabel.equalsIgnoreCase("VIP") &&
		        player.hasPermission("VIP.command")){
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
			player.sendMessage(ChatColor.GOLD + " This Is To Help You If You Are");
			player.sendMessage(ChatColor.GOLD + "          Vip Rank");
			player.sendMessage(ChatColor.GOLD + " You Will Have");
			player.sendMessage(ChatColor.GOLD + " /workbench, /kit VIP");
			player.sendMessage(ChatColor.GOLD + " Also You have acess to areas of");
			player.sendMessage(ChatColor.GOLD + " The Server no other ranks get");
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
		}else if (commandLabel.equalsIgnoreCase("VIP+") &&
		        player.hasPermission("VIP+.command")){
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
			player.sendMessage(ChatColor.GOLD + " This Is To Help You If You Are");
			player.sendMessage(ChatColor.GOLD + "          Vip+ Rank");
			player.sendMessage(ChatColor.GOLD + " You Will Have");
			player.sendMessage(ChatColor.GOLD + " /workbench, /kit VIP, /enderchest");
			player.sendMessage(ChatColor.GOLD + " and /flytime");
			player.sendMessage(ChatColor.GOLD + " Also You have acess to areas of");
			player.sendMessage(ChatColor.GOLD + " The Server no other ranks get");
			player.sendMessage(ChatColor.GREEN + "-------------------------------");
		}else if (commandLabel.equalsIgnoreCase("SetTime") &&
					player.hasPermission("SetTime.command")){
			if(args[0].equalsIgnoreCase("day")){
				world.setTime(0);
			} else if(args[0].equalsIgnoreCase("night")){
				world.setTime(15000);
			} else if(args[0].equalsIgnoreCase("Noon")){
				world.setTime(5000);
			}
		}
		return false;
	}
}

		
		
		