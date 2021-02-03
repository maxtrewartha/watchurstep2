package xyz.acxd.watchurstep2.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent playEvent) {
        Player player = playEvent.getPlayer();
        Location playerLoc = player.getLocation();
        playerLoc.setY(playerLoc.getY() - 1.0D);
        if (player.getLocation().getBlock().getType() == Material.GRASS_BLOCK){
            player.getWorld().spawn(player.getLocation(), TNTPrimed.class).setFuseTicks(35);
        }
    }

}
