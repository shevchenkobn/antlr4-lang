The app accepts up to 2 arguments: the first one is `.ofp` file, the second one is optional, an output transpiled file.

If you provide an output file, make sure to provide an extension (e.g. `output/python/test.py`)

To compile the program from CLI:
```shell
javac -d ./out/production/antlr4-lang/ ./src/ua/nure/lnu2020/ofp_4dv507/pashaieva_shevchenko/**/*.java
```

Example of app start:
```shell
java -classpath /usr/local/lib/antlr-4.8-complete.jar:/home/bogdan/nure/lnu/antlr4-lang/out/production/antlr4-lang ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.Main ./input/idea_debug.ofp ./output/idea_debug.py
```