To scaffold a proper ANTLR project run the following from the project root:
```shell
cd ./grammar
antlr4 -o ../src/ua/nure/lnu2020/ofp_4dv507/pashaieva_shevchenko/parsing ./OfpPashaievaShevchenko.g4 -long-messages -visitor -listener
```
To compile the program from CLI:
```shell
javac -d ./out/production/antlr4-lang/ ./src/ua/nure/lnu2020/ofp_4dv507/pashaieva_shevchenko/**/*.java
```
To use grun:
```shell
cd ./out/production/antlr4-lang/ua/nure/lnu2020/ofp_4dv507/pashaieva_shevchenko/
grun OfpPashaievaShevchenko start -tree # doesn't work with package names
```