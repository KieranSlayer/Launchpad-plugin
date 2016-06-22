package me.KieranSlayer.Lp;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class Launch
implements Listener {
    @EventHandler
    public void on(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        if (p.getLocation().getBlock().getType() == Material.GOLD_PLATE && p.hasPermission("Launchpad.use")) {
            Vector v = p.getLocation().getDirection().multiply(10.0).setY(3.0);
            p.setVelocity(v);
            p.playEffect(p.getLocation(), Effect.SMOKE, 5);
            p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0f, 1.0f);
            p.setFallDistance(-999.0f);
        }
    }
}

