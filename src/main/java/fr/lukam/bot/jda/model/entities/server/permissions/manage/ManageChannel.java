package fr.lukam.bot.jda.model.entities.server.permissions.manage;

import fr.lukam.bot_api.entities.interfaces.server.Permission;

public class ManageChannel implements Permission {

    @Override
    public String getName() {
        return "Manage channel";
    }

}
