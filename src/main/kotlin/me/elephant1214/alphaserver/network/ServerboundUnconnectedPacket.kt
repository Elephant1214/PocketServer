package me.elephant1214.alphaserver.network

import io.ktor.network.sockets.SocketAddress

interface ServerboundUnconnectedPacket : ServerboundPacket {
    fun handle(address: SocketAddress)
}
