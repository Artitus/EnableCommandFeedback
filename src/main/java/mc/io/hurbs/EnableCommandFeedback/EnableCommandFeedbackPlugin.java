package mc.io.hurbs.EnableCommandFeedback;

import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public class EnableCommandFeedbackPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // Enable sendCommandFeedback gamerule in all worlds
        for (World world : getServer().getWorlds()) {
            world.setGameRuleValue("sendCommandFeedback", "true");
            getLogger().info("sendCommandFeedback has been enabled in world: " + world.getName());
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("Disable EnableCommandFeedbackPlugin.");
    }
}