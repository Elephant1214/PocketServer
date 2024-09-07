package me.elephant1214.pocketserver.network.raknet.v7

import io.ktor.utils.io.core.*
import me.elephant1214.pocketserver.network.ClientboundPacket
import me.elephant1214.pocketserver.server.PocketServer
import me.elephant1214.pocketserver.server.SECURITY_BYTE
import me.elephant1214.pocketserver.util.writeOfflineData

class ClientboundOpenConnectionReply2(
    private val serverId: Long = PocketServer.SERVER_ID,
    private val clientPort: UShort = PocketServer.RANDOM.nextInt(49152, 65535).toUShort(),
    private val mtuSize: Short = PocketServer.MTU_SIZE,
    private val security: Byte = SECURITY_BYTE,
) : ClientboundPacket {
    override val id: Byte = 0x08

    override fun write(): ByteReadPacket = buildPacket { 
        this.writeByte(this@ClientboundOpenConnectionReply2.id)
        this.writeOfflineData()
        this.writeLong(this@ClientboundOpenConnectionReply2.serverId)
        this.writeUShort(this@ClientboundOpenConnectionReply2.clientPort)
        this.writeShort(this@ClientboundOpenConnectionReply2.mtuSize)
        this.writeByte(this@ClientboundOpenConnectionReply2.security)
    }
}