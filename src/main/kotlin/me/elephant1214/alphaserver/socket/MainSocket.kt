package me.elephant1214.alphaserver.socket

object MainSocket { /* : CoroutineScope {
    override val coroutineContext = Dispatchers.IO + SupervisorJob()
    private lateinit var socket: BoundDatagramSocket
    private var listening: AtomicBoolean = AtomicBoolean(false)

    fun startListening() = runBlocking {
        val host = PocketServer.properties.getHost()
        println("Starting main socket on $host")
        this@MainSocket.socket = aSocket(SelectorManager(Dispatchers.IO)).udp().bind(host)

        launch(Dispatchers.IO) {
            this@MainSocket.socket.openReadChannel()
            this@MainSocket.listening.set(true)
            println("Listening for connections")

            while (true) {
                val datagram = try {
                    this@MainSocket.socket.receive()
                } catch (e: ClosedChannelException) {
                    break
                }
                handle(datagram)
            }
        }
    }

    private fun handle(datagram: Datagram) {
        val readPacket = datagram.packet
        val player = PlayerManager[datagram.address]
        if (player != null) {
            player.handle(datagram.packet)
            return
        }
        
        val id = readPacket.readByte()
        val lambda: ((ByteReadPacket) -> UnconnectedPacket)? = Registries.SERVERBOUND_UNCONNECTED_PACKET[id]
        
        if (lambda == null) {
            println("Received unexpected packet `${id.toHexString()}`")
            return
        }
        
        val unconnectedPacket: UnconnectedPacket = lambda(readPacket)
        unconnectedPacket.handle(datagram.address)
    }
    
    fun send(datagram: Datagram) = launch {
        this@MainSocket.socket.send(datagram)
    }
    */
}
