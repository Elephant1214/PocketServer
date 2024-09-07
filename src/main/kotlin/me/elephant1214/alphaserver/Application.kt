package me.elephant1214.alphaserver

import me.elephant1214.alphaserver.server.PocketServer
import me.elephant1214.alphaserver.server.settings.ServerSettings

/**
 * Entry fun
 * 
 * TODO: Parse [ServerSettings] from [args], add GUI?
 */
fun main(args: Array<String>) {
    PocketServer.startServer(ServerSettings())
}
