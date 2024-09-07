package me.elephant1214.pocketserver.network

import io.ktor.network.sockets.SocketAddress

interface ServerboundUnconnectedPacket : ServerboundPacket {
    fun handle(address: SocketAddress)
}
