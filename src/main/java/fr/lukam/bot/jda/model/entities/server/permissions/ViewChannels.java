package fr.lukam.bot.jda.model.entities.server.permissions;

import fr.lukam.bot_api.entities.interfaces.server.Permission;

public class ViewChannels implements Permission {

    @Override
    public String getName() {
        return "View channels";
    }

}
