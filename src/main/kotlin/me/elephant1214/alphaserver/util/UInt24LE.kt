package me.elephant1214.alphaserver.util

class UInt24LE(initVal: Int = 0) {
    private var intValue: Int = 0

    init {
        checkAndSet(initVal)
    }

    operator fun plus(value: Int): UInt24LE =
        UInt24LE().apply { this@apply.checkAndSet(this@UInt24LE.intValue + value) }

    operator fun plusAssign(value: Int) {
        this.checkAndSet(this.intValue + value)
    }

    operator fun minus(value: Int): UInt24LE =
        UInt24LE().apply { this@apply.checkAndSet(this@UInt24LE.intValue - value) }

    operator fun minusAssign(value: Int) {
        this.checkAndSet(this.intValue - value)
    }

    operator fun times(value: Int): UInt24LE =
        UInt24LE().apply { this@apply.checkAndSet(this@UInt24LE.intValue * value) }

    operator fun timesAssign(value: Int) {
        this.checkAndSet(this.intValue * value)
    }

    operator fun div(value: Int): UInt24LE =
        UInt24LE().apply { this@apply.checkAndSet(this@UInt24LE.intValue / value) }

    operator fun divAssign(value: Int) {
        this.checkAndSet(this.intValue / value)
    }

    private fun checkAndSet(value: Int) {
        this.intValue = when {
            value < MIN -> MIN
            value > MAX -> MIN
            else -> value
        }
    }

    companion object {
        const val MIN: Int = 0
        const val MAX: Int = 16777216
    }
}