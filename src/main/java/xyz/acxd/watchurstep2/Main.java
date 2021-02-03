package xyz.acxd.watchurstep2;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.acxd.watchurstep2.listeners.PlayerMove;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerMove(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
