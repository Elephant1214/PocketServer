package me.elephant1214.alphaserver.server.settings

@JvmRecord
data class ServerSettings(
    /**
     * Enables debug logs
     */
    val debug: Boolean = false,
    /**
     * The default game mode
     */
    val defaultGameMode: GameMode = GameMode.SURVIVAL,
    /**
     * The game difficulty
     */
    val difficulty: GameDifficulty = GameDifficulty.EASY,
    /**
     * TODO: Not implemented
     */
    val enableCommandBlocks: Boolean = false,
    /**
     * TODO: Not implemented
     */
    val enableEnd: Boolean = true,
    /**
     * TODO: Not implemented
     */
    val enableNether: Boolean = true,
    /**
     * TODO: Not implemented
     */
    val gameVersion: GameVersion = GameVersion.V0_15_10,
    /**
     * The maximum number of players that can be on the server at one time.
     */
    val maxPlayers: Int = 25,
    /**
     * The name that will show up for the server displayed in-game.
     */
    val serverName: String = "A Minecraft Server",
    /**
     * The server port, range of 0 to 65,535.
     */
    val port: UShort = 19132U,
    /**
     * TODO: Not implemented
     */
    val pvp: Boolean = true,
    /**
     * TODO: Not implemented
     */
    val useExperimentalAntiCheat: Boolean = false,
    /**
     * TODO: Not implemented
     */
    val viewDistance: Int = 32,
    /**
     * TODO: Not implemented
     */
    val whitelist: Boolean = false,
)
