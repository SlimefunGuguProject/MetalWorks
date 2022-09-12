package me.jasperchasetoq.metalworks;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import me.jasperchasetoq.metalworks.setup.MetalWorksItemSetup;
import net.guizhanss.guizhanlibplugin.updater.GuizhanBuildsUpdaterWrapper;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.io.File;

public class MetalWorks extends JavaPlugin implements SlimefunAddon {


    @Override
    public void onEnable() {

        Config cfg = new Config(this);

        MetalWorksItemSetup.setup(this);
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("options.auto-update") && getDescription().getVersion().startsWith("Build")) {
            GuizhanBuildsUpdaterWrapper.start(this, getFile(), "SlimefunGuguProject", "MetalWorks", "master", false);
        }
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/SlimefunGuguProject/MetalWorks/issues";
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    private static MetalWorks instance;

    public MetalWorks() {
        instance = this;
    }

    public static MetalWorks getInstance() {
        return instance;
    }

}

