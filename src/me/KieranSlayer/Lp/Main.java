package me.KieranSlayer.Lp;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.KieranSlayer.Lp.Launch;

public class Main
extends JavaPlugin {
    public void onEnable() {
        this.getLogger().info("Launchpad is active:D!");
        this.getServer().getPluginManager().registerEvents((Listener)new Launch(), (Plugin)this);
    }

    public void onDisable() {
        this.getLogger().info("Launchpad is active D:!");
    }
}
