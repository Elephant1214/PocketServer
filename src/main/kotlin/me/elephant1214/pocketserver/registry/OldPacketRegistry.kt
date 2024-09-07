package me.elephant1214.pocketserver.registry

import me.elephant1214.pocketserver.network.Packet

@Deprecated("Here as a reference, will be removed soon")
class OldPacketRegistry<I : Any, O : Packet> {
    private val _registry = hashMapOf<Byte, (data: I) -> O>()

    fun register(id: Byte, value: (data: I) -> O) {
        val existing = this._registry[id]
        if (existing == null) {
            this._registry[id] = value
        }
    }

    operator fun get(id: Byte): ((data: I) -> O)? = this._registry[id]
}
