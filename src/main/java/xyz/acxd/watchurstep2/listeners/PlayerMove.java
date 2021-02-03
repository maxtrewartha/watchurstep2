package xyz.acxd.watchurstep2.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import xyz.acxd.watchurstep2.Main;

import java.util.ArrayList;

public class PlayerMove implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent playEvent) {

        ArrayList<String> blocks = new ArrayList<String>();
        for (String s : Main.plugin.getConfig().getStringList("blocks")){
            blocks.add(s);
        }

        Player player = playEvent.getPlayer();
        Location playerLoc = player.getLocation();
        playerLoc.setY(playerLoc.getY() - 1.0D);
        for (String m : blocks){
            if (Material.getMaterial(m) == playerLoc.getBlock().getType()){
                player.getWorld().spawn(player.getLocation(), TNTPrimed.class).setFuseTicks(35);
            }
        }
    }
}
