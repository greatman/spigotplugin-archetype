#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Spigot Plugin Example Loaded!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Spigot Plugin Example Disabled!");
    }
}
