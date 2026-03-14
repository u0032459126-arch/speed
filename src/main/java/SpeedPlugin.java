// SpeedPlugin.java

import org.bukkit.plugin.java.JavaPlugin;

public class SpeedPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("SpeedPlugin has been enabled!");
        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("SpeedPlugin has been disabled!");
    }
}