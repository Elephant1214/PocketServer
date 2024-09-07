package me.elephant1214.pocketserver.player

import io.ktor.utils.io.core.*

class Player {
    fun handle(packet: ByteReadPacket) {
        val connectedPeer = packet.readByte()
        val sequenceNumber = packet.readShort()
        val encapsulation = packet.readByte()
        val length = packet.readShort() / 8

        // TODO: Handle data packets
        when (encapsulation) {
            0x00.toByte() -> {
                
            }
            
            0x40.toByte() -> {
                
            }
            
            0x60.toByte() -> {
                
            }
        }
    }
    
    fun send(packet: ByteReadPacket) {
        PlayerManager.send(this, packet)
    }
}