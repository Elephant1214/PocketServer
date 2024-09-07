package me.elephant1214.pocketserver.util

import io.ktor.utils.io.core.BytePacketBuilder
import io.ktor.utils.io.core.ByteReadPacket
import io.ktor.utils.io.core.readBytes
import io.ktor.utils.io.core.writeFully

private val RAKNET_OFFLINE_MESSAGE_DATA = byteArrayOf(
    0x00,
    0xFF.toByte(),
    0xFF.toByte(),
    0x00,
    0xFE.toByte(),
    0xFE.toByte(),
    0xFE.toByte(),
    0xFE.toByte(),
    0xFD.toByte(),
    0xFD.toByte(),
    0xFD.toByte(),
    0xFD.toByte(),
    0x12,
    0x34,
    0x56,
    0x78,
)

fun ByteReadPacket.readOfflineData() {
    this.readBytes(RAKNET_OFFLINE_MESSAGE_DATA.size)
}

fun BytePacketBuilder.writeOfflineData() {
    this.writeFully(RAKNET_OFFLINE_MESSAGE_DATA)
}
