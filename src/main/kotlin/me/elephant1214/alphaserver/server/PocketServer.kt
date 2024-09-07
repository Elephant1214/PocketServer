package me.elephant1214.alphaserver.server

import io.ktor.network.selector.SelectorManager
import io.ktor.network.sockets.BoundDatagramSocket
import io.ktor.network.sockets.Datagram
import io.ktor.network.sockets.InetSocketAddress
import io.ktor.network.sockets.aSocket
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import me.elephant1214.alphaserver.server.settings.ServerSettings
import java.time.Instant
import kotlin.random.Random

object PocketServer {
    val RANDOM: Random = Random.Default
    val SERVER_ID: Long = RANDOM.nextLong()
    val START_TIME: Instant = Instant.now()

    /**
     * TODO: Handle this the "correct" way?
     */
    val MTU_SIZE: Short = 1500
    lateinit var settings: ServerSettings
        private set
    
    fun timeSinceStart(): Long = Instant.now().toEpochMilli() - START_TIME.toEpochMilli()
    
    fun startServer(settings: ServerSettings) = runBlocking {
        this@PocketServer.settings = settings

        ServerInitializer.initializeAll()
    }
    
    private fun runServer() = runBlocking {
        val server = startSocket()
        
        while (true) {
            val datagram = server.receive()
            launch {
                handleIncoming(datagram)
            }
        }
    }
    
    private fun startSocket(): BoundDatagramSocket = runBlocking {
        val selectorManager = SelectorManager(Dispatchers.IO)
        val server = aSocket(selectorManager).udp().bind(InetSocketAddress("0.0.0.0", settings.port.toInt()))
        return@runBlocking server
    }
    
    suspend fun handleIncoming(datagram: Datagram) {
        
    }
}