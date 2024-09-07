package me.elephant1214.pocketserver.server

import me.elephant1214.pocketserver.game.block.Block
import me.elephant1214.pocketserver.game.item.Item
import me.elephant1214.pocketserver.registry.BlockRegistry
import me.elephant1214.pocketserver.registry.EntityRegistry
import me.elephant1214.pocketserver.registry.ItemRegistry
import me.elephant1214.pocketserver.registry.PacketRegistry

object ServerInitializer {
    fun initializeBlocks() {
        BlockRegistry.apply { 
            registerBlock(0, Block("air"))
        }
    }
    
    fun initializeEntities() {
        EntityRegistry.apply { 
            
        }
    }
    
    fun initializeItems() {
        ItemRegistry.apply { 
            registerItem(0, Item("air"))
        }
    }
    
    fun initializePackets() {
        PacketRegistry.apply { 
            
        }
    }
    
    fun initializeAll() {
        initializeBlocks()
        initializeEntities()
        initializeItems()
        initializePackets()
    }
}