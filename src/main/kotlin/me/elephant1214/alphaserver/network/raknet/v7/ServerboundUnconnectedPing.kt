package me.elephant1214.alphaserver.network.raknet.v7

import io.ktor.network.sockets.*
import io.ktor.utils.io.core.*
import me.elephant1214.alphaserver.network.ServerboundUnconnectedPacket
import me.elephant1214.alphaserver.network.ServerboundUnconnectedPacketReader
import me.elephant1214.alphaserver.server.PocketServer
import me.elephant1214.alphaserver.socket.MainSocket

data class ServerboundUnconnectedPing(
    val pingId: Long,
    val clientId: Long,
) : ServerboundUnconnectedPacket {
    override val id: Byte = 0x01

    override fun handle(address: SocketAddress) {
        /*
        MainSocket.send(
            Datagram(
                ClientboundUnconnectedPong(info = "MCPE;${PocketServer.settings.serverName};7;${PocketServer.settings.gameVersion.version};0;${PocketServer.settings.maxPlayers}").write(),
                address,
            )
        )
         */
    }

    companion object : ServerboundUnconnectedPacketReader<ServerboundUnconnectedPing> {
        override fun read(packet: ByteReadPacket): ServerboundUnconnectedPing =
            ServerboundUnconnectedPing(packet.readLong(), packet.readLong())
    }
}
