package me.elephant1214.pocketserver.network.raknet.v7

import io.ktor.network.sockets.*
import io.ktor.utils.io.core.*
import me.elephant1214.pocketserver.network.ServerboundUnconnectedPacket
import me.elephant1214.pocketserver.network.ServerboundUnconnectedPacketReader
import me.elephant1214.pocketserver.util.readAddress

class ServerboundOpenConnectionRequest2(
    private val serverAddress: SocketAddress,
    private val mtuSize: UShort,
    private val clientId: Long,
) : ServerboundUnconnectedPacket {
    override val id: Byte = 0x07

    override fun handle(address: SocketAddress) {
        /*
        MainSocket.send(
            Datagram(
                ClientboundOpenConnectionReply2(clientPort = address.toJavaAddress().port.toUShort()).write(),
                address,
            )
        )
         */
    }

    companion object : ServerboundUnconnectedPacketReader<ServerboundOpenConnectionRequest2> {
        override fun read(packet: ByteReadPacket): ServerboundOpenConnectionRequest2 =
            ServerboundOpenConnectionRequest2(packet.readAddress(), packet.readUShort(), packet.readLong())
    }
}
