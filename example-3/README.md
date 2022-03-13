```sh
# compile
./mill foo.compile

# compile + run
./mill foo.run

# test
./mill foo.test

# stand-alone executable
./mill foo.assembly

# see result path
./mill show foo.assembly # => out/foo/assembly/dest/out.jar

# execute
out/foo/assembly/dest/out.jar
```
