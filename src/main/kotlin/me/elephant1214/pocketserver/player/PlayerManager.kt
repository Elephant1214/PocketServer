package me.elephant1214.pocketserver.player

import io.ktor.network.sockets.*
import io.ktor.utils.io.core.*

object PlayerManager {
    private val _players = hashMapOf<SocketAddress, Player>()

    operator fun get(socketAddress: SocketAddress): Player? = this._players[socketAddress]

    operator fun get(player: Player): SocketAddress? = this._players.entries.find { it.value == player }?.key

    operator fun set(socketAddress: SocketAddress, player: Player) {
        this._players[socketAddress] = player
    }

    fun remove(socketAddress: SocketAddress) = this._players.remove(socketAddress)

    fun remove(player: Player) = this._players.values.remove(player)

    fun send(player: Player, data: ByteReadPacket) {
        /*
        MainSocket.send(
            Datagram(
                data,
                this[player]!!,
            )
        )
        */
    }
}