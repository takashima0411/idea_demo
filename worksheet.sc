import demo.Sample

for {
  os <- Sample.seq()
  s <- os
} yield s.num

val impConv:BigInt = 1
val impConv2:Double = 1
