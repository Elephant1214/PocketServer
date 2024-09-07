package me.elephant1214.pocketserver.network.raknet.v7

import io.ktor.network.sockets.*
import io.ktor.utils.io.core.*
import me.elephant1214.pocketserver.network.ServerboundUnconnectedPacket

class ServerboundOpenConnectionRequest1(
    private val protocolVersion: Byte,
) : ServerboundUnconnectedPacket {
    override val id: Byte = 0x05

    override fun handle(address: SocketAddress) {
        // TODO: Handle incompatible protocol version
        
        /*
        MainSocket.send(
            Datagram(
                ClientboundOpenConnectionReply1().write(),
                address,
            )
        )
        */
    }
    
    companion object {
        fun read(packet: ByteReadPacket): ServerboundOpenConnectionRequest1 =
            ServerboundOpenConnectionRequest1(packet.readByte())
    }
}