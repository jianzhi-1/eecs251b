# Chisel Bootcamp
```scala
val x = 6 // can be string, boolean
// Typing
val numberOfKittens: Int = 6
val kittensPerHouse: Int = 101
val alphabet: String = "abcdefghijklmnopqrstuvwxyz"
val done: Boolean = false
```
`val` is immutable, `var` is mutable.

```scala
println(alphabet)
```
Conditionals; if conditional returns a value that is the last line of the selected branch
```scala
if (done) {
    println("we are done")
}
else if (numberOfKittens < kittensPerHouse) {
    println("more kittens!")
    numberOfKittens += 1
}
else {
    done = true
}
```


