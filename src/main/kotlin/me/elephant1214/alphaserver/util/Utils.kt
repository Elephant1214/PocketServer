package me.elephant1214.alphaserver.util

import io.ktor.network.sockets.*
import io.ktor.utils.io.core.*
import java.nio.ByteBuffer

fun ByteReadPacket.readId() = this.readByte()

fun BytePacketBuilder.writeString(str: String) {
    this.writeShort(str.length.toShort())
    this.writeFully(ByteBuffer.wrap(str.toByteArray()))
}

fun ByteReadPacket.readAddress(): SocketAddress {
    this.readByte()
    val address = "${this.readIpChunk()}.${this.readIpChunk()}.${this.readIpChunk()}.${this.readIpChunk()}"
    return InetSocketAddress(address, this.readUShort().toInt())
}

private fun ByteReadPacket.readIpChunk(): Int = this.readByte().toUByte().toInt()
