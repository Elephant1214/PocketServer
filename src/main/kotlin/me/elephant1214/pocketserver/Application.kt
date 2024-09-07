package me.elephant1214.pocketserver

import me.elephant1214.pocketserver.server.PocketServer
import me.elephant1214.pocketserver.server.settings.ServerSettings

/**
 * Entry fun
 * 
 * TODO: Parse [ServerSettings] from [args], add GUI?
 */
fun main(args: Array<String>) {
    PocketServer.startServer(ServerSettings())
}
