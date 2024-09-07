package me.elephant1214.pocketserver.registry

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import me.elephant1214.pocketserver.game.item.Item

object ItemRegistry {
    private val items = Int2ObjectOpenHashMap<Item>()
    
    fun registerItem(id: Int, item: Item) {
        this.items[id] = item
    }
    
    operator fun get(id: Int): Item? = this.items[id]
}