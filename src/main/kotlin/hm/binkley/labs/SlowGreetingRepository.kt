package hm.binkley.labs

import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletableFuture.supplyAsync
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.TimeUnit.SECONDS

class SlowGreetingRepository : GreetingRepository {
    private val cache
            = ConcurrentHashMap<String, CompletableFuture<Greeting>>()

    override fun create(name: String) {
        cache[name] = supplyAsync {
            SECONDS.sleep(10)
            Greeting(name)
        }
    }

    override fun ready(name: String) = cache(name).isDone

    override fun get(name: String) = cache(name).get()!!

    override fun delete(name: String) {
        cache.remove(name)?.cancel(true)
    }

    private fun cache(name: String)
            = cache[name] ?: throw IndexOutOfBoundsException(name)
}
