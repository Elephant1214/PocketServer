package me.elephant1214.alphaserver.network.raknet.v7

import io.ktor.utils.io.core.*
import me.elephant1214.alphaserver.network.ClientboundPacket
import me.elephant1214.alphaserver.server.PocketServer
import me.elephant1214.alphaserver.server.SECURITY_BYTE
import me.elephant1214.alphaserver.util.writeOfflineData

class ClientboundOpenConnectionReply1(
    private val serverId: Long = PocketServer.SERVER_ID,
    private val security: Byte = SECURITY_BYTE,
    private val mtuSize: Short = PocketServer.MTU_SIZE,
) : ClientboundPacket {
    override val id: Byte = 0x06
    
    override fun write(): ByteReadPacket = buildPacket { 
        this.writeByte(this@ClientboundOpenConnectionReply1.id)
        this.writeOfflineData()
        this.writeLong(this@ClientboundOpenConnectionReply1.serverId)
        this.writeByte(this@ClientboundOpenConnectionReply1.security)
        this.writeShort(this@ClientboundOpenConnectionReply1.mtuSize)
    }
}