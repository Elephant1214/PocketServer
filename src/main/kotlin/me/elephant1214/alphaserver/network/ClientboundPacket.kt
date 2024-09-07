package me.elephant1214.alphaserver.network

import io.ktor.utils.io.core.ByteReadPacket

interface ClientboundPacket : Packet {
    fun write(): ByteReadPacket
}