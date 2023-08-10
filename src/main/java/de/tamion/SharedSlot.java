package de.tamion;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SharedSlot extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerInventorySlotChange(PlayerItemHeldEvent e) {
        Bukkit.getOnlinePlayers().forEach(player -> {
            player.getInventory().setHeldItemSlot(e.getNewSlot());
        });
    }
}
