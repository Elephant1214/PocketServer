package me.elephant1214.pocketserver.network

import io.ktor.utils.io.core.ByteReadPacket

interface ServerboundUnconnectedPacketReader<T> {
    fun read(packet: ByteReadPacket): T
}