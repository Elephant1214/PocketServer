package me.elephant1214.pocketserver.registry

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import me.elephant1214.pocketserver.game.block.Block
import kotlin.collections.set

object BlockRegistry {
    private val blocks = Int2ObjectOpenHashMap<Block>()

    fun registerBlock(id: Int, block: Block) {
        this.blocks[id] = block
    }

    operator fun get(id: Int): Block? = this.blocks[id]
}