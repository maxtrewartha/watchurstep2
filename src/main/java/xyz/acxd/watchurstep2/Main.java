package xyz.acxd.watchurstep2;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.acxd.watchurstep2.listeners.PlayerMove;

import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    public static Main plugin;
    public static Logger logger;

    @Override
    public void onEnable() {
        // Adds the listener
        getLogger().info("Watch Ur Step 2 has started");
        plugin = this;
        logger = getLogger();
        loadConfig();
        getServer().getPluginManager().registerEvents(new PlayerMove(), this);
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
