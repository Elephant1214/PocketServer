package me.elephant1214.alphaserver.network

import io.ktor.utils.io.core.ByteReadPacket

interface ServerboundUnconnectedPacketReader<T> {
    fun read(packet: ByteReadPacket): T
}