package me.alek.serversecurity.lang.locales;

import me.alek.serversecurity.ServerSecurityPlugin;
import me.alek.serversecurity.lang.Lang;
import me.alek.serversecurity.lang.LocaleMessageRepresentor;

public enum SChineseRepresentor implements LocaleMessageRepresentor {


    COMMAND_NO_PERMISSION(Lang.COMMAND_NO_PERMISSION, "你没有权限使用此指令！"),
    COMMAND_NO_CONSOLE(Lang.COMMAND_NO_CONSOLE, "§c此指令只能由玩家执行。"),
    COMMAND_HELP_HEADER(Lang.COMMAND_HELP_HEADER,
            "§6" + ServerSecurityPlugin.get().getDescription().getFullName() + "。由 Alek05 制作。"),
    COMMAND_HELP_FOOTER(Lang.COMMAND_HELP_FOOTER,
            "§7使用 §e/am help §7来获得命令帮助。"),

    SUBCOMMAND_CLEAN_INFO_DESCRIPTION(Lang.SUBCOMMAND_CLEAN_INFO_DESCRIPTION, "清理系统和插件内的Skyrage蠕虫病毒。"),
    SUBCOMMAND_CLEAN_SPECIFICATION(Lang.SUBCOMMAND_CLEAN_SPECIFICATION, "§c你需要填写参数，指定如何清理？再次使用 /am cleanskyrage <system(系统)/plugins(插件)>。"),
    SUBCOMMAND_CLEAN_CLEANING(Lang.SUBCOMMAND_CLEAN_CLEANING, "§7正在清理服务器操作系统中的Skyrage恶意软件..."),
    SUBCOMMAND_CLEAN_OS_NOT_INFECTED(Lang.SUBCOMMAND_CLEAN_OS_NOT_INFECTED, "§a看起来服务器的操作系统没有被Skyrage恶意软件感染。"),
    SUBCOMMAND_CLEAN_PLUGINS_NOT_INFECTED(Lang.SUBCOMMAND_CLEAN_PLUGINS_NOT_INFECTED, "§a看起来没有插件感染了Skyrage恶意软件。"),
    SUBCOMMAND_CLEAN_PLUGINS_CLEANING(Lang.SUBCOMMAND_CLEAN_PLUGINS_CLEANING, "§a正在从文件 %s 中移除Skyrage恶意软件..."),
    SUBCOMMAND_CLEAN_PLUGINS_TOTAL_CLEANED(Lang.SUBCOMMAND_CLEAN_PLUGINS_TOTAL_CLEANED, "§a从 %s 个文件中移除了Skyrage恶意软件。"),

    SUBCOMMAND_LANGUAGE_INFO_DESCRIPTION(Lang.SUBCOMMAND_LANGUAGE_INFO_DESCRIPTION, "更改插件的语言。"),
    SUBCOMMAND_LANGUAGE_ERROR_NO_SUCH_LANGUAGE(Lang.SUBCOMMAND_LANGUAGE_ERROR_NO_SUCH_LANGUAGE, "§c找不到该语言。"),
    SUBCOMMAND_LANGUAGE_ERROR_BAD_CONFIG(Lang.SUBCOMMAND_LANGUAGE_ERROR_BAD_CONFIG, "§c配置文件可能是旧的，或者你在其中写错了。删除后重启服务器并重试。"),
    SUBCOMMAND_LANGUAGE_ERROR_SPECIFICATION(Lang.SUBCOMMAND_LANGUAGE_ERROR_SPECIFICATION, "§c你必须选择一种语言。"),
    SUBCOMMAND_LANGUAGE_CHANGED(Lang.SUBCOMMAND_LANGUAGE_CHANGED, "§a语言已更改为英语。"),

    SUBCOMMAND_DEEPSCAN_INFO_DESCRIPTION(Lang.SUBCOMMAND_DEEPSCAN_INFO_DESCRIPTION, "对带有病毒和后门的文件进行详细扫描。"),
    SUBCOMMAND_SIMPLESCAN_INFO_DESCRIPTION(Lang.SUBCOMMAND_SIMPLESCAN_INFO_DESCRIPTION, "对带有病毒和后门的文件进行简单扫描。"),
    SUBCOMMAND_HELP_INFO_DESCRIPTION(Lang.SUBCOMMAND_HELP_INFO_DESCRIPTION, "发送你可以使用的所有命令。"),
    SUBCOMMAND_RELOAD_INFO_DESCRIPTION(Lang.SUBCOMMAND_RELOAD_INFO_DESCRIPTION, "重新加载文件缓存和配置。"),
    SUBCOMMAND_RELOAD_RELOADING(Lang.SUBCOMMAND_RELOAD_RELOADING, "§7正在重新加载文件缓存和配置..."),

    SCANNING_ERROR_NO_AVAILABLE_SCANNER(Lang.SCANNING_ERROR_NO_AVAILABLE_SCANNER, "§c发生了错误。请稍等片刻。"),
    SCANNING_ERROR_NO_SUCH_PLUGIN(Lang.SCANNING_ERROR_NO_SUCH_PLUGIN, "§c找不到匹配的插件。"),
    SCANNING_ERROR_ALREADY_SCANNING(Lang.SCANNING_ERROR_ALREADY_SCANNING, "§c服务器已经在缓存扫描中。请稍等... (%s/%s)"),
    SCANNING_ERROR_NO_RESULT(Lang.SCANNING_ERROR_NO_RESULT, "§c扫描中未发现任何数据。"),
    SCANNING_ERROR_UNKNOWN(Lang.SCANNING_ERROR_UNKNOWN, "§c发生了错误。请稍等片刻。"),
    SCANNING_WARN_MANY_INFECTED(Lang.SCANNING_WARN_MANY_INFECTED, "§c看起来服务器中有很多被感染的文件。" +
            "这可能是由于一个插件感染了所有其他插件。你需要重新安装所有插件，以及ServerSecurity。"),
    SCANNING_STARTING(Lang.SCANNING_STARTING, "§7正在扫描 %s 个文件中的恶意软件和后门..."),
    SCANNING_DONE_CHAT(Lang.SCANNING_DONE_CHAT, "§7扫描完毕，共扫描了 %s 个文件，发现 %s 个感染了恶意软件或后门。"),
    SCANNING_DONE_LOG(Lang.SCANNING_DONE_LOG, "扫描完毕，共扫描了 %s 个文件，发现 %s 个感染了恶意软件或后门。"),
    SCANNING_WARN_INFECTED_JOIN(Lang.SCANNING_WARN_INFECTED_JOIN, "§c发现插件中存在恶意软件。使用 /am scan 获取更多信息。"),
    SCANNING_RESULT_GREEN(Lang.SCANNING_RESULT_GREEN, "§a此插件未感染。"),
    SCANNING_RESULT_YELLOW(Lang.SCANNING_RESULT_YELLOW, "§e此插件很可能未感染。"),
    SCANNING_RESULT_RED(Lang.SCANNING_RESULT_RED, "§c此插件可能已感染。"),
    SCANNING_RESULT_MALWARE(Lang.SCANNING_RESULT_MALWARE, "§4此插件已感染！请立即删除！"),
    SCANNING_RESULT_REPLACER(Lang.SCANNING_RESULT_REPLACER, "这个插件"),

    CLEANING_ERROR_PROCESS_RESERVED(Lang.CLEANING_ERROR_PROCESS_RESERVED, "§c此插件被其他进程占用，无法扫描。"),
    CLEANING_WINDOWS_ERROR_NO_WRITE_PERMISSION(Lang.CLEANING_WINDOWS_ERROR_NO_WRITE_PERMISSION, "§c此服务器仍然受到感染，在Windows下无法进行文件热修改。"),
    CLEANING_WINDOWS_ERROR_TASK_KILL(Lang.CLEANING_WINDOWS_ERROR_TASK_KILL, "§c服务器仍然受到感染！尝试终止进程时发生错误。"),
    CLEANING_LINUX_ERROR_ABORTED(Lang.CLEANING_LINUX_ERROR_ABORTED, "§c服务器仍然受到感染！清理被其他线程或进程中断。"),
    CLEANING_LINUX_ERROR_NO_WRITE_PERMISSION(Lang.CLEANING_LINUX_ERROR_NO_WRITE_PERMISSION, "§c服务器仍然受到感染！你需要给予修改文件的权限。"),

    NETWORK_ERROR_ACTIVATING_INTERCEPTOR(Lang.NETWORK_ERROR_ACTIVATING_INTERCEPTOR, "§c激活网络拦截器时遇到了错误。"),
    NETWORK_ERROR_REPLACE_SECURITY_MANAGER(Lang.NETWORK_ERROR_REPLACE_SECURITY_MANAGER, "§c停用网络拦截器时遇到了错误。"),
    NETWORK_BLOCKED(Lang.NETWORK_BLOCKED, "已阻止来自地址 %s 的协议"),

    SECURITY_BLOCKED_COMMAND(Lang.SECURITY_BLOCKED_COMMAND, "已阻止控制台命令：%s"),
    SECURITY_BLOCKED_OPERATOR_CHANGE(Lang.SECURITY_BLOCKED_OPERATOR_CHANGE, "已阻止管理员更改：%s -> %s (%s)"),
    SECURITY_BLOCKED_BACKDOOR_CHAT(Lang.SECURITY_BLOCKED_BACKDOOR_CHAT, "§c发现可能的后门！使用者：%s"),
    SECURITY_BLOCKED_BACKDOOR_KICK(Lang.SECURITY_BLOCKED_BACKDOOR_KICK, "§c发现可能的后门！如果这是一个错误，请联系工作人员。"),
    SECURITY_OPPROXY_BLOCKED_LOG(Lang.SECURITY_OPPROXY_BLOCKED_LOG, "玩家的管理员权限被拒绝：%s"),
    SECURITY_OPPROXY_BLOCKED_INFO(Lang.SECURITY_OPPROXY_BLOCKED_INFO, "§c玩家的管理员权限被拒绝：%s。如果该玩家应当拥有管理员权限，你可以在 config.yml 中授予权限。"),
    SECURITY_OPPROXY_LOG_OP(Lang.SECURITY_OPPROXY_LOG_OP, "玩家 %s 现在是服务器管理员(OP)了。"),
    SECURITY_OPPROXY_LOG_DEOP(Lang.SECURITY_OPPROXY_LOG_DEOP, "玩家 %s 现在不再是服务器管理员(OP)了。"),

    UPDATE_FOUND(Lang.UPDATE_FOUND, "§7发现了一个更新：v%s。下载地址：")
    ;

    private final Lang lang;
    private final String[] messages;

    SChineseRepresentor(Lang lang, String... messages) {
        this.lang = lang;
        this.messages = messages;
    }

    @Override
    public Lang getLang() {
        return lang;
    }

    @Override
    public String[] getMessages() {
        return messages;
    }
}
