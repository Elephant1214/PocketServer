package me.elephant1214.alphaserver.network.raknet.v7

import io.ktor.utils.io.core.*
import me.elephant1214.alphaserver.network.ClientboundPacket
import me.elephant1214.alphaserver.server.PocketServer
import me.elephant1214.alphaserver.util.writeOfflineData
import me.elephant1214.alphaserver.util.writeString

class ClientboundUnconnectedPong(
    private val pingId: Long = PocketServer.timeSinceStart(),
    private val serverId: Long = PocketServer.SERVER_ID,
    private val info: String,
) : ClientboundPacket {
    override val id: Byte = 0x1C
    
    override fun write(): ByteReadPacket = buildPacket {
        this.writeByte(this@ClientboundUnconnectedPong.id)
        this.writeLong(this@ClientboundUnconnectedPong.pingId)
        this.writeLong(this@ClientboundUnconnectedPong.serverId)
        this.writeOfflineData()
        this.writeString(this@ClientboundUnconnectedPong.info)
    }
}
