package me.elephant1214.pocketserver.server.settings

/**
 * The Minecraft version that the server will run with.
 * I might try to get connections from future versions working later to allow something
 * like this: Server running 0.14, 0.15 and 0.16 players can join.
 */
enum class GameVersion(val version: String) {
    V0_10("0.10"),
    V0_11("0.11"),
    V0_12("0.12"),
    V0_13("0.13"),
    V0_14_2("0.14.2"),
    V0_15_10("0.15.10"),
    V0_16("0.16.1"),
    V1_0("1.0"),
    V1_1("1.1");
    
    companion object {
        /**
         * TODO: Make better when more versions are supported
         */
        @JvmStatic
        fun versionOf(input: String): GameVersion {
            return GameVersion.valueOf(input)
        }
    }
}