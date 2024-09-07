package me.elephant1214.pocketserver.network

import io.ktor.utils.io.core.ByteReadPacket

interface ClientboundPacket : Packet {
    fun write(): ByteReadPacket
}