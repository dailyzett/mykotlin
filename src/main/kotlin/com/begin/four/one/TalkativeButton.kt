package com.begin.four.one

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey")
    protected fun whisper() = println("Let's talk!")
}