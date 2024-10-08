package me.elephant1214.pocketserver.registry

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import me.elephant1214.pocketserver.game.entity.Entity
import me.elephant1214.pocketserver.util.Position

object EntityRegistry {
    private val entityTypes = Int2ObjectOpenHashMap<EntityFactory>()

    fun registerEntity(type: Int, factory: EntityFactory) {
        entityTypes[type] = factory
    }

    fun createEntity(type: Int, id: Int, pos: Position): Entity? = entityTypes[type]?.create(id, pos)
}