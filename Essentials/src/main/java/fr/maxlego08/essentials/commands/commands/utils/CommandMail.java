package fr.maxlego08.essentials.commands.commands.utils;

import fr.maxlego08.essentials.api.EssentialsPlugin;
import fr.maxlego08.essentials.api.commands.CommandResultType;
import fr.maxlego08.essentials.api.commands.Permission;
import fr.maxlego08.essentials.api.messages.Message;
import fr.maxlego08.essentials.module.modules.MailBoxModule;
import fr.maxlego08.essentials.zutils.utils.commands.VCommand;

public class CommandMail extends VCommand {
    public CommandMail(EssentialsPlugin plugin) {
        super(plugin);
        this.setModule(MailBoxModule.class);
        this.setDescription(Message.DESCRIPTION_MAIL);
        this.setPermission(Permission.ESSENTIALS_MAIL);
        this.onlyPlayers();
    }

    @Override
    protected CommandResultType perform(EssentialsPlugin plugin) {

        plugin.getModuleManager().getModule(MailBoxModule.class).openMailBox(player);

        return CommandResultType.SUCCESS;
    }
}
